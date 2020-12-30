// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.microgw20200810.models;

import com.aliyun.tea.*;

public class DataScopesValue extends TeaModel {
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

    public static DataScopesValue build(java.util.Map<String, ?> map) throws Exception {
        DataScopesValue self = new DataScopesValue();
        return TeaModel.build(map, self);
    }

    public DataScopesValue setApiId(Long apiId) {
        this.apiId = apiId;
        return this;
    }
    public Long getApiId() {
        return this.apiId;
    }

    public DataScopesValue setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public DataScopesValue setCreationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }
    public String getCreationDateTime() {
        return this.creationDateTime;
    }

    public DataScopesValue setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DataScopesValue setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DataScopesValue setPolicyAliasName(String policyAliasName) {
        this.policyAliasName = policyAliasName;
        return this;
    }
    public String getPolicyAliasName() {
        return this.policyAliasName;
    }

    public DataScopesValue setPolicyContent(String policyContent) {
        this.policyContent = policyContent;
        return this;
    }
    public String getPolicyContent() {
        return this.policyContent;
    }

    public DataScopesValue setPolicyGroup(String policyGroup) {
        this.policyGroup = policyGroup;
        return this;
    }
    public String getPolicyGroup() {
        return this.policyGroup;
    }

    public DataScopesValue setPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }
    public String getPolicyId() {
        return this.policyId;
    }

    public DataScopesValue setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public DataScopesValue setPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    public Long getPriority() {
        return this.priority;
    }

    public DataScopesValue setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public DataScopesValue setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public DataScopesValue setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

    public DataScopesValue setUpdateDateTime(String updateDateTime) {
        this.updateDateTime = updateDateTime;
        return this;
    }
    public String getUpdateDateTime() {
        return this.updateDateTime;
    }

}
