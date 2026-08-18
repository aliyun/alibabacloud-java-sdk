// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class AddEntityIntoMetaCollectionRequest extends TeaModel {
    /**
     * <p>The ID of the entity. Currently, only the table type is supported. You can obtain the ID from the response of the ListTables operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-table:::project_name:[schema_name]:table_name</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The ID of the collection object. You can obtain the ID from the response of the ListMetaCollections operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>as78d756asd</p>
     */
    @NameInMap("MetaCollectionId")
    public String metaCollectionId;

    /**
     * <p>The remarks when adding the entity to the collection. Currently, this parameter takes effect only for the album type.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
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
