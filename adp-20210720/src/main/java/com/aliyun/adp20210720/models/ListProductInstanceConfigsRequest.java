// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class ListProductInstanceConfigsRequest extends TeaModel {
    @NameInMap("componentReleaseName")
    public String componentReleaseName;

    @NameInMap("environmentUID")
    public String environmentUID;

    @NameInMap("fuzzy")
    public String fuzzy;

    @NameInMap("pageNum")
    public Integer pageNum;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("paramType")
    public String paramType;

    @NameInMap("parameter")
    public String parameter;

    @NameInMap("productVersionUID")
    public String productVersionUID;

    public static ListProductInstanceConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductInstanceConfigsRequest self = new ListProductInstanceConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListProductInstanceConfigsRequest setComponentReleaseName(String componentReleaseName) {
        this.componentReleaseName = componentReleaseName;
        return this;
    }
    public String getComponentReleaseName() {
        return this.componentReleaseName;
    }

    public ListProductInstanceConfigsRequest setEnvironmentUID(String environmentUID) {
        this.environmentUID = environmentUID;
        return this;
    }
    public String getEnvironmentUID() {
        return this.environmentUID;
    }

    public ListProductInstanceConfigsRequest setFuzzy(String fuzzy) {
        this.fuzzy = fuzzy;
        return this;
    }
    public String getFuzzy() {
        return this.fuzzy;
    }

    public ListProductInstanceConfigsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListProductInstanceConfigsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProductInstanceConfigsRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public ListProductInstanceConfigsRequest setParameter(String parameter) {
        this.parameter = parameter;
        return this;
    }
    public String getParameter() {
        return this.parameter;
    }

    public ListProductInstanceConfigsRequest setProductVersionUID(String productVersionUID) {
        this.productVersionUID = productVersionUID;
        return this;
    }
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

}
