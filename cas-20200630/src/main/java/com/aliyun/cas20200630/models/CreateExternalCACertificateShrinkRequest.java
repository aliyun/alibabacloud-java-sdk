// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateExternalCACertificateShrinkRequest extends TeaModel {
    @NameInMap("ApiPassthrough")
    public String apiPassthroughShrink;

    /**
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE REQUEST-----
     * MIIBczCCARgCAQAwgYoxFDASBgNVBAMMC2FsaXl1bi50ZXN0MQ0wCwYDVQQ
     * ...
     * vbIgMQIhAKHDWD6/WAMbtezAt4bysJ/BZIDz1jPWuUR5GV4TJ/mS
     * -----END CERTIFICATE REQUEST-----</p>
     */
    @NameInMap("Csr")
    public String csr;

    /**
     * <strong>example:</strong>
     * <p>cas_deposit-cn-1234abcd</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tags")
    public java.util.List<CreateExternalCACertificateShrinkRequestTags> tags;

    /**
     * <strong>example:</strong>
     * <p>10y</p>
     */
    @NameInMap("Validity")
    public String validity;

    public static CreateExternalCACertificateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateExternalCACertificateShrinkRequest self = new CreateExternalCACertificateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateExternalCACertificateShrinkRequest setApiPassthroughShrink(String apiPassthroughShrink) {
        this.apiPassthroughShrink = apiPassthroughShrink;
        return this;
    }
    public String getApiPassthroughShrink() {
        return this.apiPassthroughShrink;
    }

    public CreateExternalCACertificateShrinkRequest setCsr(String csr) {
        this.csr = csr;
        return this;
    }
    public String getCsr() {
        return this.csr;
    }

    public CreateExternalCACertificateShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateExternalCACertificateShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateExternalCACertificateShrinkRequest setTags(java.util.List<CreateExternalCACertificateShrinkRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateExternalCACertificateShrinkRequestTags> getTags() {
        return this.tags;
    }

    public CreateExternalCACertificateShrinkRequest setValidity(String validity) {
        this.validity = validity;
        return this;
    }
    public String getValidity() {
        return this.validity;
    }

    public static class CreateExternalCACertificateShrinkRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateExternalCACertificateShrinkRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateExternalCACertificateShrinkRequestTags self = new CreateExternalCACertificateShrinkRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateExternalCACertificateShrinkRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateExternalCACertificateShrinkRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
