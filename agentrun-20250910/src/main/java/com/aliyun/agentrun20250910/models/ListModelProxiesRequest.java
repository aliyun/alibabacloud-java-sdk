// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListModelProxiesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>proxyMode</p>
     * 
     * <strong>example:</strong>
     * <p>proxyMode</p>
     */
    @NameInMap("proxyMode")
    public String proxyMode;

    /**
     * <strong>example:</strong>
     * <p>CREATING</p>
     */
    @NameInMap("status")
    public String status;

    public static ListModelProxiesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListModelProxiesRequest self = new ListModelProxiesRequest();
        return TeaModel.build(map, self);
    }

    public ListModelProxiesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListModelProxiesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListModelProxiesRequest setProxyMode(String proxyMode) {
        this.proxyMode = proxyMode;
        return this;
    }
    public String getProxyMode() {
        return this.proxyMode;
    }

    public ListModelProxiesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
