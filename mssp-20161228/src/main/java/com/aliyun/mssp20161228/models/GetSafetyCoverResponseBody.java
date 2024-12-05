// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetSafetyCoverResponseBody extends TeaModel {
    /**
     * <p>API return code.</p>
     * 
     * <strong>example:</strong>
     * <p>404</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data query result.</p>
     */
    @NameInMap("Data")
    public GetSafetyCoverResponseBodyData data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Message of the response result.</p>
     * 
     * <strong>example:</strong>
     * <p>system error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>564f8bb9-df3c-42a0-877a-b35d48f66603</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether the call was successful:</p>
     * <ul>
     * <li><strong>true</strong>: Call succeeded.</li>
     * <li><strong>false</strong>: Call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetSafetyCoverResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSafetyCoverResponseBody self = new GetSafetyCoverResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSafetyCoverResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSafetyCoverResponseBody setData(GetSafetyCoverResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSafetyCoverResponseBodyData getData() {
        return this.data;
    }

    public GetSafetyCoverResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetSafetyCoverResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSafetyCoverResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSafetyCoverResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSafetyCoverResponseBodyDataCfwProtection extends TeaModel {
        /**
         * <p>Number of unprotected items.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("NoProtectionCount")
        public Long noProtectionCount;

        /**
         * <p>Number of protected items.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ProtectionCount")
        public Long protectionCount;

        /**
         * <p>Year-over-year protection rate.</p>
         * 
         * <strong>example:</strong>
         * <p>35.00</p>
         */
        @NameInMap("ProtectionGrowthRate")
        public String protectionGrowthRate;

        /**
         * <p>Protection rate.</p>
         * 
         * <strong>example:</strong>
         * <p>50.00</p>
         */
        @NameInMap("ProtectionRate")
        public String protectionRate;

        /**
         * <p>Total quantity.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetSafetyCoverResponseBodyDataCfwProtection build(java.util.Map<String, ?> map) throws Exception {
            GetSafetyCoverResponseBodyDataCfwProtection self = new GetSafetyCoverResponseBodyDataCfwProtection();
            return TeaModel.build(map, self);
        }

        public GetSafetyCoverResponseBodyDataCfwProtection setNoProtectionCount(Long noProtectionCount) {
            this.noProtectionCount = noProtectionCount;
            return this;
        }
        public Long getNoProtectionCount() {
            return this.noProtectionCount;
        }

        public GetSafetyCoverResponseBodyDataCfwProtection setProtectionCount(Long protectionCount) {
            this.protectionCount = protectionCount;
            return this;
        }
        public Long getProtectionCount() {
            return this.protectionCount;
        }

        public GetSafetyCoverResponseBodyDataCfwProtection setProtectionGrowthRate(String protectionGrowthRate) {
            this.protectionGrowthRate = protectionGrowthRate;
            return this;
        }
        public String getProtectionGrowthRate() {
            return this.protectionGrowthRate;
        }

        public GetSafetyCoverResponseBodyDataCfwProtection setProtectionRate(String protectionRate) {
            this.protectionRate = protectionRate;
            return this;
        }
        public String getProtectionRate() {
            return this.protectionRate;
        }

        public GetSafetyCoverResponseBodyDataCfwProtection setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class GetSafetyCoverResponseBodyDataEcsProtection extends TeaModel {
        /**
         * <p>Number of unprotected items.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("NoProtectionCount")
        public Long noProtectionCount;

        /**
         * <p>Number of protected items.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ProtectionCount")
        public Long protectionCount;

        /**
         * <p>Year-over-year growth in protection rate.</p>
         * 
         * <strong>example:</strong>
         * <p>35.00</p>
         */
        @NameInMap("ProtectionGrowthRate")
        public String protectionGrowthRate;

        /**
         * <p>Protection rate.</p>
         * 
         * <strong>example:</strong>
         * <p>50.00</p>
         */
        @NameInMap("ProtectionRate")
        public String protectionRate;

        /**
         * <p>Total number of items.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetSafetyCoverResponseBodyDataEcsProtection build(java.util.Map<String, ?> map) throws Exception {
            GetSafetyCoverResponseBodyDataEcsProtection self = new GetSafetyCoverResponseBodyDataEcsProtection();
            return TeaModel.build(map, self);
        }

        public GetSafetyCoverResponseBodyDataEcsProtection setNoProtectionCount(Long noProtectionCount) {
            this.noProtectionCount = noProtectionCount;
            return this;
        }
        public Long getNoProtectionCount() {
            return this.noProtectionCount;
        }

        public GetSafetyCoverResponseBodyDataEcsProtection setProtectionCount(Long protectionCount) {
            this.protectionCount = protectionCount;
            return this;
        }
        public Long getProtectionCount() {
            return this.protectionCount;
        }

        public GetSafetyCoverResponseBodyDataEcsProtection setProtectionGrowthRate(String protectionGrowthRate) {
            this.protectionGrowthRate = protectionGrowthRate;
            return this;
        }
        public String getProtectionGrowthRate() {
            return this.protectionGrowthRate;
        }

        public GetSafetyCoverResponseBodyDataEcsProtection setProtectionRate(String protectionRate) {
            this.protectionRate = protectionRate;
            return this;
        }
        public String getProtectionRate() {
            return this.protectionRate;
        }

        public GetSafetyCoverResponseBodyDataEcsProtection setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class GetSafetyCoverResponseBodyDataWafProtection extends TeaModel {
        /**
         * <p>Number of unprotected items.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("NoProtectionCount")
        public Long noProtectionCount;

        /**
         * <p>Number of protected items.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ProtectionCount")
        public Long protectionCount;

        /**
         * <p>Year-over-year growth in protection rate.</p>
         * 
         * <strong>example:</strong>
         * <p>35.00</p>
         */
        @NameInMap("ProtectionGrowthRate")
        public String protectionGrowthRate;

        /**
         * <p>Protection rate.</p>
         * 
         * <strong>example:</strong>
         * <p>50.00</p>
         */
        @NameInMap("ProtectionRate")
        public String protectionRate;

        /**
         * <p>Total number of items.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetSafetyCoverResponseBodyDataWafProtection build(java.util.Map<String, ?> map) throws Exception {
            GetSafetyCoverResponseBodyDataWafProtection self = new GetSafetyCoverResponseBodyDataWafProtection();
            return TeaModel.build(map, self);
        }

        public GetSafetyCoverResponseBodyDataWafProtection setNoProtectionCount(Long noProtectionCount) {
            this.noProtectionCount = noProtectionCount;
            return this;
        }
        public Long getNoProtectionCount() {
            return this.noProtectionCount;
        }

        public GetSafetyCoverResponseBodyDataWafProtection setProtectionCount(Long protectionCount) {
            this.protectionCount = protectionCount;
            return this;
        }
        public Long getProtectionCount() {
            return this.protectionCount;
        }

        public GetSafetyCoverResponseBodyDataWafProtection setProtectionGrowthRate(String protectionGrowthRate) {
            this.protectionGrowthRate = protectionGrowthRate;
            return this;
        }
        public String getProtectionGrowthRate() {
            return this.protectionGrowthRate;
        }

        public GetSafetyCoverResponseBodyDataWafProtection setProtectionRate(String protectionRate) {
            this.protectionRate = protectionRate;
            return this;
        }
        public String getProtectionRate() {
            return this.protectionRate;
        }

        public GetSafetyCoverResponseBodyDataWafProtection setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class GetSafetyCoverResponseBodyData extends TeaModel {
        /**
         * <p>CFW protection coverage.</p>
         */
        @NameInMap("CfwProtection")
        public GetSafetyCoverResponseBodyDataCfwProtection cfwProtection;

        /**
         * <p>ECS protection coverage.</p>
         */
        @NameInMap("EcsProtection")
        public GetSafetyCoverResponseBodyDataEcsProtection ecsProtection;

        /**
         * <p>WAF protection coverage.</p>
         */
        @NameInMap("WafProtection")
        public GetSafetyCoverResponseBodyDataWafProtection wafProtection;

        public static GetSafetyCoverResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSafetyCoverResponseBodyData self = new GetSafetyCoverResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSafetyCoverResponseBodyData setCfwProtection(GetSafetyCoverResponseBodyDataCfwProtection cfwProtection) {
            this.cfwProtection = cfwProtection;
            return this;
        }
        public GetSafetyCoverResponseBodyDataCfwProtection getCfwProtection() {
            return this.cfwProtection;
        }

        public GetSafetyCoverResponseBodyData setEcsProtection(GetSafetyCoverResponseBodyDataEcsProtection ecsProtection) {
            this.ecsProtection = ecsProtection;
            return this;
        }
        public GetSafetyCoverResponseBodyDataEcsProtection getEcsProtection() {
            return this.ecsProtection;
        }

        public GetSafetyCoverResponseBodyData setWafProtection(GetSafetyCoverResponseBodyDataWafProtection wafProtection) {
            this.wafProtection = wafProtection;
            return this;
        }
        public GetSafetyCoverResponseBodyDataWafProtection getWafProtection() {
            return this.wafProtection;
        }

    }

}
