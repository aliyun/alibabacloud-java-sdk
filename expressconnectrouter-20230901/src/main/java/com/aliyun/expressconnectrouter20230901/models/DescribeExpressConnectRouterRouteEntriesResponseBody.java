// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectRouterRouteEntriesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Authentication is failed for ****</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>IllegalParamFormat.EcrId</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <strong>example:</strong>
     * <p>The param format of EcrId **** is illegal.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>gAAAAABkWwFTUMNCdWC0VMYOIylA56Hx6JUfCZlk5hQ5g_fnKmetN6303tqq5UJ2ouJzyT2fDOdzb-NqyEB5jcY8Z2euX7qHDA==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>6FABF516-FED3-5697-BDA2-B18C5D9A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RouteEntriesList")
    public java.util.List<DescribeExpressConnectRouterRouteEntriesResponseBodyRouteEntriesList> routeEntriesList;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeExpressConnectRouterRouteEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressConnectRouterRouteEntriesResponseBody self = new DescribeExpressConnectRouterRouteEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExpressConnectRouterRouteEntriesResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeExpressConnectRouterRouteEntriesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeExpressConnectRouterRouteEntriesResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeExpressConnectRouterRouteEntriesResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeExpressConnectRouterRouteEntriesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeExpressConnectRouterRouteEntriesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeExpressConnectRouterRouteEntriesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeExpressConnectRouterRouteEntriesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeExpressConnectRouterRouteEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExpressConnectRouterRouteEntriesResponseBody setRouteEntriesList(java.util.List<DescribeExpressConnectRouterRouteEntriesResponseBodyRouteEntriesList> routeEntriesList) {
        this.routeEntriesList = routeEntriesList;
        return this;
    }
    public java.util.List<DescribeExpressConnectRouterRouteEntriesResponseBodyRouteEntriesList> getRouteEntriesList() {
        return this.routeEntriesList;
    }

    public DescribeExpressConnectRouterRouteEntriesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeExpressConnectRouterRouteEntriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeExpressConnectRouterRouteEntriesResponseBodyRouteEntriesList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[64993,64512]</p>
         */
        @NameInMap("AsPath")
        public String asPath;

        /**
         * <strong>example:</strong>
         * <p>9001:9263</p>
         */
        @NameInMap("Community")
        public String community;

        /**
         * <strong>example:</strong>
         * <p>192.168.0.0/16</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <strong>example:</strong>
         * <p>br-hp3u4u5f03tfuljis****</p>
         */
        @NameInMap("NexthopInstanceId")
        public String nexthopInstanceId;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("NexthopInstanceRegionId")
        public String nexthopInstanceRegionId;

        /**
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeExpressConnectRouterRouteEntriesResponseBodyRouteEntriesList build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpressConnectRouterRouteEntriesResponseBodyRouteEntriesList self = new DescribeExpressConnectRouterRouteEntriesResponseBodyRouteEntriesList();
            return TeaModel.build(map, self);
        }

        public DescribeExpressConnectRouterRouteEntriesResponseBodyRouteEntriesList setAsPath(String asPath) {
            this.asPath = asPath;
            return this;
        }
        public String getAsPath() {
            return this.asPath;
        }

        public DescribeExpressConnectRouterRouteEntriesResponseBodyRouteEntriesList setCommunity(String community) {
            this.community = community;
            return this;
        }
        public String getCommunity() {
            return this.community;
        }

        public DescribeExpressConnectRouterRouteEntriesResponseBodyRouteEntriesList setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public DescribeExpressConnectRouterRouteEntriesResponseBodyRouteEntriesList setNexthopInstanceId(String nexthopInstanceId) {
            this.nexthopInstanceId = nexthopInstanceId;
            return this;
        }
        public String getNexthopInstanceId() {
            return this.nexthopInstanceId;
        }

        public DescribeExpressConnectRouterRouteEntriesResponseBodyRouteEntriesList setNexthopInstanceRegionId(String nexthopInstanceRegionId) {
            this.nexthopInstanceRegionId = nexthopInstanceRegionId;
            return this;
        }
        public String getNexthopInstanceRegionId() {
            return this.nexthopInstanceRegionId;
        }

        public DescribeExpressConnectRouterRouteEntriesResponseBodyRouteEntriesList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
