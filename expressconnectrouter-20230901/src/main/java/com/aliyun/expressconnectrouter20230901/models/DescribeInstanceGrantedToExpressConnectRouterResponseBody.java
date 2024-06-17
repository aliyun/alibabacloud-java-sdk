// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeInstanceGrantedToExpressConnectRouterResponseBody extends TeaModel {
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
     * <p>IllegalParamFormat.Name</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <strong>example:</strong>
     * <p>The param format of Name **** is illegal.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("EcrGrantedInstanceList")
    public java.util.List<DescribeInstanceGrantedToExpressConnectRouterResponseBodyEcrGrantedInstanceList> ecrGrantedInstanceList;

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
     * <p>FFlMqGuJ10uN3l+FX/cBrGDNXUOUifNeOuAJlT4dc3vsWD6DsNSFAC2FtpeH5QOSG2WFdyRoun7gSLCm5o69YnAQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>6FABF516-FED3-5697-BDA2-B18C5D9A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>ecr-mezk2idmsd0vx2****</p>
         */
        @NameInMap("EcrId")
        public String ecrId;

        /**
         * <strong>example:</strong>
         * <p>1669023139000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1669023139000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>gr-8gdelo13mi99g1****</p>
         */
        @NameInMap("GrantId")
        public String grantId;

        /**
         * <strong>example:</strong>
         * <p>vbr-j6cwxhgg0s5nuephp****</p>
         */
        @NameInMap("NodeId")
        public String nodeId;

        /**
         * <strong>example:</strong>
         * <p>26842</p>
         */
        @NameInMap("NodeOwnerBid")
        public String nodeOwnerBid;

        /**
         * <strong>example:</strong>
         * <p>129845258050****</p>
         */
        @NameInMap("NodeOwnerUid")
        public Long nodeOwnerUid;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("NodeRegionId")
        public String nodeRegionId;

        /**
         * <strong>example:</strong>
         * <p>VBR</p>
         */
        @NameInMap("NodeType")
        public String nodeType;

        /**
         * <strong>example:</strong>
         * <p>Active</p>
         */
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
