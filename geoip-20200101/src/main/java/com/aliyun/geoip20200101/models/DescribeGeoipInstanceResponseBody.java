// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.geoip20200101.models;

import com.aliyun.tea.*;

public class DescribeGeoipInstanceResponseBody extends TeaModel {
    @NameInMap("ExpireTimestamp")
    public Long expireTimestamp;

    @NameInMap("VersionCode")
    public String versionCode;

    @NameInMap("MaxQpd")
    public Long maxQpd;

    @NameInMap("MaxQps")
    public Long maxQps;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("QueryCount")
    public Long queryCount;

    @NameInMap("ExpireTime")
    public String expireTime;

    @NameInMap("CreateTimestamp")
    public Long createTimestamp;

    public static DescribeGeoipInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGeoipInstanceResponseBody self = new DescribeGeoipInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGeoipInstanceResponseBody setExpireTimestamp(Long expireTimestamp) {
        this.expireTimestamp = expireTimestamp;
        return this;
    }
    public Long getExpireTimestamp() {
        return this.expireTimestamp;
    }

    public DescribeGeoipInstanceResponseBody setVersionCode(String versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public String getVersionCode() {
        return this.versionCode;
    }

    public DescribeGeoipInstanceResponseBody setMaxQpd(Long maxQpd) {
        this.maxQpd = maxQpd;
        return this;
    }
    public Long getMaxQpd() {
        return this.maxQpd;
    }

    public DescribeGeoipInstanceResponseBody setMaxQps(Long maxQps) {
        this.maxQps = maxQps;
        return this;
    }
    public Long getMaxQps() {
        return this.maxQps;
    }

    public DescribeGeoipInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGeoipInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeGeoipInstanceResponseBody setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public DescribeGeoipInstanceResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeGeoipInstanceResponseBody setQueryCount(Long queryCount) {
        this.queryCount = queryCount;
        return this;
    }
    public Long getQueryCount() {
        return this.queryCount;
    }

    public DescribeGeoipInstanceResponseBody setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public DescribeGeoipInstanceResponseBody setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

}
