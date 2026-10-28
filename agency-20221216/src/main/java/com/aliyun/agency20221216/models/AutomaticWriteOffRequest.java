// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class AutomaticWriteOffRequest extends TeaModel {
    /**
     * <p>The automatic write-off amount. This parameter is required if automatic write-off is enabled. Valid values: 100, 500, and 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("AutomaticWriteOffAmount")
    public Long automaticWriteOffAmount;

    /**
     * <p>Specifies whether to enable automatic write-off and set the automatic write-off amount. Valid values:</p>
     * <ul>
     * <li>true: Enables automatic write-off and sets the automatic write-off amount.</li>
     * <li>false: Disables automatic write-off.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutomaticWriteOffEnabled")
    public Boolean automaticWriteOffEnabled;

    /**
     * <p>The UID of the customer.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("CustomerUid")
    public Long customerUid;

    /**
     * <p>The language. If this parameter is not specified, English is used by default. Valid values:</p>
     * <ul>
     * <li>en: English.</li>
     * <li>zh: Chinese.</li>
     * <li>ja: Japanese.</li>
     * </ul>
     * 
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
