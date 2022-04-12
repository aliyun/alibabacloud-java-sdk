// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class TotalAppliedConsumStatResponseBody extends TeaModel {
    // 业务处理结果Code
    @NameInMap("Code")
    public String code;

    // 业务对象
    @NameInMap("Data")
    public java.util.List<TotalAppliedConsumStatResponseBodyData> data;

    // 业务处理消息摘要
    @NameInMap("Message")
    public String message;

    // 操作请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 业务处理是否成功
    @NameInMap("Success")
    public Boolean success;

    public static TotalAppliedConsumStatResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TotalAppliedConsumStatResponseBody self = new TotalAppliedConsumStatResponseBody();
        return TeaModel.build(map, self);
    }

    public TotalAppliedConsumStatResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TotalAppliedConsumStatResponseBody setData(java.util.List<TotalAppliedConsumStatResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<TotalAppliedConsumStatResponseBodyData> getData() {
        return this.data;
    }

    public TotalAppliedConsumStatResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TotalAppliedConsumStatResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TotalAppliedConsumStatResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TotalAppliedConsumStatResponseBodyData extends TeaModel {
        // 应用ID
        @NameInMap("AppliedId")
        public String appliedId;

        // 分钟级消耗CU
        @NameInMap("ConsumptionCu")
        public Long consumptionCu;

        // 统计日期
        @NameInMap("StatDate")
        public String statDate;

        public static TotalAppliedConsumStatResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TotalAppliedConsumStatResponseBodyData self = new TotalAppliedConsumStatResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TotalAppliedConsumStatResponseBodyData setAppliedId(String appliedId) {
            this.appliedId = appliedId;
            return this;
        }
        public String getAppliedId() {
            return this.appliedId;
        }

        public TotalAppliedConsumStatResponseBodyData setConsumptionCu(Long consumptionCu) {
            this.consumptionCu = consumptionCu;
            return this;
        }
        public Long getConsumptionCu() {
            return this.consumptionCu;
        }

        public TotalAppliedConsumStatResponseBodyData setStatDate(String statDate) {
            this.statDate = statDate;
            return this;
        }
        public String getStatDate() {
            return this.statDate;
        }

    }

}
