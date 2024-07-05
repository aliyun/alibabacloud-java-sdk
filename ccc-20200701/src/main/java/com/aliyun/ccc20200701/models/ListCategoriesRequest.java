// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListCategoriesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>43c2671b-<em><strong>-</strong></em>-86d0-6bd187905cc8</p>
     */
    @NameInMap("CategoryId")
    public String categoryId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>Ticket</p>
     */
    @NameInMap("Type")
    public String type;

    public static ListCategoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCategoriesRequest self = new ListCategoriesRequest();
        return TeaModel.build(map, self);
    }

    public ListCategoriesRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public ListCategoriesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListCategoriesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
