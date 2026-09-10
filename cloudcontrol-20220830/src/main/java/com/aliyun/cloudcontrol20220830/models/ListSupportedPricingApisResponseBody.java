// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class ListSupportedPricingApisResponseBody extends TeaModel {
    @NameInMap("maxResults")
    public Integer maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The array of OpenAPI triplets that support price inquiry. The triplets are sorted in alphabetical order by popCode, popVersion, and apiName.</p>
     */
    @NameInMap("supportedApis")
    public java.util.List<ListSupportedPricingApisResponseBodySupportedApis> supportedApis;

    public static ListSupportedPricingApisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSupportedPricingApisResponseBody self = new ListSupportedPricingApisResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSupportedPricingApisResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListSupportedPricingApisResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListSupportedPricingApisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSupportedPricingApisResponseBody setSupportedApis(java.util.List<ListSupportedPricingApisResponseBodySupportedApis> supportedApis) {
        this.supportedApis = supportedApis;
        return this;
    }
    public java.util.List<ListSupportedPricingApisResponseBodySupportedApis> getSupportedApis() {
        return this.supportedApis;
    }

    public static class ListSupportedPricingApisResponseBodySupportedApis extends TeaModel {
        /**
         * <p>The OpenAPI name in PascalCase, such as RunInstances.</p>
         */
        @NameInMap("apiName")
        public String apiName;

        /**
         * <p>The POP product code, such as Ecs, Rds, or Alb. This value corresponds to the popCode field used in price inquiry requests.</p>
         */
        @NameInMap("popCode")
        public String popCode;

        /**
         * <p>The OpenAPI version number, such as 2014-05-26.</p>
         */
        @NameInMap("popVersion")
        public String popVersion;

        public static ListSupportedPricingApisResponseBodySupportedApis build(java.util.Map<String, ?> map) throws Exception {
            ListSupportedPricingApisResponseBodySupportedApis self = new ListSupportedPricingApisResponseBodySupportedApis();
            return TeaModel.build(map, self);
        }

        public ListSupportedPricingApisResponseBodySupportedApis setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public ListSupportedPricingApisResponseBodySupportedApis setPopCode(String popCode) {
            this.popCode = popCode;
            return this;
        }
        public String getPopCode() {
            return this.popCode;
        }

        public ListSupportedPricingApisResponseBodySupportedApis setPopVersion(String popVersion) {
            this.popVersion = popVersion;
            return this;
        }
        public String getPopVersion() {
            return this.popVersion;
        }

    }

}
