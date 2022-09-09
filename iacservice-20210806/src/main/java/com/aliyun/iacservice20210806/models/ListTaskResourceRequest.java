// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListTaskResourceRequest extends TeaModel {
    @NameInMap("pageNumber")
    public String pageNumber;

    @NameInMap("pageSize")
    public String pageSize;

    public static ListTaskResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTaskResourceRequest self = new ListTaskResourceRequest();
        return TeaModel.build(map, self);
    }

    public ListTaskResourceRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListTaskResourceRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
