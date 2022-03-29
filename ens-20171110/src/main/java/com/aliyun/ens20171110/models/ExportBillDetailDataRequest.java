// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ExportBillDetailDataRequest extends TeaModel {
    // 结束时间UTC格式
    @NameInMap("EndDate")
    public String endDate;

    // 开始时间，UTC格式
    @NameInMap("StartDate")
    public String startDate;

    public static ExportBillDetailDataRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportBillDetailDataRequest self = new ExportBillDetailDataRequest();
        return TeaModel.build(map, self);
    }

    public ExportBillDetailDataRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ExportBillDetailDataRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
