// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateContactGroupRequest extends TeaModel {
    @NameInMap("contacts")
    public java.util.List<String> contacts;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    public static UpdateContactGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateContactGroupRequest self = new UpdateContactGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateContactGroupRequest setContacts(java.util.List<String> contacts) {
        this.contacts = contacts;
        return this;
    }
    public java.util.List<String> getContacts() {
        return this.contacts;
    }

    public UpdateContactGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
