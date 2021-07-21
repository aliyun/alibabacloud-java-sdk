// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListProductVersionConfigRequest extends TeaModel {
    @NameInMap("pageNum")
    public String pageNum;

    @NameInMap("pageSize")
    public String pageSize;

    @NameInMap("configType")
    public String configType;

    public static ListProductVersionConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductVersionConfigRequest self = new ListProductVersionConfigRequest();
        return TeaModel.build(map, self);
    }

    public ListProductVersionConfigRequest setPageNum(String pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public String getPageNum() {
        return this.pageNum;
    }

    public ListProductVersionConfigRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListProductVersionConfigRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

}
