// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateContactGroupRequest extends TeaModel {
    /**
     * <p>The unique identifier of the contact group.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("contactGroupId")
    public String contactGroupId;

    /**
     * <p>The IDs of the contacts.</p>
     */
    @NameInMap("contacts")
    public java.util.List<String> contacts;

    /**
     * <p>The name of the contact.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The name of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>default-cms-5884500827389836-cn-hangzhou</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static CreateContactGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateContactGroupRequest self = new CreateContactGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateContactGroupRequest setContactGroupId(String contactGroupId) {
        this.contactGroupId = contactGroupId;
        return this;
    }
    public String getContactGroupId() {
        return this.contactGroupId;
    }

    public CreateContactGroupRequest setContacts(java.util.List<String> contacts) {
        this.contacts = contacts;
        return this;
    }
    public java.util.List<String> getContacts() {
        return this.contacts;
    }

    public CreateContactGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateContactGroupRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
