// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeWaitingOrdersResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<Data> data;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeWaitingOrdersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeWaitingOrdersResponseBody self = new DescribeWaitingOrdersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeWaitingOrdersResponseBody setData(java.util.List<Data> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Data> getData() {
        return this.data;
    }

    public DescribeWaitingOrdersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeWaitingOrdersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeWaitingOrdersResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class InstanceInfos extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ResultCode")
        public String resultCode;

        public static InstanceInfos build(java.util.Map<String, ?> map) throws Exception {
            InstanceInfos self = new InstanceInfos();
            return TeaModel.build(map, self);
        }

        public InstanceInfos setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public InstanceInfos setResultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public String getResultCode() {
            return this.resultCode;
        }

    }

    public static class Data extends TeaModel {
        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("FailedMessage")
        public String failedMessage;

        @NameInMap("InstanceAmount")
        public Long instanceAmount;

        @NameInMap("InstanceInfos")
        public java.util.List<InstanceInfos> instanceInfos;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("LxCreateParam")
        public String lxCreateParam;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

        @NameInMap("SuccessAmount")
        public Long successAmount;

        @NameInMap("WaitingOrderId")
        public String waitingOrderId;

        @NameInMap("ZoneId")
        public String zoneId;

        public static Data build(java.util.Map<String, ?> map) throws Exception {
            Data self = new Data();
            return TeaModel.build(map, self);
        }

        public Data setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public Data setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public Data setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public Data setFailedMessage(String failedMessage) {
            this.failedMessage = failedMessage;
            return this;
        }
        public String getFailedMessage() {
            return this.failedMessage;
        }

        public Data setInstanceAmount(Long instanceAmount) {
            this.instanceAmount = instanceAmount;
            return this;
        }
        public Long getInstanceAmount() {
            return this.instanceAmount;
        }

        public Data setInstanceInfos(java.util.List<InstanceInfos> instanceInfos) {
            this.instanceInfos = instanceInfos;
            return this;
        }
        public java.util.List<InstanceInfos> getInstanceInfos() {
            return this.instanceInfos;
        }

        public Data setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public Data setLxCreateParam(String lxCreateParam) {
            this.lxCreateParam = lxCreateParam;
            return this;
        }
        public String getLxCreateParam() {
            return this.lxCreateParam;
        }

        public Data setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public Data setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public Data setSuccessAmount(Long successAmount) {
            this.successAmount = successAmount;
            return this;
        }
        public Long getSuccessAmount() {
            return this.successAmount;
        }

        public Data setWaitingOrderId(String waitingOrderId) {
            this.waitingOrderId = waitingOrderId;
            return this;
        }
        public String getWaitingOrderId() {
            return this.waitingOrderId;
        }

        public Data setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
