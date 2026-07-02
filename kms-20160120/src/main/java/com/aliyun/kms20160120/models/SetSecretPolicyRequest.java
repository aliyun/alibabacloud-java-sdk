// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class SetSecretPolicyRequest extends TeaModel {
    /**
     * <p>The content of the secret policy. The value must be in the JSON format. The value can be up to 32,768 bytes in length.</p>
     * <p>A secret policy contains the following elements:</p>
     * <ul>
     * <li><p>Version: The version of the secret policy. The value can only be 1.</p>
     * </li>
     * <li><p>Statement: The statement of the secret policy. Each secret policy can contain one or more statements.</p>
     * </li>
     * </ul>
     * <p>The following code shows the format of a secret policy:</p>
     * <pre><code>{
     *     &quot;Version&quot;: &quot;1&quot;,
     *     &quot;Statement&quot;: [
     *         {
     *             &quot;Sid&quot;: &quot;Enable RAM User Permissions&quot;,
     *             &quot;Effect&quot;: &quot;Allow&quot;,
     *             &quot;Principal&quot;: {
     *               &quot;RAM&quot;: [&quot;acs:ram::12345678****:*&quot;]
     *             },
     *             &quot;Action&quot;: [
     *                 &quot;kms:*&quot;
     *             ],
     *             &quot;Resource&quot;: [
     *                 &quot;*&quot;
     *             ]
     *         }
     *     ]
     * }
     * </code></pre>
     * <p>The following section describes the elements in a statement:</p>
     * <ul>
     * <li><p>Sid: Optional. The custom identifier of the statement. The value can be up to 128 characters in length and can contain uppercase letters (A-Z), lowercase letters (a-z), digits (0-9), and special characters, including underscores (_), forward slashes (/), equal signs (=), plus signs (+), periods (.), at signs (@), and hyphens (-).</p>
     * </li>
     * <li><p>Effect: Required. Specifies whether to allow or deny the permissions in the statement. Valid values: Allow and Deny.</p>
     * </li>
     * <li><p>Principal: Required. The principal that is authorized to access the secret. You can set this parameter to the current Alibaba Cloud account (the account to which the secret belongs), a RAM user or RAM role of the current Alibaba Cloud account, or a RAM user or RAM role of another Alibaba Cloud account.</p>
     * </li>
     * <li><p>Action: Required. The API operations that are allowed or denied. The value must start with \<code>kms:\\</code>. For a list of supported operations, see <a href="https://help.aliyun.com/document_detail/2716465.html">Secret policy overview</a>. If you specify an operation that is not in the list, the operation does not take effect.</p>
     * </li>
     * <li><p>Resource: Required. The value can only be \<code>\\*\\</code>, which indicates the current KMS secret.</p>
     * </li>
     * <li><p>Condition: Optional. The conditions for the authorization to take effect. You can use conditions to evaluate the context of an API request to determine whether a policy statement is applicable. The format is <code>&quot;Condition&quot;: {&quot;condition operator&quot;: {&quot;condition key&quot;: &quot;condition value&quot;}}</code>. For more information, see <a href="https://help.aliyun.com/document_detail/2716465.html">Secret policy overview</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>After you grant permissions to a RAM user or RAM role of another Alibaba Cloud account, you must go to the RAM console and use the Alibaba Cloud account to which the RAM user or RAM role belongs to grant the RAM user or RAM role the permissions to use the secret. For more information, see <a href="https://help.aliyun.com/document_detail/480682.html">Custom policies for KMS</a>, <a href="https://help.aliyun.com/document_detail/116146.html">Grant permissions to a RAM user</a>, and <a href="https://help.aliyun.com/document_detail/116147.html">Grant permissions to a RAM role</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Version&quot;:&quot;1&quot;,&quot;Statement&quot;: [{&quot;Sid&quot;:&quot;kms default secret policy&quot;,&quot;Effect&quot;:&quot;Allow&quot;,&quot;Principal&quot;:{&quot;RAM&quot;: [&quot;acs:ram::119285303511****:<em>&quot;]},&quot;Action&quot;:[&quot;kms:</em>&quot;],&quot;Resource&quot;: [&quot;*&quot;] }] }</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The name of the secret policy. The value can only be \<code>default\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    /**
     * <p>The name or Alibaba Cloud Resource Name (ARN) of the secret.</p>
     * <blockquote>
     * <p>When you access a secret in another Alibaba Cloud account, you must specify the ARN of the secret. The ARN of a secret is in the format of <code>acs:kms:${region}:${account}:secret/${secret-name}</code>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>secret_test</p>
     */
    @NameInMap("SecretName")
    public String secretName;

    public static SetSecretPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetSecretPolicyRequest self = new SetSecretPolicyRequest();
        return TeaModel.build(map, self);
    }

    public SetSecretPolicyRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public SetSecretPolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public SetSecretPolicyRequest setSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }
    public String getSecretName() {
        return this.secretName;
    }

}
