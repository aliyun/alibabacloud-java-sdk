// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeHistoryApisRequest extends TeaModel {
    /**
     * <p>The ID of the API.</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The name of the API. The name is used for fuzzy match.</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <p>The ID of the API group.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The page number of the current page.</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The name of the runtime environment. Valid values:</p>
     * <br>
     * <p>*   **RELEASE**</p>
     * <p>*   **TEST**</p>
     */
    @NameInMap("StageName")
    public String stageName;

    public static DescribeHistoryApisRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHistoryApisRequest self = new DescribeHistoryApisRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHistoryApisRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public DescribeHistoryApisRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public DescribeHistoryApisRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeHistoryApisRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeHistoryApisRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeHistoryApisRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeHistoryApisRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
