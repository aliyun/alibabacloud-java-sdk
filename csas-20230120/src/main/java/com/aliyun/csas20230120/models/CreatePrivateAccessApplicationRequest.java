// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreatePrivateAccessApplicationRequest extends TeaModel {
    /**
     * <p>The application address groups. Required when ConfigMode is set to Precise. Not allowed when ConfigMode is an empty string.</p>
     */
    @NameInMap("AddressGroups")
    public java.util.List<AddressGroup> addressGroups;

    /**
     * <p>The collection of internal-facing access application addresses. You can specify up to 1000 addresses.</p>
     */
    @NameInMap("Addresses")
    public java.util.List<String> addresses;

    /**
     * <p>The browser access status of the internal-facing access application. After this feature is enabled, you can access internal applications in a clientless manner. Default value: <strong>Disabled</strong>. Valid values:</p>
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

    /**
     * <p>The configuration mode. Valid values:</p>
     * <ul>
     * <li>Empty string: default mode.</li>
     * <li>Precise: precise mode.</li>
     * </ul>
     */
    @NameInMap("ConfigMode")
    public String configMode;

    /**
     * <p>The description of the internal-facing access application. The description must be 1 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), hyphens (-), and spaces. Chinese characters are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>This is an internal-facing access application</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The browser access mode parameter: the application configuration.</p>
     */
    @NameInMap("L7Config")
    public PAL7Config l7Config;

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
     * <p>The collection of port ranges for the internal-facing access application. You can specify up to 65535 port ranges. Port ranges cannot overlap or be duplicated.</p>
     */
    @NameInMap("PortRanges")
    public java.util.List<CreatePrivateAccessApplicationRequestPortRanges> portRanges;

    /**
     * <p>The protocol of the internal-facing access application. Valid values:</p>
     * <ul>
     * <li><strong>All</strong>: all protocols.</li>
     * <li><strong>TCP</strong></li>
     * <li><strong>UDP</strong></li>
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
     * <p>The collection of internal-facing access tag IDs. You can associate up to 6 custom-type internal-facing access tags with each application.</p>
     */
    @NameInMap("TagIds")
    public java.util.List<String> tagIds;

    @NameInMap("UnauthorizedAccessConfig")
    public PAApplicationUnauthorizedAccessConfig unauthorizedAccessConfig;

    public static CreatePrivateAccessApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePrivateAccessApplicationRequest self = new CreatePrivateAccessApplicationRequest();
        return TeaModel.build(map, self);
    }

    public CreatePrivateAccessApplicationRequest setAddressGroups(java.util.List<AddressGroup> addressGroups) {
        this.addressGroups = addressGroups;
        return this;
    }
    public java.util.List<AddressGroup> getAddressGroups() {
        return this.addressGroups;
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

    public CreatePrivateAccessApplicationRequest setConfigMode(String configMode) {
        this.configMode = configMode;
        return this;
    }
    public String getConfigMode() {
        return this.configMode;
    }

    public CreatePrivateAccessApplicationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreatePrivateAccessApplicationRequest setL7Config(PAL7Config l7Config) {
        this.l7Config = l7Config;
        return this;
    }
    public PAL7Config getL7Config() {
        return this.l7Config;
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

    public CreatePrivateAccessApplicationRequest setUnauthorizedAccessConfig(PAApplicationUnauthorizedAccessConfig unauthorizedAccessConfig) {
        this.unauthorizedAccessConfig = unauthorizedAccessConfig;
        return this;
    }
    public PAApplicationUnauthorizedAccessConfig getUnauthorizedAccessConfig() {
        return this.unauthorizedAccessConfig;
    }

    public static class CreatePrivateAccessApplicationRequestPortRanges extends TeaModel {
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
