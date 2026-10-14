// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreatePrivateAccessApplicationShrinkRequest extends TeaModel {
    /**
     * <p>The application address groups. This parameter is required when ConfigMode is set to Precise, and cannot be specified when ConfigMode is an empty string.</p>
     */
    @NameInMap("AddressGroups")
    public java.util.List<AddressGroup> addressGroups;

    /**
     * <p>The collection of private access application addresses. You can enter up to 1,000 private access application addresses.</p>
     */
    @NameInMap("Addresses")
    public java.util.List<String> addresses;

    /**
     * <p>The browser access status of the private access application. After you enable this feature, you can access private access applications without a client. Default value: <strong>Disabled</strong>. Valid values:</p>
     * <ul>
     * <li><strong>Enabled</strong>: Enabled.</li>
     * <li><strong>Disabled</strong>: Disabled.</li>
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
     * <li>Empty string: Default mode.</li>
     * <li>Precise: Precise mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Precise</p>
     */
    @NameInMap("ConfigMode")
    public String configMode;

    /**
     * <p>The description of the private access application. The description must be 1 to 128 characters in length, and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), hyphens (-), and spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a private access application</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The health check configuration. This parameter is required when HealthCheckMode is set to Continuous, and cannot be specified when HealthCheckMode is set to OnAccess.</p>
     */
    @NameInMap("HealthCheckConfig")
    public String healthCheckConfigShrink;

    /**
     * <p>The health check mode. Valid values:</p>
     * <ul>
     * <li>OnAccess: Checks upon access without proactive probing.</li>
     * <li>Continuous: Performs continuous checks and proactive probing based on the configurations in HealthCheckConfig.
     * If this parameter is not specified, the default value is OnAccess. When the application addresses include wildcard domain names or CIDR blocks, or when the number of application addresses exceeds 10, only OnAccess is supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OnAccess</p>
     */
    @NameInMap("HealthCheckMode")
    public String healthCheckMode;

    /**
     * <p>The application configuration in browser access mode.</p>
     */
    @NameInMap("L7Config")
    public String l7ConfigShrink;

    /**
     * <p>The prefix of the mapped proxy domain name in browser access mode. The prefix must be 3 to 20 characters in length, and can contain lowercase letters, digits, and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>app-sample</p>
     */
    @NameInMap("L7ProxyDomainAutomaticPrefix")
    public String l7ProxyDomainAutomaticPrefix;

    /**
     * <p>The custom proxy domain name in browser access mode. The value must be a valid domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>app1.example.com</p>
     */
    @NameInMap("L7ProxyDomainCustom")
    public String l7ProxyDomainCustom;

    /**
     * <p>The name of the private access application. The name must be 1 to 128 characters in length, and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), and hyphens (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>private_access_application_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The collection of port ranges for the private access application. You can enter up to 65,535 port ranges. Multiple port ranges cannot be duplicate or overlap.</p>
     */
    @NameInMap("PortRanges")
    public java.util.List<CreatePrivateAccessApplicationShrinkRequestPortRanges> portRanges;

    /**
     * <p>The protocol of the private access application. Valid values:</p>
     * <ul>
     * <li><strong>All</strong>: All protocols.</li>
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
     * <p>The status of the private access application. Valid values:</p>
     * <ul>
     * <li><strong>Enabled</strong>: Enabled.</li>
     * <li><strong>Disabled</strong>: Disabled.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The collection of private access tag IDs. You can associate up to six custom private access tags with a single private access application.</p>
     */
    @NameInMap("TagIds")
    public java.util.List<String> tagIds;

    /**
     * <p>The configuration for unauthorized application access requests.</p>
     */
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

    public CreatePrivateAccessApplicationShrinkRequest setHealthCheckConfigShrink(String healthCheckConfigShrink) {
        this.healthCheckConfigShrink = healthCheckConfigShrink;
        return this;
    }
    public String getHealthCheckConfigShrink() {
        return this.healthCheckConfigShrink;
    }

    public CreatePrivateAccessApplicationShrinkRequest setHealthCheckMode(String healthCheckMode) {
        this.healthCheckMode = healthCheckMode;
        return this;
    }
    public String getHealthCheckMode() {
        return this.healthCheckMode;
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
