// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListChangeRequestsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("current")
    public Long current;

    @NameInMap("data")
    public java.util.List<?> data;

    /**
     * <strong>example:</strong>
     * <p>eb13ac6049d3d78159d60f84af</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("pages")
    public Long pages;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("perPage")
    public Long perPage;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListChangeRequestsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChangeRequestsResponseBody self = new ListChangeRequestsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChangeRequestsResponseBody setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public ListChangeRequestsResponseBody setData(java.util.List<?> data) {
        this.data = data;
        return this;
    }
    public java.util.List<?> getData() {
        return this.data;
    }

    public ListChangeRequestsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListChangeRequestsResponseBody setPages(Long pages) {
        this.pages = pages;
        return this;
    }
    public Long getPages() {
        return this.pages;
    }

    public ListChangeRequestsResponseBody setPerPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }
    public Long getPerPage() {
        return this.perPage;
    }

    public ListChangeRequestsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
