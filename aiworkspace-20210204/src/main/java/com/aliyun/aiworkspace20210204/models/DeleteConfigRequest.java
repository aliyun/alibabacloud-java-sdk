// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteConfigRequest extends TeaModel {
    /**
     * <p>The category of the configuration item. Valid values:</p>
     * <ul>
     * <li>CommonResourceConfig</li>
     * <li>DLCAutoRecycle - DLCPriorityConfig</li>
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
     * <p>The filter conditions. Separate multiple conditions with commas (,). The conditions have an AND relationship.</p>
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
