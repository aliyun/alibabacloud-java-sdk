// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateIntegrationPolicyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CS_Pro</p>
     */
    @NameInMap("feePackage")
    public String feePackage;

    /**
     * <strong>example:</strong>
     * <p>metrics-inner-manage</p>
     */
    @NameInMap("policyName")
    public String policyName;

    /**
     * <strong>example:</strong>
     * <p>rg-aekzoiafjtr7zyq</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    @NameInMap("tags")
    public java.util.List<UpdateIntegrationPolicyRequestTags> tags;

    public static UpdateIntegrationPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIntegrationPolicyRequest self = new UpdateIntegrationPolicyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIntegrationPolicyRequest setFeePackage(String feePackage) {
        this.feePackage = feePackage;
        return this;
    }
    public String getFeePackage() {
        return this.feePackage;
    }

    public UpdateIntegrationPolicyRequest setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
    public String getPolicyName() {
        return this.policyName;
    }

    public UpdateIntegrationPolicyRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdateIntegrationPolicyRequest setTags(java.util.List<UpdateIntegrationPolicyRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<UpdateIntegrationPolicyRequestTags> getTags() {
        return this.tags;
    }

    public static class UpdateIntegrationPolicyRequestTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>algo_bhv_expose_in_airec_exposure</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>[{\&quot;Id\&quot;: \&quot;kgqie6hm\&quot;, \&quot;Name\&quot;: \&quot;Sheet1\&quot;}]</p>
         */
        @NameInMap("value")
        public String value;

        public static UpdateIntegrationPolicyRequestTags build(java.util.Map<String, ?> map) throws Exception {
            UpdateIntegrationPolicyRequestTags self = new UpdateIntegrationPolicyRequestTags();
            return TeaModel.build(map, self);
        }

        public UpdateIntegrationPolicyRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateIntegrationPolicyRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
