// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeDeployedApisRequest extends TeaModel {
    @NameInMap("ApiId")
    public String apiId;

    @NameInMap("ApiMethod")
    public String apiMethod;

    @NameInMap("ApiName")
    public String apiName;

    @NameInMap("ApiPath")
    public String apiPath;

    @NameInMap("EnableTagAuth")
    public Boolean enableTagAuth;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("StageName")
    public String stageName;

    @NameInMap("Tag")
    public java.util.List<DescribeDeployedApisRequestTag> tag;

    public static DescribeDeployedApisRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeployedApisRequest self = new DescribeDeployedApisRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDeployedApisRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public DescribeDeployedApisRequest setApiMethod(String apiMethod) {
        this.apiMethod = apiMethod;
        return this;
    }
    public String getApiMethod() {
        return this.apiMethod;
    }

    public DescribeDeployedApisRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public DescribeDeployedApisRequest setApiPath(String apiPath) {
        this.apiPath = apiPath;
        return this;
    }
    public String getApiPath() {
        return this.apiPath;
    }

    public DescribeDeployedApisRequest setEnableTagAuth(Boolean enableTagAuth) {
        this.enableTagAuth = enableTagAuth;
        return this;
    }
    public Boolean getEnableTagAuth() {
        return this.enableTagAuth;
    }

    public DescribeDeployedApisRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeDeployedApisRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDeployedApisRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDeployedApisRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeDeployedApisRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

    public DescribeDeployedApisRequest setTag(java.util.List<DescribeDeployedApisRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeDeployedApisRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeDeployedApisRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeDeployedApisRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeployedApisRequestTag self = new DescribeDeployedApisRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeDeployedApisRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeDeployedApisRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
