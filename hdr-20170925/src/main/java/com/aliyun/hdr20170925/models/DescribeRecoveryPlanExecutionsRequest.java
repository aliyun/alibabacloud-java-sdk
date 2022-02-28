// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeRecoveryPlanExecutionsRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RecoveryPlanId")
    public String recoveryPlanId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeRecoveryPlanExecutionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRecoveryPlanExecutionsRequest self = new DescribeRecoveryPlanExecutionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRecoveryPlanExecutionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRecoveryPlanExecutionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRecoveryPlanExecutionsRequest setRecoveryPlanId(String recoveryPlanId) {
        this.recoveryPlanId = recoveryPlanId;
        return this;
    }
    public String getRecoveryPlanId() {
        return this.recoveryPlanId;
    }

    public DescribeRecoveryPlanExecutionsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
