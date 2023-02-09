// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearch20230101.models;

import com.aliyun.tea.*;

public class ListDumpMetaRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListDumpMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDumpMetaRequest self = new ListDumpMetaRequest();
        return TeaModel.build(map, self);
    }

    public ListDumpMetaRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ListDumpMetaRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDumpMetaRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
