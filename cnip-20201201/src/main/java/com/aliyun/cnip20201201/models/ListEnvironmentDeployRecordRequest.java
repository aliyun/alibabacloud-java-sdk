// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListEnvironmentDeployRecordRequest extends TeaModel {
    @NameInMap("pageNum")
    public Integer pageNum;

    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListEnvironmentDeployRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentDeployRecordRequest self = new ListEnvironmentDeployRecordRequest();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentDeployRecordRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListEnvironmentDeployRecordRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
