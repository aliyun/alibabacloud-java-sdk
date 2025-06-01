// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdatePrivateAccessApplicationRequest extends TeaModel {
    /**
     * <p>The addresses of the office applications. You can enter up to 1,000 addresses of office applications.</p>
     */
    @NameInMap("Addresses")
    public java.util.List<String> addresses;

    /**
     * <p>The ID of the office application. You can obtain the value by calling the following operations:</p>
     * <ul>
     * <li><a href="~~ListPrivateAccessApplications~~">ListPrivateAccessApplications</a>: queries office applications.</li>
     * <li><a href="~~CreatePrivateAccessApplication~~">CreatePrivateAccessApplication</a>: creates an office application.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-application-e12860ef6c48****</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The description of the office application. The value must be 1 to 128 characters in length and can contain letters, digits, periods (.), underscores (_), hyphens (-), and spaces.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The browser access mode parameter. The parameter specifies the configurations of Layer 7 applications.</p>
     */
    @NameInMap("L7Config")
    public PAL7Config l7Config;

    /**
     * <p>The browser access mode parameter. The parameter specifies the prefix of the domain name that the proxy gateway uses. The prefix must be 3 to 20 characters in length, and can contain lowercase letters, digits, and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>app1-xxx</p>
     */
    @NameInMap("L7ProxyDomainAutomaticPrefix")
    public String l7ProxyDomainAutomaticPrefix;

    /**
     * <p>The browser access mode parameter. The parameter specifies the custom domain name of the proxy gateway.</p>
     * 
     * <strong>example:</strong>
     * <p>app1.example.com</p>
     */
    @NameInMap("L7ProxyDomainCustom")
    public String l7ProxyDomainCustom;

    /**
     * <p>浏览器访问模式参数：私有代理域名。</p>
     * 
     * <strong>example:</strong>
     * <p>app1.example.com</p>
     */
    @NameInMap("L7ProxyDomainPrivate")
    @Deprecated
    public String l7ProxyDomainPrivate;

    /**
     * <p>The modification type of the office application. Valid values:</p>
     * <ul>
     * <li><strong>Cover</strong>: uses the values of the <strong>Addresses</strong>, <strong>PortRanges</strong>, and <strong>TagIds</strong> parameters to overwrite the original addresses, port ranges, and tag IDs. This is the default value.</li>
     * <li><strong>Append</strong>: adds the values of the <strong>Addresses</strong>, <strong>PortRanges</strong>, and <strong>TagIds</strong> parameters respectively to the original addresses, port ranges, and tag IDs.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Cover</p>
     */
    @NameInMap("ModifyType")
    public String modifyType;

    /**
     * <p>The port ranges of the office applications. You can enter up to 65,535 port ranges. Multiple port ranges cannot be duplicated or overlapped.</p>
     */
    @NameInMap("PortRanges")
    public java.util.List<UpdatePrivateAccessApplicationRequestPortRanges> portRanges;

    /**
     * <p>The protocol that is used by the office application. Valid values:</p>
     * <ul>
     * <li><strong>All</strong></li>
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
     * <p>The status of the office application. Valid values:</p>
     * <ul>
     * <li><strong>Enabled</strong></li>
     * <li><strong>Disabled</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Enabled</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The IDs of the tags for the office applications. You can add up to six custom tags to an office application.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("TagIds")
    public java.util.List<String> tagIds;

    public static UpdatePrivateAccessApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrivateAccessApplicationRequest self = new UpdatePrivateAccessApplicationRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePrivateAccessApplicationRequest setAddresses(java.util.List<String> addresses) {
        this.addresses = addresses;
        return this;
    }
    public java.util.List<String> getAddresses() {
        return this.addresses;
    }

    public UpdatePrivateAccessApplicationRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public UpdatePrivateAccessApplicationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdatePrivateAccessApplicationRequest setL7Config(PAL7Config l7Config) {
        this.l7Config = l7Config;
        return this;
    }
    public PAL7Config getL7Config() {
        return this.l7Config;
    }

    public UpdatePrivateAccessApplicationRequest setL7ProxyDomainAutomaticPrefix(String l7ProxyDomainAutomaticPrefix) {
        this.l7ProxyDomainAutomaticPrefix = l7ProxyDomainAutomaticPrefix;
        return this;
    }
    public String getL7ProxyDomainAutomaticPrefix() {
        return this.l7ProxyDomainAutomaticPrefix;
    }

    public UpdatePrivateAccessApplicationRequest setL7ProxyDomainCustom(String l7ProxyDomainCustom) {
        this.l7ProxyDomainCustom = l7ProxyDomainCustom;
        return this;
    }
    public String getL7ProxyDomainCustom() {
        return this.l7ProxyDomainCustom;
    }

    @Deprecated
    public UpdatePrivateAccessApplicationRequest setL7ProxyDomainPrivate(String l7ProxyDomainPrivate) {
        this.l7ProxyDomainPrivate = l7ProxyDomainPrivate;
        return this;
    }
    public String getL7ProxyDomainPrivate() {
        return this.l7ProxyDomainPrivate;
    }

    public UpdatePrivateAccessApplicationRequest setModifyType(String modifyType) {
        this.modifyType = modifyType;
        return this;
    }
    public String getModifyType() {
        return this.modifyType;
    }

    public UpdatePrivateAccessApplicationRequest setPortRanges(java.util.List<UpdatePrivateAccessApplicationRequestPortRanges> portRanges) {
        this.portRanges = portRanges;
        return this;
    }
    public java.util.List<UpdatePrivateAccessApplicationRequestPortRanges> getPortRanges() {
        return this.portRanges;
    }

    public UpdatePrivateAccessApplicationRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public UpdatePrivateAccessApplicationRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdatePrivateAccessApplicationRequest setTagIds(java.util.List<String> tagIds) {
        this.tagIds = tagIds;
        return this;
    }
    public java.util.List<String> getTagIds() {
        return this.tagIds;
    }

    public static class UpdatePrivateAccessApplicationRequestPortRanges extends TeaModel {
        /**
         * <p>The start port. The start port must be less than or equal to the end port.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Begin")
        public Integer begin;

        /**
         * <p>The end port. The end port must be greater than or equal to the start port.</p>
         * 
         * <strong>example:</strong>
         * <p>81</p>
         */
        @NameInMap("End")
        public Integer end;

        public static UpdatePrivateAccessApplicationRequestPortRanges build(java.util.Map<String, ?> map) throws Exception {
            UpdatePrivateAccessApplicationRequestPortRanges self = new UpdatePrivateAccessApplicationRequestPortRanges();
            return TeaModel.build(map, self);
        }

        public UpdatePrivateAccessApplicationRequestPortRanges setBegin(Integer begin) {
            this.begin = begin;
            return this;
        }
        public Integer getBegin() {
            return this.begin;
        }

        public UpdatePrivateAccessApplicationRequestPortRanges setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

    }

}
