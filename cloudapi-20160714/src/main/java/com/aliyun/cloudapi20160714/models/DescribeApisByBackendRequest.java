// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApisByBackendRequest extends TeaModel {
    /**
     * <p>The ID of the backend service.</p>
     */
    @NameInMap("BackendId")
    public String backendId;

    /**
     * <p>The number of the current page.</p>
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
     * <p>The environment to which the API is published. Valid values:</p>
     * <br>
     * <p>*   **RELEASE**</p>
     * <p>*   **PRE**</p>
     * <p>*   **TEST**</p>
     * <br>
     * <p>If you do not specify this parameter, APIs in the draft state are returned.</p>
     */
    @NameInMap("StageName")
    public String stageName;

    public static DescribeApisByBackendRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisByBackendRequest self = new DescribeApisByBackendRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApisByBackendRequest setBackendId(String backendId) {
        this.backendId = backendId;
        return this;
    }
    public String getBackendId() {
        return this.backendId;
    }

    public DescribeApisByBackendRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApisByBackendRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApisByBackendRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeApisByBackendRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
