// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListConfigsRequest extends TeaModel {
    /**
     * <p>The category of the configuration item. The following categories are supported:</p>
     * <ul>
     * <li><p>CommonResourceConfig: The common resource configuration.</p>
     * </li>
     * <li><p>DLCAutoRecycle: The automatic recycling configuration for DLC.</p>
     * </li>
     * <li><p>DLCPriorityConfig: The priority configuration for DLC.</p>
     * </li>
     * <li><p>DSWPriorityConfig: The priority configuration for DSW.</p>
     * </li>
     * <li><p>QuotaMaximumDuration: The configuration for the maximum runtime of a DLC task in a quota.</p>
     * </li>
     * <li><p>CommonTagConfig: The label configuration.</p>
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
     * <li><p>tempStoragePath: The path for temporary storage. This key is valid only when CategoryName is set to CommonResourceConfig.</p>
     * </li>
     * <li><p>isAutoRecycle: The automatic recycling configuration. This key is valid only when CategoryName is set to DLCAutoRecycle.</p>
     * </li>
     * <li><p>priorityConfig: The priority configuration. This key is valid only when CategoryName is set to DLCPriorityConfig or DSWPriorityConfig.</p>
     * </li>
     * <li><p>quotaMaximumDuration: The configuration for the maximum runtime of a DLC task in a quota. This key is valid only when CategoryName is set to QuotaMaximumDuration.</p>
     * </li>
     * <li><p>predefinedTags: The predefined labels for the workspace. Resources that you create must have these labels.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>tempStoragePath</p>
     */
    @NameInMap("ConfigKeys")
    public String configKeys;

    /**
     * <p>The labels to use as filter conditions. Separate multiple labels with commas. A logical AND operation is performed on these labels.</p>
     * 
     * <strong>example:</strong>
     * <p>key1=value1,key2=value2</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>Specifies whether to return label information.</p>
     * <ul>
     * <li><p>true: Returns label information.</p>
     * </li>
     * <li><p>false: Does not return label information.</p>
     * </li>
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
