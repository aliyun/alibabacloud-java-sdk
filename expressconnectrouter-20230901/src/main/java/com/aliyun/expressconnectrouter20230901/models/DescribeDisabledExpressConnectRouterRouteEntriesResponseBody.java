// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeDisabledExpressConnectRouterRouteEntriesResponseBody extends TeaModel {
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
     * <p>The routes that are queried.</p>
     */
    @NameInMap("DisabledRouteEntryList")
    public java.util.List<DescribeDisabledExpressConnectRouterRouteEntriesResponseBodyDisabledRouteEntryList> disabledRouteEntryList;

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
     * <p> For example, if the value of <strong>ErrMessage</strong> is <strong>The Value of Input Parameter %s is not valid</strong> and the value of <strong>DynamicMessage</strong> is <strong>DtsInstanceId</strong>, the request parameter <strong>DtsInstanceId</strong> is invalid.</p>
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
     * <p>The total number of entries returned. Valid values: 1 to 2147483647. Default value: 10.</p>
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
     * <li>If NextToken is empty, no next page exists.</li>
     * <li>If a value of NextToken is returned, the value indicates the token that is used for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>gAAAAABkDTaRFnmxUoMLVOn8YTIgYFeL2ch8j0sJs8VCIU8SS5438m3D9X1VqspCcaUEHRN9I_AfVwMhZHAhcNivifK_OtQxJQ==</p>
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
     * <p>Indicates whether routes are disabled by the ECR. Valid values:</p>
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
     * <p>The total number of routes.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDisabledExpressConnectRouterRouteEntriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDisabledExpressConnectRouterRouteEntriesResponseBody self = new DescribeDisabledExpressConnectRouterRouteEntriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDisabledExpressConnectRouterRouteEntriesResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeDisabledExpressConnectRouterRouteEntriesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDisabledExpressConnectRouterRouteEntriesResponseBody setDisabledRouteEntryList(java.util.List<DescribeDisabledExpressConnectRouterRouteEntriesResponseBodyDisabledRouteEntryList> disabledRouteEntryList) {
        this.disabledRouteEntryList = disabledRouteEntryList;
        return this;
    }
    public java.util.List<DescribeDisabledExpressConnectRouterRouteEntriesResponseBodyDisabledRouteEntryList> getDisabledRouteEntryList() {
        return this.disabledRouteEntryList;
    }

    public DescribeDisabledExpressConnectRouterRouteEntriesResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeDisabledExpressConnectRouterRouteEntriesResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeDisabledExpressConnectRouterRouteEntriesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeDisabledExpressConnectRouterRouteEntriesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeDisabledExpressConnectRouterRouteEntriesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDisabledExpressConnectRouterRouteEntriesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeDisabledExpressConnectRouterRouteEntriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDisabledExpressConnectRouterRouteEntriesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeDisabledExpressConnectRouterRouteEntriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDisabledExpressConnectRouterRouteEntriesResponseBodyDisabledRouteEntryList extends TeaModel {
        /**
         * <p>The destination CIDR block of the route.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.100.110/32</p>
         */
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        /**
         * <p>The ECR ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecr-mezk2idmsd0vx2****</p>
         */
        @NameInMap("EcrId")
        public String ecrId;

        /**
         * <p>The time when the route entry was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1682317345</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

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

        public static DescribeDisabledExpressConnectRouterRouteEntriesResponseBodyDisabledRouteEntryList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDisabledExpressConnectRouterRouteEntriesResponseBodyDisabledRouteEntryList self = new DescribeDisabledExpressConnectRouterRouteEntriesResponseBodyDisabledRouteEntryList();
            return TeaModel.build(map, self);
        }

        public DescribeDisabledExpressConnectRouterRouteEntriesResponseBodyDisabledRouteEntryList setDestinationCidrBlock(String destinationCidrBlock) {
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        public DescribeDisabledExpressConnectRouterRouteEntriesResponseBodyDisabledRouteEntryList setEcrId(String ecrId) {
            this.ecrId = ecrId;
            return this;
        }
        public String getEcrId() {
            return this.ecrId;
        }

        public DescribeDisabledExpressConnectRouterRouteEntriesResponseBodyDisabledRouteEntryList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeDisabledExpressConnectRouterRouteEntriesResponseBodyDisabledRouteEntryList setNexthopInstanceId(String nexthopInstanceId) {
            this.nexthopInstanceId = nexthopInstanceId;
            return this;
        }
        public String getNexthopInstanceId() {
            return this.nexthopInstanceId;
        }

        public DescribeDisabledExpressConnectRouterRouteEntriesResponseBodyDisabledRouteEntryList setNexthopInstanceRegionId(String nexthopInstanceRegionId) {
            this.nexthopInstanceRegionId = nexthopInstanceRegionId;
            return this;
        }
        public String getNexthopInstanceRegionId() {
            return this.nexthopInstanceRegionId;
        }

    }

}
