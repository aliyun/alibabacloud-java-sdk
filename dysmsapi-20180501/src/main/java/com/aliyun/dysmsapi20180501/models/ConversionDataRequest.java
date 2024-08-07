// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20180501.models;

import com.aliyun.tea.*;

public class ConversionDataRequest extends TeaModel {
    /**
     * <p>Conversion rate monitoring return value.</p>
     * <blockquote>
     * <p> The value of this parameter is of type double, and the value is between [0,1].</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0.53</p>
     */
    @NameInMap("ConversionRate")
    public String conversionRate;

    /**
     * <p>Timestamp of the conversion rate observation should be a Unix timestamp, a millisecond-level long integer.</p>
     * <blockquote>
     * <p> If this field is not specified: the current timestamp is the default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1349055900000</p>
     */
    @NameInMap("ReportTime")
    public Long reportTime;

    public static ConversionDataRequest build(java.util.Map<String, ?> map) throws Exception {
        ConversionDataRequest self = new ConversionDataRequest();
        return TeaModel.build(map, self);
    }

    public ConversionDataRequest setConversionRate(String conversionRate) {
        this.conversionRate = conversionRate;
        return this;
    }
    public String getConversionRate() {
        return this.conversionRate;
    }

    public ConversionDataRequest setReportTime(Long reportTime) {
        this.reportTime = reportTime;
        return this;
    }
    public Long getReportTime() {
        return this.reportTime;
    }

}
