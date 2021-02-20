// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ExportBillDetailDataRequest extends TeaModel {
    @NameInMap("Version")
    public String version;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("EndDate")
    public String endDate;

    public static ExportBillDetailDataRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportBillDetailDataRequest self = new ExportBillDetailDataRequest();
        return TeaModel.build(map, self);
    }

    public ExportBillDetailDataRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public ExportBillDetailDataRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public ExportBillDetailDataRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

}
