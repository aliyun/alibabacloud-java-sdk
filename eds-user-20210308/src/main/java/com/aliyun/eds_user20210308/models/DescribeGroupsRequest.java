// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeGroupsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ENTERPRISE</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <strong>example:</strong>
     * <p>ug-12341234****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>co-0esnf80jab***</p>
     */
    @NameInMap("SolutionId")
    public String solutionId;

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
