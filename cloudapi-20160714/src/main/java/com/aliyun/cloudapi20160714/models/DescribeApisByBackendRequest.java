// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApisByBackendRequest extends TeaModel {
    /**
     * <p>The ID of the backend service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4ac69b7a17524781b275ed4c5eb25c54</p>
     */
    @NameInMap("BackendId")
    public String backendId;

    /**
     * <p>The number of the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The environment to which the API is published. Valid values:</p>
     * <ul>
     * <li><strong>RELEASE</strong></li>
     * <li><strong>PRE</strong></li>
     * <li><strong>TEST</strong></li>
     * </ul>
     * <p>If you do not specify this parameter, APIs in the draft state are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>PRE</p>
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
