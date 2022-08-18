// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmInstanceResponseBody extends TeaModel {
    @NameInMap("AccessStrategyNum")
    public Integer accessStrategyNum;

    @NameInMap("AddressPoolNum")
    public Integer addressPoolNum;

    @NameInMap("AlertGroup")
    public String alertGroup;

    @NameInMap("Cname")
    public String cname;

    @NameInMap("CnameMode")
    public String cnameMode;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("CreateTimestamp")
    public Long createTimestamp;

    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("ExpireTimestamp")
    public Long expireTimestamp;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("LbaStrategy")
    public String lbaStrategy;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Ttl")
    public Integer ttl;

    @NameInMap("UserDomainName")
    public String userDomainName;

    @NameInMap("VersionCode")
    public String versionCode;

    public static DescribeGtmInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmInstanceResponseBody self = new DescribeGtmInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGtmInstanceResponseBody setAccessStrategyNum(Integer accessStrategyNum) {
        this.accessStrategyNum = accessStrategyNum;
        return this;
    }
    public Integer getAccessStrategyNum() {
        return this.accessStrategyNum;
    }

    public DescribeGtmInstanceResponseBody setAddressPoolNum(Integer addressPoolNum) {
        this.addressPoolNum = addressPoolNum;
        return this;
    }
    public Integer getAddressPoolNum() {
        return this.addressPoolNum;
    }

    public DescribeGtmInstanceResponseBody setAlertGroup(String alertGroup) {
        this.alertGroup = alertGroup;
        return this;
    }
    public String getAlertGroup() {
        return this.alertGroup;
    }

    public DescribeGtmInstanceResponseBody setCname(String cname) {
        this.cname = cname;
        return this;
    }
    public String getCname() {
        return this.cname;
    }

    public DescribeGtmInstanceResponseBody setCnameMode(String cnameMode) {
        this.cnameMode = cnameMode;
        return this;
    }
    public String getCnameMode() {
        return this.cnameMode;
    }

    public DescribeGtmInstanceResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeGtmInstanceResponseBody setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public DescribeGtmInstanceResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribeGtmInstanceResponseBody setExpireTimestamp(Long expireTimestamp) {
        this.expireTimestamp = expireTimestamp;
        return this;
    }
    public Long getExpireTimestamp() {
        return this.expireTimestamp;
    }

    public DescribeGtmInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeGtmInstanceResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeGtmInstanceResponseBody setLbaStrategy(String lbaStrategy) {
        this.lbaStrategy = lbaStrategy;
        return this;
    }
    public String getLbaStrategy() {
        return this.lbaStrategy;
    }

    public DescribeGtmInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGtmInstanceResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeGtmInstanceResponseBody setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public DescribeGtmInstanceResponseBody setUserDomainName(String userDomainName) {
        this.userDomainName = userDomainName;
        return this;
    }
    public String getUserDomainName() {
        return this.userDomainName;
    }

    public DescribeGtmInstanceResponseBody setVersionCode(String versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public String getVersionCode() {
        return this.versionCode;
    }

}
