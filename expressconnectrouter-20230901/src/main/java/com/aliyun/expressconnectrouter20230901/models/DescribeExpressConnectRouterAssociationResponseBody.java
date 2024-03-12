// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectRouterAssociationResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("AssociationList")
    public java.util.List<DescribeExpressConnectRouterAssociationResponseBodyAssociationList> associationList;

    @NameInMap("Code")
    public String code;

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

    public static DescribeExpressConnectRouterAssociationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressConnectRouterAssociationResponseBody self = new DescribeExpressConnectRouterAssociationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExpressConnectRouterAssociationResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeExpressConnectRouterAssociationResponseBody setAssociationList(java.util.List<DescribeExpressConnectRouterAssociationResponseBodyAssociationList> associationList) {
        this.associationList = associationList;
        return this;
    }
    public java.util.List<DescribeExpressConnectRouterAssociationResponseBodyAssociationList> getAssociationList() {
        return this.associationList;
    }

    public DescribeExpressConnectRouterAssociationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeExpressConnectRouterAssociationResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeExpressConnectRouterAssociationResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeExpressConnectRouterAssociationResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeExpressConnectRouterAssociationResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeExpressConnectRouterAssociationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeExpressConnectRouterAssociationResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeExpressConnectRouterAssociationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExpressConnectRouterAssociationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeExpressConnectRouterAssociationResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeExpressConnectRouterAssociationResponseBodyAssociationList extends TeaModel {
        @NameInMap("AllowedPrefixes")
        public java.util.List<String> allowedPrefixes;

        @NameInMap("AssociationId")
        public String associationId;

        @NameInMap("AssociationNodeType")
        public String associationNodeType;

        @NameInMap("CenId")
        public String cenId;

        @NameInMap("EcrId")
        public String ecrId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("OwnerId")
        public Long ownerId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

        @NameInMap("TransitRouterId")
        public String transitRouterId;

        @NameInMap("TransitRouterOwnerId")
        public Long transitRouterOwnerId;

        @NameInMap("VpcId")
        public String vpcId;

        @NameInMap("VpcOwnerId")
        public Long vpcOwnerId;

        public static DescribeExpressConnectRouterAssociationResponseBodyAssociationList build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpressConnectRouterAssociationResponseBodyAssociationList self = new DescribeExpressConnectRouterAssociationResponseBodyAssociationList();
            return TeaModel.build(map, self);
        }

        public DescribeExpressConnectRouterAssociationResponseBodyAssociationList setAllowedPrefixes(java.util.List<String> allowedPrefixes) {
            this.allowedPrefixes = allowedPrefixes;
            return this;
        }
        public java.util.List<String> getAllowedPrefixes() {
            return this.allowedPrefixes;
        }

        public DescribeExpressConnectRouterAssociationResponseBodyAssociationList setAssociationId(String associationId) {
            this.associationId = associationId;
            return this;
        }
        public String getAssociationId() {
            return this.associationId;
        }

        public DescribeExpressConnectRouterAssociationResponseBodyAssociationList setAssociationNodeType(String associationNodeType) {
            this.associationNodeType = associationNodeType;
            return this;
        }
        public String getAssociationNodeType() {
            return this.associationNodeType;
        }

        public DescribeExpressConnectRouterAssociationResponseBodyAssociationList setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public DescribeExpressConnectRouterAssociationResponseBodyAssociationList setEcrId(String ecrId) {
            this.ecrId = ecrId;
            return this;
        }
        public String getEcrId() {
            return this.ecrId;
        }

        public DescribeExpressConnectRouterAssociationResponseBodyAssociationList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeExpressConnectRouterAssociationResponseBodyAssociationList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeExpressConnectRouterAssociationResponseBodyAssociationList setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public DescribeExpressConnectRouterAssociationResponseBodyAssociationList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeExpressConnectRouterAssociationResponseBodyAssociationList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeExpressConnectRouterAssociationResponseBodyAssociationList setTransitRouterId(String transitRouterId) {
            this.transitRouterId = transitRouterId;
            return this;
        }
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

        public DescribeExpressConnectRouterAssociationResponseBodyAssociationList setTransitRouterOwnerId(Long transitRouterOwnerId) {
            this.transitRouterOwnerId = transitRouterOwnerId;
            return this;
        }
        public Long getTransitRouterOwnerId() {
            return this.transitRouterOwnerId;
        }

        public DescribeExpressConnectRouterAssociationResponseBodyAssociationList setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeExpressConnectRouterAssociationResponseBodyAssociationList setVpcOwnerId(Long vpcOwnerId) {
            this.vpcOwnerId = vpcOwnerId;
            return this;
        }
        public Long getVpcOwnerId() {
            return this.vpcOwnerId;
        }

    }

}
