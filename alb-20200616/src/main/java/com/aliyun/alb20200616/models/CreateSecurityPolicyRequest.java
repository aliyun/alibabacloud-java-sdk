// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CreateSecurityPolicyRequest extends TeaModel {
    /**
     * <p>The list of supported cipher suites.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Ciphers")
    public java.util.List<String> ciphers;

    /**
     * <p>Ensures the idempotence of the request. You can generate the value on your client to ensure that the value is unique across different requests. The ClientToken parameter supports only ASCII characters and can be up to 64 characters in length.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>593B0448-D13E-4C56-AC0D-FDF0F******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs only a dry run and does not create resources. The system checks whether required parameters are specified, the request format is valid, and service limits are met. If the request fails the dry run, an error is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): sends a normal request. If the request passes the dry run, an HTTP 2xx status code is returned and the operation is performed.</li>
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
     * <p>Policy Name of the security policy.</p>
     * <p>Policy Name must be 2 to 128 characters in length. It must start with a letter, Chinese character, or digit, and can contain digits, periods (.), underscores (_), hyphens (-), and spaces.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-secrity</p>
     */
    @NameInMap("SecurityPolicyName")
    public String securityPolicyName;

    /**
     * <p>The list of supported TLS protocol versions.</p>
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
         * <p>The tag key. The key can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The value can be up to 128 characters in length. It cannot start with <code>aliyun</code> or <code>acs:</code>, and cannot contain <code>http://</code> or <code>https://</code>.</p>
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
