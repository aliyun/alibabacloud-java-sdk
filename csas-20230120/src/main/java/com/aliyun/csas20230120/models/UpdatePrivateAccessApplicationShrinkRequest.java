// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdatePrivateAccessApplicationShrinkRequest extends TeaModel {
    @NameInMap("AddressGroups")
    public java.util.List<AddressGroup> addressGroups;

    /**
     * <p>The addresses of the internal-facing access application. You can specify up to 1000 addresses.</p>
     */
    @NameInMap("Addresses")
    public java.util.List<String> addresses;

    /**
     * <p>The ID of the internal-facing access application. You can obtain the value from the following operations:</p>
     * <ul>
     * <li><a href="~~ListPrivateAccessApplications~~">ListPrivateAccessApplications</a>: lists internal-facing access applications.</li>
     * <li><a href="~~CreatePrivateAccessApplication~~">CreatePrivateAccessApplication</a>: creates an internal-facing access application.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-application-e12860ef6c48****</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("ConfigMode")
    public String configMode;

    /**
     * <p>The description of the internal-facing access application. The description must be 1 to 128 characters in length and can contain Chinese characters, uppercase and lowercase letters, digits, periods (.), underscores (_), hyphens (-), and spaces.</p>
     * 
     * <strong>example:</strong>
     * <p>这是一条内网访问应用</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The browser access mode parameter: the Layer 7 application configuration.</p>
     */
    @NameInMap("L7Config")
    public String l7ConfigShrink;

    /**
     * <p>The browser access mode parameter: the prefix of the mapped proxy domain name. The prefix must be 3 to 20 characters in length and can contain lowercase letters, digits, and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>app1-xxx</p>
     */
    @NameInMap("L7ProxyDomainAutomaticPrefix")
    public String l7ProxyDomainAutomaticPrefix;

    /**
     * <p>The browser access mode parameter: the custom proxy domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>app1.example.com</p>
     */
    @NameInMap("L7ProxyDomainCustom")
    public String l7ProxyDomainCustom;

    /**
     * <p>The browser access mode parameter: the private proxy domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>app1.example.com</p>
     */
    @NameInMap("L7ProxyDomainPrivate")
    @Deprecated
    public String l7ProxyDomainPrivate;

    /**
     * <p>The modification type of the internal-facing access application. Valid values:</p>
     * <ul>
     * <li><strong>Cover</strong> (default): overwrites the original addresses, port ranges, and tag IDs with the values of the <strong>Addresses</strong>, <strong>PortRanges</strong>, and <strong>TagIds</strong> parameters.</li>
     * <li><strong>Append</strong>: adds the values of the <strong>Addresses</strong>, <strong>PortRanges</strong>, and <strong>TagIds</strong> parameters to the original addresses, port ranges, and tag IDs.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Cover</p>
     */
    @NameInMap("ModifyType")
    public String modifyType;

    @NameInMap("Name")
    public String name;

    /**
     * <p>The port ranges of the internal-facing access application. You can specify up to 65535 port ranges. Multiple port ranges cannot be duplicate or overlap.</p>
     */
    @NameInMap("PortRanges")
    public java.util.List<UpdatePrivateAccessApplicationShrinkRequestPortRanges> portRanges;

    /**
     * <p>The protocol of the internal-facing access application. Valid values:</p>
     * <ul>
     * <li><strong>All</strong>: all protocols.</li>
     * <li><strong>TCP</strong></li>
     * <li><strong>UDP</strong></li>
     * </ul>
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
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The IDs of internal-facing access tags. You can associate up to 6 custom internal-facing access tags with each internal-facing access application.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("TagIds")
    public java.util.List<String> tagIds;

    @NameInMap("UnauthorizedAccessConfig")
    public String unauthorizedAccessConfigShrink;

    public static UpdatePrivateAccessApplicationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrivateAccessApplicationShrinkRequest self = new UpdatePrivateAccessApplicationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePrivateAccessApplicationShrinkRequest setAddressGroups(java.util.List<AddressGroup> addressGroups) {
        this.addressGroups = addressGroups;
        return this;
    }
    public java.util.List<AddressGroup> getAddressGroups() {
        return this.addressGroups;
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

    public UpdatePrivateAccessApplicationShrinkRequest setConfigMode(String configMode) {
        this.configMode = configMode;
        return this;
    }
    public String getConfigMode() {
        return this.configMode;
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

    public UpdatePrivateAccessApplicationShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
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

    public UpdatePrivateAccessApplicationShrinkRequest setUnauthorizedAccessConfigShrink(String unauthorizedAccessConfigShrink) {
        this.unauthorizedAccessConfigShrink = unauthorizedAccessConfigShrink;
        return this;
    }
    public String getUnauthorizedAccessConfigShrink() {
        return this.unauthorizedAccessConfigShrink;
    }

    public static class UpdatePrivateAccessApplicationShrinkRequestPortRanges extends TeaModel {
        /**
         * <p>The start port. The value must be less than or equal to the end port.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Begin")
        public Integer begin;

        /**
         * <p>The end port. The value must be greater than or equal to the start port.</p>
         * 
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
