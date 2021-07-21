// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListEnvironmentParamsRequest extends TeaModel {
    @NameInMap("pageNum")
    public Integer pageNum;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("name")
    public String name;

    @NameInMap("fuzzy")
    public String fuzzy;

    // 组件和全局类型字段
    @NameInMap("paramType")
    public String paramType;

    @NameInMap("productVersionUID")
    public String productVersionUID;

    public static ListEnvironmentParamsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentParamsRequest self = new ListEnvironmentParamsRequest();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentParamsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListEnvironmentParamsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListEnvironmentParamsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListEnvironmentParamsRequest setFuzzy(String fuzzy) {
        this.fuzzy = fuzzy;
        return this;
    }
    public String getFuzzy() {
        return this.fuzzy;
    }

    public ListEnvironmentParamsRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

    public ListEnvironmentParamsRequest setProductVersionUID(String productVersionUID) {
        this.productVersionUID = productVersionUID;
        return this;
    }
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

}
