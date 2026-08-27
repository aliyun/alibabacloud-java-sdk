// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetRiskNotificationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetRiskNotificationResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>AE1BA0DF-D730-501D-B962-B8B1C23B4667</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetRiskNotificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRiskNotificationResponseBody self = new GetRiskNotificationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRiskNotificationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRiskNotificationResponseBody setData(GetRiskNotificationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRiskNotificationResponseBodyData getData() {
        return this.data;
    }

    public GetRiskNotificationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRiskNotificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRiskNotificationResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>gw-xxxx</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("isMute")
        public Boolean isMute;

        /**
         * <strong>example:</strong>
         * <p>GW_VERSION_EXPIRED</p>
         */
        @NameInMap("riskCode")
        public String riskCode;

        public static GetRiskNotificationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRiskNotificationResponseBodyData self = new GetRiskNotificationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRiskNotificationResponseBodyData setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public GetRiskNotificationResponseBodyData setIsMute(Boolean isMute) {
            this.isMute = isMute;
            return this;
        }
        public Boolean getIsMute() {
            return this.isMute;
        }

        public GetRiskNotificationResponseBodyData setRiskCode(String riskCode) {
            this.riskCode = riskCode;
            return this;
        }
        public String getRiskCode() {
            return this.riskCode;
        }

    }

}
