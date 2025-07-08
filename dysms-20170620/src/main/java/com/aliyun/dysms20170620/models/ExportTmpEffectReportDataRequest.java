// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class ExportTmpEffectReportDataRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndDate")
    public String endDate;

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

    public static ExportTmpEffectReportDataRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportTmpEffectReportDataRequest self = new ExportTmpEffectReportDataRequest();
        return TeaModel.build(map, self);
    }

    public ExportTmpEffectReportDataRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ExportTmpEffectReportDataRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public ExportTmpEffectReportDataRequest setTmpCode(String tmpCode) {
        this.tmpCode = tmpCode;
        return this;
    }
    public String getTmpCode() {
        return this.tmpCode;
    }

    public ExportTmpEffectReportDataRequest setTmpName(String tmpName) {
        this.tmpName = tmpName;
        return this;
    }
    public String getTmpName() {
        return this.tmpName;
    }

    public ExportTmpEffectReportDataRequest setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
        return this;
    }
    public String getVendorCode() {
        return this.vendorCode;
    }

    public ExportTmpEffectReportDataRequest setVendorName(String vendorName) {
        this.vendorName = vendorName;
        return this;
    }
    public String getVendorName() {
        return this.vendorName;
    }

}
