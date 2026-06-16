// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListBrowsersInput extends TeaModel {
    /**
     * <p>Filters the results by browser name.</p>
     * 
     * <strong>example:</strong>
     * <p>my-browser</p>
     */
    @NameInMap("browserName")
    public String browserName;

    /**
     * <p>The page number of the results to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The maximum number of results to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
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
