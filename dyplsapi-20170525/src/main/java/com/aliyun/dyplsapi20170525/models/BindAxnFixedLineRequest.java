// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxnFixedLineRequest extends TeaModel {
    /**
     * <p>The audio prompt codes for the caller side. The value must include codes for three scenarios. Specify the codes in the order of B-&gt;X, A-&gt;X, and other numbers-&gt;X, separated by commas.</p>
     * <blockquote>
     * <p>For example, 1,2,3 indicates that the audio prompt code for B-&gt;X is 1, the code for A-&gt;X is 2, and the code for other numbers-&gt;X is 3.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("Anucode")
    public String anucode;

    /**
     * <p>The audio prompt codes for the callee side. The value must include codes for two scenarios. Specify the codes in the order of A as the callee and other numbers as the callee, separated by commas.</p>
     * <blockquote>
     * <p>For example, 1,2 indicates that the audio prompt code when number A answers as the callee is 1, and the code when other numbers answer as the callee is 2.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1,2</p>
     */
    @NameInMap("Anucodecalled")
    public String anucodecalled;

    /**
     * <p>The ID of the number pool.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FC10000016848****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The area code. You can specify the location of number X (specified city -&gt; provincial capital -&gt; national routing). If you do not specify the location, a number is randomly assigned nationwide.</p>
     * 
     * <strong>example:</strong>
     * <p>0571</p>
     */
    @NameInMap("Areacode")
    public String areacode;

    /**
     * <p>The binding type. Valid values:</p>
     * <ul>
     * <li><p>mode101: The customer specifies number X.</p>
     * </li>
     * <li><p>mode102: The platform assigns number X.</p>
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
     * <p>The expiration time. Unit: seconds. Valid values:</p>
     * <ul>
     * <li><p>0: The binding never expires.</p>
     * </li>
     * <li><p>Other values: If you specify another value, such as 60, the binding is valid for 60 seconds after number X is successfully assigned. After 60 seconds, the binding is automatically unbound.</p>
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
     * <p>The extended parameters.</p>
     */
    @NameInMap("Extra")
    public BindAxnFixedLineRequestExtra extra;

    /**
     * <p>The unique identifier of the message request.</p>
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
     * <p>The external business extension field. This parameter is returned in the call record receipt message. The value cannot exceed 100 characters in length.</p>
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
     * <p>The binding time. The format is yyyyMMddHHmmss. The time is in UTC+8 and uses the 24-hour clock.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20161114143116</p>
     */
    @NameInMap("Subts")
    public String subts;

    /**
     * <p>The audio prompt codes for the caller side after the call is connected. The value must include codes for two scenarios. Specify the codes in the order of A as the callee and other numbers as the callee, separated by commas.</p>
     * <blockquote>
     * <p>For example, 1,2 indicates that the audio prompt code for the caller side when number A is the callee is 1, and the code for the caller side when other numbers are the callee is 2.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1,2</p>
     */
    @NameInMap("TAnucodeConnect")
    public String TAnucodeConnect;

    /**
     * <p>Number A of the fixed-line AXN privacy number.</p>
     * <blockquote>
     * <ul>
     * <li>Number A can be a mobile phone number or a fixed-line number. A fixed-line number must include the area code, and no hyphen is required between the area code and the number.</li>
     * <li>If your business requires modifying a bound number, you can call the <a href="https://api.aliyun.com/document/Dyplsapi/2017-05-25/UpdateAxnBindFixedLine">UpdateAxnBindFixedLine</a> operation to modify it.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Mobile phone number: 182<strong><strong>2371
     * Fixed-line number: 0571</strong></strong>**36</p>
     */
    @NameInMap("TelA")
    public String telA;

    /**
     * <p>Number N of the fixed-line AXN privacy number.</p>
     * 
     * <strong>example:</strong>
     * <p>155****2222</p>
     */
    @NameInMap("TelB")
    public String telB;

    /**
     * <p>Number X of the fixed-line AXN privacy number. Number X is the privacy number that you have purchased in the console.</p>
     * <blockquote>
     * <p>This parameter is required in the mode where the customer specifies number X (that is, the BindType parameter is set to mode101).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0571******23</p>
     */
    @NameInMap("TelX")
    public String telX;

    /**
     * <p>The business timestamp. The format is yyyyMMddHHmmssSSS. The time is in UTC+8 and uses the 24-hour clock, accurate to milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20161114143116123</p>
     */
    @NameInMap("Ts")
    public String ts;

    public static BindAxnFixedLineRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAxnFixedLineRequest self = new BindAxnFixedLineRequest();
        return TeaModel.build(map, self);
    }

    public BindAxnFixedLineRequest setAnucode(String anucode) {
        this.anucode = anucode;
        return this;
    }
    public String getAnucode() {
        return this.anucode;
    }

    public BindAxnFixedLineRequest setAnucodecalled(String anucodecalled) {
        this.anucodecalled = anucodecalled;
        return this;
    }
    public String getAnucodecalled() {
        return this.anucodecalled;
    }

    public BindAxnFixedLineRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public BindAxnFixedLineRequest setAreacode(String areacode) {
        this.areacode = areacode;
        return this;
    }
    public String getAreacode() {
        return this.areacode;
    }

    public BindAxnFixedLineRequest setBindType(String bindType) {
        this.bindType = bindType;
        return this;
    }
    public String getBindType() {
        return this.bindType;
    }

    public BindAxnFixedLineRequest setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public BindAxnFixedLineRequest setExtra(BindAxnFixedLineRequestExtra extra) {
        this.extra = extra;
        return this;
    }
    public BindAxnFixedLineRequestExtra getExtra() {
        return this.extra;
    }

    public BindAxnFixedLineRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public BindAxnFixedLineRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BindAxnFixedLineRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public BindAxnFixedLineRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BindAxnFixedLineRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public BindAxnFixedLineRequest setSubts(String subts) {
        this.subts = subts;
        return this;
    }
    public String getSubts() {
        return this.subts;
    }

    public BindAxnFixedLineRequest setTAnucodeConnect(String TAnucodeConnect) {
        this.TAnucodeConnect = TAnucodeConnect;
        return this;
    }
    public String getTAnucodeConnect() {
        return this.TAnucodeConnect;
    }

    public BindAxnFixedLineRequest setTelA(String telA) {
        this.telA = telA;
        return this;
    }
    public String getTelA() {
        return this.telA;
    }

    public BindAxnFixedLineRequest setTelB(String telB) {
        this.telB = telB;
        return this;
    }
    public String getTelB() {
        return this.telB;
    }

    public BindAxnFixedLineRequest setTelX(String telX) {
        this.telX = telX;
        return this;
    }
    public String getTelX() {
        return this.telX;
    }

    public BindAxnFixedLineRequest setTs(String ts) {
        this.ts = ts;
        return this;
    }
    public String getTs() {
        return this.ts;
    }

    public static class BindAxnFixedLineRequestExtra extends TeaModel {
        /**
         * <p>The callback control. This applies when User A makes a call through number X, meaning User A calls number X. Valid values:</p>
         * <ul>
         * <li><p>0 (default): Outbound calls are not allowed.</p>
         * </li>
         * <li><p>1: Connects to the most recent number N.</p>
         * </li>
         * <li><p>2: Calls back the fixed number TelB.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Callback")
        public String callback;

        /**
         * <p>The call recording control. Valid values:</p>
         * <ul>
         * <li><p>0 (default): Call recording is disabled.</p>
         * </li>
         * <li><p>1: Call recording is enabled.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>After you enable call recording, you can play and download audio files in the call records. Audio files are billed at CNY 0.010 per minute.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Callrecording")
        public String callrecording;

        public static BindAxnFixedLineRequestExtra build(java.util.Map<String, ?> map) throws Exception {
            BindAxnFixedLineRequestExtra self = new BindAxnFixedLineRequestExtra();
            return TeaModel.build(map, self);
        }

        public BindAxnFixedLineRequestExtra setCallback(String callback) {
            this.callback = callback;
            return this;
        }
        public String getCallback() {
            return this.callback;
        }

        public BindAxnFixedLineRequestExtra setCallrecording(String callrecording) {
            this.callrecording = callrecording;
            return this;
        }
        public String getCallrecording() {
            return this.callrecording;
        }

    }

}
