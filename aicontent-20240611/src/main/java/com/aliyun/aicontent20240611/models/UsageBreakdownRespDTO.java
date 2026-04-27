// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class UsageBreakdownRespDTO extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>hourly</p>
     */
    @NameInMap("granularity")
    public String granularity;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("rows")
    public java.util.List<UsageBreakdownRowDTO> rows;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("total")
    public Long total;

    public static UsageBreakdownRespDTO build(java.util.Map<String, ?> map) throws Exception {
        UsageBreakdownRespDTO self = new UsageBreakdownRespDTO();
        return TeaModel.build(map, self);
    }

    public UsageBreakdownRespDTO setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public UsageBreakdownRespDTO setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public UsageBreakdownRespDTO setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public UsageBreakdownRespDTO setRows(java.util.List<UsageBreakdownRowDTO> rows) {
        this.rows = rows;
        return this;
    }
    public java.util.List<UsageBreakdownRowDTO> getRows() {
        return this.rows;
    }

    public UsageBreakdownRespDTO setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
