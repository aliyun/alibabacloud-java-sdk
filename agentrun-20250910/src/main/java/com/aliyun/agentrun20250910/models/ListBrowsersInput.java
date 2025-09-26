// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListBrowsersInput extends TeaModel {
    /**
     * <p>按浏览器名称过滤</p>
     */
    @NameInMap("browserName")
    public String browserName;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    public static ListBrowsersInput build(java.util.Map<String, ?> map) throws Exception {
        ListBrowsersInput self = new ListBrowsersInput();
        return TeaModel.build(map, self);
    }

    public ListBrowsersInput setBrowserName(String browserName) {
        this.browserName = browserName;
        return this;
    }
    public String getBrowserName() {
        return this.browserName;
    }

    public ListBrowsersInput setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBrowsersInput setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
