// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetResourceOverviewResponseBody extends TeaModel {
    /**
     * <p>Response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Resource information.</p>
     */
    @NameInMap("data")
    public GetResourceOverviewResponseBodyData data;

    /**
     * <p>Response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD19A442-93C5-5C97-AFA0-B9C57EBD781B</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetResourceOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceOverviewResponseBody self = new GetResourceOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceOverviewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetResourceOverviewResponseBody setData(GetResourceOverviewResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetResourceOverviewResponseBodyData getData() {
        return this.data;
    }

    public GetResourceOverviewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetResourceOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetResourceOverviewResponseBodyDataApi extends TeaModel {
        /**
         * <p>Number of published APIs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("publishedCount")
        public Long publishedCount;

        /**
         * <p>Number of APIs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("totalCount")
        public Long totalCount;

        public static GetResourceOverviewResponseBodyDataApi build(java.util.Map<String, ?> map) throws Exception {
            GetResourceOverviewResponseBodyDataApi self = new GetResourceOverviewResponseBodyDataApi();
            return TeaModel.build(map, self);
        }

        public GetResourceOverviewResponseBodyDataApi setPublishedCount(Long publishedCount) {
            this.publishedCount = publishedCount;
            return this;
        }
        public Long getPublishedCount() {
            return this.publishedCount;
        }

        public GetResourceOverviewResponseBodyDataApi setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class GetResourceOverviewResponseBodyDataGateway extends TeaModel {
        /**
         * <p>Number of running gateways.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("runningCount")
        public Long runningCount;

        /**
         * <p>Number of gateway instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("totalCount")
        public Long totalCount;

        public static GetResourceOverviewResponseBodyDataGateway build(java.util.Map<String, ?> map) throws Exception {
            GetResourceOverviewResponseBodyDataGateway self = new GetResourceOverviewResponseBodyDataGateway();
            return TeaModel.build(map, self);
        }

        public GetResourceOverviewResponseBodyDataGateway setRunningCount(Long runningCount) {
            this.runningCount = runningCount;
            return this;
        }
        public Long getRunningCount() {
            return this.runningCount;
        }

        public GetResourceOverviewResponseBodyDataGateway setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class GetResourceOverviewResponseBodyDataRiskOverviewRiskDetails extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>gw-xxxxxx</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <strong>example:</strong>
         * <p>test-gateway</p>
         */
        @NameInMap("gatewayName")
        public String gatewayName;

        /**
         * <strong>example:</strong>
         * <p>LOW</p>
         */
        @NameInMap("riskLevel")
        public String riskLevel;

        @NameInMap("riskNames")
        public java.util.List<String> riskNames;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("score")
        public String score;

        public static GetResourceOverviewResponseBodyDataRiskOverviewRiskDetails build(java.util.Map<String, ?> map) throws Exception {
            GetResourceOverviewResponseBodyDataRiskOverviewRiskDetails self = new GetResourceOverviewResponseBodyDataRiskOverviewRiskDetails();
            return TeaModel.build(map, self);
        }

        public GetResourceOverviewResponseBodyDataRiskOverviewRiskDetails setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public GetResourceOverviewResponseBodyDataRiskOverviewRiskDetails setGatewayName(String gatewayName) {
            this.gatewayName = gatewayName;
            return this;
        }
        public String getGatewayName() {
            return this.gatewayName;
        }

        public GetResourceOverviewResponseBodyDataRiskOverviewRiskDetails setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public GetResourceOverviewResponseBodyDataRiskOverviewRiskDetails setRiskNames(java.util.List<String> riskNames) {
            this.riskNames = riskNames;
            return this;
        }
        public java.util.List<String> getRiskNames() {
            return this.riskNames;
        }

        public GetResourceOverviewResponseBodyDataRiskOverviewRiskDetails setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

    }

    public static class GetResourceOverviewResponseBodyDataRiskOverview extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("count")
        public String count;

        @NameInMap("riskDetails")
        public java.util.List<GetResourceOverviewResponseBodyDataRiskOverviewRiskDetails> riskDetails;

        /**
         * <strong>example:</strong>
         * <p>LOW</p>
         */
        @NameInMap("riskLevel")
        public String riskLevel;

        public static GetResourceOverviewResponseBodyDataRiskOverview build(java.util.Map<String, ?> map) throws Exception {
            GetResourceOverviewResponseBodyDataRiskOverview self = new GetResourceOverviewResponseBodyDataRiskOverview();
            return TeaModel.build(map, self);
        }

        public GetResourceOverviewResponseBodyDataRiskOverview setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public GetResourceOverviewResponseBodyDataRiskOverview setRiskDetails(java.util.List<GetResourceOverviewResponseBodyDataRiskOverviewRiskDetails> riskDetails) {
            this.riskDetails = riskDetails;
            return this;
        }
        public java.util.List<GetResourceOverviewResponseBodyDataRiskOverviewRiskDetails> getRiskDetails() {
            return this.riskDetails;
        }

        public GetResourceOverviewResponseBodyDataRiskOverview setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

    }

    public static class GetResourceOverviewResponseBodyData extends TeaModel {
        /**
         * <p>API information.</p>
         */
        @NameInMap("api")
        public GetResourceOverviewResponseBodyDataApi api;

        /**
         * <p>Gateway information.</p>
         */
        @NameInMap("gateway")
        public GetResourceOverviewResponseBodyDataGateway gateway;

        @NameInMap("riskOverview")
        public java.util.List<GetResourceOverviewResponseBodyDataRiskOverview> riskOverview;

        public static GetResourceOverviewResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetResourceOverviewResponseBodyData self = new GetResourceOverviewResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetResourceOverviewResponseBodyData setApi(GetResourceOverviewResponseBodyDataApi api) {
            this.api = api;
            return this;
        }
        public GetResourceOverviewResponseBodyDataApi getApi() {
            return this.api;
        }

        public GetResourceOverviewResponseBodyData setGateway(GetResourceOverviewResponseBodyDataGateway gateway) {
            this.gateway = gateway;
            return this;
        }
        public GetResourceOverviewResponseBodyDataGateway getGateway() {
            return this.gateway;
        }

        public GetResourceOverviewResponseBodyData setRiskOverview(java.util.List<GetResourceOverviewResponseBodyDataRiskOverview> riskOverview) {
            this.riskOverview = riskOverview;
            return this;
        }
        public java.util.List<GetResourceOverviewResponseBodyDataRiskOverview> getRiskOverview() {
            return this.riskOverview;
        }

    }

}
