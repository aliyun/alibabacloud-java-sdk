// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeClusterUsedUtilizationRequest extends TeaModel {
    // callType=AssumedRoleUser
    @NameInMap("AccountId")
    public String accountId;

    // 幂等性验证
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DedicatedClusterId")
    public String dedicatedClusterId;

    // migration job id
    @NameInMap("DtsJobId")
    public String dtsJobId;

    @NameInMap("Env")
    public String env;

    @NameInMap("MetricType")
    public String metricType;

    // OwnerID
    @NameInMap("OwnerID")
    public String ownerID;

    @NameInMap("RegionId")
    public String regionId;

    // callType=AssumedRoleUser
    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeClusterUsedUtilizationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterUsedUtilizationRequest self = new DescribeClusterUsedUtilizationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterUsedUtilizationRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public DescribeClusterUsedUtilizationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeClusterUsedUtilizationRequest setDedicatedClusterId(String dedicatedClusterId) {
        this.dedicatedClusterId = dedicatedClusterId;
        return this;
    }
    public String getDedicatedClusterId() {
        return this.dedicatedClusterId;
    }

    public DescribeClusterUsedUtilizationRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public DescribeClusterUsedUtilizationRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public DescribeClusterUsedUtilizationRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public DescribeClusterUsedUtilizationRequest setOwnerID(String ownerID) {
        this.ownerID = ownerID;
        return this;
    }
    public String getOwnerID() {
        return this.ownerID;
    }

    public DescribeClusterUsedUtilizationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeClusterUsedUtilizationRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
