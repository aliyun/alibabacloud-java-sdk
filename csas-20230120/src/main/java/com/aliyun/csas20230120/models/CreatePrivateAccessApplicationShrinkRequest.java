// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreatePrivateAccessApplicationShrinkRequest extends TeaModel {
    @NameInMap("AddressGroups")
    public java.util.List<AddressGroup> addressGroups;

    /**
     * <p>The addresses of the internal-facing access application. You can specify up to 1,000 addresses.</p>
     */
    @NameInMap("Addresses")
    public java.util.List<String> addresses;

    /**
     * <p>The browser access status of the internal-facing access application. After this feature is enabled, you can access internal applications without a client. Default value: <strong>Disabled</strong>. Valid values:</p>
     * <ul>
     * <li><strong>Enabled</strong>: enabled.</li>
     * <li><strong>Disabled</strong>: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Disabled</p>
     */
    @NameInMap("BrowserAccessStatus")
    public String browserAccessStatus;

    @NameInMap("ConfigMode")
    public String configMode;

    /**
     * <p>The description of the internal-facing access application. The description must be 1 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), hyphens (-), and spaces. Chinese characters are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>这是一条内网访问应用</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The browser access mode parameter: the application configuration.</p>
     */
    @NameInMap("L7Config")
    public String l7ConfigShrink;

    /**
     * <p>The browser access mode parameter: the prefix of the mapped proxy domain name. The prefix must be 3 to 20 characters in length and can contain lowercase letters, digits, and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>app-sample</p>
     */
    @NameInMap("L7ProxyDomainAutomaticPrefix")
    public String l7ProxyDomainAutomaticPrefix;

    /**
     * <p>The browser access mode parameter: the custom proxy domain name. The value must be a valid domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>app1.example.com</p>
     */
    @NameInMap("L7ProxyDomainCustom")
    public String l7ProxyDomainCustom;

    /**
     * <p>The name of the internal-facing access application. The name must be 1 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). Chinese characters are supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>private_access_application_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The port ranges of the internal-facing access application. You can specify up to 65,535 port ranges. Port ranges cannot be duplicate or overlapping.</p>
     */
    @NameInMap("PortRanges")
    public java.util.List<CreatePrivateAccessApplicationShrinkRequestPortRanges> portRanges;

    /**
     * <p>The protocol of the internal-facing access application. Valid values:</p>
     * <ul>
     * <li><strong>All</strong>: all protocols.</li>
     * <li><strong>TCP</strong></li>
     * <li><strong>UDP</strong>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>All</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The status of the internal-facing access application. Valid values:</p>
     * <ul>
     * <li><strong>Enabled</strong>: enabled.</li>
     * <li><strong>Disabled</strong>: disabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The IDs of internal-facing access tags. You can associate up to 6 custom internal-facing access tags with each internal-facing access application.</p>
     */
    @NameInMap("TagIds")
    public java.util.List<String> tagIds;

    @NameInMap("UnauthorizedAccessConfig")
    public String unauthorizedAccessConfigShrink;

    public static CreatePrivateAccessApplicationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePrivateAccessApplicationShrinkRequest self = new CreatePrivateAccessApplicationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreatePrivateAccessApplicationShrinkRequest setAddressGroups(java.util.List<AddressGroup> addressGroups) {
        this.addressGroups = addressGroups;
        return this;
    }
    public java.util.List<AddressGroup> getAddressGroups() {
        return this.addressGroups;
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

    public CreatePrivateAccessApplicationShrinkRequest setConfigMode(String configMode) {
        this.configMode = configMode;
        return this;
    }
    public String getConfigMode() {
        return this.configMode;
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

    public CreatePrivateAccessApplicationShrinkRequest setUnauthorizedAccessConfigShrink(String unauthorizedAccessConfigShrink) {
        this.unauthorizedAccessConfigShrink = unauthorizedAccessConfigShrink;
        return this;
    }
    public String getUnauthorizedAccessConfigShrink() {
        return this.unauthorizedAccessConfigShrink;
    }

    public static class CreatePrivateAccessApplicationShrinkRequestPortRanges extends TeaModel {
        /**
         * <p>The start port. The value must be less than or equal to the end port.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Begin")
        public Integer begin;

        /**
         * <p>The end port. The value must be greater than or equal to the start port.</p>
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
