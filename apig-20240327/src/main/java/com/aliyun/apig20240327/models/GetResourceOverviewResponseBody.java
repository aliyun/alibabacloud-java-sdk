// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetResourceOverviewResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetResourceOverviewResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("publishedCount")
        public Long publishedCount;

        /**
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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("runningCount")
        public Long runningCount;

        /**
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

    public static class GetResourceOverviewResponseBodyData extends TeaModel {
        @NameInMap("api")
        public GetResourceOverviewResponseBodyDataApi api;

        @NameInMap("gateway")
        public GetResourceOverviewResponseBodyDataGateway gateway;

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

    }

}
