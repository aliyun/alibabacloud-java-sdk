// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class ListServiceInstancesRequest extends TeaModel {
    // 请求的页码（默认为1）
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 每页的大小（默认为100）
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListServiceInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceInstancesRequest self = new ListServiceInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListServiceInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
