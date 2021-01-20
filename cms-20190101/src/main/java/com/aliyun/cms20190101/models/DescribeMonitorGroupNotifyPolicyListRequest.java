// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupNotifyPolicyListRequest extends TeaModel {
    @NameInMap("PolicyType")
    public String policyType;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("GroupId")
    public String groupId;

    public static DescribeMonitorGroupNotifyPolicyListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorGroupNotifyPolicyListRequest self = new DescribeMonitorGroupNotifyPolicyListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorGroupNotifyPolicyListRequest setPolicyType(String policyType) {
        this.policyType = policyType;
        return this;
    }
    public String getPolicyType() {
        return this.policyType;
    }

    public DescribeMonitorGroupNotifyPolicyListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMonitorGroupNotifyPolicyListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMonitorGroupNotifyPolicyListRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
