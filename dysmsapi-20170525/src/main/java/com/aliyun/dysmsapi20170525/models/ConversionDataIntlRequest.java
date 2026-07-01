// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class ConversionDataIntlRequest extends TeaModel {
    /**
     * <p>The conversion rate monitoring value.</p>
     * <blockquote>
     * <p>This parameter is of the double type. Valid values: [0,1].</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0.53</p>
     */
    @NameInMap("ConversionRate")
    public String conversionRate;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The point in time when the conversion rate is observed. The value must be a Unix timestamp in milliseconds, represented as a long integer.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the current timestamp is used by default.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1349055900000</p>
     */
    @NameInMap("ReportTime")
    public Long reportTime;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ConversionDataIntlRequest build(java.util.Map<String, ?> map) throws Exception {
        ConversionDataIntlRequest self = new ConversionDataIntlRequest();
        return TeaModel.build(map, self);
    }

    public ConversionDataIntlRequest setConversionRate(String conversionRate) {
        this.conversionRate = conversionRate;
        return this;
    }
    public String getConversionRate() {
        return this.conversionRate;
    }

    public ConversionDataIntlRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ConversionDataIntlRequest setReportTime(Long reportTime) {
        this.reportTime = reportTime;
        return this;
    }
    public Long getReportTime() {
        return this.reportTime;
    }

    public ConversionDataIntlRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ConversionDataIntlRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
