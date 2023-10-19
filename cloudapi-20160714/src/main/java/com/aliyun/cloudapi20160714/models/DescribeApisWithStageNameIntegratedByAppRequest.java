// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApisWithStageNameIntegratedByAppRequest extends TeaModel {
    @NameInMap("ApiName")
    public String apiName;

    @NameInMap("ApiUid")
    public String apiUid;

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

    public static DescribeApisWithStageNameIntegratedByAppRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApisWithStageNameIntegratedByAppRequest self = new DescribeApisWithStageNameIntegratedByAppRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApisWithStageNameIntegratedByAppRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public DescribeApisWithStageNameIntegratedByAppRequest setApiUid(String apiUid) {
        this.apiUid = apiUid;
        return this;
    }
    public String getApiUid() {
        return this.apiUid;
    }

    public DescribeApisWithStageNameIntegratedByAppRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public DescribeApisWithStageNameIntegratedByAppRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribeApisWithStageNameIntegratedByAppRequest setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public DescribeApisWithStageNameIntegratedByAppRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeApisWithStageNameIntegratedByAppRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeApisWithStageNameIntegratedByAppRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public DescribeApisWithStageNameIntegratedByAppRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
