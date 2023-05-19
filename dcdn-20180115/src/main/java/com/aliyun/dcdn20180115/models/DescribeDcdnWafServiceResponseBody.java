// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafServiceResponseBody extends TeaModel {
    /**
     * <p>The edition of WAF.</p>
     */
    @NameInMap("Edition")
    public String edition;

    /**
     * <p>The status of WAF. Valid values:</p>
     * <br>
     * <p>*   on</p>
     * <p>*   off</p>
     */
    @NameInMap("Enabled")
    public String enabled;

    /**
     * <p>The time when WAF was enabled.</p>
     */
    @NameInMap("OpeningTime")
    public String openingTime;

    /**
     * <p>The metering method for requests.</p>
     */
    @NameInMap("RequestBillingType")
    public String requestBillingType;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The metering method for rules. You are charged for the number of SeCUs.</p>
     */
    @NameInMap("RuleBillingType")
    public String ruleBillingType;

    /**
     * <p>The status of WAF. Valid values:</p>
     * <br>
     * <p>*   Normal</p>
     * <p>*   WaitForExpire</p>
     * <p>*   Expired</p>
     * <p>*   Released</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeDcdnWafServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafServiceResponseBody self = new DescribeDcdnWafServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafServiceResponseBody setEdition(String edition) {
        this.edition = edition;
        return this;
    }
    public String getEdition() {
        return this.edition;
    }

    public DescribeDcdnWafServiceResponseBody setEnabled(String enabled) {
        this.enabled = enabled;
        return this;
    }
    public String getEnabled() {
        return this.enabled;
    }

    public DescribeDcdnWafServiceResponseBody setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
        return this;
    }
    public String getOpeningTime() {
        return this.openingTime;
    }

    public DescribeDcdnWafServiceResponseBody setRequestBillingType(String requestBillingType) {
        this.requestBillingType = requestBillingType;
        return this;
    }
    public String getRequestBillingType() {
        return this.requestBillingType;
    }

    public DescribeDcdnWafServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnWafServiceResponseBody setRuleBillingType(String ruleBillingType) {
        this.ruleBillingType = ruleBillingType;
        return this;
    }
    public String getRuleBillingType() {
        return this.ruleBillingType;
    }

    public DescribeDcdnWafServiceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
