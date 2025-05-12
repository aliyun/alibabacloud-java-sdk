// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetConfigRequest extends TeaModel {
    /**
     * <p>The category of the configuration item. Supported categories:</p>
     * <ul>
     * <li>CommonResourceConfig</li>
     * <li>DLCAutoRecycle</li>
     * <li>DLCPriorityConfig</li>
     * <li>DSWPriorityConfig</li>
     * <li>QuotaMaximumDuration</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CommonResourceConfig</p>
     */
    @NameInMap("CategoryName")
    public String categoryName;

    /**
     * <p>The key of the configuration item. Supported keys:</p>
     * <ul>
     * <li>tempStoragePath: Temporary storage path. This key can be used only when CategoryName is set to CommonResourceConfig.</li>
     * <li>isAutoRecycle: Automatic recycle configuration. This key can be used only when CategoryName is set to DLCAutoRecycle.</li>
     * <li>priorityConfig: Priority configuration. This key can be used only when CategoryName is set to DLCPriorityConfig or DSWPriorityConfig.</li>
     * <li>quotaMaximumDuration Maximum run time of DLC jobs for a quota. This key can be used only when CategoryName is set to QuotaMaximumDuration.</li>
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
    @NameInMap("Verbose")
    public String verbose;

    public static GetConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConfigRequest self = new GetConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetConfigRequest setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }
    public String getCategoryName() {
        return this.categoryName;
    }

    public GetConfigRequest setConfigKey(String configKey) {
        this.configKey = configKey;
        return this;
    }
    public String getConfigKey() {
        return this.configKey;
    }

    public GetConfigRequest setVerbose(String verbose) {
        this.verbose = verbose;
        return this;
    }
    public String getVerbose() {
        return this.verbose;
    }

}
