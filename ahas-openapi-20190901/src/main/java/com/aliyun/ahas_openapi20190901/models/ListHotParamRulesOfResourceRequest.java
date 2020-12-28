// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ListHotParamRulesOfResourceRequest extends TeaModel {
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("Resource")
    public String resource;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    public static ListHotParamRulesOfResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHotParamRulesOfResourceRequest self = new ListHotParamRulesOfResourceRequest();
        return TeaModel.build(map, self);
    }

    public ListHotParamRulesOfResourceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListHotParamRulesOfResourceRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListHotParamRulesOfResourceRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public ListHotParamRulesOfResourceRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListHotParamRulesOfResourceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListHotParamRulesOfResourceRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

}
