// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class UpdateAxbBindFixedLineShrinkRequest extends TeaModel {
    /**
     * <p>The caller-side audio playback code. This parameter is required for the AXB privacy number service for landlines. The audio playback code must include codes for three scenarios. Specify the codes in the order of &quot;B-&gt;X, A-&gt;X, and other numbers-&gt;X&quot;, and separate the codes with commas.</p>
     * <blockquote>
     * <p>&quot;1,2,3&quot; indicates that the audio playback code for B-&gt;X is 1, the code for A-&gt;X is 2, and the code for other numbers-&gt;X is 3.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("Anucode")
    public String anucode;

    /**
     * <p>The callee-side audio playback code after the call is connected. The callee-side audio playback code must include codes for two scenarios. Specify the codes in the order of &quot;A as the callee and B as the callee&quot;, and separate the codes with commas.</p>
     * <blockquote>
     * <p>&quot;1,2&quot; indicates that the audio playback code when Number A answers as the callee is 1, and the code when Number B answers as the callee is 2.</p>
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
     * <p>The expiration time. Unit: seconds. Valid values:</p>
     * <ul>
     * <li><p>0: The binding never expires.</p>
     * </li>
     * <li><p>Other values: If you specify another value, such as 60, the binding is valid for 60 seconds after Number X is allocated. After 60 seconds, the binding is automatically unbound.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Expiration")
    public String expiration;

    /**
     * <p>The extension parameters.</p>
     */
    @NameInMap("Extra")
    public String extraShrink;

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
     * <p>The binding ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>A100***************</p>
     */
    @NameInMap("SubId")
    public String subId;

    /**
     * <p>The binding time. The format is yyyyMMddHHmmss. The time is in UTC+8 and uses the 24-hour format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20161114143116</p>
     */
    @NameInMap("Subts")
    public String subts;

    /**
     * <p>The caller-side audio playback code after the call is connected. The caller-side audio playback code after connection must include codes for two scenarios. Specify the codes in the order of &quot;A as the callee and B as the callee&quot;, and separate the codes with commas.</p>
     * <blockquote>
     * <p>&quot;1,2&quot; indicates that the caller-side audio playback code when Number A is the callee is 1, and the caller-side audio playback code when Number B is the callee is 2.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1,2</p>
     */
    @NameInMap("TAnucodeConnect")
    public String TAnucodeConnect;

    /**
     * <p>Sets Number A in the binding relationship.</p>
     * <blockquote>
     * <ul>
     * <li>Number A can be set to a mobile phone number or a landline number. If it is a landline number, you must add the area code. No hyphen is required between the area code and the number.</li>
     * <li>You cannot update TelA and TelB at the same time.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Mobile phone number: 182<strong><strong>2371
     * Landline number: 0571</strong></strong>**36</p>
     */
    @NameInMap("TelA")
    public String telA;

    /**
     * <p>Sets Number B in the binding relationship.</p>
     * <blockquote>
     * <ul>
     * <li>Number B can be set to a mobile phone number or a landline number. If it is a landline number, you must add the area code. No hyphen is required between the area code and the number.</li>
     * <li>You cannot update TelA and TelB at the same time.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Mobile phone number: 182<strong><strong>2371
     * Landline number: 0571</strong></strong>**36</p>
     */
    @NameInMap("TelB")
    public String telB;

    /**
     * <p>The business timestamp. The format is yyyyMMddHHmmssSSS. The time is in UTC+8 and uses the 24-hour format. The precision is accurate to milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20161114143116123</p>
     */
    @NameInMap("Ts")
    public String ts;

    public static UpdateAxbBindFixedLineShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAxbBindFixedLineShrinkRequest self = new UpdateAxbBindFixedLineShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAxbBindFixedLineShrinkRequest setAnucode(String anucode) {
        this.anucode = anucode;
        return this;
    }
    public String getAnucode() {
        return this.anucode;
    }

    public UpdateAxbBindFixedLineShrinkRequest setAnucodecalled(String anucodecalled) {
        this.anucodecalled = anucodecalled;
        return this;
    }
    public String getAnucodecalled() {
        return this.anucodecalled;
    }

    public UpdateAxbBindFixedLineShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateAxbBindFixedLineShrinkRequest setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public UpdateAxbBindFixedLineShrinkRequest setExtraShrink(String extraShrink) {
        this.extraShrink = extraShrink;
        return this;
    }
    public String getExtraShrink() {
        return this.extraShrink;
    }

    public UpdateAxbBindFixedLineShrinkRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public UpdateAxbBindFixedLineShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateAxbBindFixedLineShrinkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateAxbBindFixedLineShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateAxbBindFixedLineShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateAxbBindFixedLineShrinkRequest setSubId(String subId) {
        this.subId = subId;
        return this;
    }
    public String getSubId() {
        return this.subId;
    }

    public UpdateAxbBindFixedLineShrinkRequest setSubts(String subts) {
        this.subts = subts;
        return this;
    }
    public String getSubts() {
        return this.subts;
    }

    public UpdateAxbBindFixedLineShrinkRequest setTAnucodeConnect(String TAnucodeConnect) {
        this.TAnucodeConnect = TAnucodeConnect;
        return this;
    }
    public String getTAnucodeConnect() {
        return this.TAnucodeConnect;
    }

    public UpdateAxbBindFixedLineShrinkRequest setTelA(String telA) {
        this.telA = telA;
        return this;
    }
    public String getTelA() {
        return this.telA;
    }

    public UpdateAxbBindFixedLineShrinkRequest setTelB(String telB) {
        this.telB = telB;
        return this;
    }
    public String getTelB() {
        return this.telB;
    }

    public UpdateAxbBindFixedLineShrinkRequest setTs(String ts) {
        this.ts = ts;
        return this;
    }
    public String getTs() {
        return this.ts;
    }

}
