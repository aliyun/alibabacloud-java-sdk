// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreatePolicyResponseBody extends TeaModel {
    /**
     * <p>The name of the access control rule.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;NetworkRules&quot;:[&quot;kst-hzz62ee817bvyyr5x****.efkd&quot;,&quot;kst-hzz62ee817bvyyr5x****.eyyp&quot;]}</p>
     */
    @NameInMap("AccessControlRules")
    public String accessControlRules;

    /**
     * <p>The ARN of the permission policy.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:kms:cn-hangzhou:119285303511****:policy/policy_test</p>
     */
    @NameInMap("Arn")
    public String arn;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>policy  description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The scope of the permission policy.</p>
     * 
     * <strong>example:</strong>
     * <p>kst-hzz634e67d126u9p9****</p>
     */
    @NameInMap("KmsInstance")
    public String kmsInstance;

    /**
     * <p>The name of the permission policy.</p>
     * 
     * <strong>example:</strong>
     * <p>policy_test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The operations that can be performed.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;RbacPermission/Template/CryptoServiceKeyUser&quot;, &quot;RbacPermission/Template/CryptoServiceSecretUser&quot;]</p>
     */
    @NameInMap("Permissions")
    public String permissions;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>3bf02f7a-015b-4f34-be0f-c4543fda2d33</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The key and secret that are allowed to access.</p>
     * <ul>
     * <li><code>key/*</code> indicates that all keys of the KMS instance can be accessed.</li>
     * <li><code>secret/*</code> indicates all secrets of the KMS instance can be accessed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[&quot;secret/acs/ram/user/ram-secret&quot;, &quot;secret/acs/ram/user/acr-master&quot;, &quot;key/key-hzz63d9c8d3dfv8cv****&quot;]</p>
     */
    @NameInMap("Resources")
    public String resources;

    public static CreatePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePolicyResponseBody self = new CreatePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePolicyResponseBody setAccessControlRules(String accessControlRules) {
        this.accessControlRules = accessControlRules;
        return this;
    }
    public String getAccessControlRules() {
        return this.accessControlRules;
    }

    public CreatePolicyResponseBody setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public CreatePolicyResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePolicyResponseBody setKmsInstance(String kmsInstance) {
        this.kmsInstance = kmsInstance;
        return this;
    }
    public String getKmsInstance() {
        return this.kmsInstance;
    }

    public CreatePolicyResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePolicyResponseBody setPermissions(String permissions) {
        this.permissions = permissions;
        return this;
    }
    public String getPermissions() {
        return this.permissions;
    }

    public CreatePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePolicyResponseBody setResources(String resources) {
        this.resources = resources;
        return this;
    }
    public String getResources() {
        return this.resources;
    }

}
