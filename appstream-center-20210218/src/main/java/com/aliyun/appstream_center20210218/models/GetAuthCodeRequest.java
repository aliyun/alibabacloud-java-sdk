// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210218.models;

import com.aliyun.tea.*;

public class GetAuthCodeRequest extends TeaModel {
    /**
     * <p>The account type. Valid values: ad (enterprise AD account) and simple (convenience account).</p>
     * 
     * <strong>example:</strong>
     * <p>simple</p>
     */
    @NameInMap("AccountType")
    public String accountType;

    /**
     * <p>The Active Directory domain name. This parameter is required when the account type is ad.</p>
     * 
     * <strong>example:</strong>
     * <p>ad.example.com</p>
     */
    @NameInMap("AdDomain")
    public String adDomain;

    /**
     * <p>The password of the enterprise AD account.</p>
     * 
     * <strong>example:</strong>
     * <p>Qa****7!Z9</p>
     */
    @NameInMap("AdPassword")
    public String adPassword;

    /**
     * <p>Specifies whether to synchronously create an EndUserId based on ExternalUserId. This parameter takes effect only when EndUserId is left empty.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoCreateUser")
    public Boolean autoCreateUser;

    /**
     * <p>The username of the Wuying convenience account. The username must be unique within an Alibaba Cloud account. This parameter and ExternalUserId cannot be left empty at the same time.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The external user ID. This ID is customized by the caller and must be unique within an Alibaba Cloud account. This parameter and ExternalUserId cannot be left empty at the same time.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("ExternalUserId")
    public String externalUserId;

    /**
     * <p>The access policy that restricts the access permissions of the authorization code. If this parameter is left empty, no restrictions are applied.</p>
     * <p>Syntax:</p>
     * <pre><code class="language-json">{
     *       &quot;Version&quot;: &quot;1&quot;,
     *       &quot;Resource&quot;: {
     *             &quot;Type&quot;: &quot;&lt;resource type&gt;&quot;,
     *             &quot;Id&quot;: &quot;&lt;resource ID&gt;&quot;
     *       }
     * }
     * </code></pre>
     * <p>Valid values for <resource type>:</p>
     * <ul>
     * <li>AppInstanceGroup: app instance group. You can call the ListAppInstanceGroup operation to obtain the ID.</li>
     * <li>AppInstance: app instance. This is a dedicated field.</li>
     * <li>App: application. You can call the ListAppInstanceGroup operation to obtain the ID.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;Version&quot;: &quot;1&quot;,
     *       &quot;Resource&quot;: {
     *             &quot;Type&quot;: &quot;AppInstanceGroup&quot;,
     *             &quot;Id&quot;: &quot;aig-9ciijz60n4xsv****&quot;
     *       }
     * }</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The token type. Valid values: LoginToken (logon token) and StsToken (temporary identity credential).</p>
     * 
     * <strong>example:</strong>
     * <p>StsToken</p>
     */
    @NameInMap("TokenType")
    public String tokenType;

    public static GetAuthCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAuthCodeRequest self = new GetAuthCodeRequest();
        return TeaModel.build(map, self);
    }

    public GetAuthCodeRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public GetAuthCodeRequest setAdDomain(String adDomain) {
        this.adDomain = adDomain;
        return this;
    }
    public String getAdDomain() {
        return this.adDomain;
    }

    public GetAuthCodeRequest setAdPassword(String adPassword) {
        this.adPassword = adPassword;
        return this;
    }
    public String getAdPassword() {
        return this.adPassword;
    }

    public GetAuthCodeRequest setAutoCreateUser(Boolean autoCreateUser) {
        this.autoCreateUser = autoCreateUser;
        return this;
    }
    public Boolean getAutoCreateUser() {
        return this.autoCreateUser;
    }

    public GetAuthCodeRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public GetAuthCodeRequest setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
        return this;
    }
    public String getExternalUserId() {
        return this.externalUserId;
    }

    public GetAuthCodeRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public GetAuthCodeRequest setTokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }
    public String getTokenType() {
        return this.tokenType;
    }

}
