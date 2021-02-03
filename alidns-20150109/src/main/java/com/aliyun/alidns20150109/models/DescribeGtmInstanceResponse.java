// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("InstanceName")
    @Validation(required = true)
    public String instanceName;

    @NameInMap("VersionCode")
    @Validation(required = true)
    public String versionCode;

    @NameInMap("ExpireTime")
    @Validation(required = true)
    public String expireTime;

    @NameInMap("ExpireTimestamp")
    @Validation(required = true)
    public Long expireTimestamp;

    @NameInMap("Cname")
    @Validation(required = true)
    public String cname;

    @NameInMap("UserDomainName")
    @Validation(required = true)
    public String userDomainName;

    @NameInMap("Ttl")
    @Validation(required = true)
    public Integer ttl;

    @NameInMap("LbaStrategy")
    @Validation(required = true)
    public String lbaStrategy;

    @NameInMap("CreateTime")
    @Validation(required = true)
    public String createTime;

    @NameInMap("CreateTimestamp")
    @Validation(required = true)
    public Long createTimestamp;

    @NameInMap("AlertGroup")
    @Validation(required = true)
    public String alertGroup;

    @NameInMap("CnameMode")
    @Validation(required = true)
    public String cnameMode;

    @NameInMap("AccessStrategyNum")
    @Validation(required = true)
    public Integer accessStrategyNum;

    @NameInMap("AddressPoolNum")
    @Validation(required = true)
    public Integer addressPoolNum;

    public static DescribeGtmInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmInstanceResponse self = new DescribeGtmInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGtmInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGtmInstanceResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeGtmInstanceResponse setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DescribeGtmInstanceResponse setVersionCode(String versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public String getVersionCode() {
        return this.versionCode;
    }

    public DescribeGtmInstanceResponse setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribeGtmInstanceResponse setExpireTimestamp(Long expireTimestamp) {
        this.expireTimestamp = expireTimestamp;
        return this;
    }
    public Long getExpireTimestamp() {
        return this.expireTimestamp;
    }

    public DescribeGtmInstanceResponse setCname(String cname) {
        this.cname = cname;
        return this;
    }
    public String getCname() {
        return this.cname;
    }

    public DescribeGtmInstanceResponse setUserDomainName(String userDomainName) {
        this.userDomainName = userDomainName;
        return this;
    }
    public String getUserDomainName() {
        return this.userDomainName;
    }

    public DescribeGtmInstanceResponse setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public DescribeGtmInstanceResponse setLbaStrategy(String lbaStrategy) {
        this.lbaStrategy = lbaStrategy;
        return this;
    }
    public String getLbaStrategy() {
        return this.lbaStrategy;
    }

    public DescribeGtmInstanceResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeGtmInstanceResponse setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public DescribeGtmInstanceResponse setAlertGroup(String alertGroup) {
        this.alertGroup = alertGroup;
        return this;
    }
    public String getAlertGroup() {
        return this.alertGroup;
    }

    public DescribeGtmInstanceResponse setCnameMode(String cnameMode) {
        this.cnameMode = cnameMode;
        return this;
    }
    public String getCnameMode() {
        return this.cnameMode;
    }

    public DescribeGtmInstanceResponse setAccessStrategyNum(Integer accessStrategyNum) {
        this.accessStrategyNum = accessStrategyNum;
        return this;
    }
    public Integer getAccessStrategyNum() {
        return this.accessStrategyNum;
    }

    public DescribeGtmInstanceResponse setAddressPoolNum(Integer addressPoolNum) {
        this.addressPoolNum = addressPoolNum;
        return this;
    }
    public Integer getAddressPoolNum() {
        return this.addressPoolNum;
    }

}
