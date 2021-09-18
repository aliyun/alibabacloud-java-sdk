// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20180501.models;

import com.aliyun.tea.*;

public class ConversionDataRequest extends TeaModel {
    @NameInMap("ReportTime")
    public Long reportTime;

    @NameInMap("ConversionRate")
    public String conversionRate;

    public static ConversionDataRequest build(java.util.Map<String, ?> map) throws Exception {
        ConversionDataRequest self = new ConversionDataRequest();
        return TeaModel.build(map, self);
    }

    public ConversionDataRequest setReportTime(Long reportTime) {
        this.reportTime = reportTime;
        return this;
    }
    public Long getReportTime() {
        return this.reportTime;
    }

    public ConversionDataRequest setConversionRate(String conversionRate) {
        this.conversionRate = conversionRate;
        return this;
    }
    public String getConversionRate() {
        return this.conversionRate;
    }

}
