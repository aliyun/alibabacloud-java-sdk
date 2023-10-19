// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribePurchasedApisRequest extends TeaModel {
    /**
     * <p>The ID of the API.</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The name of the API.</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <p>The ID of the API group.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The page number of the page to return.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The name of the runtime environment. Valid values:</p>
     * <br>
     * <p>*   **RELEASE**</p>
     * <p>*   **PRE**</p>
     * <p>*   **TEST**</p>
     */
    @NameInMap("StageName")
    public String stageName;

    /**
     * <p>Specifies whether the API is public. Valid values:</p>
     * <br>
     * <p>*   **PUBLIC**: indicates that the API is public. If you set this parameter to PUBLIC, this API is displayed on the API List page in the console for all users after the API is published to the production environment.</p>
     * <p>*   **PRIVATE**: indicates that the API is private. If you set this parameter to PRIVATE, this API is not displayed in Alibaba Cloud Marketplace after the API group to which this API belongs is made available.</p>
     */
    @NameInMap("Visibility")
    public String visibility;

    public static DescribePurchasedApisRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePurchasedApisRequest self = new DescribePurchasedApisRequest();
        return TeaModel.build(map, self);
    }

    public DescribePurchasedApisRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public DescribePurchasedApisRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public DescribePurchasedApisRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribePurchasedApisRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePurchasedApisRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePurchasedApisRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribePurchasedApisRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

    public DescribePurchasedApisRequest setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }
    public String getVisibility() {
        return this.visibility;
    }

}
