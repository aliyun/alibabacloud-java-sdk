// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class CreateDigitalSignOrderShrinkRequest extends TeaModel {
    /**
     * <p>Reserved for future use.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("ExtendMessage")
    public String extendMessage;

    /**
     * <p>The qualification information. This object is required when you create a signature, or when you update a signature\&quot;s qualification information.</p>
     * <ul>
     * <li><p>qualificationCompanyName: Company name. The name can be up to 150 characters long. It cannot consist of only digits or contain symbols other than the middle dot (·), Chinese brackets (【】), Chinese parentheses (（）), English parentheses (()), and spaces.</p>
     * </li>
     * <li><p><code>qualificationOrganizationCode</code>: The 18-character Unified Social Credit Identifier (USCI). It must be an 18-digit code or a code that consists of 18 uppercase or lowercase letters and digits.</p>
     * </li>
     * <li><p><code>qualificationAdminName</code>: The name of the agent or legal representative. The name must be in Chinese.</p>
     * </li>
     * <li><p><code>qualificationAdminIDCard</code>: The 18-digit ID card number of the agent. Only PRC ID cards are supported.</p>
     * </li>
     * <li><p><code>qualificationLegalPersonName</code>: The name of the legal representative or agent.</p>
     * </li>
     * <li><p><code>qualificationLegalPersonIDCard</code>: The 18-digit ID card number of the legal representative. Only PRC ID cards are supported.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;qualificationCompanyName&quot;: &quot;阿里阿巴&quot;,
     *   &quot;qualificationOrganizationCode&quot;: &quot;91330106MA2A0XABCD&quot;,
     *   &quot;qualificationLegalPersonName&quot;: &quot;张三&quot;,
     *   &quot;qualificationLegalPersonIDCard&quot;: &quot;110105199001011234&quot;,
     *   &quot;qualificationAdminName&quot;: &quot;李四&quot;,
     *   &quot;qualificationAdminIDCard&quot;: &quot;11010519900101****&quot;
     * }</p>
     */
    @NameInMap("OrderContext")
    public String orderContextShrink;

    /**
     * <p>The operation to perform on the signature. Valid values:</p>
     * <ul>
     * <li><p><code>UPDATE_DIGITALSMS_SIGN</code>: Update a signature.</p>
     * </li>
     * <li><p><code>DELETE_DIGITALSMS_SIGN</code>: Delete a signature.</p>
     * </li>
     * <li><p><code>CREATE_DIGITALSMS_SIGN</code>: Create a signature.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CREATE_DIGITALSMS_SIGN</p>
     */
    @NameInMap("OrderType")
    public String orderType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the qualification.</p>
     * 
     * <strong>example:</strong>
     * <p>41</p>
     */
    @NameInMap("QualificationId")
    public Long qualificationId;

    /**
     * <p>The version of the qualification.</p>
     * 
     * <strong>example:</strong>
     * <p>49</p>
     */
    @NameInMap("QualificationVersion")
    public Long qualificationVersion;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The unique ID of the signature.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("SignId")
    public Long signId;

    /**
     * <p>The industry type. This parameter is required when you create or update a signature. It is optional when you delete a signature. Valid values:</p>
     * <ul>
     * <li><p><code>0</code>: General (GENERAL)</p>
     * </li>
     * <li><p><code>1</code>: E-commerce and retail (ECOMMERCE)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SignIndustry")
    public Long signIndustry;

    /**
     * <p>The signature name. This parameter is required for creating, updating, and deleting signatures.</p>
     * <ol>
     * <li><p>The name must be 2 to 16 characters in length.</p>
     * </li>
     * <li><p>The name can contain Chinese characters, letters, and digits.</p>
     * </li>
     * </ol>
     * <ul>
     * <li><p>Special characters are not allowed, including $, &amp;, %, #, @, !, ^, \*, (, ), _, +, -, =, {, }, [, ], |, ;, :, \&quot;, &quot;, &lt;, &gt;, ,, ., /, ?, \~, and .</p>
     * </li>
     * <li><p>The name cannot be only letters.</p>
     * </li>
     * <li><p>The name cannot be only digits. Spaces are not allowed.</p>
     * </li>
     * <li><p>Emojis are not allowed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>阿里云商城</p>
     */
    @NameInMap("SignName")
    public String signName;

    /**
     * <p>The signature source. This parameter is required when you create or update a signature. It is optional when you delete a signature. Valid values:</p>
     * <ul>
     * <li><p><code>0</code>: Enterprises and public institutions</p>
     * </li>
     * <li><p><code>2</code>: App</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SignSource")
    public Long signSource;

    /**
     * <p>The ID of the user who submits the order.</p>
     * 
     * <strong>example:</strong>
     * <p>110000001750080</p>
     */
    @NameInMap("Submitter")
    public String submitter;

    public static CreateDigitalSignOrderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDigitalSignOrderShrinkRequest self = new CreateDigitalSignOrderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDigitalSignOrderShrinkRequest setExtendMessage(String extendMessage) {
        this.extendMessage = extendMessage;
        return this;
    }
    public String getExtendMessage() {
        return this.extendMessage;
    }

    public CreateDigitalSignOrderShrinkRequest setOrderContextShrink(String orderContextShrink) {
        this.orderContextShrink = orderContextShrink;
        return this;
    }
    public String getOrderContextShrink() {
        return this.orderContextShrink;
    }

    public CreateDigitalSignOrderShrinkRequest setOrderType(String orderType) {
        this.orderType = orderType;
        return this;
    }
    public String getOrderType() {
        return this.orderType;
    }

    public CreateDigitalSignOrderShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDigitalSignOrderShrinkRequest setQualificationId(Long qualificationId) {
        this.qualificationId = qualificationId;
        return this;
    }
    public Long getQualificationId() {
        return this.qualificationId;
    }

    public CreateDigitalSignOrderShrinkRequest setQualificationVersion(Long qualificationVersion) {
        this.qualificationVersion = qualificationVersion;
        return this;
    }
    public Long getQualificationVersion() {
        return this.qualificationVersion;
    }

    public CreateDigitalSignOrderShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDigitalSignOrderShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDigitalSignOrderShrinkRequest setSignId(Long signId) {
        this.signId = signId;
        return this;
    }
    public Long getSignId() {
        return this.signId;
    }

    public CreateDigitalSignOrderShrinkRequest setSignIndustry(Long signIndustry) {
        this.signIndustry = signIndustry;
        return this;
    }
    public Long getSignIndustry() {
        return this.signIndustry;
    }

    public CreateDigitalSignOrderShrinkRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

    public CreateDigitalSignOrderShrinkRequest setSignSource(Long signSource) {
        this.signSource = signSource;
        return this;
    }
    public Long getSignSource() {
        return this.signSource;
    }

    public CreateDigitalSignOrderShrinkRequest setSubmitter(String submitter) {
        this.submitter = submitter;
        return this;
    }
    public String getSubmitter() {
        return this.submitter;
    }

}
