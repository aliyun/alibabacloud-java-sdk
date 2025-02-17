// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectRouterAssociationResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>Authentication is failed for ****</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The associated resources.</p>
     */
    @NameInMap("AssociationList")
    public java.util.List<DescribeExpressConnectRouterAssociationResponseBodyAssociationList> associationList;

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
     * <p> For example, if the value of <strong>ErrMessage</strong> is <strong>The Value of Input Parameter %s is not valid</strong> and the value of DynamicMessage is <strong>DtsJobId</strong>, the request parameter <strong>DtsJobId</strong> is invalid.</p>
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
     * <p>The total number of entries returned. Valid values: 1 to 2147483647. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
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
     * <p>AAAAAYws9fJ0Ur4MGm/5OkDoW/Zn0J0/sCjivzwX9oBcwFnWaaas/kSG+J/WzLOxJHS4****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>05130E79-588D-5C40-A718-C4863A59****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
     * <p>The total number of associated resources.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
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
        /**
         * <p>The allowed route prefixes.</p>
         */
        @NameInMap("AllowedPrefixes")
        public java.util.List<String> allowedPrefixes;

        @NameInMap("AllowedPrefixesMode")
        public String allowedPrefixesMode;

        /**
         * <p>The ID of the association between the ECR and the VPC or TR.</p>
         * 
         * <strong>example:</strong>
         * <p>ecr-assoc-9p2qxx5phpca2m****</p>
         */
        @NameInMap("AssociationId")
        public String associationId;

        /**
         * <p>The type of the associated resource. Valid values:</p>
         * <ul>
         * <li><strong>VPC</strong></li>
         * <li><strong>TR</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("AssociationNodeType")
        public String associationNodeType;

        /**
         * <p>The ID of the CEN instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-5510frtx8zi54q****</p>
         */
        @NameInMap("CenId")
        public String cenId;

        @NameInMap("Description")
        public String description;

        /**
         * <p>The ECR ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecr-fu8rszhgv7623c****</p>
         */
        @NameInMap("EcrId")
        public String ecrId;

        /**
         * <p>The time when the association was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-09T12:18:23Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the association was modified. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-09T12:18:23Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the Alibaba Cloud account that owns the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>167509154715****</p>
         */
        @NameInMap("OwnerId")
        public Long ownerId;

        /**
         * <p>The region ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The deployment state of the associated resource. Valid values:</p>
         * <ul>
         * <li><strong>CREATING</strong>: The resource is being created.</li>
         * <li><strong>ACTIVE</strong>: The resource is created.</li>
         * <li><strong>INACTIVE</strong>: The TR is pending to be associated with the ECR.</li>
         * <li><strong>ASSOCIATING</strong>: The resource is being associated.</li>
         * <li><strong>DISSOCIATING</strong>: The resource is being disassociated.</li>
         * <li><strong>UPDATING</strong>: The resource is being modified.</li>
         * <li><strong>DELETING</strong>: The resource is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The TR ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-2ze4i71c6be454e2l****</p>
         */
        @NameInMap("TransitRouterId")
        public String transitRouterId;

        /**
         * <p>The ID of the Alibaba Cloud account that owns the TR.</p>
         * 
         * <strong>example:</strong>
         * <p>189159362009****</p>
         */
        @NameInMap("TransitRouterOwnerId")
        public Long transitRouterOwnerId;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zeeaxet4i2j1a7n7****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The ID of the Alibaba Cloud account to which the VPC belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>146757288406****</p>
         */
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

        public DescribeExpressConnectRouterAssociationResponseBodyAssociationList setAllowedPrefixesMode(String allowedPrefixesMode) {
            this.allowedPrefixesMode = allowedPrefixesMode;
            return this;
        }
        public String getAllowedPrefixesMode() {
            return this.allowedPrefixesMode;
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

        public DescribeExpressConnectRouterAssociationResponseBodyAssociationList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
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
