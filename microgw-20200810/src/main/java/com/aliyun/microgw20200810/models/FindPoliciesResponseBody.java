// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class FindPoliciesResponseBody extends TeaModel {
    // code
    @NameInMap("code")
    public Long code;

    // data
    @NameInMap("data")
    public FindPoliciesResponseBodyData data;

    // message
    @NameInMap("message")
    public String message;

    public static FindPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindPoliciesResponseBody self = new FindPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public FindPoliciesResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public FindPoliciesResponseBody setData(FindPoliciesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FindPoliciesResponseBodyData getData() {
        return this.data;
    }

    public FindPoliciesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class FindPoliciesResponseBodyDataListAttachedApi extends TeaModel {
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

        public static FindPoliciesResponseBodyDataListAttachedApi build(java.util.Map<String, ?> map) throws Exception {
            FindPoliciesResponseBodyDataListAttachedApi self = new FindPoliciesResponseBodyDataListAttachedApi();
            return TeaModel.build(map, self);
        }

        public FindPoliciesResponseBodyDataListAttachedApi setApiId(Long apiId) {
            this.apiId = apiId;
            return this;
        }
        public Long getApiId() {
            return this.apiId;
        }

        public FindPoliciesResponseBodyDataListAttachedApi setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public FindPoliciesResponseBodyDataListAttachedApi setCreationDateTime(String creationDateTime) {
            this.creationDateTime = creationDateTime;
            return this;
        }
        public String getCreationDateTime() {
            return this.creationDateTime;
        }

        public FindPoliciesResponseBodyDataListAttachedApi setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public FindPoliciesResponseBodyDataListAttachedApi setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public FindPoliciesResponseBodyDataListAttachedApi setPolicyAliasName(String policyAliasName) {
            this.policyAliasName = policyAliasName;
            return this;
        }
        public String getPolicyAliasName() {
            return this.policyAliasName;
        }

        public FindPoliciesResponseBodyDataListAttachedApi setPolicyContent(String policyContent) {
            this.policyContent = policyContent;
            return this;
        }
        public String getPolicyContent() {
            return this.policyContent;
        }

        public FindPoliciesResponseBodyDataListAttachedApi setPolicyGroup(String policyGroup) {
            this.policyGroup = policyGroup;
            return this;
        }
        public String getPolicyGroup() {
            return this.policyGroup;
        }

        public FindPoliciesResponseBodyDataListAttachedApi setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public FindPoliciesResponseBodyDataListAttachedApi setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public FindPoliciesResponseBodyDataListAttachedApi setPriority(Long priority) {
            this.priority = priority;
            return this;
        }
        public Long getPriority() {
            return this.priority;
        }

        public FindPoliciesResponseBodyDataListAttachedApi setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public FindPoliciesResponseBodyDataListAttachedApi setStatus(Boolean status) {
            this.status = status;
            return this;
        }
        public Boolean getStatus() {
            return this.status;
        }

        public FindPoliciesResponseBodyDataListAttachedApi setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

        public FindPoliciesResponseBodyDataListAttachedApi setUpdateDateTime(String updateDateTime) {
            this.updateDateTime = updateDateTime;
            return this;
        }
        public String getUpdateDateTime() {
            return this.updateDateTime;
        }

    }

    public static class FindPoliciesResponseBodyDataList extends TeaModel {
        // aliasName
        @NameInMap("aliasName")
        public String aliasName;

        // attachedApi
        @NameInMap("attachedApi")
        public java.util.List<FindPoliciesResponseBodyDataListAttachedApi> attachedApi;

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

        public static FindPoliciesResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            FindPoliciesResponseBodyDataList self = new FindPoliciesResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public FindPoliciesResponseBodyDataList setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public FindPoliciesResponseBodyDataList setAttachedApi(java.util.List<FindPoliciesResponseBodyDataListAttachedApi> attachedApi) {
            this.attachedApi = attachedApi;
            return this;
        }
        public java.util.List<FindPoliciesResponseBodyDataListAttachedApi> getAttachedApi() {
            return this.attachedApi;
        }

        public FindPoliciesResponseBodyDataList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public FindPoliciesResponseBodyDataList setCreationDateTime(String creationDateTime) {
            this.creationDateTime = creationDateTime;
            return this;
        }
        public String getCreationDateTime() {
            return this.creationDateTime;
        }

        public FindPoliciesResponseBodyDataList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public FindPoliciesResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FindPoliciesResponseBodyDataList setPolicyGroup(String policyGroup) {
            this.policyGroup = policyGroup;
            return this;
        }
        public String getPolicyGroup() {
            return this.policyGroup;
        }

        public FindPoliciesResponseBodyDataList setPolicyTypeName(String policyTypeName) {
            this.policyTypeName = policyTypeName;
            return this;
        }
        public String getPolicyTypeName() {
            return this.policyTypeName;
        }

        public FindPoliciesResponseBodyDataList setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

        public FindPoliciesResponseBodyDataList setUpdateDateTime(String updateDateTime) {
            this.updateDateTime = updateDateTime;
            return this;
        }
        public String getUpdateDateTime() {
            return this.updateDateTime;
        }

    }

    public static class FindPoliciesResponseBodyData extends TeaModel {
        // list
        @NameInMap("list")
        public java.util.List<FindPoliciesResponseBodyDataList> list;

        // totalCount
        @NameInMap("totalCount")
        public Long totalCount;

        public static FindPoliciesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FindPoliciesResponseBodyData self = new FindPoliciesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FindPoliciesResponseBodyData setList(java.util.List<FindPoliciesResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<FindPoliciesResponseBodyDataList> getList() {
            return this.list;
        }

        public FindPoliciesResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
