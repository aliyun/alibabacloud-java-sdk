// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectRouterResponseBody extends TeaModel {
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

    @NameInMap("EcrList")
    public java.util.List<DescribeExpressConnectRouterResponseBodyEcrList> ecrList;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>10</p>
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
     * <p>AAAAAdDWBF2w6Olxc+cMPjUtUMpttDGZkffvHCfhBKKNEyCVaq+WUEzuUWpp9+QOApNf6g==</p>
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
         * <strong>example:</strong>
         * <p>181614792955****</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Category")
        public Integer category;

        /**
         * <strong>example:</strong>
         * <p>000000100089****</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <strong>example:</strong>
         * <p>rg-aek2aq7f4va****</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>ECR</p>
         */
        @NameInMap("ResuorceType")
        public String resuorceType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Scope")
        public Integer scope;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeExpressConnectRouterResponseBodyEcrListTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeExpressConnectRouterResponseBodyEcrListTags self = new DescribeExpressConnectRouterResponseBodyEcrListTags();
            return TeaModel.build(map, self);
        }

        public DescribeExpressConnectRouterResponseBodyEcrListTags setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public DescribeExpressConnectRouterResponseBodyEcrListTags setCategory(Integer category) {
            this.category = category;
            return this;
        }
        public Integer getCategory() {
            return this.category;
        }

        public DescribeExpressConnectRouterResponseBodyEcrListTags setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeExpressConnectRouterResponseBodyEcrListTags setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeExpressConnectRouterResponseBodyEcrListTags setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeExpressConnectRouterResponseBodyEcrListTags setResuorceType(String resuorceType) {
            this.resuorceType = resuorceType;
            return this;
        }
        public String getResuorceType() {
            return this.resuorceType;
        }

        public DescribeExpressConnectRouterResponseBodyEcrListTags setScope(Integer scope) {
            this.scope = scope;
            return this;
        }
        public Integer getScope() {
            return this.scope;
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
         * <strong>example:</strong>
         * <p>45104</p>
         */
        @NameInMap("AlibabaSideAsn")
        public Long alibabaSideAsn;

        /**
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("BizStatus")
        public String bizStatus;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>ecr-mezk2idmsd0vx2****</p>
         */
        @NameInMap("EcrId")
        public String ecrId;

        /**
         * <strong>example:</strong>
         * <p>2023-02-16T01:44:50Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2023-02-16T01:44:50Z</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>170646818729****</p>
         */
        @NameInMap("OwnerId")
        public Long ownerId;

        /**
         * <strong>example:</strong>
         * <p>rg-aekzuscospt****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("Status")
        public String status;

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
