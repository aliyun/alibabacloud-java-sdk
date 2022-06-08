// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.image_detect20211221.models;

import com.aliyun.tea.*;

public class GetMqConfigListRequest extends TeaModel {
    @NameInMap("PageIndex")
    public Long pageIndex;

    @NameInMap("PageSize")
    public Long pageSize;

    public static GetMqConfigListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMqConfigListRequest self = new GetMqConfigListRequest();
        return TeaModel.build(map, self);
    }

    public GetMqConfigListRequest setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public GetMqConfigListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
