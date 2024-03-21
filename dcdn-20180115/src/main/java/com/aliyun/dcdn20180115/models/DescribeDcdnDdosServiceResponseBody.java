// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDdosServiceResponseBody extends TeaModel {
    /**
     * <p>The time when the renewed service takes effect. The time is displayed in UTC.</p>
     */
    @NameInMap("ChangingAffectTime")
    public String changingAffectTime;

    /**
     * <p>The metering method after the configuration changes Valid values:</p>
     * <br>
     * <p>*   **PayByBandwidth**</p>
     * <p>*   **PayByTraffic**</p>
     * <p>*   **PayByBandwidth95**</p>
     */
    @NameInMap("ChangingChargeType")
    public String changingChargeType;

    /**
     * <p>The number of protected domain names.</p>
     */
    @NameInMap("ChangingDomianNum")
    public Integer changingDomianNum;

    /**
     * <p>The protection edition for which the configuration changes take effect. Valid values:</p>
     * <br>
     * <p>*   **poc**: POC Edition</p>
     * <p>*   **basic**: Basic Edition</p>
     * <p>*   **insurance**: Insurance Edition</p>
     * <p>*   **unlimited**: Unlimited Edition</p>
     */
    @NameInMap("ChangingEdition")
    public String changingEdition;

    /**
     * <p>The number of mitigation sessions with configuration changes.</p>
     */
    @NameInMap("ChangingProtectNum")
    public Integer changingProtectNum;

    /**
     * <p>The billing method. Valid values:</p>
     * <br>
     * <p>*   **PayByBandwidth**</p>
     * <p>*   **PayByTraffic**</p>
     * <p>*   **PayByBandwidth95**</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The number of protected domain names.</p>
     */
    @NameInMap("DomianNum")
    public Integer domianNum;

    /**
     * <p>The protection edition. Valid values:</p>
     * <br>
     * <p>*   **poc**: POC Edition</p>
     * <p>*   **basic**: Basic Edition</p>
     * <p>*   **insurance**: Insurance Edition</p>
     * <p>*   **unlimited**: Unlimited Edition</p>
     */
    @NameInMap("Edition")
    public String edition;

    /**
     * <p>The activation status of the service. Valid values:</p>
     * <br>
     * <p>*   **on**</p>
     * <p>*   **off**</p>
     */
    @NameInMap("Enabled")
    public String enabled;

    /**
     * <p>The service expiration time.</p>
     */
    @NameInMap("EndingTime")
    public String endingTime;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The time when the service was enabled.</p>
     */
    @NameInMap("OpeningTime")
    public String openingTime;

    /**
     * <p>The number of mitigation sessions.</p>
     */
    @NameInMap("ProtectNum")
    public Integer protectNum;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the service. Valid values:</p>
     * <br>
     * <p>*   **Normal**</p>
     * <p>*   **WaitForExpire**</p>
     * <p>*   **expired**</p>
     * <p>*   **Released**</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeDcdnDdosServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDdosServiceResponseBody self = new DescribeDcdnDdosServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDdosServiceResponseBody setChangingAffectTime(String changingAffectTime) {
        this.changingAffectTime = changingAffectTime;
        return this;
    }
    public String getChangingAffectTime() {
        return this.changingAffectTime;
    }

    public DescribeDcdnDdosServiceResponseBody setChangingChargeType(String changingChargeType) {
        this.changingChargeType = changingChargeType;
        return this;
    }
    public String getChangingChargeType() {
        return this.changingChargeType;
    }

    public DescribeDcdnDdosServiceResponseBody setChangingDomianNum(Integer changingDomianNum) {
        this.changingDomianNum = changingDomianNum;
        return this;
    }
    public Integer getChangingDomianNum() {
        return this.changingDomianNum;
    }

    public DescribeDcdnDdosServiceResponseBody setChangingEdition(String changingEdition) {
        this.changingEdition = changingEdition;
        return this;
    }
    public String getChangingEdition() {
        return this.changingEdition;
    }

    public DescribeDcdnDdosServiceResponseBody setChangingProtectNum(Integer changingProtectNum) {
        this.changingProtectNum = changingProtectNum;
        return this;
    }
    public Integer getChangingProtectNum() {
        return this.changingProtectNum;
    }

    public DescribeDcdnDdosServiceResponseBody setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public DescribeDcdnDdosServiceResponseBody setDomianNum(Integer domianNum) {
        this.domianNum = domianNum;
        return this;
    }
    public Integer getDomianNum() {
        return this.domianNum;
    }

    public DescribeDcdnDdosServiceResponseBody setEdition(String edition) {
        this.edition = edition;
        return this;
    }
    public String getEdition() {
        return this.edition;
    }

    public DescribeDcdnDdosServiceResponseBody setEnabled(String enabled) {
        this.enabled = enabled;
        return this;
    }
    public String getEnabled() {
        return this.enabled;
    }

    public DescribeDcdnDdosServiceResponseBody setEndingTime(String endingTime) {
        this.endingTime = endingTime;
        return this;
    }
    public String getEndingTime() {
        return this.endingTime;
    }

    public DescribeDcdnDdosServiceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDcdnDdosServiceResponseBody setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
        return this;
    }
    public String getOpeningTime() {
        return this.openingTime;
    }

    public DescribeDcdnDdosServiceResponseBody setProtectNum(Integer protectNum) {
        this.protectNum = protectNum;
        return this;
    }
    public Integer getProtectNum() {
        return this.protectNum;
    }

    public DescribeDcdnDdosServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnDdosServiceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
