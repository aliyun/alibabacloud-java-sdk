// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class BillingDetailListRespDTO extends TeaModel {
    /**
     * <p>The column definitions, which are dynamically generated based on the model types that appear in the query results.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("columns")
    public java.util.List<MetricDefRespDTO> columns;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The list of bill details data.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("rows")
    public java.util.List<BillingDetailRowDTO> rows;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("total")
    public Long total;

    public static BillingDetailListRespDTO build(java.util.Map<String, ?> map) throws Exception {
        BillingDetailListRespDTO self = new BillingDetailListRespDTO();
        return TeaModel.build(map, self);
    }

    public BillingDetailListRespDTO setColumns(java.util.List<MetricDefRespDTO> columns) {
        this.columns = columns;
        return this;
    }
    public java.util.List<MetricDefRespDTO> getColumns() {
        return this.columns;
    }

    public BillingDetailListRespDTO setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public BillingDetailListRespDTO setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public BillingDetailListRespDTO setRows(java.util.List<BillingDetailRowDTO> rows) {
        this.rows = rows;
        return this;
    }
    public java.util.List<BillingDetailRowDTO> getRows() {
        return this.rows;
    }

    public BillingDetailListRespDTO setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
