// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class GetExpressConnectRouterResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("AlibabaSideAsn")
    public Long alibabaSideAsn;

    @NameInMap("BizStatus")
    public String bizStatus;

    @NameInMap("Code")
    public String code;

    @NameInMap("Description")
    public String description;

    @NameInMap("DynamicCode")
    public String dynamicCode;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("EcrId")
    public String ecrId;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Tags")
    public java.util.List<GetExpressConnectRouterResponseBodyTags> tags;

    public static GetExpressConnectRouterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetExpressConnectRouterResponseBody self = new GetExpressConnectRouterResponseBody();
        return TeaModel.build(map, self);
    }

    public GetExpressConnectRouterResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetExpressConnectRouterResponseBody setAlibabaSideAsn(Long alibabaSideAsn) {
        this.alibabaSideAsn = alibabaSideAsn;
        return this;
    }
    public Long getAlibabaSideAsn() {
        return this.alibabaSideAsn;
    }

    public GetExpressConnectRouterResponseBody setBizStatus(String bizStatus) {
        this.bizStatus = bizStatus;
        return this;
    }
    public String getBizStatus() {
        return this.bizStatus;
    }

    public GetExpressConnectRouterResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetExpressConnectRouterResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetExpressConnectRouterResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetExpressConnectRouterResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetExpressConnectRouterResponseBody setEcrId(String ecrId) {
        this.ecrId = ecrId;
        return this;
    }
    public String getEcrId() {
        return this.ecrId;
    }

    public GetExpressConnectRouterResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public GetExpressConnectRouterResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public GetExpressConnectRouterResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetExpressConnectRouterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetExpressConnectRouterResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetExpressConnectRouterResponseBody setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetExpressConnectRouterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetExpressConnectRouterResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetExpressConnectRouterResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetExpressConnectRouterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetExpressConnectRouterResponseBody setTags(java.util.List<GetExpressConnectRouterResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetExpressConnectRouterResponseBodyTags> getTags() {
        return this.tags;
    }

    public static class GetExpressConnectRouterResponseBodyTags extends TeaModel {
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

        public static GetExpressConnectRouterResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetExpressConnectRouterResponseBodyTags self = new GetExpressConnectRouterResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetExpressConnectRouterResponseBodyTags setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public GetExpressConnectRouterResponseBodyTags setCategory(Integer category) {
            this.category = category;
            return this;
        }
        public Integer getCategory() {
            return this.category;
        }

        public GetExpressConnectRouterResponseBodyTags setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetExpressConnectRouterResponseBodyTags setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public GetExpressConnectRouterResponseBodyTags setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public GetExpressConnectRouterResponseBodyTags setResuorceType(String resuorceType) {
            this.resuorceType = resuorceType;
            return this;
        }
        public String getResuorceType() {
            return this.resuorceType;
        }

        public GetExpressConnectRouterResponseBodyTags setScope(Integer scope) {
            this.scope = scope;
            return this;
        }
        public Integer getScope() {
            return this.scope;
        }

        public GetExpressConnectRouterResponseBodyTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetExpressConnectRouterResponseBodyTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
