// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxnRequest extends TeaModel {
    /**
     * <p>The ASR model ID. Valid values:</p>
     * <ul>
     * <li><p>7ee372834d2f4cc7ac0d0ab2d0ae1aac: General-Telephone-Mandarin Chinese model.</p>
     * </li>
     * <li><p>9b4afe3d224e4fa3bf963697113e2f77: General-Telephone-Cantonese model.</p>
     * </li>
     * <li><p>3655a6cb94764145a1f9a38a3c3b3b4b: General-Telephone-Regional accent model.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>7ee372834d2f4cc7ac0d0ab2d0ae1aac</p>
     */
    @NameInMap("ASRModelId")
    public String ASRModelId;

    /**
     * <p>The ASR status. Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: Disabled. This is the default value.</li>
     * <li><strong>true</strong>: Enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ASRStatus")
    public Boolean ASRStatus;

    /**
     * <p>Resets the number display logic in the binding relationship. Set the value to <strong>1</strong>, which indicates that the intermediate Number X is displayed for both the caller and the callee.</p>
     * <blockquote>
     * <p>Due to carrier regulatory restrictions, the setting to display the real number during a call does not take effect.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CallDisplayType")
    public Integer callDisplayType;

    /**
     * <p>The single-call restriction status. Valid values:</p>
     * <ul>
     * <li><strong>CONTROL_AX_DISABLE</strong>: Number A cannot call Number X.</li>
     * <li><strong>CONTROL_BX_DISABLE</strong>: Number B cannot call Number X.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CONTROL_AX_DISABLE</p>
     */
    @NameInMap("CallRestrict")
    public String callRestrict;

    /**
     * <p>The ring duration. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("CallTimeout")
    public Integer callTimeout;

    /**
     * <p>The city specified for selecting Number X.</p>
     * <blockquote>
     * <ul>
     * <li>If no available numbers in the specified city exist in the current number pool, or if this parameter is not specified, a number from another city is randomly assigned from the current number pool as Number X.</li>
     * <li>If the <strong>Number X allocation mode</strong> is set to <strong>strict match mode</strong>, the system returns an allocation error when no eligible numbers are available.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Shanghai</p>
     */
    @NameInMap("ExpectCity")
    public String expectCity;

    /**
     * <p>The expiration time of the binding relationship. Unit: seconds.</p>
     * <blockquote>
     * <p>The expiration time must be at least 60 seconds later than the current time.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-09-05 12:00:00</p>
     */
    @NameInMap("Expiration")
    public String expiration;

    @NameInMap("Extend")
    public String extend;

    /**
     * <p>Specifies whether to record all calls generated for this binding relationship. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Records calls.</li>
     * <li><strong>false</strong>: Does not record calls. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsRecordingEnabled")
    public Boolean isRecordingEnabled;

    /**
     * <p>The number type.</p>
     * <blockquote>
     * <p>This parameter applies to former Alibaba Dayu customers. Alibaba Cloud users can ignore this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AXB_170</p>
     */
    @NameInMap("NoType")
    public String noType;

    /**
     * <p>The external business extension field. This parameter is returned in the call record receipt message.</p>
     * 
     * <strong>example:</strong>
     * <p>abcdef</p>
     */
    @NameInMap("OutId")
    public String outId;

    /**
     * <p>The external business ID.</p>
     * 
     * <strong>example:</strong>
     * <p>34553330****</p>
     */
    @NameInMap("OutOrderId")
    public String outOrderId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Number A of the AXN privacy number. Number A can be a mobile phone number or a landline number. If it is a landline number, the area code must be included, and no hyphen is required between the area code and the phone number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>139****0000</p>
     */
    @NameInMap("PhoneNoA")
    public String phoneNoA;

    /**
     * <p>Number B of the AXN privacy number.</p>
     * <p>Number B can be a mobile phone number or a landline number. If it is a landline number, the area code must be included, and no hyphen is required between the area code and the phone number.</p>
     * <blockquote>
     * <ul>
     * <li>When Number A dials Number X, the call is forwarded to Number B by default. If Number B is not set, the call cannot be connected.</li>
     * <li>When Number A dials Number X, the call is forwarded to Number B only when the <strong>callback mode for Number A</strong> is set to <strong>default mode</strong>. Otherwise, the call cannot be connected.</li>
     * <li>To modify the <strong>callback mode for Number A</strong>, go to <a href="https://dyplsnext.console.aliyun.com/number-pool?resType=1">Number Pool Management</a> &gt; filter <strong>AXN privacy number</strong> &gt; <strong>Number Pool Management</strong> &gt; <strong>Callback mode for Number A</strong> &gt; <strong>Adjust Configuration</strong>.</li>
     * <li>To update Number B, call the <a href="https://www.alibabacloud.com/help/en/pnp/developer-reference/api-dyplsapi-2017-05-25-updatesubscription">UpdateSubscription</a> operation.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>138****0000</p>
     */
    @NameInMap("PhoneNoB")
    public String phoneNoB;

    /**
     * <p>Number X of the AXN privacy number.</p>
     * <p>Number X is a privacy number that you have <a href="https://dyplsnext.console.aliyun.com/numberbuy?spm=a2c4g.11186623.0.0.7e6449bbtiHP8m">purchased</a> in the console.</p>
     * <blockquote>
     * <p>If Number X is not specified, a number is randomly selected from the specified number pool based on the ExpectCity parameter as Number X.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>139****1111</p>
     */
    @NameInMap("PhoneNoX")
    public String phoneNoX;

    /**
     * <p>The key of the number pool. You can obtain the <strong>number pool key</strong> on the <a href="https://dyplsnext.console.aliyun.com/number-pool?spm=a2c4g.11186623.0.0.7e6449bbtiHP8m">Number Pool Management</a> page in the Privacy Protection console.</p>
     * 
     * <strong>example:</strong>
     * <p>FC2256****</p>
     */
    @NameInMap("PoolKey")
    public String poolKey;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Sets the corporate color ringback tone (CRBT) played during a dial-up to Number X after the AXN privacy number is attached.</p>
     * <p>Specify the <strong>ringtone field</strong> and <strong>CRBT encoding</strong> for this parameter.</p>
     * <p><strong>Ringtone field</strong> valid values:</p>
     * <ul>
     * <li>AXNRing_AB: The ringtone Settings before Number A dials Number X and the call is connected (with a callback number) in AXN mode.</li>
     * <li>AXNRing_A: The ringtone Settings before Number A dials Number X and the call is connected (without a callback number) in AXN mode.</li>
     * <li>AXNRing_N: The ringtone Settings before Number N dials Number X and the call is connected in AXN mode.</li>
     * <li>AXNRing_A_PICKUP: The ringtone Settings after Number A dials Number X and the call is connected in AXN mode.</li>
     * <li>AXNRing_N_PICKUP: The ringtone Settings after Number N dials Number X and the call is connected in AXN mode.</li>
     * </ul>
     * <p><strong>CRBT encoding</strong>:</p>
     * <p>You can obtain the corporate CRBT encoding on the <a href="https://dyplsnext.console.aliyun.com/number-pool/ringtone?resType=1">Corporate CRBT Management</a> page in the Privacy Protection console.</p>
     * <p><strong>Example</strong>:</p>
     * <p>To set the ringtone played before Number A dials Number X and the call is connected (without a callback number), enter &quot;AXNRing_A&quot;: &quot;1000****1&quot;.</p>
     * <blockquote>
     * <p>The corporate CRBT configured at the attachment level takes precedence. If it is not set or does not take effect, the CRBT configured at the number pool level is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AXNRing_N&quot;:&quot;1000<strong><strong>1&quot;,&quot;AXNRing_A&quot;:&quot;1000</strong></strong>1&quot;}</p>
     */
    @NameInMap("RingConfig")
    public String ringConfig;

    public static BindAxnRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAxnRequest self = new BindAxnRequest();
        return TeaModel.build(map, self);
    }

    public BindAxnRequest setASRModelId(String ASRModelId) {
        this.ASRModelId = ASRModelId;
        return this;
    }
    public String getASRModelId() {
        return this.ASRModelId;
    }

    public BindAxnRequest setASRStatus(Boolean ASRStatus) {
        this.ASRStatus = ASRStatus;
        return this;
    }
    public Boolean getASRStatus() {
        return this.ASRStatus;
    }

    public BindAxnRequest setCallDisplayType(Integer callDisplayType) {
        this.callDisplayType = callDisplayType;
        return this;
    }
    public Integer getCallDisplayType() {
        return this.callDisplayType;
    }

    public BindAxnRequest setCallRestrict(String callRestrict) {
        this.callRestrict = callRestrict;
        return this;
    }
    public String getCallRestrict() {
        return this.callRestrict;
    }

    public BindAxnRequest setCallTimeout(Integer callTimeout) {
        this.callTimeout = callTimeout;
        return this;
    }
    public Integer getCallTimeout() {
        return this.callTimeout;
    }

    public BindAxnRequest setExpectCity(String expectCity) {
        this.expectCity = expectCity;
        return this;
    }
    public String getExpectCity() {
        return this.expectCity;
    }

    public BindAxnRequest setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public BindAxnRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public BindAxnRequest setIsRecordingEnabled(Boolean isRecordingEnabled) {
        this.isRecordingEnabled = isRecordingEnabled;
        return this;
    }
    public Boolean getIsRecordingEnabled() {
        return this.isRecordingEnabled;
    }

    public BindAxnRequest setNoType(String noType) {
        this.noType = noType;
        return this;
    }
    public String getNoType() {
        return this.noType;
    }

    public BindAxnRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public BindAxnRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public BindAxnRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BindAxnRequest setPhoneNoA(String phoneNoA) {
        this.phoneNoA = phoneNoA;
        return this;
    }
    public String getPhoneNoA() {
        return this.phoneNoA;
    }

    public BindAxnRequest setPhoneNoB(String phoneNoB) {
        this.phoneNoB = phoneNoB;
        return this;
    }
    public String getPhoneNoB() {
        return this.phoneNoB;
    }

    public BindAxnRequest setPhoneNoX(String phoneNoX) {
        this.phoneNoX = phoneNoX;
        return this;
    }
    public String getPhoneNoX() {
        return this.phoneNoX;
    }

    public BindAxnRequest setPoolKey(String poolKey) {
        this.poolKey = poolKey;
        return this;
    }
    public String getPoolKey() {
        return this.poolKey;
    }

    public BindAxnRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BindAxnRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public BindAxnRequest setRingConfig(String ringConfig) {
        this.ringConfig = ringConfig;
        return this;
    }
    public String getRingConfig() {
        return this.ringConfig;
    }

}
