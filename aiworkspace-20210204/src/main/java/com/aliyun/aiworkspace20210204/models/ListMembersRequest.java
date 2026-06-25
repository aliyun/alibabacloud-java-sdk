// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListMembersRequest extends TeaModel {
    /**
     * <p>Username. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>zhangsan</p>
     */
    @NameInMap("MemberName")
    public String memberName;

    /**
     * <p>Page number. Pages start at 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>Number of entries per page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Roles used to filter members. Separate multiple roles with commas (,). Valid values:</p>
     * <ul>
     * <li><p>PAI.AlgoDeveloper: Algorithm developer</p>
     * </li>
     * <li><p>PAI.AlgoOperator: Algorithm O\&amp;M engineer</p>
     * </li>
     * <li><p>PAI.LabelManager: Annotation administrator</p>
     * </li>
     * <li><p>PAI.MaxComputeDeveloper: MaxCompute developer</p>
     * </li>
     * <li><p>PAI.WorkspaceAdmin: Workspace administrator</p>
     * </li>
     * <li><p>PAI.WorkspaceGuest: Guest</p>
     * </li>
     * <li><p>PAI.WorkspaceOwner: Workspace owner</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PAI.AlgoDeveloper</p>
     */
    @NameInMap("Roles")
    public String roles;

    /**
     * <strong>example:</strong>
     * <p>2788******129</p>
     */
    @NameInMap("UserId")
    public String userId;

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

    public ListMembersRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
