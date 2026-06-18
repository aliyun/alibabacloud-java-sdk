// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeGroupsRequest extends TeaModel {
    /**
     * <blockquote>
     * <p>This parameter is for internal use only.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("BusinessChannel")
    public String businessChannel;

    /**
     * <p>Specifies whether to exclude user groups that are already associated with a logon policy.</p>
     */
    @NameInMap("ExcludeAttachedLoginPolicyGroups")
    public Boolean excludeAttachedLoginPolicyGroups;

    /**
     * <p>The ID of the user group.</p>
     * 
     * <strong>example:</strong>
     * <p>ug-16nf7xxh4o9gc****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The name of the user group.</p>
     * 
     * <strong>example:</strong>
     * <p>TestGroup</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("IdpId")
    public String idpId;

    /**
     * <p>The ID of a logon policy. If you specify this parameter, the call returns only user groups associated with the policy.</p>
     */
    @NameInMap("LoginPolicyId")
    public String loginPolicyId;

    /**
     * <p>The page number to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Maximum value: 100. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <blockquote>
     * <p>This parameter is for internal use only.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>co-0esnf80jab***</p>
     */
    @NameInMap("SolutionId")
    public String solutionId;

    /**
     * <p>Specifies whether file approval is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("TransferFileNeedApproval")
    public Boolean transferFileNeedApproval;

    public static DescribeGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupsRequest self = new DescribeGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGroupsRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DescribeGroupsRequest setBusinessChannel(String businessChannel) {
        this.businessChannel = businessChannel;
        return this;
    }
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    public DescribeGroupsRequest setExcludeAttachedLoginPolicyGroups(Boolean excludeAttachedLoginPolicyGroups) {
        this.excludeAttachedLoginPolicyGroups = excludeAttachedLoginPolicyGroups;
        return this;
    }
    public Boolean getExcludeAttachedLoginPolicyGroups() {
        return this.excludeAttachedLoginPolicyGroups;
    }

    public DescribeGroupsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeGroupsRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DescribeGroupsRequest setIdpId(String idpId) {
        this.idpId = idpId;
        return this;
    }
    public String getIdpId() {
        return this.idpId;
    }

    public DescribeGroupsRequest setLoginPolicyId(String loginPolicyId) {
        this.loginPolicyId = loginPolicyId;
        return this;
    }
    public String getLoginPolicyId() {
        return this.loginPolicyId;
    }

    public DescribeGroupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGroupsRequest setSolutionId(String solutionId) {
        this.solutionId = solutionId;
        return this;
    }
    public String getSolutionId() {
        return this.solutionId;
    }

    public DescribeGroupsRequest setTransferFileNeedApproval(Boolean transferFileNeedApproval) {
        this.transferFileNeedApproval = transferFileNeedApproval;
        return this;
    }
    public Boolean getTransferFileNeedApproval() {
        return this.transferFileNeedApproval;
    }

}
