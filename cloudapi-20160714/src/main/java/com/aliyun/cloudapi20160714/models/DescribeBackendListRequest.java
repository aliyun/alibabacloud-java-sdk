// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeBackendListRequest extends TeaModel {
    @NameInMap("BackendName")
    public String backendName;

    @NameInMap("BackendType")
    public String backendType;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeBackendListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackendListRequest self = new DescribeBackendListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBackendListRequest setBackendName(String backendName) {
        this.backendName = backendName;
        return this;
    }
    public String getBackendName() {
        return this.backendName;
    }

    public DescribeBackendListRequest setBackendType(String backendType) {
        this.backendType = backendType;
        return this;
    }
    public String getBackendType() {
        return this.backendType;
    }

    public DescribeBackendListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBackendListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBackendListRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
