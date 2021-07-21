// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListEnvChangeParamsRequest extends TeaModel {
    @NameInMap("pageNum")
    public String pageNum;

    @NameInMap("pageSize")
    public String pageSize;

    // 全局参数传global，组件配置传component
    @NameInMap("paramType")
    public String paramType;

    public static ListEnvChangeParamsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEnvChangeParamsRequest self = new ListEnvChangeParamsRequest();
        return TeaModel.build(map, self);
    }

    public ListEnvChangeParamsRequest setPageNum(String pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public String getPageNum() {
        return this.pageNum;
    }

    public ListEnvChangeParamsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListEnvChangeParamsRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

}
