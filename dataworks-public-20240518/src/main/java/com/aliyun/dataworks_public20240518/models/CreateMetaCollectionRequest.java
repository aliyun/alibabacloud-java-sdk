// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateMetaCollectionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test comment</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_album</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>category.123</p>
     */
    @NameInMap("ParentId")
    public String parentId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Category</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateMetaCollectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMetaCollectionRequest self = new CreateMetaCollectionRequest();
        return TeaModel.build(map, self);
    }

    public CreateMetaCollectionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateMetaCollectionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMetaCollectionRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public CreateMetaCollectionRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
