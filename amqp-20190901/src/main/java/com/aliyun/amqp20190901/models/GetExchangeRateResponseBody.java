// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetExchangeRateResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public GetExchangeRateResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetExchangeRateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExchangeRateResponseBody self = new GetExchangeRateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExchangeRateResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetExchangeRateResponseBody setData(GetExchangeRateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetExchangeRateResponseBodyData getData() {
        return this.data;
    }

    public GetExchangeRateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetExchangeRateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetExchangeRateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetExchangeRateResponseBodyDataExchangeQuotaVO extends TeaModel {
        @NameInMap("ExchangeName")
        public String exchangeName;

        @NameInMap("InQps")
        public Long inQps;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("OutQps")
        public Long outQps;

        @NameInMap("VhostName")
        public String vhostName;

        public static GetExchangeRateResponseBodyDataExchangeQuotaVO build(java.util.Map<String, ?> map) throws Exception {
            GetExchangeRateResponseBodyDataExchangeQuotaVO self = new GetExchangeRateResponseBodyDataExchangeQuotaVO();
            return TeaModel.build(map, self);
        }

        public GetExchangeRateResponseBodyDataExchangeQuotaVO setExchangeName(String exchangeName) {
            this.exchangeName = exchangeName;
            return this;
        }
        public String getExchangeName() {
            return this.exchangeName;
        }

        public GetExchangeRateResponseBodyDataExchangeQuotaVO setInQps(Long inQps) {
            this.inQps = inQps;
            return this;
        }
        public Long getInQps() {
            return this.inQps;
        }

        public GetExchangeRateResponseBodyDataExchangeQuotaVO setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetExchangeRateResponseBodyDataExchangeQuotaVO setOutQps(Long outQps) {
            this.outQps = outQps;
            return this;
        }
        public Long getOutQps() {
            return this.outQps;
        }

        public GetExchangeRateResponseBodyDataExchangeQuotaVO setVhostName(String vhostName) {
            this.vhostName = vhostName;
            return this;
        }
        public String getVhostName() {
            return this.vhostName;
        }

    }

    public static class GetExchangeRateResponseBodyData extends TeaModel {
        @NameInMap("ExchangeQuotaVO")
        public java.util.List<GetExchangeRateResponseBodyDataExchangeQuotaVO> exchangeQuotaVO;

        public static GetExchangeRateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetExchangeRateResponseBodyData self = new GetExchangeRateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetExchangeRateResponseBodyData setExchangeQuotaVO(java.util.List<GetExchangeRateResponseBodyDataExchangeQuotaVO> exchangeQuotaVO) {
            this.exchangeQuotaVO = exchangeQuotaVO;
            return this;
        }
        public java.util.List<GetExchangeRateResponseBodyDataExchangeQuotaVO> getExchangeQuotaVO() {
            return this.exchangeQuotaVO;
        }

    }

}
