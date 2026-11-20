// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class UpdateAxnBindFixedLineShrinkRequest extends TeaModel {
    /**
     * <p>The prompt code for the caller side. This parameter is required for AXB services. The codes must include three scenarios. Enter the codes in the order of B-&gt;X, A-&gt;X, and other numbers-&gt;X, separated by commas.</p>
     * <blockquote>
     * <p>1,2,3 indicates that the prompt code for B-&gt;X is 1, the prompt code for A-&gt;X is 2, and the prompt code for other numbers-&gt;X is 3.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("Anucode")
    public String anucode;

    /**
     * <p>The prompt code for the callee side after the call is connected. The codes must include two scenarios. Enter the codes in the order of A as callee and B as callee, separated by commas.</p>
     * <blockquote>
     * <p>1,2 indicates that the prompt code when A is the callee is 1, and the prompt code when B is the callee is 2.</p>
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
     * <li><p>0: Never expires.</p>
     * </li>
     * <li><p>Other values: If you specify another value, such as 60, the binding is valid for 60 seconds after the number X is allocated. After 60 seconds, the binding is automatically unbound.</p>
     * </li>
     * </ul>
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
     * <p>The external business extension field. This parameter is returned in the call record receipt message. The maximum length is 100 characters.</p>
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
     * <p>GHX0*************************</p>
     */
    @NameInMap("SubId")
    public String subId;

    /**
     * <p>The binding time. The format is yyyyMMddHHmmss. The time is in UTC+8 and uses a 24-hour clock.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20161114143116</p>
     */
    @NameInMap("Subts")
    public String subts;

    /**
     * <p>The prompt code for the caller side after the call is connected. The codes must include two scenarios. Enter the codes in the order of A as callee and B as callee, separated by commas.</p>
     * <blockquote>
     * <p>1,2 indicates that the prompt code for the caller side when A is the callee is 1, and the prompt code for the caller side when B is the callee is 2.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1,2</p>
     */
    @NameInMap("TAnucodeConnect")
    public String TAnucodeConnect;

    /**
     * <p>The number A of the landline AXN privacy number.</p>
     * <blockquote>
     * <p>You can set number A to a mobile phone number or a landline number. If you use a landline number, you must include the area code. Do not add a hyphen between the area code and the phone number.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Mobile phone number: 182<strong><strong>2371
     * Landline number: 0571</strong></strong>**36</p>
     */
    @NameInMap("TelA")
    public String telA;

    /**
     * <p>The number N of the landline AXN privacy number.</p>
     * 
     * <strong>example:</strong>
     * <p>155****2222</p>
     */
    @NameInMap("TelB")
    public String telB;

    /**
     * <p>The business timestamp. The format is yyyyMMddHHmmssSSS. The time is in UTC+8 and uses a 24-hour clock, accurate to milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20161114143116123</p>
     */
    @NameInMap("Ts")
    public String ts;

    public static UpdateAxnBindFixedLineShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAxnBindFixedLineShrinkRequest self = new UpdateAxnBindFixedLineShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAxnBindFixedLineShrinkRequest setAnucode(String anucode) {
        this.anucode = anucode;
        return this;
    }
    public String getAnucode() {
        return this.anucode;
    }

    public UpdateAxnBindFixedLineShrinkRequest setAnucodecalled(String anucodecalled) {
        this.anucodecalled = anucodecalled;
        return this;
    }
    public String getAnucodecalled() {
        return this.anucodecalled;
    }

    public UpdateAxnBindFixedLineShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateAxnBindFixedLineShrinkRequest setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public UpdateAxnBindFixedLineShrinkRequest setExtraShrink(String extraShrink) {
        this.extraShrink = extraShrink;
        return this;
    }
    public String getExtraShrink() {
        return this.extraShrink;
    }

    public UpdateAxnBindFixedLineShrinkRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public UpdateAxnBindFixedLineShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateAxnBindFixedLineShrinkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateAxnBindFixedLineShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateAxnBindFixedLineShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateAxnBindFixedLineShrinkRequest setSubId(String subId) {
        this.subId = subId;
        return this;
    }
    public String getSubId() {
        return this.subId;
    }

    public UpdateAxnBindFixedLineShrinkRequest setSubts(String subts) {
        this.subts = subts;
        return this;
    }
    public String getSubts() {
        return this.subts;
    }

    public UpdateAxnBindFixedLineShrinkRequest setTAnucodeConnect(String TAnucodeConnect) {
        this.TAnucodeConnect = TAnucodeConnect;
        return this;
    }
    public String getTAnucodeConnect() {
        return this.TAnucodeConnect;
    }

    public UpdateAxnBindFixedLineShrinkRequest setTelA(String telA) {
        this.telA = telA;
        return this;
    }
    public String getTelA() {
        return this.telA;
    }

    public UpdateAxnBindFixedLineShrinkRequest setTelB(String telB) {
        this.telB = telB;
        return this;
    }
    public String getTelB() {
        return this.telB;
    }

    public UpdateAxnBindFixedLineShrinkRequest setTs(String ts) {
        this.ts = ts;
        return this;
    }
    public String getTs() {
        return this.ts;
    }

}
