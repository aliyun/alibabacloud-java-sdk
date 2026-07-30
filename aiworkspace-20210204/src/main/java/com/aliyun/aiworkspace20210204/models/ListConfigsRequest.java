// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListConfigsRequest extends TeaModel {
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
     * <p>The keys of the configuration items. The following keys are supported:</p>
     * <ul>
     * <li>tempStoragePath: temporary storage path. This ConfigKey can be used only when CategoryName is set to CommonResourceConfig.</li>
     * <li>isAutoRecycle: automatic reclamation configuration. This ConfigKey can be used only when CategoryName is set to DLCAutoRecycle.</li>
     * <li>priorityConfig: priority configuration. This ConfigKey can be used only when CategoryName is set to DLCPriorityConfig or DSWPriorityConfig.</li>
     * <li>quotaMaximumDuration: maximum runtime duration configuration for DLC jobs in a quota. This ConfigKey can be used only when CategoryName is set to QuotaMaximumDuration.</li>
     * <li>predefinedTags: preset tags for the workspace. Resources that are created must include these tags.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>tempStoragePath</p>
     */
    @NameInMap("ConfigKeys")
    public String configKeys;

    /**
     * <p>The labels used as filter conditions. Separate multiple conditions with commas. These conditions have an AND relationship.</p>
     * 
     * <strong>example:</strong>
     * <p>key1=value1,key2=value2</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>Specifies whether to display label information. Valid values:</p>
     * <ul>
     * <li>true: Display label information.</li>
     * <li>false: Do not display label information.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Verbose")
    public String verbose;

    public static ListConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConfigsRequest self = new ListConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListConfigsRequest setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }
    public String getCategoryName() {
        return this.categoryName;
    }

    public ListConfigsRequest setConfigKeys(String configKeys) {
        this.configKeys = configKeys;
        return this;
    }
    public String getConfigKeys() {
        return this.configKeys;
    }

    public ListConfigsRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public ListConfigsRequest setVerbose(String verbose) {
        this.verbose = verbose;
        return this;
    }
    public String getVerbose() {
        return this.verbose;
    }

}
