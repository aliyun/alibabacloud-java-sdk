// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CheckCommodityStatusResponseBody extends TeaModel {
    /**
     * <p>The commodity status list. Each item contains the commodity code and indicates whether the commodity capability is enabled for the current account.</p>
     */
    @NameInMap("commodities")
    public java.util.List<CheckCommodityStatusResponseBodyCommodities> commodities;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CheckCommodityStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckCommodityStatusResponseBody self = new CheckCommodityStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckCommodityStatusResponseBody setCommodities(java.util.List<CheckCommodityStatusResponseBodyCommodities> commodities) {
        this.commodities = commodities;
        return this;
    }
    public java.util.List<CheckCommodityStatusResponseBodyCommodities> getCommodities() {
        return this.commodities;
    }

    public CheckCommodityStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CheckCommodityStatusResponseBodyCommodities extends TeaModel {
        /**
         * <p>The commodity code.</p>
         * 
         * <strong>example:</strong>
         * <p>apigateway_aicredits_public_cn</p>
         */
        @NameInMap("commodityCode")
        public String commodityCode;

        /**
         * <p>Indicates whether the commodity capability is enabled for the current account.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        public static CheckCommodityStatusResponseBodyCommodities build(java.util.Map<String, ?> map) throws Exception {
            CheckCommodityStatusResponseBodyCommodities self = new CheckCommodityStatusResponseBodyCommodities();
            return TeaModel.build(map, self);
        }

        public CheckCommodityStatusResponseBodyCommodities setCommodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }
        public String getCommodityCode() {
            return this.commodityCode;
        }

        public CheckCommodityStatusResponseBodyCommodities setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

    }

}
