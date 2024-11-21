// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateListShrinkRequest extends TeaModel {
    /**
     * <p>The description of the list that you want to create.</p>
     * 
     * <strong>example:</strong>
     * <p>a custom list</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The items in the list that you want to create.</p>
     * 
     * <strong>example:</strong>
     * <p>a custom list</p>
     */
    @NameInMap("Items")
    public String itemsShrink;

    /**
     * <p>The type of the list that you want to create.</p>
     * 
     * <strong>example:</strong>
     * <p>ip</p>
     */
    @NameInMap("Kind")
    public String kind;

    /**
     * <p>The name of the list that you want to create.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Name")
    public String name;

    public static CreateListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateListShrinkRequest self = new CreateListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateListShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateListShrinkRequest setItemsShrink(String itemsShrink) {
        this.itemsShrink = itemsShrink;
        return this;
    }
    public String getItemsShrink() {
        return this.itemsShrink;
    }

    public CreateListShrinkRequest setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public CreateListShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
