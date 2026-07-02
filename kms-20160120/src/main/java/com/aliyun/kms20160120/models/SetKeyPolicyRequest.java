// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class SetKeyPolicyRequest extends TeaModel {
    /**
     * <p>The ID or Alibaba Cloud Resource Name (ARN) of the key.</p>
     * <blockquote>
     * <p>To access a key of another Alibaba Cloud account, you must specify the ARN of the key. The key ARN is in the format of <code>acs:kms:${region}:${account}:key/${keyid}</code>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>key-hzz630494463ejqjx****</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The key policy. The policy is in the JSON format. The policy can be up to 32,768 bytes in length.</p>
     * <p>A key policy contains the following elements:</p>
     * <ul>
     * <li><p>Version: The version of the key policy. The value can only be 1.</p>
     * </li>
     * <li><p>Statement: The statement of the key policy. Each key policy can contain one or more statements.</p>
     * </li>
     * </ul>
     * <p>The following code provides an example of a key policy:</p>
     * <pre><code>{
     *     &quot;Version&quot;: &quot;1&quot;,
     *     &quot;Statement&quot;: [
     *         {
     *             &quot;Sid&quot;: &quot;Enable RAM User Permissions&quot;,
     *             &quot;Effect&quot;: &quot;Allow&quot;,
     *             &quot;Principal&quot;: {
     *               &quot;RAM&quot;: [&quot;acs:ram::112890462****:*&quot;]
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
     * <p>The following section describes the elements in a Statement:</p>
     * <ul>
     * <li><p>Sid: Optional. The custom statement identifier. The value can be up to 128 characters in length and can contain uppercase letters, lowercase letters, digits, and the following special characters: _ / + = . @ -.</p>
     * </li>
     * <li><p>Effect: Required. The effect of the policy statement. Valid values: Allow and Deny.</p>
     * </li>
     * <li><p>Principal: Required. The principal that is authorized to access the key. You can set this parameter to the current Alibaba Cloud account, a RAM user or RAM role of the current Alibaba Cloud account, or a RAM user or RAM role of another Alibaba Cloud account.</p>
     * </li>
     * <li><p>Action: Required. The API operations that are allowed or denied. The value must start with kms:. For more information about the operations, see <a href="https://help.aliyun.com/document_detail/2716468.html">Key policy overview</a>. If you specify an operation that is not included in the list, the operation will not take effect.</p>
     * </li>
     * <li><p>Resource: Required. The key. The value can only be \*.</p>
     * </li>
     * <li><p>Condition: Optional. The conditions for the policy to take effect. You can use conditions to evaluate the context of an API request to determine whether the policy statement is applicable. The format is <code>&quot;Condition&quot;: {&quot;condition operator&quot;: {&quot;condition key&quot;: &quot;condition value&quot;}}</code>. For more information, see <a href="https://help.aliyun.com/document_detail/2716468.html">Key policy overview</a>.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>After you grant permissions to a RAM user or RAM role of another Alibaba Cloud account, you must use the Alibaba Cloud account to which the RAM user or RAM role belongs to grant the RAM user or RAM role the permissions to use the key in the RAM console. For more information, see <a href="https://help.aliyun.com/document_detail/480682.html">Custom policies for KMS</a>, <a href="https://help.aliyun.com/document_detail/116146.html">Grant permissions to a RAM user</a>, and <a href="https://help.aliyun.com/document_detail/116147.html">Grant permissions to a RAM role</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Statement&quot;:[{&quot;Action&quot;:[&quot;kms:<em>&quot;],&quot;Effect&quot;:&quot;Allow&quot;,&quot;Principal&quot;:{&quot;RAM&quot;:[&quot;acs:ram::119285303511</em><em>**:<em>&quot;]},&quot;Resource&quot;:[&quot;</em>&quot;],&quot;Sid&quot;:&quot;kms default key policy&quot;},{&quot;Action&quot;:[&quot;kms:List</em>&quot;,&quot;kms:Describe*&quot;,&quot;kms:Create*&quot;,&quot;kms:Enable*&quot;,&quot;kms:Disable*&quot;,&quot;kms:Get*&quot;,&quot;kms:Set*&quot;,&quot;kms:Update*&quot;,&quot;kms:Delete*&quot;,&quot;kms:Cancel*&quot;,&quot;kms:TagResource&quot;,&quot;kms:UntagResource&quot;,&quot;kms:ImportKeyMaterial&quot;,&quot;kms:ScheduleKeyDeletion&quot;],&quot;Effect&quot;:&quot;Allow&quot;,&quot;Principal&quot;:{&quot;RAM&quot;:[&quot;acs:ram::119285303511****:user/for_test_policy&quot;]},&quot;Resource&quot;:[&quot;*&quot;]}],&quot;Version&quot;:&quot;1&quot;}</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The name of the key policy. The name can only be \<code>default\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("PolicyName")
    public String policyName;

    public static SetKeyPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        SetKeyPolicyRequest self = new SetKeyPolicyRequest();
        return TeaModel.build(map, self);
    }

    public SetKeyPolicyRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public SetKeyPolicyRequest setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public SetKeyPolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

}
