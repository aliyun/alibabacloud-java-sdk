// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListProjectRequest extends TeaModel {
    @NameInMap("pageNumber")
    public String pageNumber;

    @NameInMap("pageSize")
    public String pageSize;

    public static ListProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectRequest self = new ListProjectRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListProjectRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

}
