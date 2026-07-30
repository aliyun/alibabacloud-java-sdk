// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetConfigRequest extends TeaModel {
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
