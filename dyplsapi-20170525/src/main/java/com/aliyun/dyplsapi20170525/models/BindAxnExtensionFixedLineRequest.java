// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxnExtensionFixedLineRequest extends TeaModel {
    /**
     * <p>Caller-side ringtone code. This parameter is required for AXB scenarios. Must contain codes for 3 scenarios. Enter the codes in the order of &quot;B-&gt;X, A-&gt;X, other numbers-&gt;X&quot;, separated by commas.</p>
     * <blockquote>
     * <p>&quot;1,2,3&quot; indicates that the ringtone code for B-&gt;X is 1, for A-&gt;X is 2, and for other numbers-&gt;X is 3.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("Anucode")
    public String anucode;

    /**
     * <p>Called-side ringtone code after connection. Must contain codes for 2 scenarios. Enter the codes in the order of &quot;A as called party, B as called party&quot;, separated by commas.</p>
     * <blockquote>
     * <p>&quot;1,2&quot; indicates that the ringtone code when A is the called party is 1, and the ringtone code when B is the called party is 2.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1,2</p>
     */
    @NameInMap("Anucodecalled")
    public String anucodecalled;

    /**
     * <p>Number pool ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FC10000016848****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Area code. Supports specifying the home location of the X number (specified city -&gt; provincial capital -&gt; nationwide routing). If no home location is specified, a number is randomly assigned nationwide.</p>
     * 
     * <strong>example:</strong>
     * <p>0571</p>
     */
    @NameInMap("Areacode")
    public String areacode;

    /**
     * <p>Binding type. Valid values:</p>
     * <ul>
     * <li><p>mode101: Customer specifies the X number.</p>
     * </li>
     * <li><p>mode102: Platform assigns the X number.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mode101</p>
     */
    @NameInMap("BindType")
    public String bindType;

    /**
     * <p>Expiration time. Unit: seconds. Valid values:</p>
     * <ul>
     * <li><p>0: Never expires.</p>
     * </li>
     * <li><p>Other values: When other values are specified, such as 60, the binding is valid for 60 seconds after the X number is successfully assigned. After 60 seconds, the binding is automatically released.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Expiration")
    public String expiration;

    /**
     * <p>Extension parameters.</p>
     */
    @NameInMap("Extraaxx")
    public BindAxnExtensionFixedLineRequestExtraaxx extraaxx;

    /**
     * <p>Unique identifier of the message request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123*******</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>External business extension field. This parameter is returned in call record receipt messages. Must not exceed 100 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>19394</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Binding time. Format: yyyyMMddHHmmss. Uses Beijing time, 24-hour clock.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20161114143116</p>
     */
    @NameInMap("Subts")
    public String subts;

    /**
     * <p>Caller-side ringtone code after connection. Must contain codes for 2 scenarios. Enter the codes in the order of &quot;A as called party, B as called party&quot;, separated by commas.</p>
     * <blockquote>
     * <p>&quot;1,2&quot; indicates that the caller-side ringtone code when A is the called party is 1, and the caller-side ringtone code when B is the called party is 2.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1,2</p>
     */
    @NameInMap("TAnucodeConnect")
    public String TAnucodeConnect;

    /**
     * <p>The A number for the fixed-line AXN extension number.</p>
     * <blockquote>
     * <p>The A number can be set to a mobile number or a fixed-line number. Fixed-line numbers must include the area code, and no hyphen is needed between the area code and the number.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Mobile: 182<strong><strong>2371
     * Fixed line: 0571</strong></strong>**36</p>
     */
    @NameInMap("TelA")
    public String telA;

    /**
     * <p>The X number for the fixed-line AXN extension number. The X number is a privacy number that you have <a href="https://dyplsnext.console.aliyun.com/numberbuy">purchased</a> in the console.</p>
     * 
     * <strong>example:</strong>
     * <p>0571******23</p>
     */
    @NameInMap("TelX")
    public String telX;

    /**
     * <p>Extension number. This parameter is required when the BindType parameter is set to mode101.</p>
     * 
     * <strong>example:</strong>
     * <p>1009</p>
     */
    @NameInMap("TelXext")
    public String telXext;

    /**
     * <p>Business timestamp. Format: yyyyMMddHHmmssSSS. Uses Beijing time, 24-hour clock, accurate to milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20161114143116123</p>
     */
    @NameInMap("Ts")
    public String ts;

    public static BindAxnExtensionFixedLineRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAxnExtensionFixedLineRequest self = new BindAxnExtensionFixedLineRequest();
        return TeaModel.build(map, self);
    }

    public BindAxnExtensionFixedLineRequest setAnucode(String anucode) {
        this.anucode = anucode;
        return this;
    }
    public String getAnucode() {
        return this.anucode;
    }

    public BindAxnExtensionFixedLineRequest setAnucodecalled(String anucodecalled) {
        this.anucodecalled = anucodecalled;
        return this;
    }
    public String getAnucodecalled() {
        return this.anucodecalled;
    }

    public BindAxnExtensionFixedLineRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public BindAxnExtensionFixedLineRequest setAreacode(String areacode) {
        this.areacode = areacode;
        return this;
    }
    public String getAreacode() {
        return this.areacode;
    }

    public BindAxnExtensionFixedLineRequest setBindType(String bindType) {
        this.bindType = bindType;
        return this;
    }
    public String getBindType() {
        return this.bindType;
    }

    public BindAxnExtensionFixedLineRequest setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public BindAxnExtensionFixedLineRequest setExtraaxx(BindAxnExtensionFixedLineRequestExtraaxx extraaxx) {
        this.extraaxx = extraaxx;
        return this;
    }
    public BindAxnExtensionFixedLineRequestExtraaxx getExtraaxx() {
        return this.extraaxx;
    }

    public BindAxnExtensionFixedLineRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public BindAxnExtensionFixedLineRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BindAxnExtensionFixedLineRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public BindAxnExtensionFixedLineRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BindAxnExtensionFixedLineRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public BindAxnExtensionFixedLineRequest setSubts(String subts) {
        this.subts = subts;
        return this;
    }
    public String getSubts() {
        return this.subts;
    }

    public BindAxnExtensionFixedLineRequest setTAnucodeConnect(String TAnucodeConnect) {
        this.TAnucodeConnect = TAnucodeConnect;
        return this;
    }
    public String getTAnucodeConnect() {
        return this.TAnucodeConnect;
    }

    public BindAxnExtensionFixedLineRequest setTelA(String telA) {
        this.telA = telA;
        return this;
    }
    public String getTelA() {
        return this.telA;
    }

    public BindAxnExtensionFixedLineRequest setTelX(String telX) {
        this.telX = telX;
        return this;
    }
    public String getTelX() {
        return this.telX;
    }

    public BindAxnExtensionFixedLineRequest setTelXext(String telXext) {
        this.telXext = telXext;
        return this;
    }
    public String getTelXext() {
        return this.telXext;
    }

    public BindAxnExtensionFixedLineRequest setTs(String ts) {
        this.ts = ts;
        return this;
    }
    public String getTs() {
        return this.ts;
    }

    public static class BindAxnExtensionFixedLineRequestExtraaxx extends TeaModel {
        /**
         * <p>Callback control. When A calls through X, that is, A dials X as the caller. Valid values:</p>
         * <ul>
         * <li><p>0 (default): Cannot make outbound calls.</p>
         * </li>
         * <li><p>1: Connect to the most recent N number.</p>
         * </li>
         * <li><p>2: Call back the fixed number TelB.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Callback")
        public String callback;

        /**
         * <p>Recording control. Valid values:</p>
         * <ul>
         * <li><p>0 (default): No recording.</p>
         * </li>
         * <li><p>1: Recording.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>After you enable the call recording feature, you can play and download audio files in the call records. Recording files are billed at CNY 0.010/minute.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Callrecording")
        public String callrecording;

        public static BindAxnExtensionFixedLineRequestExtraaxx build(java.util.Map<String, ?> map) throws Exception {
            BindAxnExtensionFixedLineRequestExtraaxx self = new BindAxnExtensionFixedLineRequestExtraaxx();
            return TeaModel.build(map, self);
        }

        public BindAxnExtensionFixedLineRequestExtraaxx setCallback(String callback) {
            this.callback = callback;
            return this;
        }
        public String getCallback() {
            return this.callback;
        }

        public BindAxnExtensionFixedLineRequestExtraaxx setCallrecording(String callrecording) {
            this.callrecording = callrecording;
            return this;
        }
        public String getCallrecording() {
            return this.callrecording;
        }

    }

}
