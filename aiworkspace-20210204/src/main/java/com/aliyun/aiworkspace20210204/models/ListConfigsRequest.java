// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListConfigsRequest extends TeaModel {
    /**
     * <p>The categorization of the configuration item. Valid values:</p>
     * <ul>
     * <li>CommonResourceConfig: general resource configuration</li>
     * <li>DLCAutoRecycle: automatic DLC revoke</li>
     * <li>DLCPriorityConfig: DLC priority settings</li>
     * <li>DSWPriorityConfig: DSW priority settings</li>
     * <li>QuotaMaximumDuration: maximum runtime configuration of DLC nodes for a quota</li>
     * <li>CommonTagConfig: label settings</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CommonResourceConfig</p>
     */
    @NameInMap("CategoryName")
    public String categoryName;

    /**
     * <p>The keys of the configuration items. Valid values:</p>
     * <ul>
     * <li>tempStoragePath: Temporary storage path. This key is allowed only when CategoryName is set to CommonResourceConfig.</li>
     * <li>isAutoRecycle: Automatic revoke configuration. This key is allowed only when CategoryName is set to DLCAutoRecycle.</li>
     * <li>priorityConfig: Priority configuration. This key is allowed only when CategoryName is set to DLCPriorityConfig or DSWPriorityConfig.</li>
     * <li>quotaMaximumDuration: Maximum runtime configuration of DLC nodes for a quota. This key is allowed only when CategoryName is set to QuotaMaximumDuration.</li>
     * <li>predefinedTags: Preset labels for the workspace. Resources created must have these labels.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>tempStoragePath</p>
     */
    @NameInMap("ConfigKeys")
    public String configKeys;

    /**
     * <p>The labels used as filter conditions. Separate multiple conditions with commas. These conditions are combined by using the AND operator.</p>
     * 
     * <strong>example:</strong>
     * <p>key1=value1,key2=value2</p>
     */
    @NameInMap("Labels")
    public String labels;

    /**
     * <p>The additional options. Currently, only ThrowExceptionOnError is supported, which indicates that an error is thrown when an exception occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>ThrowExceptionOnError</p>
     */
    @NameInMap("Options")
    public String options;

    /**
     * <p>Specifies whether to display label information. Valid values:</p>
     * <ul>
     * <li>true: Displays label information.</li>
     * <li>false: Does not display label information.</li>
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

    public ListConfigsRequest setOptions(String options) {
        this.options = options;
        return this;
    }
    public String getOptions() {
        return this.options;
    }

    public ListConfigsRequest setVerbose(String verbose) {
        this.verbose = verbose;
        return this;
    }
    public String getVerbose() {
        return this.verbose;
    }

}
