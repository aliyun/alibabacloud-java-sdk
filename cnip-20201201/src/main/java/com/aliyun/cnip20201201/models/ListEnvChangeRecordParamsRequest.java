// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListEnvChangeRecordParamsRequest extends TeaModel {
    @NameInMap("pageNum")
    public String pageNum;

    @NameInMap("pageSize")
    public String pageSize;

    // 全局参数传global，组件配置传component
    @NameInMap("paramType")
    public String paramType;

    public static ListEnvChangeRecordParamsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEnvChangeRecordParamsRequest self = new ListEnvChangeRecordParamsRequest();
        return TeaModel.build(map, self);
    }

    public ListEnvChangeRecordParamsRequest setPageNum(String pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public String getPageNum() {
        return this.pageNum;
    }

    public ListEnvChangeRecordParamsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListEnvChangeRecordParamsRequest setParamType(String paramType) {
        this.paramType = paramType;
        return this;
    }
    public String getParamType() {
        return this.paramType;
    }

}
