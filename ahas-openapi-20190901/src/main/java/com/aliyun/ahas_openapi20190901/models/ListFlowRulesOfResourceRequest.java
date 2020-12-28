// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class ListFlowRulesOfResourceRequest extends TeaModel {
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

    public static ListFlowRulesOfResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFlowRulesOfResourceRequest self = new ListFlowRulesOfResourceRequest();
        return TeaModel.build(map, self);
    }

    public ListFlowRulesOfResourceRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListFlowRulesOfResourceRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ListFlowRulesOfResourceRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public ListFlowRulesOfResourceRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListFlowRulesOfResourceRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFlowRulesOfResourceRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

}
