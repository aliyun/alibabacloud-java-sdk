// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeDisabledExpressConnectRouterRouteEntriesResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("DisabledRouteEntryList")
    public java.util.List<DescribeDisabledExpressConnectRouterRouteEntriesResponseBodyDisabledRouteEntryList> disabledRouteEntryList;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Message")
    public String message;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

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
        @NameInMap("DestinationCidrBlock")
        public String destinationCidrBlock;

        @NameInMap("EcrId")
        public String ecrId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("NexthopInstanceId")
        public String nexthopInstanceId;

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
