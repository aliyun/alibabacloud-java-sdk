// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeInstanceGrantedToExpressConnectRouterResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("EcrGrantedInstanceList")
    public java.util.List<DescribeInstanceGrantedToExpressConnectRouterResponseBodyEcrGrantedInstanceList> ecrGrantedInstanceList;

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

    public static DescribeInstanceGrantedToExpressConnectRouterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceGrantedToExpressConnectRouterResponseBody self = new DescribeInstanceGrantedToExpressConnectRouterResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceGrantedToExpressConnectRouterResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeInstanceGrantedToExpressConnectRouterResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeInstanceGrantedToExpressConnectRouterResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeInstanceGrantedToExpressConnectRouterResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeInstanceGrantedToExpressConnectRouterResponseBody setEcrGrantedInstanceList(java.util.List<DescribeInstanceGrantedToExpressConnectRouterResponseBodyEcrGrantedInstanceList> ecrGrantedInstanceList) {
        this.ecrGrantedInstanceList = ecrGrantedInstanceList;
        return this;
    }
    public java.util.List<DescribeInstanceGrantedToExpressConnectRouterResponseBodyEcrGrantedInstanceList> getEcrGrantedInstanceList() {
        return this.ecrGrantedInstanceList;
    }

    public DescribeInstanceGrantedToExpressConnectRouterResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeInstanceGrantedToExpressConnectRouterResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeInstanceGrantedToExpressConnectRouterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeInstanceGrantedToExpressConnectRouterResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeInstanceGrantedToExpressConnectRouterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceGrantedToExpressConnectRouterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeInstanceGrantedToExpressConnectRouterResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeInstanceGrantedToExpressConnectRouterResponseBodyEcrGrantedInstanceList extends TeaModel {
        @NameInMap("EcrId")
        public String ecrId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("GrantId")
        public String grantId;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("NodeOwnerBid")
        public String nodeOwnerBid;

        @NameInMap("NodeOwnerUid")
        public Long nodeOwnerUid;

        @NameInMap("NodeRegionId")
        public String nodeRegionId;

        @NameInMap("NodeType")
        public String nodeType;

        @NameInMap("Status")
        public String status;

        public static DescribeInstanceGrantedToExpressConnectRouterResponseBodyEcrGrantedInstanceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceGrantedToExpressConnectRouterResponseBodyEcrGrantedInstanceList self = new DescribeInstanceGrantedToExpressConnectRouterResponseBodyEcrGrantedInstanceList();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceGrantedToExpressConnectRouterResponseBodyEcrGrantedInstanceList setEcrId(String ecrId) {
            this.ecrId = ecrId;
            return this;
        }
        public String getEcrId() {
            return this.ecrId;
        }

        public DescribeInstanceGrantedToExpressConnectRouterResponseBodyEcrGrantedInstanceList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeInstanceGrantedToExpressConnectRouterResponseBodyEcrGrantedInstanceList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeInstanceGrantedToExpressConnectRouterResponseBodyEcrGrantedInstanceList setGrantId(String grantId) {
            this.grantId = grantId;
            return this;
        }
        public String getGrantId() {
            return this.grantId;
        }

        public DescribeInstanceGrantedToExpressConnectRouterResponseBodyEcrGrantedInstanceList setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public DescribeInstanceGrantedToExpressConnectRouterResponseBodyEcrGrantedInstanceList setNodeOwnerBid(String nodeOwnerBid) {
            this.nodeOwnerBid = nodeOwnerBid;
            return this;
        }
        public String getNodeOwnerBid() {
            return this.nodeOwnerBid;
        }

        public DescribeInstanceGrantedToExpressConnectRouterResponseBodyEcrGrantedInstanceList setNodeOwnerUid(Long nodeOwnerUid) {
            this.nodeOwnerUid = nodeOwnerUid;
            return this;
        }
        public Long getNodeOwnerUid() {
            return this.nodeOwnerUid;
        }

        public DescribeInstanceGrantedToExpressConnectRouterResponseBodyEcrGrantedInstanceList setNodeRegionId(String nodeRegionId) {
            this.nodeRegionId = nodeRegionId;
            return this;
        }
        public String getNodeRegionId() {
            return this.nodeRegionId;
        }

        public DescribeInstanceGrantedToExpressConnectRouterResponseBodyEcrGrantedInstanceList setNodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }
        public String getNodeType() {
            return this.nodeType;
        }

        public DescribeInstanceGrantedToExpressConnectRouterResponseBodyEcrGrantedInstanceList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
