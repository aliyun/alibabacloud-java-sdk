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
     * <p>The list of associated resources.</p>
     */
    @NameInMap("AssociationList")
    public java.util.List<DescribeExpressConnectRouterAssociationResponseBodyAssociationList> associationList;

    /**
     * <p>The status code. A value of 200 indicates that the call was successful. Other values indicate that the call failed. For more information about the causes of failures, see Error codes.</p>
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
     * <p>The dynamic error message, which is used to replace <code>%s</code> in the <strong>ErrMessage</strong> error message.</p>
     * <blockquote>
     * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, the specified <strong>DtsJobId</strong> request parameter is invalid.</p>
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
     * <p>The maximum number of entries to return. Valid values: 1 to 2147483647. Default value: 20.</p>
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
     * <p>The token for the next query. Valid values:</p>
     * <ul>
     * <li>If <strong>NextToken</strong> is empty, no next query is required.</li>
     * <li>If <strong>NextToken</strong> is returned, the value indicates the token for the next query.</li>
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
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>True</strong>: successful.</li>
     * <li><strong>False</strong>: failed.</li>
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

    public static class DescribeExpressConnectRouterAssociationResponseBodyAssociationListTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeExpressConnectRouterAssociationResponseBodyAssociationListTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpressConnectRouterAssociationResponseBodyAssociationListTags self = new DescribeExpressConnectRouterAssociationResponseBodyAssociationListTags();
            return TeaModel.build(map, self);
        }

        public DescribeExpressConnectRouterAssociationResponseBodyAssociationListTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeExpressConnectRouterAssociationResponseBodyAssociationListTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeExpressConnectRouterAssociationResponseBodyAssociationList extends TeaModel {
        /**
         * <p>The allowed route prefix list.</p>
         */
        @NameInMap("AllowedPrefixes")
        public java.util.List<String> allowedPrefixes;

        /**
         * <p>The prefix routing mode. Valid values:</p>
         * <ul>
         * <li>MatchMode: match mode.</li>
         * <li>IncrementalMode: incremental mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MatchMode</p>
         */
        @NameInMap("AllowedPrefixesMode")
        public String allowedPrefixesMode;

        /**
         * <p>The ID used to associate the Express Connect Router (ECR) with a VPC or TR.</p>
         * 
         * <strong>example:</strong>
         * <p>ecr-assoc-9p2qxx5phpca2m****</p>
         */
        @NameInMap("AssociationId")
        public String associationId;

        /**
         * <p>The type of the associated resource. Valid values:</p>
         * <ul>
         * <li><p><strong>VPC</strong>: VPC.</p>
         * </li>
         * <li><p><strong>TR</strong>: transit router.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("AssociationNodeType")
        public String associationNodeType;

        /**
         * <p>The instance ID of the Cloud Enterprise Network (CEN).</p>
         * 
         * <strong>example:</strong>
         * <p>cen-5510frtx8zi54q****</p>
         */
        @NameInMap("CenId")
        public String cenId;

        /**
         * <p>The description of the associated resource.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The instance ID of the Express Connect Router (ECR).</p>
         * 
         * <strong>example:</strong>
         * <p>ecr-fu8rszhgv7623c****</p>
         */
        @NameInMap("EcrId")
        public String ecrId;

        /**
         * <p>The time when the association was created. The time is displayed in UTC and follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-09T12:18:23Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the association was modified. The time is displayed in UTC and follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-09T12:18:23Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The Alibaba Cloud account ID to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>167509154715****</p>
         */
        @NameInMap("OwnerId")
        public Long ownerId;

        /**
         * <p>The region where the resource resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The deployment status of the associated resource. Valid values:</p>
         * <ul>
         * <li><p><strong>CREATING</strong>: The resource is being created.</p>
         * </li>
         * <li><p><strong>ACTIVE</strong>: The resource is created.</p>
         * </li>
         * <li><p><strong>INACTIVE</strong>: The Express Connect Router (ECR) is associated with the transit router, and the transit router is pending association with the ECR for forward routing.</p>
         * </li>
         * <li><p><strong>ASSOCIATING</strong>: The resource is being attached.</p>
         * </li>
         * <li><p><strong>DISSOCIATING</strong>: The resource is being disassociated.</p>
         * </li>
         * <li><p><strong>UPDATING</strong>: The resource is being modified.</p>
         * </li>
         * <li><p><strong>DELETING</strong>: The resource is being deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The list of tags added to the associated resource.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeExpressConnectRouterAssociationResponseBodyAssociationListTags> tags;

        /**
         * <p>The ID of the transit router.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-2ze4i71c6be454e2l****</p>
         */
        @NameInMap("TransitRouterId")
        public String transitRouterId;

        /**
         * <p>The name of the transit router.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TransitRouterName")
        public String transitRouterName;

        /**
         * <p>The Alibaba Cloud account ID to which the transit router for forward routing belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>189159362009****</p>
         */
        @NameInMap("TransitRouterOwnerId")
        public Long transitRouterOwnerId;

        /**
         * <p>The ID of the VPC-connected instance.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zeeaxet4i2j1a7n7****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The name of the VPC-connected instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("VpcName")
        public String vpcName;

        /**
         * <p>The Alibaba Cloud account ID to which the VPC belongs.</p>
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

        public DescribeExpressConnectRouterAssociationResponseBodyAssociationList setTags(java.util.List<DescribeExpressConnectRouterAssociationResponseBodyAssociationListTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeExpressConnectRouterAssociationResponseBodyAssociationListTags> getTags() {
            return this.tags;
        }

        public DescribeExpressConnectRouterAssociationResponseBodyAssociationList setTransitRouterId(String transitRouterId) {
            this.transitRouterId = transitRouterId;
            return this;
        }
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

        public DescribeExpressConnectRouterAssociationResponseBodyAssociationList setTransitRouterName(String transitRouterName) {
            this.transitRouterName = transitRouterName;
            return this;
        }
        public String getTransitRouterName() {
            return this.transitRouterName;
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

        public DescribeExpressConnectRouterAssociationResponseBodyAssociationList setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
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
