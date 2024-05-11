// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApisByAppRequest extends TeaModel {
    @NameInMap("ApiName")
    public String apiName;

    @NameInMap("ApiUid")
    public String apiUid;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Method")
    public String method;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Path")
    public String path;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeApisByAppRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisByAppRequest self = new DescribeApisByAppRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApisByAppRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public DescribeApisByAppRequest setApiUid(String apiUid) {
        this.apiUid = apiUid;
        return this;
    }
    public String getApiUid() {
        return this.apiUid;
    }

    public DescribeApisByAppRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public DescribeApisByAppRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeApisByAppRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public DescribeApisByAppRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApisByAppRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApisByAppRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public DescribeApisByAppRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
