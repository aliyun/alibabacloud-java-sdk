// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListKvsRequest extends TeaModel {
    /**
     * <p>The name specified when you called <a href="https://help.aliyun.com/document_detail/2850317.html">CreatevNamespace</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The page number. The product of PageNumber and PageSize cannot exceed 50000.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size. Default value: <strong>50</strong>. Maximum value: <strong>100</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The prefix used to filter keys.</p>
     * 
     * <strong>example:</strong>
     * <p>prefix-</p>
     */
    @NameInMap("Prefix")
    public String prefix;

    public static ListKvsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListKvsRequest self = new ListKvsRequest();
        return TeaModel.build(map, self);
    }

    public ListKvsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public ListKvsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListKvsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListKvsRequest setPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    public String getPrefix() {
        return this.prefix;
    }

}
