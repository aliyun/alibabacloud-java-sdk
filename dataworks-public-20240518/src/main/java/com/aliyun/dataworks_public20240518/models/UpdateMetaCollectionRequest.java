// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateMetaCollectionRequest extends TeaModel {
    @NameInMap("Administrators")
    public java.util.List<String> administrators;

    /**
     * <strong>example:</strong>
     * <p>new comment</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>category.123</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>new_name</p>
     */
    @NameInMap("Name")
    public String name;

    public static UpdateMetaCollectionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetaCollectionRequest self = new UpdateMetaCollectionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMetaCollectionRequest setAdministrators(java.util.List<String> administrators) {
        this.administrators = administrators;
        return this;
    }
    public java.util.List<String> getAdministrators() {
        return this.administrators;
    }

    public UpdateMetaCollectionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateMetaCollectionRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateMetaCollectionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
