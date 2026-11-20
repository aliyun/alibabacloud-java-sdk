// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class UpdateAxnExtensionBindFixedLineShrinkRequest extends TeaModel {
    /**
     * <p>The announcement code for the caller side. This parameter is required for the AXB service. It must contain codes for three scenarios. Specify the codes in the order of &quot;B-&gt;X, A-&gt;X, and other numbers-&gt;X&quot;, separated by commas.</p>
     * <blockquote>
     * <p>&quot;1,2,3&quot; indicates that the announcement code for B-&gt;X is 1, the announcement code for A-&gt;X is 2, and the announcement code for other numbers-&gt;X is 3.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("Anucode")
    public String anucode;

    /**
     * <p>The announcement code for the callee side after the call is connected. It must contain codes for two scenarios. Specify the codes in the order of &quot;A as callee and B as callee&quot;, separated by commas.</p>
     * <blockquote>
     * <p>&quot;1,2&quot; indicates that the announcement code when number A answers as the callee is 1, and the announcement code when number B answers as the callee is 2.</p>
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
     * <li><p>Other values: If you specify another value, such as 60, the binding is valid for 60 seconds after number X is allocated. After 60 seconds, the binding is automatically unbound.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Expiration")
    public String expiration;

    /**
     * <p>The extension parameters.</p>
     */
    @NameInMap("Extraaxx")
    public String extraaxxShrink;

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
     * <p>GHX0*************************</p>
     */
    @NameInMap("SubId")
    public String subId;

    /**
     * <p>The binding time. Format: yyyyMMddHHmmss. The time is in UTC+8 and uses the 24-hour format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20161114143116</p>
     */
    @NameInMap("Subts")
    public String subts;

    /**
     * <p>The announcement code for the caller side after the call is connected. It must contain codes for two scenarios. Specify the codes in the order of &quot;A as callee and B as callee&quot;, separated by commas.</p>
     * <blockquote>
     * <p>&quot;1,2&quot; indicates that the announcement code for the caller side when number A is the callee is 1, and the announcement code for the caller side when number B is the callee is 2.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1,2</p>
     */
    @NameInMap("TAnucodeConnect")
    public String TAnucodeConnect;

    /**
     * <p>The number A of the landline AXN extension.</p>
     * <blockquote>
     * <p>Number A can be set to a mobile phone number or a landline number. For a landline number, the area code must be included, and no hyphen is required between the area code and the number.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Mobile phone number: 182<strong><strong>2371
     * Landline number: 0571</strong></strong>**36</p>
     */
    @NameInMap("TelA")
    public String telA;

    /**
     * <p>The business timestamp. Format: yyyyMMddHHmmssSSS. The time is in UTC+8 and uses the 24-hour format, accurate to milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20161114143116123</p>
     */
    @NameInMap("Ts")
    public String ts;

    public static UpdateAxnExtensionBindFixedLineShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAxnExtensionBindFixedLineShrinkRequest self = new UpdateAxnExtensionBindFixedLineShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAxnExtensionBindFixedLineShrinkRequest setAnucode(String anucode) {
        this.anucode = anucode;
        return this;
    }
    public String getAnucode() {
        return this.anucode;
    }

    public UpdateAxnExtensionBindFixedLineShrinkRequest setAnucodecalled(String anucodecalled) {
        this.anucodecalled = anucodecalled;
        return this;
    }
    public String getAnucodecalled() {
        return this.anucodecalled;
    }

    public UpdateAxnExtensionBindFixedLineShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateAxnExtensionBindFixedLineShrinkRequest setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public UpdateAxnExtensionBindFixedLineShrinkRequest setExtraaxxShrink(String extraaxxShrink) {
        this.extraaxxShrink = extraaxxShrink;
        return this;
    }
    public String getExtraaxxShrink() {
        return this.extraaxxShrink;
    }

    public UpdateAxnExtensionBindFixedLineShrinkRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public UpdateAxnExtensionBindFixedLineShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateAxnExtensionBindFixedLineShrinkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public UpdateAxnExtensionBindFixedLineShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateAxnExtensionBindFixedLineShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateAxnExtensionBindFixedLineShrinkRequest setSubId(String subId) {
        this.subId = subId;
        return this;
    }
    public String getSubId() {
        return this.subId;
    }

    public UpdateAxnExtensionBindFixedLineShrinkRequest setSubts(String subts) {
        this.subts = subts;
        return this;
    }
    public String getSubts() {
        return this.subts;
    }

    public UpdateAxnExtensionBindFixedLineShrinkRequest setTAnucodeConnect(String TAnucodeConnect) {
        this.TAnucodeConnect = TAnucodeConnect;
        return this;
    }
    public String getTAnucodeConnect() {
        return this.TAnucodeConnect;
    }

    public UpdateAxnExtensionBindFixedLineShrinkRequest setTelA(String telA) {
        this.telA = telA;
        return this;
    }
    public String getTelA() {
        return this.telA;
    }

    public UpdateAxnExtensionBindFixedLineShrinkRequest setTs(String ts) {
        this.ts = ts;
        return this;
    }
    public String getTs() {
        return this.ts;
    }

}
