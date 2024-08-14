// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class DescribePolicyResponseBody extends TeaModel {
    /**
     * <p>The network access rule that is associated with the permission policy.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;NetworkRules&quot;:[&quot;kst-hzz62ee817bvyyr5x****.efkd&quot;,&quot;kst-hzz62ee817bvyyr5x****.eyyp&quot;]}</p>
     */
    @NameInMap("AccessControlRules")
    public String accessControlRules;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the permission policy.</p>
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
     * <p>A list of operations that can be performed.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;RbacPermission/Template/CryptoServiceKeyUser&quot;, &quot;RbacPermission/Template/CryptoServiceSecretUser&quot;]</p>
     */
    @NameInMap("Permissions")
    public java.util.List<String> permissions;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>f455324b-e229-4066-9f58-9c1cf3fe83a9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>A list of keys and secrets that are allowed to access.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;secret/acs/ram/user/ram-secret&quot;, &quot;secret/acs/ram/user/acr-master&quot;, &quot;key/key-hzz63d9c8d3dfv8cv****&quot;]</p>
     */
    @NameInMap("Resources")
    public java.util.List<String> resources;

    public static DescribePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyResponseBody self = new DescribePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolicyResponseBody setAccessControlRules(String accessControlRules) {
        this.accessControlRules = accessControlRules;
        return this;
    }
    public String getAccessControlRules() {
        return this.accessControlRules;
    }

    public DescribePolicyResponseBody setArn(String arn) {
        this.arn = arn;
        return this;
    }
    public String getArn() {
        return this.arn;
    }

    public DescribePolicyResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DescribePolicyResponseBody setKmsInstance(String kmsInstance) {
        this.kmsInstance = kmsInstance;
        return this;
    }
    public String getKmsInstance() {
        return this.kmsInstance;
    }

    public DescribePolicyResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribePolicyResponseBody setPermissions(java.util.List<String> permissions) {
        this.permissions = permissions;
        return this;
    }
    public java.util.List<String> getPermissions() {
        return this.permissions;
    }

    public DescribePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePolicyResponseBody setResources(java.util.List<String> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<String> getResources() {
        return this.resources;
    }

}
