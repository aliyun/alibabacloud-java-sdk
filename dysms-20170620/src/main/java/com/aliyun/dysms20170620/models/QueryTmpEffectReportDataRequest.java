// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryTmpEffectReportDataRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("TmpCode")
    public String tmpCode;

    @NameInMap("TmpName")
    public String tmpName;

    @NameInMap("VendorCode")
    public String vendorCode;

    @NameInMap("VendorName")
    public String vendorName;

    public static QueryTmpEffectReportDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTmpEffectReportDataRequest self = new QueryTmpEffectReportDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryTmpEffectReportDataRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryTmpEffectReportDataRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryTmpEffectReportDataRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryTmpEffectReportDataRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public QueryTmpEffectReportDataRequest setTmpCode(String tmpCode) {
        this.tmpCode = tmpCode;
        return this;
    }
    public String getTmpCode() {
        return this.tmpCode;
    }

    public QueryTmpEffectReportDataRequest setTmpName(String tmpName) {
        this.tmpName = tmpName;
        return this;
    }
    public String getTmpName() {
        return this.tmpName;
    }

    public QueryTmpEffectReportDataRequest setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
        return this;
    }
    public String getVendorCode() {
        return this.vendorCode;
    }

    public QueryTmpEffectReportDataRequest setVendorName(String vendorName) {
        this.vendorName = vendorName;
        return this;
    }
    public String getVendorName() {
        return this.vendorName;
    }

}
