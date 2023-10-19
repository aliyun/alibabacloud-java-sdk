// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribePluginsByApiRequest extends TeaModel {
    /**
     * <p>The ID of the API.</p>
     */
    @NameInMap("ApiId")
    public String apiId;

    /**
     * <p>The ID of the group to which the API belongs.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The environment in which the API is running. Valid values:</p>
     * <br>
     * <p>*   **RELEASE**: production</p>
     * <p>*   **PRE**: staging</p>
     * <p>*   **TEST**: test</p>
     */
    @NameInMap("StageName")
    public String stageName;

    public static DescribePluginsByApiRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePluginsByApiRequest self = new DescribePluginsByApiRequest();
        return TeaModel.build(map, self);
    }

    public DescribePluginsByApiRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public DescribePluginsByApiRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribePluginsByApiRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePluginsByApiRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePluginsByApiRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribePluginsByApiRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
