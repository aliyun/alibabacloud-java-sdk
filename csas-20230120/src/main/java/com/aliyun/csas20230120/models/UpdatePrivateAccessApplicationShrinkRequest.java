// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdatePrivateAccessApplicationShrinkRequest extends TeaModel {
    @NameInMap("Addresses")
    public java.util.List<String> addresses;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-application-e12860ef6c48****</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("L7Config")
    public String l7ConfigShrink;

    @NameInMap("L7ProxyDomainAutomaticPrefix")
    public String l7ProxyDomainAutomaticPrefix;

    @NameInMap("L7ProxyDomainCustom")
    public String l7ProxyDomainCustom;

    @NameInMap("L7ProxyDomainPrivate")
    @Deprecated
    public String l7ProxyDomainPrivate;

    /**
     * <strong>example:</strong>
     * <p>Cover</p>
     */
    @NameInMap("ModifyType")
    public String modifyType;

    @NameInMap("PortRanges")
    public java.util.List<UpdatePrivateAccessApplicationShrinkRequestPortRanges> portRanges;

    /**
     * <strong>example:</strong>
     * <p>All</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("TagIds")
    public java.util.List<String> tagIds;

    public static UpdatePrivateAccessApplicationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrivateAccessApplicationShrinkRequest self = new UpdatePrivateAccessApplicationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePrivateAccessApplicationShrinkRequest setAddresses(java.util.List<String> addresses) {
        this.addresses = addresses;
        return this;
    }
    public java.util.List<String> getAddresses() {
        return this.addresses;
    }

    public UpdatePrivateAccessApplicationShrinkRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpdatePrivateAccessApplicationShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdatePrivateAccessApplicationShrinkRequest setL7ConfigShrink(String l7ConfigShrink) {
        this.l7ConfigShrink = l7ConfigShrink;
        return this;
    }
    public String getL7ConfigShrink() {
        return this.l7ConfigShrink;
    }

    public UpdatePrivateAccessApplicationShrinkRequest setL7ProxyDomainAutomaticPrefix(String l7ProxyDomainAutomaticPrefix) {
        this.l7ProxyDomainAutomaticPrefix = l7ProxyDomainAutomaticPrefix;
        return this;
    }
    public String getL7ProxyDomainAutomaticPrefix() {
        return this.l7ProxyDomainAutomaticPrefix;
    }

    public UpdatePrivateAccessApplicationShrinkRequest setL7ProxyDomainCustom(String l7ProxyDomainCustom) {
        this.l7ProxyDomainCustom = l7ProxyDomainCustom;
        return this;
    }
    public String getL7ProxyDomainCustom() {
        return this.l7ProxyDomainCustom;
    }

    @Deprecated
    public UpdatePrivateAccessApplicationShrinkRequest setL7ProxyDomainPrivate(String l7ProxyDomainPrivate) {
        this.l7ProxyDomainPrivate = l7ProxyDomainPrivate;
        return this;
    }
    public String getL7ProxyDomainPrivate() {
        return this.l7ProxyDomainPrivate;
    }

    public UpdatePrivateAccessApplicationShrinkRequest setModifyType(String modifyType) {
        this.modifyType = modifyType;
        return this;
    }
    public String getModifyType() {
        return this.modifyType;
    }

    public UpdatePrivateAccessApplicationShrinkRequest setPortRanges(java.util.List<UpdatePrivateAccessApplicationShrinkRequestPortRanges> portRanges) {
        this.portRanges = portRanges;
        return this;
    }
    public java.util.List<UpdatePrivateAccessApplicationShrinkRequestPortRanges> getPortRanges() {
        return this.portRanges;
    }

    public UpdatePrivateAccessApplicationShrinkRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public UpdatePrivateAccessApplicationShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdatePrivateAccessApplicationShrinkRequest setTagIds(java.util.List<String> tagIds) {
        this.tagIds = tagIds;
        return this;
    }
    public java.util.List<String> getTagIds() {
        return this.tagIds;
    }

    public static class UpdatePrivateAccessApplicationShrinkRequestPortRanges extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Begin")
        public Integer begin;

        /**
         * <strong>example:</strong>
         * <p>81</p>
         */
        @NameInMap("End")
        public Integer end;

        public static UpdatePrivateAccessApplicationShrinkRequestPortRanges build(java.util.Map<String, ?> map) throws Exception {
            UpdatePrivateAccessApplicationShrinkRequestPortRanges self = new UpdatePrivateAccessApplicationShrinkRequestPortRanges();
            return TeaModel.build(map, self);
        }

        public UpdatePrivateAccessApplicationShrinkRequestPortRanges setBegin(Integer begin) {
            this.begin = begin;
            return this;
        }
        public Integer getBegin() {
            return this.begin;
        }

        public UpdatePrivateAccessApplicationShrinkRequestPortRanges setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

    }

}
