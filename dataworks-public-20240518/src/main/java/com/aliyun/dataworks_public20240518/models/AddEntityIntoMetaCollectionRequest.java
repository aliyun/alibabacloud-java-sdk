// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class AddEntityIntoMetaCollectionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-table</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>category.123</p>
     */
    @NameInMap("MetaCollectionId")
    public String metaCollectionId;

    @NameInMap("Remark")
    public String remark;

    public static AddEntityIntoMetaCollectionRequest build(java.util.Map<String, ?> map) throws Exception {
        AddEntityIntoMetaCollectionRequest self = new AddEntityIntoMetaCollectionRequest();
        return TeaModel.build(map, self);
    }

    public AddEntityIntoMetaCollectionRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public AddEntityIntoMetaCollectionRequest setMetaCollectionId(String metaCollectionId) {
        this.metaCollectionId = metaCollectionId;
        return this;
    }
    public String getMetaCollectionId() {
        return this.metaCollectionId;
    }

    public AddEntityIntoMetaCollectionRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
