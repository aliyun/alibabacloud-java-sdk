// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListProjectsOfMemberRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MemberBaseId")
    public String memberBaseId;

    @NameInMap("MemberRoleCode")
    public String memberRoleCode;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListProjectsOfMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsOfMemberRequest self = new ListProjectsOfMemberRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectsOfMemberRequest setMemberBaseId(String memberBaseId) {
        this.memberBaseId = memberBaseId;
        return this;
    }
    public String getMemberBaseId() {
        return this.memberBaseId;
    }

    public ListProjectsOfMemberRequest setMemberRoleCode(String memberRoleCode) {
        this.memberRoleCode = memberRoleCode;
        return this;
    }
    public String getMemberRoleCode() {
        return this.memberRoleCode;
    }

    public ListProjectsOfMemberRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public ListProjectsOfMemberRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListProjectsOfMemberRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
