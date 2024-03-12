// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class DescribeExpressConnectRouterResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Code")
    public String code;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("EcrList")
    public java.util.List<DescribeExpressConnectRouterResponseBodyEcrList> ecrList;

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
        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("Category")
        public Integer category;

        @NameInMap("Id")
        public Long id;

        @NameInMap("RegionNo")
        public String regionNo;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResuorceType")
        public String resuorceType;

        @NameInMap("Scope")
        public Integer scope;

        @NameInMap("TagKey")
        public String tagKey;

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
        @NameInMap("AlibabaSideAsn")
        public Long alibabaSideAsn;

        @NameInMap("BizStatus")
        public String bizStatus;

        @NameInMap("Description")
        public String description;

        @NameInMap("EcrId")
        public String ecrId;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Name")
        public String name;

        @NameInMap("OwnerId")
        public Long ownerId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

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
