// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectRouterRouteEntriesResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>Authentication is failed for ****</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response code. The status code 200 indicates that the request was successful. Other status codes indicate that the request failed. For more information, see Error codes.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The dynamic error code.</p>
     * 
     * <strong>example:</strong>
     * <p>IllegalParamFormat.EcrId</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic part in the error message. This parameter is used to replace the <code>%s</code> variable in <strong>ErrMessage</strong>.</p>
     * <blockquote>
     * <p> For example, if the value of <strong>ErrMessage</strong> is <strong>The Value of Input Parameter %s is not valid</strong> and the value of <strong>DynamicMessage</strong> is <strong>DtsJobId</strong>, the request parameter <strong>DtsJobId</strong> is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>The param format of EcrId **** is illegal.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The total number of entries returned. Valid values: 1 to 2147483647. Default value: 10</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next page exists.</li>
     * <li>If a value of <strong>NextToken</strong> is returned, the value indicates the token that is used for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>gAAAAABkWwFTUMNCdWC0VMYOIylA56Hx6JUfCZlk5hQ5g_fnKmetN6303tqq5UJ2ouJzyT2fDOdzb-NqyEB5jcY8Z2euX7qHDA==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6FABF516-FED3-5697-BDA2-B18C5D9A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The route entries.</p>
     */
    @NameInMap("RouteEntriesList")
    public java.util.List<DescribeExpressConnectRouterRouteEntriesResponseBodyRouteEntriesList> routeEntriesList;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of route entries.</p>
     * 
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
         * <p>The AS path of the route.</p>
         * 
         * <strong>example:</strong>
         * <p>[64993,64512]</p>
         */
        @NameInMap("AsPath")
        public String asPath;

        /**
         * <p>The community value that is carried in the BGP route.</p>
         * 
         * <strong>example:</strong>
         * <p>9001:9263</p>
         */
        @NameInMap("Community")
        public String community;

        /**
         * <p>The destination CIDR block of the route.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.0/16</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        @NameInMap("Med")
        public Long med;

        /**
         * <p>The ID of the next-hop instance.</p>
         * 
         * <strong>example:</strong>
         * <p>br-hp3u4u5f03tfuljis****</p>
         */
        @NameInMap("NexthopInstanceId")
        public String nexthopInstanceId;

        /**
         * <p>The region ID of the next-hop instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("NexthopInstanceRegionId")
        public String nexthopInstanceRegionId;

        /**
         * <p>The state of the ECR.</p>
         * 
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

        public DescribeExpressConnectRouterRouteEntriesResponseBodyRouteEntriesList setMed(Long med) {
            this.med = med;
            return this;
        }
        public Long getMed() {
            return this.med;
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
