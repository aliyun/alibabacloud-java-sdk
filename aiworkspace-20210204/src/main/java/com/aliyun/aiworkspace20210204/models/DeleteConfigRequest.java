// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteConfigRequest extends TeaModel {
    /**
     * <p>The classification of the configuration item. The following classifications are supported:</p>
     * <ul>
     * <li><p>DLCAutoRecycle: The DLC automatic release configuration.</p>
     * </li>
     * <li><p>DLCPriorityConfig: The DLC priority settings.</p>
     * </li>
     * <li><p>DSWPriorityConfig: The DSW priority settings.</p>
     * </li>
     * <li><p>QuotaMaximumDuration: The maximum runtime configuration of a DLC task for a quota.</p>
     * </li>
     * <li><p>CommonTagConfig: The tag settings.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CommonResourceConfig</p>
     */
    @NameInMap("CategoryName")
    public String categoryName;

    /**
     * <p>The filter conditions. Separate multiple conditions with commas. The conditions are combined with a logical AND.</p>
     * 
     * <strong>example:</strong>
     * <p>key1=value;key2=value2</p>
     */
    @NameInMap("Labels")
    public String labels;

    public static DeleteConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigRequest self = new DeleteConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteConfigRequest setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }
    public String getCategoryName() {
        return this.categoryName;
    }

    public DeleteConfigRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

}
