// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class GetPolicyByIdResponseBody extends TeaModel {
    // code
    @NameInMap("code")
    public Long code;

    // data
    @NameInMap("data")
    public java.util.List<GetPolicyByIdResponseBodyData> data;

    // message
    @NameInMap("message")
    public String message;

    public static GetPolicyByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPolicyByIdResponseBody self = new GetPolicyByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPolicyByIdResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetPolicyByIdResponseBody setData(java.util.List<GetPolicyByIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetPolicyByIdResponseBodyData> getData() {
        return this.data;
    }

    public GetPolicyByIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class GetPolicyByIdResponseBodyDataAttachedApi extends TeaModel {
        // apiId
        @NameInMap("apiId")
        public Long apiId;

        // apiName
        @NameInMap("apiName")
        public String apiName;

        // creationDateTime
        @NameInMap("creationDateTime")
        public String creationDateTime;

        // direction
        @NameInMap("direction")
        public String direction;

        // id
        @NameInMap("id")
        public Long id;

        // policyAliasName
        @NameInMap("policyAliasName")
        public String policyAliasName;

        // policyContent
        @NameInMap("policyContent")
        public String policyContent;

        // policyGroup
        @NameInMap("policyGroup")
        public String policyGroup;

        // policyId
        @NameInMap("policyId")
        public String policyId;

        // policyName
        @NameInMap("policyName")
        public String policyName;

        // priority
        @NameInMap("priority")
        public Long priority;

        // scope
        @NameInMap("scope")
        public String scope;

        // status
        @NameInMap("status")
        public Boolean status;

        // type
        @NameInMap("type")
        public Long type;

        // updateDateTime
        @NameInMap("updateDateTime")
        public String updateDateTime;

        public static GetPolicyByIdResponseBodyDataAttachedApi build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyByIdResponseBodyDataAttachedApi self = new GetPolicyByIdResponseBodyDataAttachedApi();
            return TeaModel.build(map, self);
        }

        public GetPolicyByIdResponseBodyDataAttachedApi setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public GetPolicyByIdResponseBodyDataAttachedApi setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public GetPolicyByIdResponseBodyDataAttachedApi setCreationDateTime(String creationDateTime) {
            this.creationDateTime = creationDateTime;
            return this;
        }
        public String getCreationDateTime() {
            return this.creationDateTime;
        }

        public GetPolicyByIdResponseBodyDataAttachedApi setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public GetPolicyByIdResponseBodyDataAttachedApi setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetPolicyByIdResponseBodyDataAttachedApi setPolicyAliasName(String policyAliasName) {
            this.policyAliasName = policyAliasName;
            return this;
        }
        public String getPolicyAliasName() {
            return this.policyAliasName;
        }

        public GetPolicyByIdResponseBodyDataAttachedApi setPolicyContent(String policyContent) {
            this.policyContent = policyContent;
            return this;
        }
        public String getPolicyContent() {
            return this.policyContent;
        }

        public GetPolicyByIdResponseBodyDataAttachedApi setPolicyGroup(String policyGroup) {
            this.policyGroup = policyGroup;
            return this;
        }
        public String getPolicyGroup() {
            return this.policyGroup;
        }

        public GetPolicyByIdResponseBodyDataAttachedApi setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public GetPolicyByIdResponseBodyDataAttachedApi setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public GetPolicyByIdResponseBodyDataAttachedApi setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public GetPolicyByIdResponseBodyDataAttachedApi setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public GetPolicyByIdResponseBodyDataAttachedApi setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public GetPolicyByIdResponseBodyDataAttachedApi setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

        public GetPolicyByIdResponseBodyDataAttachedApi setUpdateDateTime(String updateDateTime) {
            this.updateDateTime = updateDateTime;
            return this;
        }
        public String getUpdateDateTime() {
            return this.updateDateTime;
        }

    }

    public static class GetPolicyByIdResponseBodyData extends TeaModel {
        // aliasName
        @NameInMap("aliasName")
        public String aliasName;

        // attachedApi
        @NameInMap("attachedApi")
        public java.util.List<GetPolicyByIdResponseBodyDataAttachedApi> attachedApi;

        // content
        @NameInMap("content")
        public String content;

        // creationDateTime
        @NameInMap("creationDateTime")
        public String creationDateTime;

        // id
        @NameInMap("id")
        public Long id;

        // name
        @NameInMap("name")
        public String name;

        // policyGroup
        @NameInMap("policyGroup")
        public String policyGroup;

        // policyTypeName
        @NameInMap("policyTypeName")
        public String policyTypeName;

        // type
        @NameInMap("type")
        public Long type;

        // updateDateTime
        @NameInMap("updateDateTime")
        public String updateDateTime;

        public static GetPolicyByIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPolicyByIdResponseBodyData self = new GetPolicyByIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPolicyByIdResponseBodyData setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public GetPolicyByIdResponseBodyData setAttachedApi(java.util.List<GetPolicyByIdResponseBodyDataAttachedApi> attachedApi) {
            this.attachedApi = attachedApi;
            return this;
        }
        public java.util.List<GetPolicyByIdResponseBodyDataAttachedApi> getAttachedApi() {
            return this.attachedApi;
        }

        public GetPolicyByIdResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetPolicyByIdResponseBodyData setCreationDateTime(String creationDateTime) {
            this.creationDateTime = creationDateTime;
            return this;
        }
        public String getCreationDateTime() {
            return this.creationDateTime;
        }

        public GetPolicyByIdResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetPolicyByIdResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetPolicyByIdResponseBodyData setPolicyGroup(String policyGroup) {
            this.policyGroup = policyGroup;
            return this;
        }
        public String getPolicyGroup() {
            return this.policyGroup;
        }

        public GetPolicyByIdResponseBodyData setPolicyTypeName(String policyTypeName) {
            this.policyTypeName = policyTypeName;
            return this;
        }
        public String getPolicyTypeName() {
            return this.policyTypeName;
        }

        public GetPolicyByIdResponseBodyData setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

        public GetPolicyByIdResponseBodyData setUpdateDateTime(String updateDateTime) {
            this.updateDateTime = updateDateTime;
            return this;
        }
        public String getUpdateDateTime() {
            return this.updateDateTime;
        }

    }

}
