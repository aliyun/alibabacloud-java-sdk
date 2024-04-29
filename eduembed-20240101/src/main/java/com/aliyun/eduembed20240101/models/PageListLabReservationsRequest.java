// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eduembed20240101.models;

import com.aliyun.tea.*;

public class PageListLabReservationsRequest extends TeaModel {
    @NameInMap("Page")
    public Long page;

    @NameInMap("PageSize")
    public Long pageSize;

    public static PageListLabReservationsRequest build(java.util.Map<String, ?> map) throws Exception {
        PageListLabReservationsRequest self = new PageListLabReservationsRequest();
        return TeaModel.build(map, self);
    }

    public PageListLabReservationsRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public PageListLabReservationsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
