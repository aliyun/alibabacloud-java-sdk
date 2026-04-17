// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListContactsShrinkRequest extends TeaModel {
    @NameInMap("contactIds")
    public String contactIdsShrink;

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

    public static ListContactsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListContactsShrinkRequest self = new ListContactsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListContactsShrinkRequest setContactIdsShrink(String contactIdsShrink) {
        this.contactIdsShrink = contactIdsShrink;
        return this;
    }
    public String getContactIdsShrink() {
        return this.contactIdsShrink;
    }

    public ListContactsShrinkRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public ListContactsShrinkRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ListContactsShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListContactsShrinkRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListContactsShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListContactsShrinkRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public ListContactsShrinkRequest setQueryUngroupedContacts(Boolean queryUngroupedContacts) {
        this.queryUngroupedContacts = queryUngroupedContacts;
        return this;
    }
    public Boolean getQueryUngroupedContacts() {
        return this.queryUngroupedContacts;
    }

    public ListContactsShrinkRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
