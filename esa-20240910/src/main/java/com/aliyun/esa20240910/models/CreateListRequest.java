// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateListRequest extends TeaModel {
    /**
     * <p>The description of the custom list. This parameter provides detailed information about the custom list.</p>
     * 
     * <strong>example:</strong>
     * <p>a custom list</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The list items. This parameter provides the specific item data for the list.</p>
     * 
     * <strong>example:</strong>
     * <p>a custom list</p>
     */
    @NameInMap("Items")
    public java.util.List<String> items;

    /**
     * <p>The kind of the custom list. This parameter specifies the type of the custom list.</p>
     * 
     * <strong>example:</strong>
     * <p>ip</p>
     */
    @NameInMap("Kind")
    public String kind;

    /**
     * <p>The name of the custom list.</p>
     * <p><strong>Naming rules</strong>: Only letters, digits, and underscores are supported (<code>^\\w{1,64}$</code>). The name must be 1 to 64 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Name")
    public String name;

    public static CreateListRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateListRequest self = new CreateListRequest();
        return TeaModel.build(map, self);
    }

    public CreateListRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateListRequest setItems(java.util.List<String> items) {
        this.items = items;
        return this;
    }
    public java.util.List<String> getItems() {
        return this.items;
    }

    public CreateListRequest setKind(String kind) {
        this.kind = kind;
        return this;
    }
    public String getKind() {
        return this.kind;
    }

    public CreateListRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
