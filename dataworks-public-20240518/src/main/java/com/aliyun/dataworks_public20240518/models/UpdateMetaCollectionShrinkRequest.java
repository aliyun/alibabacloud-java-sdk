// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateMetaCollectionShrinkRequest extends TeaModel {
    @NameInMap("Administrators")
    public String administratorsShrink;

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

    public static UpdateMetaCollectionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetaCollectionShrinkRequest self = new UpdateMetaCollectionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMetaCollectionShrinkRequest setAdministratorsShrink(String administratorsShrink) {
        this.administratorsShrink = administratorsShrink;
        return this;
    }
    public String getAdministratorsShrink() {
        return this.administratorsShrink;
    }

    public UpdateMetaCollectionShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateMetaCollectionShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public UpdateMetaCollectionShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
