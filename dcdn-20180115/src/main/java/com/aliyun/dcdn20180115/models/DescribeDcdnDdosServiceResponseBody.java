// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDdosServiceResponseBody extends TeaModel {
    /**
     * <p>The time when the renewed service takes effect. The time is displayed in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2018-03-31T16:00:00Z</p>
     */
    @NameInMap("ChangingAffectTime")
    public String changingAffectTime;

    /**
     * <p>The metering method after the configuration changes Valid values:</p>
     * <ul>
     * <li><strong>PayByBandwidth</strong></li>
     * <li><strong>PayByTraffic</strong></li>
     * <li><strong>PayByBandwidth95</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PayByBandwidth</p>
     */
    @NameInMap("ChangingChargeType")
    public String changingChargeType;

    /**
     * <p>The number of protected domain names.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("ChangingDomianNum")
    public Integer changingDomianNum;

    /**
     * <p>The protection edition for which the configuration changes take effect. Valid values:</p>
     * <ul>
     * <li><strong>poc</strong>: POC Edition</li>
     * <li><strong>basic</strong>: Basic Edition</li>
     * <li><strong>insurance</strong>: Insurance Edition</li>
     * <li><strong>unlimited</strong>: Unlimited Edition</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>basic</p>
     */
    @NameInMap("ChangingEdition")
    public String changingEdition;

    /**
     * <p>The number of mitigation sessions with configuration changes.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ChangingProtectNum")
    public Integer changingProtectNum;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li><strong>PayByBandwidth</strong></li>
     * <li><strong>PayByTraffic</strong></li>
     * <li><strong>PayByBandwidth95</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PayByTraffic</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The number of protected domain names.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("DomianNum")
    public Integer domianNum;

    /**
     * <p>The protection edition. Valid values:</p>
     * <ul>
     * <li><strong>poc</strong>: POC Edition</li>
     * <li><strong>basic</strong>: Basic Edition</li>
     * <li><strong>insurance</strong>: Insurance Edition</li>
     * <li><strong>unlimited</strong>: Unlimited Edition</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>poc</p>
     */
    @NameInMap("Edition")
    public String edition;

    /**
     * <p>The activation status of the service. Valid values:</p>
     * <ul>
     * <li><strong>on</strong></li>
     * <li><strong>off</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Enabled")
    public String enabled;

    /**
     * <p>The service expiration time.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-09-26T16:00:00Z</p>
     */
    @NameInMap("EndingTime")
    public String endingTime;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx-12345</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The time when the service was enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-09-26T16:00:00Z</p>
     */
    @NameInMap("OpeningTime")
    public String openingTime;

    /**
     * <p>The number of mitigation sessions.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ProtectNum")
    public Integer protectNum;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C370DAF1-C838-4288-A1A0-9A87633D248E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the service. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong></li>
     * <li><strong>WaitForExpire</strong></li>
     * <li><strong>expired</strong></li>
     * <li><strong>Released</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
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
