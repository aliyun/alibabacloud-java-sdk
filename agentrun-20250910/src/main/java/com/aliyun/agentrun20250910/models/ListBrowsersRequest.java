// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListBrowsersRequest extends TeaModel {
    /**
     * <p>根据浏览器实例名称进行模糊匹配过滤</p>
     * 
     * <strong>example:</strong>
     * <p>browser</p>
     */
    @NameInMap("browserName")
    public String browserName;

    /**
     * <p>当前页码，从1开始计数</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>每页返回的记录数量</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>根据浏览器实例的运行状态进行过滤，可选值：CREATING、READY、DELETING等</p>
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
