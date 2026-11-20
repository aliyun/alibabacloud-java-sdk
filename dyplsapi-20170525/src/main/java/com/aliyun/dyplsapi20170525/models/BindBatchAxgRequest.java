// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindBatchAxgRequest extends TeaModel {
    /**
     * <p>The list of AXG bindings.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AxgBindList")
    public java.util.List<BindBatchAxgRequestAxgBindList> axgBindList;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The key of the number pool.</p>
     * <p>You can log on to the Phone Number Protection console and obtain the key on the <a href="https://dyplsnext.console.aliyun.com/number-pool">Number Pool Management</a> page.</p>
     * 
     * <strong>example:</strong>
     * <p>FC2235****</p>
     */
    @NameInMap("PoolKey")
    public String poolKey;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static BindBatchAxgRequest build(java.util.Map<String, ?> map) throws Exception {
        BindBatchAxgRequest self = new BindBatchAxgRequest();
        return TeaModel.build(map, self);
    }

    public BindBatchAxgRequest setAxgBindList(java.util.List<BindBatchAxgRequestAxgBindList> axgBindList) {
        this.axgBindList = axgBindList;
        return this;
    }
    public java.util.List<BindBatchAxgRequestAxgBindList> getAxgBindList() {
        return this.axgBindList;
    }

    public BindBatchAxgRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BindBatchAxgRequest setPoolKey(String poolKey) {
        this.poolKey = poolKey;
        return this;
    }
    public String getPoolKey() {
        return this.poolKey;
    }

    public BindBatchAxgRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BindBatchAxgRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class BindBatchAxgRequestAxgBindList extends TeaModel {
        /**
         * <p>The ASR model ID. Valid values:</p>
         * <ul>
         * <li><p>The ID of the telephony model for Mandarin: 7ee372834d2f4cc7ac0d0ab2d0ae1aac</p>
         * </li>
         * <li><p>The ID of the telephony model for Cantonese: 9b4afe3d224e4fa3bf963697113e2f77</p>
         * </li>
         * <li><p>The ID of the telephony model for local accents: 3655a6cb94764145a1f9a38a3c3b3b4b</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>7ee372834d2f4cc7ac0d0ab2d0ae1aac</p>
         */
        @NameInMap("ASRModelId")
        public String ASRModelId;

        /**
         * <p>The automatic speech recognition (ASR) status. Valid values:</p>
         * <ul>
         * <li><p><strong>false</strong> (default): The ASR feature is disabled.</p>
         * </li>
         * <li><p><strong>true</strong>: The ASR feature is enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ASRStatus")
        public Boolean ASRStatus;

        /**
         * <p>Resets the number display logic for the binding. Set the value to <strong>1</strong>. This indicates that the intermediate number (Number X) is displayed to both the calling and called parties.</p>
         * <blockquote>
         * <p>Due to carrier regulations, the feature of displaying real numbers is not supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CallDisplayType")
        public Integer callDisplayType;

        /**
         * <p>The one-way call restriction. Valid values:</p>
         * <ul>
         * <li><p><strong>CONTROL_AX_DISABLE</strong>: Number A cannot call Number X.</p>
         * </li>
         * <li><p><strong>CONTROL_BX_DISABLE</strong>: Number B cannot call Number X.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CONTROL_AX_DISABLE</p>
         */
        @NameInMap("CallRestrict")
        public String callRestrict;

        /**
         * <p>The city to which Number X belongs.</p>
         * <blockquote>
         * <ul>
         * <li><p>If no numbers are available in the specified city, or if this parameter is not specified, a number from another city in the current number pool is randomly selected and used as Number X.</p>
         * </li>
         * <li><p>If <strong>Number X Assignment Mode</strong> is set to <strong>Strict Match Mode</strong> and no eligible number is found, an allocation error is reported.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>北京</p>
         */
        @NameInMap("ExpectCity")
        public String expectCity;

        /**
         * <p>The expiration time of the binding. The value is accurate to seconds.</p>
         * <blockquote>
         * <ul>
         * <li><p>The expiration time must be more than 1 minute later than the current time.</p>
         * </li>
         * <li><p>This parameter is required.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-07-11 01:05:15</p>
         */
        @NameInMap("Expiration")
        public String expiration;

        /**
         * <p>The group ID (GID) in the AXG binding.</p>
         * <p>You can view the GID in the following ways:</p>
         * <ul>
         * <li><p>Log on to the Phone Number Protection console. On the <a href="https://dyplsnext.console.aliyun.com/number-pool">Number Pool Management</a> page, select <strong>AXG Privacy Number</strong> and click <strong>G Number Group Management</strong> to view the GIDs of all G number groups.</p>
         * </li>
         * <li><p>If you use the <a href="https://help.aliyun.com/document_detail/110250.html">CreateAxgGroup</a> operation to create a G number group, the value of the <strong>GroupId</strong> parameter in the response is the GID.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The G number group must contain at least one phone number.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>200001234****</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>Specifies whether to record all calls made in the binding. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Call recording is enabled.</p>
         * </li>
         * <li><p><strong>false</strong> (default): Call recording is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsRecordingEnabled")
        public Boolean isRecordingEnabled;

        /**
         * <p>The extension field. This parameter is carried in call record messages.</p>
         * 
         * <strong>example:</strong>
         * <p>1***********0fd</p>
         */
        @NameInMap("OutId")
        public String outId;

        /**
         * <p>The external business ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20***************677</p>
         */
        @NameInMap("OutOrderId")
        public String outOrderId;

        /**
         * <p>Number A in the AXG binding. Number A can be a mobile phone number or a landline number. If you use a landline number, add the area code, and do not add a hyphen between the area code and the landline number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>139****0000</p>
         */
        @NameInMap("PhoneNoA")
        public String phoneNoA;

        /**
         * <p>Number B in the AXG binding.</p>
         * <p>Number B can be a mobile phone number or a landline number. If you use a landline number, add the area code, and do not add a hyphen between the area code and the landline number.</p>
         * <blockquote>
         * <ul>
         * <li><p>When Number A calls Number X, the call is transferred to Number B by default. If Number B is not specified, the call fails.</p>
         * </li>
         * <li><p>When Number A calls Number X, if <strong>A Callback Mode</strong> is set to <strong>Default Mode</strong>, the call is transferred to Number B. Otherwise, the call fails.</p>
         * </li>
         * <li><p>To modify <strong>A Callback Mode</strong>, on the <a href="https://dyplsnext.console.aliyun.com/number-pool?resType=1">Number Pool Management</a> page, select <strong>AXG Privacy Number</strong> and choose <strong>Pool Management</strong> &gt; <strong>A Callback Mode</strong> &gt; <strong>Adjust Configuration</strong>.</p>
         * </li>
         * <li><p>To update Number B, call the <a href="https://help.aliyun.com/zh/pnp/developer-reference/api-dyplsapi-2017-05-25-updatesubscription?spm=a2c4g.11186623.0.i16">UpdateSubscription</a> operation.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>138****0000</p>
         */
        @NameInMap("PhoneNoB")
        public String phoneNoB;

        /**
         * <p>Number X in the AXG binding.</p>
         * <p>Number X must be a <a href="https://dyplsnext.console.aliyun.com/numberbuy?spm=a2c4g.11186623.0.0.7e6449bbtiHP8m">purchased privacy number</a>. You can log on to the Phone Number Protection console, go to the <a href="https://dyplsnext.console.aliyun.com/number/list">Number Management</a> page, and then select <strong>AXG Privacy Number</strong> to obtain Number X.</p>
         * <blockquote>
         * <p>If you do not specify Number X, a random number is selected from the number pool based on the <strong>ExpectCity</strong> parameter and used as Number X.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>139****1111</p>
         */
        @NameInMap("PhoneNoX")
        public String phoneNoX;

        /**
         * <p>The corporate ringback tone (CRBT) that is played when Number X in an AXG binding is called.</p>
         * <p>You must specify the <strong>ringtone field</strong> and the <strong>CRBT code</strong>.</p>
         * <p>Valid values for the <strong>ringtone field</strong>:</p>
         * <ul>
         * <li><p><code>AXGRing_AB</code>: the ringtone for calls from Number A to Number X (with a callback number).</p>
         * </li>
         * <li><p><code>AXGRing_A</code>: the ringtone for calls from Number A to Number X (without a callback number).</p>
         * </li>
         * <li><p><code>AXGRing_G</code>: the ringtone for calls from a number in Group G to Number X.</p>
         * </li>
         * </ul>
         * <p><strong>CRBT code</strong>:</p>
         * <p>You can log on to the Phone Number Protection console and obtain the CRBT code on the <a href="https://dyplsnext.console.aliyun.com/number-pool/ringtone?resType=1">Corporate CRBT Management</a> page.</p>
         * <p><strong>Example</strong>:</p>
         * <p>To set the ringtone for calls from Number A to Number X (without a callback number), specify <code>&quot;AXGRing_A&quot;: &quot;1000****1&quot;</code>.</p>
         * <blockquote>
         * <p>The CRBT that is set at the binding level takes precedence over the CRBT that is set at the number pool level.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;AXGRing_AB&quot;:&quot;1000<strong><strong>2&quot;,&quot;AXGRing_A&quot;:&quot;1000</strong></strong>1&quot;}</p>
         */
        @NameInMap("RingConfig")
        public String ringConfig;

        public static BindBatchAxgRequestAxgBindList build(java.util.Map<String, ?> map) throws Exception {
            BindBatchAxgRequestAxgBindList self = new BindBatchAxgRequestAxgBindList();
            return TeaModel.build(map, self);
        }

        public BindBatchAxgRequestAxgBindList setASRModelId(String ASRModelId) {
            this.ASRModelId = ASRModelId;
            return this;
        }
        public String getASRModelId() {
            return this.ASRModelId;
        }

        public BindBatchAxgRequestAxgBindList setASRStatus(Boolean ASRStatus) {
            this.ASRStatus = ASRStatus;
            return this;
        }
        public Boolean getASRStatus() {
            return this.ASRStatus;
        }

        public BindBatchAxgRequestAxgBindList setCallDisplayType(Integer callDisplayType) {
            this.callDisplayType = callDisplayType;
            return this;
        }
        public Integer getCallDisplayType() {
            return this.callDisplayType;
        }

        public BindBatchAxgRequestAxgBindList setCallRestrict(String callRestrict) {
            this.callRestrict = callRestrict;
            return this;
        }
        public String getCallRestrict() {
            return this.callRestrict;
        }

        public BindBatchAxgRequestAxgBindList setExpectCity(String expectCity) {
            this.expectCity = expectCity;
            return this;
        }
        public String getExpectCity() {
            return this.expectCity;
        }

        public BindBatchAxgRequestAxgBindList setExpiration(String expiration) {
            this.expiration = expiration;
            return this;
        }
        public String getExpiration() {
            return this.expiration;
        }

        public BindBatchAxgRequestAxgBindList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public BindBatchAxgRequestAxgBindList setIsRecordingEnabled(Boolean isRecordingEnabled) {
            this.isRecordingEnabled = isRecordingEnabled;
            return this;
        }
        public Boolean getIsRecordingEnabled() {
            return this.isRecordingEnabled;
        }

        public BindBatchAxgRequestAxgBindList setOutId(String outId) {
            this.outId = outId;
            return this;
        }
        public String getOutId() {
            return this.outId;
        }

        public BindBatchAxgRequestAxgBindList setOutOrderId(String outOrderId) {
            this.outOrderId = outOrderId;
            return this;
        }
        public String getOutOrderId() {
            return this.outOrderId;
        }

        public BindBatchAxgRequestAxgBindList setPhoneNoA(String phoneNoA) {
            this.phoneNoA = phoneNoA;
            return this;
        }
        public String getPhoneNoA() {
            return this.phoneNoA;
        }

        public BindBatchAxgRequestAxgBindList setPhoneNoB(String phoneNoB) {
            this.phoneNoB = phoneNoB;
            return this;
        }
        public String getPhoneNoB() {
            return this.phoneNoB;
        }

        public BindBatchAxgRequestAxgBindList setPhoneNoX(String phoneNoX) {
            this.phoneNoX = phoneNoX;
            return this;
        }
        public String getPhoneNoX() {
            return this.phoneNoX;
        }

        public BindBatchAxgRequestAxgBindList setRingConfig(String ringConfig) {
            this.ringConfig = ringConfig;
            return this;
        }
        public String getRingConfig() {
            return this.ringConfig;
        }

    }

}
