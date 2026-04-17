// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListContactsRequest extends TeaModel {
    @NameInMap("contactIds")
    public java.util.List<String> contactIds;

    /**
     * <strong>example:</strong>
     * <p><a href="mailto:test@aliyun.com">test@aliyun.com</a></p>
     */
    @NameInMap("email")
    public String email;

    @NameInMap("groupId")
    public String groupId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>15012345678</p>
     */
    @NameInMap("phone")
    public String phone;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("queryUngroupedContacts")
    public Boolean queryUngroupedContacts;

    @NameInMap("workspace")
    public String workspace;

    public static ListContactsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListContactsRequest self = new ListContactsRequest();
        return TeaModel.build(map, self);
    }

    public ListContactsRequest setContactIds(java.util.List<String> contactIds) {
        this.contactIds = contactIds;
        return this;
    }
    public java.util.List<String> getContactIds() {
        return this.contactIds;
    }

    public ListContactsRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public ListContactsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ListContactsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListContactsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListContactsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListContactsRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public ListContactsRequest setQueryUngroupedContacts(Boolean queryUngroupedContacts) {
        this.queryUngroupedContacts = queryUngroupedContacts;
        return this;
    }
    public Boolean getQueryUngroupedContacts() {
        return this.queryUngroupedContacts;
    }

    public ListContactsRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
