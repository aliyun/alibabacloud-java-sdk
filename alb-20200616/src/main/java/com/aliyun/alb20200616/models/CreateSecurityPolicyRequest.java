// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CreateSecurityPolicyRequest extends TeaModel {
    /**
     * <p>The supported cipher suites.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Ciphers")
    public java.util.List<String> ciphers;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId as the ClientToken. The RequestId of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>593B0448-D13E-4C56-AC0D-FDF0F******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs a dry run. The system checks the required parameters, the request format, and business limits. If the request fails the check, an error message is returned. If the request passes the check, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): sends a normal request. After the request passes the check, a 2xx HTTP status code is returned and the operation is performed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-atstuj3rtop****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The name of the security policy.</p>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, Chinese characters, periods (.), underscores (_), hyphens (-), and spaces. The name must start with a letter, a Chinese character, or a digit.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-secrity</p>
     */
    @NameInMap("SecurityPolicyName")
    public String securityPolicyName;

    /**
     * <p>The TLS protocol versions that are supported.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TLSVersions")
    public java.util.List<String> TLSVersions;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateSecurityPolicyRequestTag> tag;

    public static CreateSecurityPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSecurityPolicyRequest self = new CreateSecurityPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateSecurityPolicyRequest setCiphers(java.util.List<String> ciphers) {
        this.ciphers = ciphers;
        return this;
    }
    public java.util.List<String> getCiphers() {
        return this.ciphers;
    }

    public CreateSecurityPolicyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateSecurityPolicyRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateSecurityPolicyRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateSecurityPolicyRequest setSecurityPolicyName(String securityPolicyName) {
        this.securityPolicyName = securityPolicyName;
        return this;
    }
    public String getSecurityPolicyName() {
        return this.securityPolicyName;
    }

    public CreateSecurityPolicyRequest setTLSVersions(java.util.List<String> TLSVersions) {
        this.TLSVersions = TLSVersions;
        return this;
    }
    public java.util.List<String> getTLSVersions() {
        return this.TLSVersions;
    }

    public CreateSecurityPolicyRequest setTag(java.util.List<CreateSecurityPolicyRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateSecurityPolicyRequestTag> getTag() {
        return this.tag;
    }

    public static class CreateSecurityPolicyRequestTag extends TeaModel {
        /**
         * <p>The tag key. The key can be up to 128 characters long, cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The value can be up to 128 characters long, cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>product</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateSecurityPolicyRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateSecurityPolicyRequestTag self = new CreateSecurityPolicyRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateSecurityPolicyRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateSecurityPolicyRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
