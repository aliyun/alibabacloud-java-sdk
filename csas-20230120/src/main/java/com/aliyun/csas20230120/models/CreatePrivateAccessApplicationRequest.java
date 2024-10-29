// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreatePrivateAccessApplicationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Addresses")
    public java.util.List<String> addresses;

    @NameInMap("BrowserAccessStatus")
    public String browserAccessStatus;

    @NameInMap("Description")
    public String description;

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
    public java.util.List<CreatePrivateAccessApplicationRequestPortRanges> portRanges;

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

    public static CreatePrivateAccessApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePrivateAccessApplicationRequest self = new CreatePrivateAccessApplicationRequest();
        return TeaModel.build(map, self);
    }

    public CreatePrivateAccessApplicationRequest setAddresses(java.util.List<String> addresses) {
        this.addresses = addresses;
        return this;
    }
    public java.util.List<String> getAddresses() {
        return this.addresses;
    }

    public CreatePrivateAccessApplicationRequest setBrowserAccessStatus(String browserAccessStatus) {
        this.browserAccessStatus = browserAccessStatus;
        return this;
    }
    public String getBrowserAccessStatus() {
        return this.browserAccessStatus;
    }

    public CreatePrivateAccessApplicationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePrivateAccessApplicationRequest setL7ProxyDomainAutomaticPrefix(String l7ProxyDomainAutomaticPrefix) {
        this.l7ProxyDomainAutomaticPrefix = l7ProxyDomainAutomaticPrefix;
        return this;
    }
    public String getL7ProxyDomainAutomaticPrefix() {
        return this.l7ProxyDomainAutomaticPrefix;
    }

    public CreatePrivateAccessApplicationRequest setL7ProxyDomainCustom(String l7ProxyDomainCustom) {
        this.l7ProxyDomainCustom = l7ProxyDomainCustom;
        return this;
    }
    public String getL7ProxyDomainCustom() {
        return this.l7ProxyDomainCustom;
    }

    public CreatePrivateAccessApplicationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatePrivateAccessApplicationRequest setPortRanges(java.util.List<CreatePrivateAccessApplicationRequestPortRanges> portRanges) {
        this.portRanges = portRanges;
        return this;
    }
    public java.util.List<CreatePrivateAccessApplicationRequestPortRanges> getPortRanges() {
        return this.portRanges;
    }

    public CreatePrivateAccessApplicationRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreatePrivateAccessApplicationRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreatePrivateAccessApplicationRequest setTagIds(java.util.List<String> tagIds) {
        this.tagIds = tagIds;
        return this;
    }
    public java.util.List<String> getTagIds() {
        return this.tagIds;
    }

    public static class CreatePrivateAccessApplicationRequestPortRanges extends TeaModel {
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

        public static CreatePrivateAccessApplicationRequestPortRanges build(java.util.Map<String, ?> map) throws Exception {
            CreatePrivateAccessApplicationRequestPortRanges self = new CreatePrivateAccessApplicationRequestPortRanges();
            return TeaModel.build(map, self);
        }

        public CreatePrivateAccessApplicationRequestPortRanges setBegin(Integer begin) {
            this.begin = begin;
            return this;
        }
        public Integer getBegin() {
            return this.begin;
        }

        public CreatePrivateAccessApplicationRequestPortRanges setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

    }

}
