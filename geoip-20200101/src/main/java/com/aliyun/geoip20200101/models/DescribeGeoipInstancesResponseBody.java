// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.geoip20200101.models;

import com.aliyun.tea.*;

public class DescribeGeoipInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("GeoipInstances")
    public DescribeGeoipInstancesResponseBodyGeoipInstances geoipInstances;

    public static DescribeGeoipInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGeoipInstancesResponseBody self = new DescribeGeoipInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGeoipInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGeoipInstancesResponseBody setGeoipInstances(DescribeGeoipInstancesResponseBodyGeoipInstances geoipInstances) {
        this.geoipInstances = geoipInstances;
        return this;
    }
    public DescribeGeoipInstancesResponseBodyGeoipInstances getGeoipInstances() {
        return this.geoipInstances;
    }

    public static class DescribeGeoipInstancesResponseBodyGeoipInstancesGeoipInstance extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("ExpireTimestamp")
        public Long expireTimestamp;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("MaxQps")
        public Long maxQps;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("MaxQpd")
        public Long maxQpd;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("VersionCode")
        public String versionCode;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        @NameInMap("ProductCode")
        public String productCode;

        public static DescribeGeoipInstancesResponseBodyGeoipInstancesGeoipInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeGeoipInstancesResponseBodyGeoipInstancesGeoipInstance self = new DescribeGeoipInstancesResponseBodyGeoipInstancesGeoipInstance();
            return TeaModel.build(map, self);
        }

        public DescribeGeoipInstancesResponseBodyGeoipInstancesGeoipInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeGeoipInstancesResponseBodyGeoipInstancesGeoipInstance setExpireTimestamp(Long expireTimestamp) {
            this.expireTimestamp = expireTimestamp;
            return this;
        }
        public Long getExpireTimestamp() {
            return this.expireTimestamp;
        }

        public DescribeGeoipInstancesResponseBodyGeoipInstancesGeoipInstance setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeGeoipInstancesResponseBodyGeoipInstancesGeoipInstance setMaxQps(Long maxQps) {
            this.maxQps = maxQps;
            return this;
        }
        public Long getMaxQps() {
            return this.maxQps;
        }

        public DescribeGeoipInstancesResponseBodyGeoipInstancesGeoipInstance setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeGeoipInstancesResponseBodyGeoipInstancesGeoipInstance setMaxQpd(Long maxQpd) {
            this.maxQpd = maxQpd;
            return this;
        }
        public Long getMaxQpd() {
            return this.maxQpd;
        }

        public DescribeGeoipInstancesResponseBodyGeoipInstancesGeoipInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeGeoipInstancesResponseBodyGeoipInstancesGeoipInstance setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

        public DescribeGeoipInstancesResponseBodyGeoipInstancesGeoipInstance setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public DescribeGeoipInstancesResponseBodyGeoipInstancesGeoipInstance setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

    }

    public static class DescribeGeoipInstancesResponseBodyGeoipInstances extends TeaModel {
        @NameInMap("GeoipInstance")
        public java.util.List<DescribeGeoipInstancesResponseBodyGeoipInstancesGeoipInstance> geoipInstance;

        public static DescribeGeoipInstancesResponseBodyGeoipInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeGeoipInstancesResponseBodyGeoipInstances self = new DescribeGeoipInstancesResponseBodyGeoipInstances();
            return TeaModel.build(map, self);
        }

        public DescribeGeoipInstancesResponseBodyGeoipInstances setGeoipInstance(java.util.List<DescribeGeoipInstancesResponseBodyGeoipInstancesGeoipInstance> geoipInstance) {
            this.geoipInstance = geoipInstance;
            return this;
        }
        public java.util.List<DescribeGeoipInstancesResponseBodyGeoipInstancesGeoipInstance> getGeoipInstance() {
            return this.geoipInstance;
        }

    }

}
