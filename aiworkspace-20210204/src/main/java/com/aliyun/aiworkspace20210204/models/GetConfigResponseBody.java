// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetConfigResponseBody extends TeaModel {
    /**
     * <p>The category of the configuration item. Valid values:</p>
     * <ul>
     * <li>CommonResourceConfig</li>
     * <li>DLCAutoRecycle</li>
     * <li>DLCPriorityConfig</li>
     * <li>DSWPriorityConfig</li>
     * <li>QuotaMaximumDuration</li>
     * <li>CommonTagConfig</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CommonResourceConfig</p>
     */
    @NameInMap("CategoryName")
    public String categoryName;

    /**
     * <p>The key of the configuration item. Valid values:</p>
     * <ul>
     * <li>tempStoragePath: Temporary storage path. This key can be used only when CategoryName is set to CommonResourceConfig.</li>
     * <li>isAutoRecycle: Automatic recycle configuration. This key can be used only when CategoryName is set to DLCAutoRecycle.</li>
     * <li>priorityConfig: Priority configuration. This key can be used only when CategoryName is set to DLCPriorityConfig or DSWPriorityConfig.</li>
     * <li>quotaMaximumDuration: Maximum run time of DLC jobs for a quota. This key can be used only when CategoryName is set to QuotaMaximumDuration.</li>
     * <li>predefinedTags: Predefined tags of the workspace. Created resources must include tags.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>tempStoragePath</p>
     */
    @NameInMap("ConfigKey")
    public String configKey;

    /**
     * <p>The value of the configuration item.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://***</p>
     */
    @NameInMap("ConfigValue")
    public String configValue;

    /**
     * <p>The tags of the configuration item.</p>
     */
    @NameInMap("Labels")
    public java.util.List<GetConfigResponseBodyLabels> labels;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A******C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1234******2</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConfigResponseBody self = new GetConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConfigResponseBody setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }
    public String getCategoryName() {
        return this.categoryName;
    }

    public GetConfigResponseBody setConfigKey(String configKey) {
        this.configKey = configKey;
        return this;
    }
    public String getConfigKey() {
        return this.configKey;
    }

    public GetConfigResponseBody setConfigValue(String configValue) {
        this.configValue = configValue;
        return this;
    }
    public String getConfigValue() {
        return this.configValue;
    }

    public GetConfigResponseBody setLabels(java.util.List<GetConfigResponseBodyLabels> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<GetConfigResponseBodyLabels> getLabels() {
        return this.labels;
    }

    public GetConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConfigResponseBody setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class GetConfigResponseBodyLabels extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetConfigResponseBodyLabels build(java.util.Map<String, ?> map) throws Exception {
            GetConfigResponseBodyLabels self = new GetConfigResponseBodyLabels();
            return TeaModel.build(map, self);
        }

        public GetConfigResponseBodyLabels setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetConfigResponseBodyLabels setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
