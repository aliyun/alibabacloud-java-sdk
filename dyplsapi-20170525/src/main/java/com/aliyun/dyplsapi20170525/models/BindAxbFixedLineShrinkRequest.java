// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class BindAxbFixedLineShrinkRequest extends TeaModel {
    /**
     * <p>The caller-side announcement code. This parameter is required for the fixed-line AXB privacy number service. The code must include announcements for three scenarios. Specify the codes in the order of &quot;B-&gt;X, A-&gt;X, other numbers-&gt;X&quot;, separated by commas.</p>
     * <blockquote>
     * <p>For example, &quot;1,2,3&quot; indicates that the announcement code for B-&gt;X is 1, the announcement code for A-&gt;X is 2, and the announcement code for other numbers-&gt;X is 3.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("Anucode")
    public String anucode;

    /**
     * <p>The callee-side announcement code after the call is connected. The code must include announcements for two scenarios. Specify the codes in the order of &quot;A as callee, B as callee&quot;, separated by commas.</p>
     * <blockquote>
     * <p>For example, &quot;1,2&quot; indicates that the announcement code when Number A answers as the callee is 1, and the announcement code when Number B answers as the callee is 2.</p>
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
     * <p>The area code. You can specify the location of Number X (specified city -&gt; provincial capital -&gt; national routing). If you do not specify a location, a number is randomly assigned nationwide.</p>
     * 
     * <strong>example:</strong>
     * <p>0571</p>
     */
    @NameInMap("Areacode")
    public String areacode;

    /**
     * <p>The binding type. Valid values:</p>
     * <ul>
     * <li><p>mode101: The customer specifies Number X.</p>
     * </li>
     * <li><p>mode102: The platform allocates Number X.</p>
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
     * <li><p>Other values: If you specify another value, such as 60, the binding is valid for 60 seconds after Number X is successfully allocated. After 60 seconds, the binding is automatically unbound.</p>
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
     * <p>The binding time. The format is yyyyMMddHHmmss. The time is in UTC+8 and uses the 24-hour clock.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20161114143116</p>
     */
    @NameInMap("Subts")
    public String subts;

    /**
     * <p>The caller-side announcement code after the call is connected. The code must include announcements for two scenarios. Specify the codes in the order of &quot;A as callee, B as callee&quot;, separated by commas.</p>
     * <blockquote>
     * <p>For example, &quot;1,2&quot; indicates that the caller-side announcement code when Number A is the callee is 1, and the caller-side announcement code when Number B is the callee is 2.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1,2</p>
     */
    @NameInMap("TAnucodeConnect")
    public String TAnucodeConnect;

    /**
     * <p>Number A of the fixed-line AXB privacy number.</p>
     * <blockquote>
     * <ul>
     * <li>Number A can be a mobile phone number or a fixed-line number. For a fixed-line number, add the area code. No hyphen is required between the area code and the fixed-line number. </li>
     * <li>If your business requires modifying a bound number, you can call the <a href="https://api.aliyun.com/document/Dyplsapi/2017-05-25/UpdateAxbBindFixedLine">UpdateAxbBindFixedLine</a> operation.</li>
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
     * <p>Number B of the fixed-line AXB privacy number.</p>
     * <blockquote>
     * <ul>
     * <li>Number B can be a mobile phone number or a fixed-line number. For a fixed-line number, add the area code. No hyphen is required between the area code and the fixed-line number.</li>
     * <li>If your business requires modifying a bound number, you can call the <a href="https://api.aliyun.com/document/Dyplsapi/2017-05-25/UpdateAxbBindFixedLine">UpdateAxbBindFixedLine</a> operation.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Mobile phone number: 182<strong><strong>2371
     * Fixed-line number: 0571</strong></strong>**36</p>
     */
    @NameInMap("TelB")
    public String telB;

    /**
     * <p>Number X of the fixed-line AXB privacy number. Number X is a privacy number that you have <a href="https://dyplsnext.console.aliyun.com/numberbuy">purchased</a> in the console.</p>
     * <blockquote>
     * <p>This parameter is required when the customer specifies Number X (that is, the BindType parameter is set to mode101).</p>
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

    public static BindAxbFixedLineShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BindAxbFixedLineShrinkRequest self = new BindAxbFixedLineShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BindAxbFixedLineShrinkRequest setAnucode(String anucode) {
        this.anucode = anucode;
        return this;
    }
    public String getAnucode() {
        return this.anucode;
    }

    public BindAxbFixedLineShrinkRequest setAnucodecalled(String anucodecalled) {
        this.anucodecalled = anucodecalled;
        return this;
    }
    public String getAnucodecalled() {
        return this.anucodecalled;
    }

    public BindAxbFixedLineShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public BindAxbFixedLineShrinkRequest setAreacode(String areacode) {
        this.areacode = areacode;
        return this;
    }
    public String getAreacode() {
        return this.areacode;
    }

    public BindAxbFixedLineShrinkRequest setBindType(String bindType) {
        this.bindType = bindType;
        return this;
    }
    public String getBindType() {
        return this.bindType;
    }

    public BindAxbFixedLineShrinkRequest setExpiration(String expiration) {
        this.expiration = expiration;
        return this;
    }
    public String getExpiration() {
        return this.expiration;
    }

    public BindAxbFixedLineShrinkRequest setExtraShrink(String extraShrink) {
        this.extraShrink = extraShrink;
        return this;
    }
    public String getExtraShrink() {
        return this.extraShrink;
    }

    public BindAxbFixedLineShrinkRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public BindAxbFixedLineShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BindAxbFixedLineShrinkRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public BindAxbFixedLineShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BindAxbFixedLineShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public BindAxbFixedLineShrinkRequest setSubts(String subts) {
        this.subts = subts;
        return this;
    }
    public String getSubts() {
        return this.subts;
    }

    public BindAxbFixedLineShrinkRequest setTAnucodeConnect(String TAnucodeConnect) {
        this.TAnucodeConnect = TAnucodeConnect;
        return this;
    }
    public String getTAnucodeConnect() {
        return this.TAnucodeConnect;
    }

    public BindAxbFixedLineShrinkRequest setTelA(String telA) {
        this.telA = telA;
        return this;
    }
    public String getTelA() {
        return this.telA;
    }

    public BindAxbFixedLineShrinkRequest setTelB(String telB) {
        this.telB = telB;
        return this;
    }
    public String getTelB() {
        return this.telB;
    }

    public BindAxbFixedLineShrinkRequest setTelX(String telX) {
        this.telX = telX;
        return this;
    }
    public String getTelX() {
        return this.telX;
    }

    public BindAxbFixedLineShrinkRequest setTs(String ts) {
        this.ts = ts;
        return this;
    }
    public String getTs() {
        return this.ts;
    }

}
