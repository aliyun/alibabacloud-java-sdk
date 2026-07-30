// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetConfigResponseBody extends TeaModel {
    /**
     * <p>The category of the configuration item. The following categories are supported:</p>
     * <ul>
     * <li>CommonResourceConfig: common resource configuration</li>
     * <li>DLCAutoRecycle: DLC automatic reclamation</li>
     * <li>DLCPriorityConfig: DLC priority settings</li>
     * <li>DSWPriorityConfig: DSW priority settings</li>
     * <li>QuotaMaximumDuration: maximum runtime duration configuration for DLC jobs in a quota</li>
     * <li>CommonTagConfig: tag settings</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CommonResourceConfig</p>
     */
    @NameInMap("CategoryName")
    public String categoryName;

    /**
     * <p>The key of the configuration item. The following keys are supported:</p>
     * <ul>
     * <li>tempStoragePath: the temporary storage path. This key is valid only when CategoryName is set to CommonResourceConfig.</li>
     * <li>isAutoRecycle: the automatic reclamation configuration. This key is valid only when CategoryName is set to DLCAutoRecycle.</li>
     * <li>priorityConfig: the priority configuration. This key is valid only when CategoryName is set to DLCPriorityConfig or DSWPriorityConfig.</li>
     * <li>quotaMaximumDuration: the maximum runtime duration configuration for DLC jobs in a quota. This key is valid only when CategoryName is set to QuotaMaximumDuration.</li>
     * <li>predefinedTags: the preset tags for the workspace. Resources created in the workspace must include these tags.</li>
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
     * <p>The time when the configuration item was created, in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-07-17T06:53:04.000Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>The time when the configuration item was last modified, in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-07-17T06:55:04.000Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <p>The list of labels for the configuration item.</p>
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

    public GetConfigResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetConfigResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
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
         * <p>The key of the label.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the label.</p>
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
