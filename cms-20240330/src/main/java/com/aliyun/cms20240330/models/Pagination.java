// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class Pagination extends TeaModel {
    /**
     * <p>页码（从 1 开始）</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>每页数量</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    public static Pagination build(java.util.Map<String, ?> map) throws Exception {
        Pagination self = new Pagination();
        return TeaModel.build(map, self);
    }

    public Pagination setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public Pagination setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
