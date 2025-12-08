// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class UpdatePcaCertificateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cert-name</p>
     */
    @NameInMap("AliasName")
    public String aliasName;

    /**
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>160ae6bb538d538c70c01f81dcf2****</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    /**
     * <strong>example:</strong>
     * <p>rg-ae******4wia</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tags")
    public java.util.List<UpdatePcaCertificateRequestTags> tags;

    public static UpdatePcaCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePcaCertificateRequest self = new UpdatePcaCertificateRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePcaCertificateRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public UpdatePcaCertificateRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdatePcaCertificateRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public UpdatePcaCertificateRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdatePcaCertificateRequest setTags(java.util.List<UpdatePcaCertificateRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<UpdatePcaCertificateRequestTags> getTags() {
        return this.tags;
    }

    public static class UpdatePcaCertificateRequestTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>runtime</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdatePcaCertificateRequestTags build(java.util.Map<String, ?> map) throws Exception {
            UpdatePcaCertificateRequestTags self = new UpdatePcaCertificateRequestTags();
            return TeaModel.build(map, self);
        }

        public UpdatePcaCertificateRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdatePcaCertificateRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
