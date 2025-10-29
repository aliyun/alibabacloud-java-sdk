// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CodeInterpreterSessionListOut extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("items")
    public java.util.List<CodeInterpreterSessionOut> items;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("total")
    public Long total;

    public static CodeInterpreterSessionListOut build(java.util.Map<String, ?> map) throws Exception {
        CodeInterpreterSessionListOut self = new CodeInterpreterSessionListOut();
        return TeaModel.build(map, self);
    }

    public CodeInterpreterSessionListOut setItems(java.util.List<CodeInterpreterSessionOut> items) {
        this.items = items;
        return this;
    }
    public java.util.List<CodeInterpreterSessionOut> getItems() {
        return this.items;
    }

    public CodeInterpreterSessionListOut setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public CodeInterpreterSessionListOut setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public CodeInterpreterSessionListOut setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
