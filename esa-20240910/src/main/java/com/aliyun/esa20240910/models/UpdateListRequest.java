// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateListRequest extends TeaModel {
    /**
     * <p>The new description of the list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a custom list</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the custom list. You can obtain the ID by calling the <a href="https://help.aliyun.com/document_detail/2850217.html">ListLists</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>40000001</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The new list content. The value is a JSON array string, for example, <code>[&quot;1.1.1.1&quot;,&quot;2.2.2.2&quot;]</code>.</p>
     * <p><strong>Full overwrite semantics</strong>: The specified <code>Items</code> value completely overwrites the existing list content instead of appending to it.</p>
     * <blockquote>
     * <p>⚠️ <strong>If this parameter is not specified or is set to an empty value, the existing list content is cleared</strong>. To retain existing items and append new ones, call <code>GetList</code> to retrieve the current <code>Items</code>, merge them, and then submit the combined list.</p>
     * </blockquote>
     * <p><strong>Element format</strong>: The format depends on the <code>Kind</code> value specified when the list was created. UpdateList does not support modifying Kind.</p>
     * <ul>
     * <li>Kind = <code>ip</code>: Each element must be a valid IP address or CIDR block. If an element is invalid, <code>WrongValueMatched</code> is returned.</li>
     * <li>Other Kind values: The element format is subject to the relevant specifications. The number of elements is limited by the tenant quota <code>NumberItemsPerList</code>. This limit does not apply to the <code>ip</code> Kind.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a custom list</p>
     */
    @NameInMap("Items")
    public java.util.List<String> items;

    /**
     * <p>The new name of the custom list. If this parameter is not specified, the original name is retained.</p>
     * <p><strong>Naming rules</strong>: Only letters, digits, and underscores are supported (<code>^\\w{1,64}$</code>). The name must be 1 to 64 characters in length.</p>
     * <p>This parameter is required.</p>
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
