// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectRouterResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>Authentication is failed for ****</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>Indicates whether the call was successful. A return value of 200 indicates success, while other values indicate failure. For the cause of failure, see the error codes.</p>
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
     * <p>IllegalParamFormat.Name</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>The dynamic error message, which is used to replace <code>%s</code> in the <strong>ErrMessage</strong> error message.</p>
     * <blockquote>
     * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, it indicates that the <strong>DtsJobId</strong> request parameter is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>The param format of Name **** is illegal.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The list of Express Connect Router (ECR) instances.</p>
     */
    @NameInMap("EcrList")
    public java.util.List<DescribeExpressConnectRouterResponseBodyEcrList> ecrList;

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
     * <p>The message returned for the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The token for the next query. Valid values:</p>
     * <ul>
     * <li>If NextToken is empty, no next query is available.</li>
     * <li>If NextToken has a return value, the value indicates the token for the next query.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2w6Olxc+cMPjUtUMpttDGZkffvHCfhBKKNEyCVaq+WUEzuUWpp9+QOApNf6g==</p>
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
     * <p>Indicates whether the query for created ECR instances was successful. Valid values:</p>
     * <ul>
     * <li><strong>True</strong>: The query was successful.</li>
     * <li><strong>False</strong>: The query failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of Express Connect Router (ECR) instances.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeExpressConnectRouterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExpressConnectRouterResponseBody self = new DescribeExpressConnectRouterResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExpressConnectRouterResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeExpressConnectRouterResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeExpressConnectRouterResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public DescribeExpressConnectRouterResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public DescribeExpressConnectRouterResponseBody setEcrList(java.util.List<DescribeExpressConnectRouterResponseBodyEcrList> ecrList) {
        this.ecrList = ecrList;
        return this;
    }
    public java.util.List<DescribeExpressConnectRouterResponseBodyEcrList> getEcrList() {
        return this.ecrList;
    }

    public DescribeExpressConnectRouterResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeExpressConnectRouterResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeExpressConnectRouterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeExpressConnectRouterResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeExpressConnectRouterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExpressConnectRouterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeExpressConnectRouterResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeExpressConnectRouterResponseBodyEcrListTags extends TeaModel {
        /**
         * <p>The tag key of the Express Connect Router (ECR) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value of the Express Connect Router (ECR) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeExpressConnectRouterResponseBodyEcrListTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpressConnectRouterResponseBodyEcrListTags self = new DescribeExpressConnectRouterResponseBodyEcrListTags();
            return TeaModel.build(map, self);
        }

        public DescribeExpressConnectRouterResponseBodyEcrListTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeExpressConnectRouterResponseBodyEcrListTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeExpressConnectRouterResponseBodyEcrList extends TeaModel {
        /**
         * <p>The ASN of the Express Connect Router (ECR) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>45104</p>
         */
        @NameInMap("AlibabaSideAsn")
        public Long alibabaSideAsn;

        /**
         * <p>The business status of the service instance. Valid values:</p>
         * <ul>
         * <li><p><strong>Normal</strong>: Normal.</p>
         * </li>
         * <li><p><strong>FinancialLocked</strong>: Locked due to overdue payment.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("BizStatus")
        public String bizStatus;

        /**
         * <p>The description of the Express Connect Router (ECR) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the Express Connect Router (ECR) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ecr-mezk2idmsd0vx2****</p>
         */
        @NameInMap("EcrId")
        public String ecrId;

        /**
         * <p>The time when the Express Connect Router (ECR) instance was created. The time is displayed in UTC and follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-16T01:44:50Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the Express Connect Router (ECR) instance was modified. The time is displayed in UTC and follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-16T01:44:50Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The name of the Express Connect Router (ECR) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The Alibaba Cloud account ID to which the Express Connect Router (ECR) instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>170646818729****</p>
         */
        @NameInMap("OwnerId")
        public Long ownerId;

        /**
         * <p>The ID of the resource group to which the Express Connect Router (ECR) instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzuscospt****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The deployment status of the service instance. Valid values:</p>
         * <ul>
         * <li><p><strong>ACTIVE</strong>: Created.</p>
         * </li>
         * <li><p><strong>UPDATING</strong>: Updating.</p>
         * </li>
         * <li><p><strong>ASSOCIATING</strong>: Associating resources.</p>
         * </li>
         * <li><p><strong>DISSOCIATING</strong>: Dissociating resources.</p>
         * </li>
         * <li><p><strong>LOCKED_ATTACHING</strong>: Locked for association by an external system.</p>
         * </li>
         * <li><p><strong>LOCKED_DETACHING</strong>: Locked for dissociation by an external system.</p>
         * </li>
         * <li><p><strong>RECLAIMING</strong>: Pending resource release.</p>
         * </li>
         * <li><p><strong>DELETING</strong>: Deleting.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The list of tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<DescribeExpressConnectRouterResponseBodyEcrListTags> tags;

        public static DescribeExpressConnectRouterResponseBodyEcrList build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpressConnectRouterResponseBodyEcrList self = new DescribeExpressConnectRouterResponseBodyEcrList();
            return TeaModel.build(map, self);
        }

        public DescribeExpressConnectRouterResponseBodyEcrList setAlibabaSideAsn(Long alibabaSideAsn) {
            this.alibabaSideAsn = alibabaSideAsn;
            return this;
        }
        public Long getAlibabaSideAsn() {
            return this.alibabaSideAsn;
        }

        public DescribeExpressConnectRouterResponseBodyEcrList setBizStatus(String bizStatus) {
            this.bizStatus = bizStatus;
            return this;
        }
        public String getBizStatus() {
            return this.bizStatus;
        }

        public DescribeExpressConnectRouterResponseBodyEcrList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeExpressConnectRouterResponseBodyEcrList setEcrId(String ecrId) {
            this.ecrId = ecrId;
            return this;
        }
        public String getEcrId() {
            return this.ecrId;
        }

        public DescribeExpressConnectRouterResponseBodyEcrList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeExpressConnectRouterResponseBodyEcrList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeExpressConnectRouterResponseBodyEcrList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeExpressConnectRouterResponseBodyEcrList setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public DescribeExpressConnectRouterResponseBodyEcrList setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeExpressConnectRouterResponseBodyEcrList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeExpressConnectRouterResponseBodyEcrList setTags(java.util.List<DescribeExpressConnectRouterResponseBodyEcrListTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeExpressConnectRouterResponseBodyEcrListTags> getTags() {
            return this.tags;
        }

    }

}
