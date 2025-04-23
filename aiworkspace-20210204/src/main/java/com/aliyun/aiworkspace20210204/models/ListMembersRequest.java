// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListMembersRequest extends TeaModel {
    /**
     * <p>The member name. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>zhangsan</p>
     */
    @NameInMap("MemberName")
    public String memberName;

    /**
     * <p>The page number of the workspace list. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The roles that are used to filter members. Multiple roles are separated by commas (,). Valid values:</p>
     * <ul>
     * <li>PAI.AlgoDeveloper: algorithm developer</li>
     * <li>PAI.AlgoOperator: algorithm O\&amp;M engineer</li>
     * <li>PAI.LabelManager: labeling administrator</li>
     * <li>PAI.MaxComputeDeveloper: MaxCompute developer</li>
     * <li>PAI.WorkspaceAdmin: administrator</li>
     * <li>PAI.WorkspaceGuest: guest</li>
     * <li>PAI.WorkspaceOwner: owner</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PAI.AlgoDeveloper</p>
     */
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
