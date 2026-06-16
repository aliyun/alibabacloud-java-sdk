// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListBrowsersRequest extends TeaModel {
    /**
     * <p>Filter by browser name</p>
     * 
     * <strong>example:</strong>
     * <p>browser</p>
     */
    @NameInMap("browserName")
    public String browserName;

    /**
     * <p>Page number</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Filter by status</p>
     * 
     * <strong>example:</strong>
     * <p>CREATING</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("status")
    public String status;

    public static ListBrowsersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBrowsersRequest self = new ListBrowsersRequest();
        return TeaModel.build(map, self);
    }

    public ListBrowsersRequest setBrowserName(String browserName) {
        this.browserName = browserName;
        return this;
    }
    public String getBrowserName() {
        return this.browserName;
    }

    public ListBrowsersRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBrowsersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBrowsersRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
