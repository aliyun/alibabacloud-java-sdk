// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListMembersRequest extends TeaModel {
    // 成员名
    @NameInMap("MemberName")
    public String memberName;

    // 分页，从1开始，默认1
    @NameInMap("PageNumber")
    public Long pageNumber;

    // 页大小，默认20
    @NameInMap("PageSize")
    public Integer pageSize;

    // Role 过滤列表，逗号分隔
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
