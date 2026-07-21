// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class BillingCostBreakdownRespDTO extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("columns")
    public java.util.List<MetricDefRespDTO> columns;

    /**
     * <p>Aggregation granularity: hourly or daily</p>
     * 
     * <strong>example:</strong>
     * <p>hourly</p>
     */
    @NameInMap("granularity")
    public String granularity;

    /**
     * <p>Current page number</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>Number of entries per page</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>List of billing details data</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("rows")
    public java.util.List<BillingCostBreakdownRowDTO> rows;

    /**
     * <p>Total number of entries</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("total")
    public Long total;

    public static BillingCostBreakdownRespDTO build(java.util.Map<String, ?> map) throws Exception {
        BillingCostBreakdownRespDTO self = new BillingCostBreakdownRespDTO();
        return TeaModel.build(map, self);
    }

    public BillingCostBreakdownRespDTO setColumns(java.util.List<MetricDefRespDTO> columns) {
        this.columns = columns;
        return this;
    }
    public java.util.List<MetricDefRespDTO> getColumns() {
        return this.columns;
    }

    public BillingCostBreakdownRespDTO setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public BillingCostBreakdownRespDTO setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public BillingCostBreakdownRespDTO setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public BillingCostBreakdownRespDTO setRows(java.util.List<BillingCostBreakdownRowDTO> rows) {
        this.rows = rows;
        return this;
    }
    public java.util.List<BillingCostBreakdownRowDTO> getRows() {
        return this.rows;
    }

    public BillingCostBreakdownRespDTO setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
