// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeUserBuyStatusResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeUserBuyStatusResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUserBuyStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserBuyStatusResponseBody self = new DescribeUserBuyStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserBuyStatusResponseBody setData(DescribeUserBuyStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeUserBuyStatusResponseBodyData getData() {
        return this.data;
    }

    public DescribeUserBuyStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUserBuyStatusResponseBodyData extends TeaModel {
        @NameInMap("CanBuy")
        public Boolean canBuy;

        @NameInMap("Capacity")
        public Integer capacity;

        @NameInMap("DurationDays")
        public Long durationDays;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("MainUserId")
        public Long mainUserId;

        @NameInMap("MainUserName")
        public String mainUserName;

        @NameInMap("MasterUserId")
        public Long masterUserId;

        @NameInMap("MasterUserName")
        public String masterUserName;

        @NameInMap("SasInstanceId")
        public String sasInstanceId;

        @NameInMap("SubUserId")
        public Long subUserId;

        @NameInMap("SubUserName")
        public String subUserName;

        public static DescribeUserBuyStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserBuyStatusResponseBodyData self = new DescribeUserBuyStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeUserBuyStatusResponseBodyData setCanBuy(Boolean canBuy) {
            this.canBuy = canBuy;
            return this;
        }
        public Boolean getCanBuy() {
            return this.canBuy;
        }

        public DescribeUserBuyStatusResponseBodyData setCapacity(Integer capacity) {
            this.capacity = capacity;
            return this;
        }
        public Integer getCapacity() {
            return this.capacity;
        }

        public DescribeUserBuyStatusResponseBodyData setDurationDays(Long durationDays) {
            this.durationDays = durationDays;
            return this;
        }
        public Long getDurationDays() {
            return this.durationDays;
        }

        public DescribeUserBuyStatusResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeUserBuyStatusResponseBodyData setMainUserId(Long mainUserId) {
            this.mainUserId = mainUserId;
            return this;
        }
        public Long getMainUserId() {
            return this.mainUserId;
        }

        public DescribeUserBuyStatusResponseBodyData setMainUserName(String mainUserName) {
            this.mainUserName = mainUserName;
            return this;
        }
        public String getMainUserName() {
            return this.mainUserName;
        }

        public DescribeUserBuyStatusResponseBodyData setMasterUserId(Long masterUserId) {
            this.masterUserId = masterUserId;
            return this;
        }
        public Long getMasterUserId() {
            return this.masterUserId;
        }

        public DescribeUserBuyStatusResponseBodyData setMasterUserName(String masterUserName) {
            this.masterUserName = masterUserName;
            return this;
        }
        public String getMasterUserName() {
            return this.masterUserName;
        }

        public DescribeUserBuyStatusResponseBodyData setSasInstanceId(String sasInstanceId) {
            this.sasInstanceId = sasInstanceId;
            return this;
        }
        public String getSasInstanceId() {
            return this.sasInstanceId;
        }

        public DescribeUserBuyStatusResponseBodyData setSubUserId(Long subUserId) {
            this.subUserId = subUserId;
            return this;
        }
        public Long getSubUserId() {
            return this.subUserId;
        }

        public DescribeUserBuyStatusResponseBodyData setSubUserName(String subUserName) {
            this.subUserName = subUserName;
            return this;
        }
        public String getSubUserName() {
            return this.subUserName;
        }

    }

}
