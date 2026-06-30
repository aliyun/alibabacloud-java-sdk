// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterMulticastDomainRequest extends TeaModel {
    /**
     * <p>The ID of the Cloud Enterprise Network (CEN) instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-a7syd349kne38g****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>Generate a token on your client to make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-4266****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs a dry run. The system checks the required parameters, request format, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): sends a normal request. After the request passes the check, the multicast domain is created.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The multicast domain options.</p>
     */
    @NameInMap("Options")
    public CreateTransitRouterMulticastDomainRequestOptions options;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the transit router is deployed.</p>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to obtain region IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The tag.</p>
     * <p>You can specify up to 20 tags in each call.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateTransitRouterMulticastDomainRequestTag> tag;

    /**
     * <p>The ID of the transit router.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-p0wr9p28r92d598y6****</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    /**
     * <p>The description of the multicast domain.</p>
     * <p>The description can be empty or 1 to 256 characters in length, and cannot start with \<code>http\\://\\</code> or \<code>https\\://\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>desctest</p>
     */
    @NameInMap("TransitRouterMulticastDomainDescription")
    public String transitRouterMulticastDomainDescription;

    /**
     * <p>The name of the multicast domain.</p>
     * <p>The name can be empty or 1 to 128 characters in length, and cannot start with \<code>http\\://\\</code> or \<code>https\\://\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("TransitRouterMulticastDomainName")
    public String transitRouterMulticastDomainName;

    public static CreateTransitRouterMulticastDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterMulticastDomainRequest self = new CreateTransitRouterMulticastDomainRequest();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterMulticastDomainRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public CreateTransitRouterMulticastDomainRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTransitRouterMulticastDomainRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateTransitRouterMulticastDomainRequest setOptions(CreateTransitRouterMulticastDomainRequestOptions options) {
        this.options = options;
        return this;
    }
    public CreateTransitRouterMulticastDomainRequestOptions getOptions() {
        return this.options;
    }

    public CreateTransitRouterMulticastDomainRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateTransitRouterMulticastDomainRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateTransitRouterMulticastDomainRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTransitRouterMulticastDomainRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateTransitRouterMulticastDomainRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateTransitRouterMulticastDomainRequest setTag(java.util.List<CreateTransitRouterMulticastDomainRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateTransitRouterMulticastDomainRequestTag> getTag() {
        return this.tag;
    }

    public CreateTransitRouterMulticastDomainRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public CreateTransitRouterMulticastDomainRequest setTransitRouterMulticastDomainDescription(String transitRouterMulticastDomainDescription) {
        this.transitRouterMulticastDomainDescription = transitRouterMulticastDomainDescription;
        return this;
    }
    public String getTransitRouterMulticastDomainDescription() {
        return this.transitRouterMulticastDomainDescription;
    }

    public CreateTransitRouterMulticastDomainRequest setTransitRouterMulticastDomainName(String transitRouterMulticastDomainName) {
        this.transitRouterMulticastDomainName = transitRouterMulticastDomainName;
        return this;
    }
    public String getTransitRouterMulticastDomainName() {
        return this.transitRouterMulticastDomainName;
    }

    public static class CreateTransitRouterMulticastDomainRequestOptions extends TeaModel {
        /**
         * <p>Specifies whether to enable the Internet Group Management Protocol (IGMP) feature for the multicast domain. After you enable IGMP, hosts can dynamically join or leave multicast groups using IGMP. Valid values:</p>
         * <ul>
         * <li><p><strong>enable</strong>: enables the IGMP feature.</p>
         * </li>
         * <li><p><strong>disable</strong> (default): disables the IGMP feature.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>The IGMP feature is in public preview. To use this feature, contact your account manager to request permissions.</p>
         * </li>
         * <li><p>After the IGMP feature is enabled, you cannot disable it.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("Igmpv2Support")
        public String igmpv2Support;

        /**
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("StrictSourceControl")
        public String strictSourceControl;

        public static CreateTransitRouterMulticastDomainRequestOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateTransitRouterMulticastDomainRequestOptions self = new CreateTransitRouterMulticastDomainRequestOptions();
            return TeaModel.build(map, self);
        }

        public CreateTransitRouterMulticastDomainRequestOptions setIgmpv2Support(String igmpv2Support) {
            this.igmpv2Support = igmpv2Support;
            return this;
        }
        public String getIgmpv2Support() {
            return this.igmpv2Support;
        }

        public CreateTransitRouterMulticastDomainRequestOptions setStrictSourceControl(String strictSourceControl) {
            this.strictSourceControl = strictSourceControl;
            return this;
        }
        public String getStrictSourceControl() {
            return this.strictSourceControl;
        }

    }

    public static class CreateTransitRouterMulticastDomainRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * <p>The tag key cannot be an empty string. The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https:// </code>.</p>
         * <p>You can specify up to 20 tag keys.</p>
         * 
         * <strong>example:</strong>
         * <p>TagKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * <p>The tag value can be an empty string or a string of up to 128 characters. It cannot start with <code>aliyun</code> or <code>acs:</code> and cannot contain <code>http://</code> or <code>https:// </code>.</p>
         * <p>Each tag key must have a unique tag value. You can specify up to 20 tag values.</p>
         * 
         * <strong>example:</strong>
         * <p>TagValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateTransitRouterMulticastDomainRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateTransitRouterMulticastDomainRequestTag self = new CreateTransitRouterMulticastDomainRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateTransitRouterMulticastDomainRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateTransitRouterMulticastDomainRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
