// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreatePrivateAccessApplicationShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Addresses")
    public java.util.List<String> addresses;

    @NameInMap("BrowserAccessStatus")
    public String browserAccessStatus;

    @NameInMap("Description")
    public String description;

    @NameInMap("L7Config")
    public String l7ConfigShrink;

    @NameInMap("L7ProxyDomainAutomaticPrefix")
    public String l7ProxyDomainAutomaticPrefix;

    @NameInMap("L7ProxyDomainCustom")
    public String l7ProxyDomainCustom;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>private_access_application_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PortRanges")
    public java.util.List<CreatePrivateAccessApplicationShrinkRequestPortRanges> portRanges;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>All</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("TagIds")
    public java.util.List<String> tagIds;

    public static CreatePrivateAccessApplicationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePrivateAccessApplicationShrinkRequest self = new CreatePrivateAccessApplicationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePrivateAccessApplicationShrinkRequest setAddresses(java.util.List<String> addresses) {
        this.addresses = addresses;
        return this;
    }
    public java.util.List<String> getAddresses() {
        return this.addresses;
    }

    public CreatePrivateAccessApplicationShrinkRequest setBrowserAccessStatus(String browserAccessStatus) {
        this.browserAccessStatus = browserAccessStatus;
        return this;
    }
    public String getBrowserAccessStatus() {
        return this.browserAccessStatus;
    }

    public CreatePrivateAccessApplicationShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePrivateAccessApplicationShrinkRequest setL7ConfigShrink(String l7ConfigShrink) {
        this.l7ConfigShrink = l7ConfigShrink;
        return this;
    }
    public String getL7ConfigShrink() {
        return this.l7ConfigShrink;
    }

    public CreatePrivateAccessApplicationShrinkRequest setL7ProxyDomainAutomaticPrefix(String l7ProxyDomainAutomaticPrefix) {
        this.l7ProxyDomainAutomaticPrefix = l7ProxyDomainAutomaticPrefix;
        return this;
    }
    public String getL7ProxyDomainAutomaticPrefix() {
        return this.l7ProxyDomainAutomaticPrefix;
    }

    public CreatePrivateAccessApplicationShrinkRequest setL7ProxyDomainCustom(String l7ProxyDomainCustom) {
        this.l7ProxyDomainCustom = l7ProxyDomainCustom;
        return this;
    }
    public String getL7ProxyDomainCustom() {
        return this.l7ProxyDomainCustom;
    }

    public CreatePrivateAccessApplicationShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePrivateAccessApplicationShrinkRequest setPortRanges(java.util.List<CreatePrivateAccessApplicationShrinkRequestPortRanges> portRanges) {
        this.portRanges = portRanges;
        return this;
    }
    public java.util.List<CreatePrivateAccessApplicationShrinkRequestPortRanges> getPortRanges() {
        return this.portRanges;
    }

    public CreatePrivateAccessApplicationShrinkRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreatePrivateAccessApplicationShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreatePrivateAccessApplicationShrinkRequest setTagIds(java.util.List<String> tagIds) {
        this.tagIds = tagIds;
        return this;
    }
    public java.util.List<String> getTagIds() {
        return this.tagIds;
    }

    public static class CreatePrivateAccessApplicationShrinkRequestPortRanges extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Begin")
        public Integer begin;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>81</p>
         */
        @NameInMap("End")
        public Integer end;

        public static CreatePrivateAccessApplicationShrinkRequestPortRanges build(java.util.Map<String, ?> map) throws Exception {
            CreatePrivateAccessApplicationShrinkRequestPortRanges self = new CreatePrivateAccessApplicationShrinkRequestPortRanges();
            return TeaModel.build(map, self);
        }

        public CreatePrivateAccessApplicationShrinkRequestPortRanges setBegin(Integer begin) {
            this.begin = begin;
            return this;
        }
        public Integer getBegin() {
            return this.begin;
        }

        public CreatePrivateAccessApplicationShrinkRequestPortRanges setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

    }

}
