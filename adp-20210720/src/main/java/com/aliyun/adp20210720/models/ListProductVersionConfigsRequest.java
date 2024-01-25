// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListProductVersionConfigsRequest extends TeaModel {
    @NameInMap("componentReleaseName")
    public String componentReleaseName;

    @NameInMap("configType")
    public String configType;

    @NameInMap("fuzzy")
    public String fuzzy;

    @NameInMap("pageNum")
    public String pageNum;

    @NameInMap("pageSize")
    public String pageSize;

    @NameInMap("parameter")
    public String parameter;

    @NameInMap("scope")
    public String scope;

    public static ListProductVersionConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductVersionConfigsRequest self = new ListProductVersionConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListProductVersionConfigsRequest setComponentReleaseName(String componentReleaseName) {
        this.componentReleaseName = componentReleaseName;
        return this;
    }
    public String getComponentReleaseName() {
        return this.componentReleaseName;
    }

    public ListProductVersionConfigsRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public ListProductVersionConfigsRequest setFuzzy(String fuzzy) {
        this.fuzzy = fuzzy;
        return this;
    }
    public String getFuzzy() {
        return this.fuzzy;
    }

    public ListProductVersionConfigsRequest setPageNum(String pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public String getPageNum() {
        return this.pageNum;
    }

    public ListProductVersionConfigsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListProductVersionConfigsRequest setParameter(String parameter) {
        this.parameter = parameter;
        return this;
    }
    public String getParameter() {
        return this.parameter;
    }

    public ListProductVersionConfigsRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

}
