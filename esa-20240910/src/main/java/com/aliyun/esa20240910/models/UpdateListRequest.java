// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateListRequest extends TeaModel {
    /**
     * <p>The new description of the list.</p>
     * 
     * <strong>example:</strong>
     * <p>a custom list</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the custom list, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850217.html">ListLists</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>40000001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The items in the updated list. The value is a JSON array.</p>
     * 
     * <strong>example:</strong>
     * <p>a custom list</p>
     */
    @NameInMap("Items")
    public java.util.List<String> items;

    /**
     * <p>The new name of the list.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Name")
    public String name;

    public static UpdateListRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateListRequest self = new UpdateListRequest();
        return TeaModel.build(map, self);
    }

    public UpdateListRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateListRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateListRequest setItems(java.util.List<String> items) {
        this.items = items;
        return this;
    }
    public java.util.List<String> getItems() {
        return this.items;
    }

    public UpdateListRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
