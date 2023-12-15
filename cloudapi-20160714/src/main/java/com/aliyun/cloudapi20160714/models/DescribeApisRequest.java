// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApisRequest extends TeaModel {
    /**
     * <p>The API ID.</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The HTTP method of the API request.</p>
     */
    @NameInMap("ApiMethod")
    public String apiMethod;

    /**
     * <p>The API name. The name is used for fuzzy match.</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <p>The request path of the API.</p>
     */
    @NameInMap("ApiPath")
    public String apiPath;

    /**
     * <p>The category ID.</p>
     */
    @NameInMap("CatalogId")
    public String catalogId;

    /**
     * <p>Specifies whether to enable tag verification.</p>
     */
    @NameInMap("EnableTagAuth")
    public Boolean enableTagAuth;

    /**
     * <p>The API group ID.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The environment in which you want to perform this operation. Valid values:</p>
     * <br>
     * <p>*   **RELEASE**: the production environment</p>
     * <p>*   **PRE**: the staging environment</p>
     * <p>*   **TEST**: the test environment</p>
     */
    @NameInMap("StageName")
    public String stageName;

    /**
     * <p>The tags of objects that match the rule.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeApisRequestTag> tag;

    /**
     * <p>Specifies whether to filter unpublished APIs.</p>
     */
    @NameInMap("UnDeployed")
    public Boolean unDeployed;

    /**
     * <p>Specifies whether the API is public. Valid values:</p>
     * <br>
     * <p>*   **PUBLIC**: The API is public. If you publish the definition of a public API to the production environment, the definition is displayed on the APIs page for all users.</p>
     * <p>*   **PRIVATE**: The API is private. If you publish an API group that contains a private API in Alibaba Cloud Marketplace, the API is not displayed in Alibaba Cloud Marketplace.</p>
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
         * <p>The tag value.</p>
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
