// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class ListLiveRecordTemplatesRequest extends TeaModel {
    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListLiveRecordTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLiveRecordTemplatesRequest self = new ListLiveRecordTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListLiveRecordTemplatesRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListLiveRecordTemplatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
