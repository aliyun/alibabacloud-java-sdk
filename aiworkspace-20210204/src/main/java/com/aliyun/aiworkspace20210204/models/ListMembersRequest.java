// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListMembersRequest extends TeaModel {
    @NameInMap("MemberName")
    public String memberName;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Roles")
    public String roles;

    public static ListMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMembersRequest self = new ListMembersRequest();
        return TeaModel.build(map, self);
    }

    public ListMembersRequest setMemberName(String memberName) {
        this.memberName = memberName;
        return this;
    }
    public String getMemberName() {
        return this.memberName;
    }

    public ListMembersRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListMembersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMembersRequest setRoles(String roles) {
        this.roles = roles;
        return this;
    }
    public String getRoles() {
        return this.roles;
    }

}
