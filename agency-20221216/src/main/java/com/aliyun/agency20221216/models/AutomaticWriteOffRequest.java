// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class AutomaticWriteOffRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("AutomaticWriteOffAmount")
    public Long automaticWriteOffAmount;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutomaticWriteOffEnabled")
    public Boolean automaticWriteOffEnabled;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("CustomerUid")
    public Long customerUid;

    /**
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Language")
    public String language;

    public static AutomaticWriteOffRequest build(java.util.Map<String, ?> map) throws Exception {
        AutomaticWriteOffRequest self = new AutomaticWriteOffRequest();
        return TeaModel.build(map, self);
    }

    public AutomaticWriteOffRequest setAutomaticWriteOffAmount(Long automaticWriteOffAmount) {
        this.automaticWriteOffAmount = automaticWriteOffAmount;
        return this;
    }
    public Long getAutomaticWriteOffAmount() {
        return this.automaticWriteOffAmount;
    }

    public AutomaticWriteOffRequest setAutomaticWriteOffEnabled(Boolean automaticWriteOffEnabled) {
        this.automaticWriteOffEnabled = automaticWriteOffEnabled;
        return this;
    }
    public Boolean getAutomaticWriteOffEnabled() {
        return this.automaticWriteOffEnabled;
    }

    public AutomaticWriteOffRequest setCustomerUid(Long customerUid) {
        this.customerUid = customerUid;
        return this;
    }
    public Long getCustomerUid() {
        return this.customerUid;
    }

    public AutomaticWriteOffRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

}
