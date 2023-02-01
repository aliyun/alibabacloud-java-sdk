// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApisRequest extends TeaModel {
    /**
     * <p>The ID of the API.</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    @NameInMap("ApiMethod")
    public String apiMethod;

    /**
     * <p>The name of the API operation. The name is used for fuzzy match.</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    @NameInMap("ApiPath")
    public String apiPath;

    /**
     * <p>The ID of the category.</p>
     */
    @NameInMap("CatalogId")
    public String catalogId;

    /**
     * <p>Specifies whether to enable tag verification.</p>
     */
    @NameInMap("EnableTagAuth")
    public Boolean enableTagAuth;

    /**
     * <p>The ID of the API group.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: 100. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("StageName")
    public String stageName;

    /**
     * <p>The tag of objects that match the rule. You can specify multiple tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeApisRequestTag> tag;

    @NameInMap("UnDeployed")
    public Boolean unDeployed;

    /**
     * <p>Specifies whether to make the API public. Valid values:</p>
     * <br>
     * <p>*   **PUBLIC: Make the API public. If you set this parameter to PUBLIC, this API is displayed on the APIs page for all users after the API is published to the production environment.**</p>
     * <p>*   **PRIVATE: Make the API private. Private APIs are not displayed in the Alibaba Cloud Marketplace after the API group to which they belong is made available.</p>
     */
    @NameInMap("Visibility")
    public String visibility;

    public static DescribeApisRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisRequest self = new DescribeApisRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApisRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public DescribeApisRequest setApiMethod(String apiMethod) {
        this.apiMethod = apiMethod;
        return this;
    }
    public String getApiMethod() {
        return this.apiMethod;
    }

    public DescribeApisRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public DescribeApisRequest setApiPath(String apiPath) {
        this.apiPath = apiPath;
        return this;
    }
    public String getApiPath() {
        return this.apiPath;
    }

    public DescribeApisRequest setCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }
    public String getCatalogId() {
        return this.catalogId;
    }

    public DescribeApisRequest setEnableTagAuth(Boolean enableTagAuth) {
        this.enableTagAuth = enableTagAuth;
        return this;
    }
    public Boolean getEnableTagAuth() {
        return this.enableTagAuth;
    }

    public DescribeApisRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeApisRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApisRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApisRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeApisRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

    public DescribeApisRequest setTag(java.util.List<DescribeApisRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeApisRequestTag> getTag() {
        return this.tag;
    }

    public DescribeApisRequest setUnDeployed(Boolean unDeployed) {
        this.unDeployed = unDeployed;
        return this;
    }
    public Boolean getUnDeployed() {
        return this.unDeployed;
    }

    public DescribeApisRequest setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

    public static class DescribeApisRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeApisRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeApisRequestTag self = new DescribeApisRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeApisRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeApisRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
