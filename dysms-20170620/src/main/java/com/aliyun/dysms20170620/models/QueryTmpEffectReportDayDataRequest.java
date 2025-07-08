// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryTmpEffectReportDayDataRequest extends TeaModel {
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

    @NameInMap("VendorName")
    public String vendorName;

    public static QueryTmpEffectReportDayDataRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTmpEffectReportDayDataRequest self = new QueryTmpEffectReportDayDataRequest();
        return TeaModel.build(map, self);
    }

    public QueryTmpEffectReportDayDataRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public QueryTmpEffectReportDayDataRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryTmpEffectReportDayDataRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryTmpEffectReportDayDataRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public QueryTmpEffectReportDayDataRequest setTmpCode(String tmpCode) {
        this.tmpCode = tmpCode;
        return this;
    }
    public String getTmpCode() {
        return this.tmpCode;
    }

    public QueryTmpEffectReportDayDataRequest setTmpName(String tmpName) {
        this.tmpName = tmpName;
        return this;
    }
    public String getTmpName() {
        return this.tmpName;
    }

    public QueryTmpEffectReportDayDataRequest setVendorName(String vendorName) {
        this.vendorName = vendorName;
        return this;
    }
    public String getVendorName() {
        return this.vendorName;
    }

}
