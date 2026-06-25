// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetConfigRequest extends TeaModel {
    /**
     * <p>The classification of the configuration item. The following classifications are supported:</p>
     * <ul>
     * <li><p>CommonResourceConfig: common resource configurations</p>
     * </li>
     * <li><p>DLCAutoRecycle: automatic DLC resource recycling</p>
     * </li>
     * <li><p>DLCPriorityConfig: DLC priority settings</p>
     * </li>
     * <li><p>DSWPriorityConfig: DSW priority settings</p>
     * </li>
     * <li><p>QuotaMaximumDuration: the maximum runtime of a DLC task for a quota</p>
     * </li>
     * <li><p>CommonTagConfig: tag settings</p>
     * </li>
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
     * <li><p>tempStoragePath: the temporary storage path. This key applies only when CategoryName is set to CommonResourceConfig.</p>
     * </li>
     * <li><p>isAutoRecycle: the automatic recycling configuration. This key applies only when CategoryName is set to DLCAutoRecycle.</p>
     * </li>
     * <li><p>priorityConfig: the priority configuration. This key applies only when CategoryName is set to DLCPriorityConfig or DSWPriorityConfig.</p>
     * </li>
     * <li><p>quotaMaximumDuration: the maximum runtime of a DLC task for a quota. This key applies only when CategoryName is set to QuotaMaximumDuration.</p>
     * </li>
     * <li><p>predefinedTags: the predefined tags for the workspace. Resources that you create must have tags.</p>
     * </li>
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
