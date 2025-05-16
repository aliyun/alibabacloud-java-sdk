// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListConfigsRequest extends TeaModel {
    /**
     * <p>The category of the configuration item. Supported categories:</p>
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
     * <p>The key of the configuration item. Supported keys:</p>
     * <ul>
     * <li>tempStoragePath: Temporary storage path. This key can be used only when CategoryName is set to CommonResourceConfig.</li>
     * <li>isAutoRecycle: Automatic recycle configuration. This key can be used only when CategoryName is set to DLCAutoRecycle.</li>
     * <li>priorityConfig: Priority configuration. This key can be used only when CategoryName is set to DLCPriorityConfig or DSWPriorityConfig.</li>
     * <li>quotaMaximumDuration: Maximum run time of DLC jobs for a quota. This key can be used only when CategoryName is set to QuotaMaximumDuration.</li>
     * <li>predefinedTags: The predefined tags of the workspace. All created resources must have tags</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>tempStoragePath</p>
     */
    @NameInMap("ConfigKeys")
    public String configKeys;

    /**
     * <p>The tags used as filter conditions. Separate multiple tags with commas (,). These conditions are in an AND relationship.</p>
     * 
     * <strong>example:</strong>
     * <p>key1=value1,key2=value2</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>Specifies whether to show the tag information.</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
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
