// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class GetBlockchainCreateTaskRequest extends TeaModel {
    @NameInMap("Current")
    public Integer current;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetBlockchainCreateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBlockchainCreateTaskRequest self = new GetBlockchainCreateTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetBlockchainCreateTaskRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public GetBlockchainCreateTaskRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
