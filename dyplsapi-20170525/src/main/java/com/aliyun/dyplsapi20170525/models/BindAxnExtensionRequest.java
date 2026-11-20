// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxnExtensionRequest extends TeaModel {
    /**
     * <p>The ASR model ID. Valid values:</p>
     * <ul>
     * <li><p>General-Telephone-Mandarin Chinese model ID: 7ee372834d2f4cc7ac0d0ab2d0ae1aac</p>
     * </li>
     * <li><p>General-Telephone-Cantonese model ID: 9b4afe3d224e4fa3bf963697113e2f77</p>
     * </li>
     * <li><p>General-Telephone-Regional accent model ID: 3655a6cb94764145a1f9a38a3c3b3b4b</p>
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
     * <p>Resets the number display logic in the binding relationship. Set the value to <strong>1</strong>, which indicates that the intermediate number X is displayed for both the caller and the callee.</p>
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
     * <p>The call restriction status. Valid values:</p>
     * <ul>
     * <li><strong>CONTROL_AX_DISABLE</strong>: Number A cannot call number X.</li>
     * <li><strong>CONTROL_BX_DISABLE</strong>: Number B cannot call number X.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CONTROL_AX_DISABLE</p>
     */
    @NameInMap("CallRestrict")
    public String callRestrict;

    /**
     * <p>The city where you want to select number X.</p>
     * <blockquote>
     * <ul>
     * <li>If no available numbers exist in the specified city in the current number pool, or if this parameter is not specified, the system randomly assigns a number from another city in the current number pool as number X.</li>
     * <li>If the <strong>number X allocation mode</strong> is set to <strong>strict match mode</strong>, the system returns an allocation error when no eligible numbers are available.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Beijing</p>
     */
    @NameInMap("ExpectCity")
    public String expectCity;

    /**
     * <p>The expiration time of the binding relationship. The time is accurate to seconds.</p>
     * <blockquote>
     * <p>The expiration time must be at least 1 minute later than the current time.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-09-05 12:00:00</p>
     */
    @NameInMap("Expiration")
    public String expiration;

    @NameInMap("Extend")
    public String extend;

    /**
     * <p>The extension number of number X. The extension number must be 1 to 3 digits in length.</p>
     * <blockquote>
     * <p>If you specify an extension number, you must also specify number X. This means that both the Extension and PhoneNoX parameters must be specified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>130</p>
     */
    @NameInMap("Extension")
    public String extension;

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
     * <p>abcdef</p>
     */
    @NameInMap("OutOrderId")
    public String outOrderId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number A of the AXN extension number.
     * Number A can be a mobile phone number or a landline number. For a landline number, you must add the area code. Do not add a hyphen between the area code and the phone number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>139****0000</p>
     */
    @NameInMap("PhoneNoA")
    public String phoneNoA;

    /**
     * <p>The number B of the AXN extension number.</p>
     * <p>Number B can be a mobile phone number or a landline number. For a landline number, you must add the area code. Do not add a hyphen between the area code and the phone number.</p>
     * <blockquote>
     * <ul>
     * <li>When number A calls number X, the call is forwarded to number B by default. If number B is not specified, the call cannot be connected.</li>
     * <li>When number A calls number X, the call is forwarded to number B only when the <strong>callback mode for number A</strong> is set to <strong>default mode</strong>. If it is not set to <strong>default mode</strong>, the call cannot be connected.</li>
     * <li>To modify the <strong>callback mode for number A</strong>, go to <a href="https://dyplsnext.console.aliyun.com/number-pool?resType=1">Number Pool Management</a> &gt; filter by <strong>AXN Extension Number</strong> &gt; <strong>Number Pool Management</strong> &gt; <strong>Callback Mode for Number A</strong> &gt; <strong>Adjust Configuration</strong>.</li>
     * <li>To update number B, call the <a href="https://www.alibabacloud.com/help/en/pnp/developer-reference/api-dyplsapi-2017-05-25-updatesubscription">UpdateSubscription</a> operation.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>138****0000</p>
     */
    @NameInMap("PhoneNoB")
    public String phoneNoB;

    /**
     * <p>The number X of the AXN extension number.</p>
     * <p>Number X is a privacy number that you have <a href="https://dyplsnext.console.aliyun.com/numberbuy?spm=a2c4g.11186623.0.0.7e6449bbtiHP8m">purchased</a> in the console.</p>
     * <blockquote>
     * <p>If you do not specify number X, the system randomly assigns a number from the specified number pool as number X based on the ExpectCity parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>139****1111</p>
     */
    @NameInMap("PhoneNoX")
    public String phoneNoX;

    /**
     * <p>The key of the number pool.</p>
     * <p>You can obtain the <strong>number pool key</strong> on the <a href="https://dyplsnext.console.aliyun.com/number-pool?spm=a2c4g.11186623.0.0.7e6449bbtiHP8m">Number Pool Management</a> page in the Privacy Protection console.</p>
     * 
     * <strong>example:</strong>
     * <p>FC10000011111****</p>
     */
    @NameInMap("PoolKey")
    public String poolKey;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Set the corporate ringback tone for dial-up to number X after the AXN extension number is bound.</p>
     * <p>Specify the <strong>ringtone field</strong> and <strong>ringback tone encoding</strong> for this parameter.</p>
     * <p>Valid values for the <strong>ringtone field</strong>:</p>
     * <ul>
     * <li>AXNRing_AB: The ringtone settings before number A calls number X and the call is connected (with a callback number) in the AXN extension number scenario.</li>
     * <li>AXNRing_A: The ringtone settings before number A calls number X and the call is connected (without a callback number) in the AXN extension number scenario.</li>
     * <li>AXNRing_N: The ringtone settings before the number on side N calls number X and the call is connected in the AXN extension number scenario.</li>
     * <li>AXNRing_A_PICKUP: The ringtone settings after number A calls number X and the call is connected in the AXN extension number scenario.</li>
     * <li>AXNRing_N_PICKUP: The ringtone settings after the number on side N calls number X and the call is connected in the AXN extension number scenario.</li>
     * </ul>
     * <p><strong>Ringback tone encoding</strong>:</p>
     * <p>You can obtain the corporate ringback tone encoding on the <a href="https://dyplsnext.console.aliyun.com/number-pool/ringtone?resType=1">Corporate Ringback Tone Management</a> page in the Privacy Protection console.</p>
     * <p><strong>Example</strong>:</p>
     * <p>To set the ringtone before number A calls number X and the call is connected (without a callback number), enter &quot;AXNRing_A&quot;: &quot;1000****1&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;AXNRing_N&quot;:&quot;1000<strong><strong>1&quot;,&quot;AXNRing_A&quot;:&quot;1000</strong></strong>1&quot;}</p>
     */
    @NameInMap("RingConfig")
    public String ringConfig;

    public static BindAxnExtensionRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAxnExtensionRequest self = new BindAxnExtensionRequest();
        return TeaModel.build(map, self);
    }

    public BindAxnExtensionRequest setASRModelId(String ASRModelId) {
        this.ASRModelId = ASRModelId;
        return this;
    }
    public String getASRModelId() {
        return this.ASRModelId;
    }

    public BindAxnExtensionRequest setASRStatus(Boolean ASRStatus) {
        this.ASRStatus = ASRStatus;
        return this;
    }
    public Boolean getASRStatus() {
        return this.ASRStatus;
    }

    public BindAxnExtensionRequest setCallDisplayType(Integer callDisplayType) {
        this.callDisplayType = callDisplayType;
        return this;
    }
    public Integer getCallDisplayType() {
        return this.callDisplayType;
    }

    public BindAxnExtensionRequest setCallRestrict(String callRestrict) {
        this.callRestrict = callRestrict;
        return this;
    }
    public String getCallRestrict() {
        return this.callRestrict;
    }

    public BindAxnExtensionRequest setExpectCity(String expectCity) {
        this.expectCity = expectCity;
        return this;
    }
    public String getExpectCity() {
        return this.expectCity;
    }

    public BindAxnExtensionRequest setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public BindAxnExtensionRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public BindAxnExtensionRequest setExtension(String extension) {
        this.extension = extension;
        return this;
    }
    public String getExtension() {
        return this.extension;
    }

    public BindAxnExtensionRequest setIsRecordingEnabled(Boolean isRecordingEnabled) {
        this.isRecordingEnabled = isRecordingEnabled;
        return this;
    }
    public Boolean getIsRecordingEnabled() {
        return this.isRecordingEnabled;
    }

    public BindAxnExtensionRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public BindAxnExtensionRequest setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
        return this;
    }
    public String getOutOrderId() {
        return this.outOrderId;
    }

    public BindAxnExtensionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BindAxnExtensionRequest setPhoneNoA(String phoneNoA) {
        this.phoneNoA = phoneNoA;
        return this;
    }
    public String getPhoneNoA() {
        return this.phoneNoA;
    }

    public BindAxnExtensionRequest setPhoneNoB(String phoneNoB) {
        this.phoneNoB = phoneNoB;
        return this;
    }
    public String getPhoneNoB() {
        return this.phoneNoB;
    }

    public BindAxnExtensionRequest setPhoneNoX(String phoneNoX) {
        this.phoneNoX = phoneNoX;
        return this;
    }
    public String getPhoneNoX() {
        return this.phoneNoX;
    }

    public BindAxnExtensionRequest setPoolKey(String poolKey) {
        this.poolKey = poolKey;
        return this;
    }
    public String getPoolKey() {
        return this.poolKey;
    }

    public BindAxnExtensionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BindAxnExtensionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public BindAxnExtensionRequest setRingConfig(String ringConfig) {
        this.ringConfig = ringConfig;
        return this;
    }
    public String getRingConfig() {
        return this.ringConfig;
    }

}
