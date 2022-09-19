// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeDasAdvancedInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public DescribeDasAdvancedInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeDasAdvancedInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDasAdvancedInfoResponseBody self = new DescribeDasAdvancedInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDasAdvancedInfoResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DescribeDasAdvancedInfoResponseBody setData(DescribeDasAdvancedInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDasAdvancedInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeDasAdvancedInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDasAdvancedInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDasAdvancedInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDasAdvancedInfoResponseBodyData extends TeaModel {
        @NameInMap("CommodityInstanceId")
        public String commodityInstanceId;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Region")
        public String region;

        @NameInMap("Retention")
        public Long retention;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("UserId")
        public String userId;

        public static DescribeDasAdvancedInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDasAdvancedInfoResponseBodyData self = new DescribeDasAdvancedInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDasAdvancedInfoResponseBodyData setCommodityInstanceId(String commodityInstanceId) {
            this.commodityInstanceId = commodityInstanceId;
            return this;
        }
        public String getCommodityInstanceId() {
            return this.commodityInstanceId;
        }

        public DescribeDasAdvancedInfoResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeDasAdvancedInfoResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDasAdvancedInfoResponseBodyData setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeDasAdvancedInfoResponseBodyData setRetention(Long retention) {
            this.retention = retention;
            return this;
        }
        public Long getRetention() {
            return this.retention;
        }

        public DescribeDasAdvancedInfoResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeDasAdvancedInfoResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
