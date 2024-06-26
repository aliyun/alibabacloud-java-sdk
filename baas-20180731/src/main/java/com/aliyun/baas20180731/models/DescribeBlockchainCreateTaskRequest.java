// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeBlockchainCreateTaskRequest extends TeaModel {
    @NameInMap("Current")
    public Integer current;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeBlockchainCreateTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockchainCreateTaskRequest self = new DescribeBlockchainCreateTaskRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBlockchainCreateTaskRequest setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public DescribeBlockchainCreateTaskRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
