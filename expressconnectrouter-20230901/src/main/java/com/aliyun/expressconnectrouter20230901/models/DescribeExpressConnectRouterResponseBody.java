// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectRouterResponseBody extends TeaModel {
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
     * <p>IllegalParamFormat.Name</p>
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
     * <p>The param format of Name **** is illegal.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The ECRs.</p>
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
     * <p>The total number of entries returned. Valid values: 1 to 2147483647. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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
     * <p>The total number of ECRs.</p>
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
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <p>The tag value.</p>
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
         * <p>The autonomous system number (ASN) of the ECR.</p>
         * 
         * <strong>example:</strong>
         * <p>45104</p>
         */
        @NameInMap("AlibabaSideAsn")
        public Long alibabaSideAsn;

        /**
         * <p>The business state of the ECR. Valid values:</p>
         * <ul>
         * <li><strong>Normal:</strong> The ECR is running as expected.</li>
         * <li><strong>FinancialLocked</strong>: The ECR is locked due to overdue payments.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("BizStatus")
        public String bizStatus;

        /**
         * <p>The description of the ECR.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ECR ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecr-mezk2idmsd0vx2****</p>
         */
        @NameInMap("EcrId")
        public String ecrId;

        /**
         * <p>The time when the ECR was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-16T01:44:50Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the ECR was modified. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-16T01:44:50Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The name of the ECR.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the Alibaba Cloud account that owns the ECR.</p>
         * 
         * <strong>example:</strong>
         * <p>170646818729****</p>
         */
        @NameInMap("OwnerId")
        public Long ownerId;

        /**
         * <p>The ID of the resource group to which the ECR belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzuscospt****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The deployment state of the ECR. Valid values:</p>
         * <ul>
         * <li><strong>ACTIVE</strong>: The ECR is created.</li>
         * <li><strong>UPDATING</strong>: The ECR is being modified.</li>
         * <li><strong>ASSOCIATING</strong>: The ECR is being associated with resources.</li>
         * <li><strong>DISSOCIATING</strong>: The resource is being disassociated from resources.</li>
         * <li><strong>LOCKED_ATTACHING</strong>: The ECR is locked because it is being associated with an external system.</li>
         * <li><strong>LOCKED_DETACHING</strong>: The ECR is locked because it is being disassociated from an external system.</li>
         * <li><strong>RECLAIMING</strong>: The ECR is waiting to release resources.</li>
         * <li><strong>DELETING</strong>: The ECR is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags.</p>
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
