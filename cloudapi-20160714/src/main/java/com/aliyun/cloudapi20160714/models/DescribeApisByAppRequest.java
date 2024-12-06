// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApisByAppRequest extends TeaModel {
    /**
     * <p>The name of the API. The name is used for fuzzy match.</p>
     * 
     * <strong>example:</strong>
     * <p>getPersonInfo</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <p>The API ID.</p>
     * 
     * <strong>example:</strong>
     * <p>b19240592b1b4e74961fb8438ed7550c</p>
     */
    @NameInMap("ApiUid")
    public String apiUid;

    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>333486644</p>
     */
    @NameInMap("AppId")
    public Long appId;

    /**
     * <p>The description of the API.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The request HTTP method of the API.</p>
     * 
     * <strong>example:</strong>
     * <p>POST</p>
     */
    @NameInMap("Method")
    public String method;

    /**
     * <p>The number of the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request path of the API.</p>
     * 
     * <strong>example:</strong>
     * <p>/tt</p>
     */
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
