// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterRouteTableRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>Generate a token from your client to ensure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each request is different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs a dry run. The system checks the request for potential issues, including required parameters, request format, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): performs a dry run and sends the request. If the request passes the dry run, a custom route table is created.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The features of the route table.</p>
     */
    @NameInMap("RouteTableOptions")
    public CreateTransitRouterRouteTableRequestRouteTableOptions routeTableOptions;

    /**
     * <p>The tag.</p>
     * <p>You can specify up to 20 tags in each call.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateTransitRouterRouteTableRequestTag> tag;

    /**
     * <p>The ID of the Enterprise Edition transit router instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-bp1su1ytdxtataupl****</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    /**
     * <p>The description of the custom route table.</p>
     * <p>The description can be empty or 1 to 256 characters in length. It cannot start with \<code>http\\://\\</code> or \<code>https\\://\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>testdesc</p>
     */
    @NameInMap("TransitRouterRouteTableDescription")
    public String transitRouterRouteTableDescription;

    /**
     * <p>The name of the custom route table.</p>
     * <p>The name can be empty or 1 to 128 characters in length. It cannot start with \<code>http\\://\\</code> or \<code>https\\://\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>testname</p>
     */
    @NameInMap("TransitRouterRouteTableName")
    public String transitRouterRouteTableName;

    public static CreateTransitRouterRouteTableRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterRouteTableRequest self = new CreateTransitRouterRouteTableRequest();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterRouteTableRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateTransitRouterRouteTableRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateTransitRouterRouteTableRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateTransitRouterRouteTableRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateTransitRouterRouteTableRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateTransitRouterRouteTableRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateTransitRouterRouteTableRequest setRouteTableOptions(CreateTransitRouterRouteTableRequestRouteTableOptions routeTableOptions) {
        this.routeTableOptions = routeTableOptions;
        return this;
    }
    public CreateTransitRouterRouteTableRequestRouteTableOptions getRouteTableOptions() {
        return this.routeTableOptions;
    }

    public CreateTransitRouterRouteTableRequest setTag(java.util.List<CreateTransitRouterRouteTableRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateTransitRouterRouteTableRequestTag> getTag() {
        return this.tag;
    }

    public CreateTransitRouterRouteTableRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public CreateTransitRouterRouteTableRequest setTransitRouterRouteTableDescription(String transitRouterRouteTableDescription) {
        this.transitRouterRouteTableDescription = transitRouterRouteTableDescription;
        return this;
    }
    public String getTransitRouterRouteTableDescription() {
        return this.transitRouterRouteTableDescription;
    }

    public CreateTransitRouterRouteTableRequest setTransitRouterRouteTableName(String transitRouterRouteTableName) {
        this.transitRouterRouteTableName = transitRouterRouteTableName;
        return this;
    }
    public String getTransitRouterRouteTableName() {
        return this.transitRouterRouteTableName;
    }

    public static class CreateTransitRouterRouteTableRequestRouteTableOptions extends TeaModel {
        /**
         * <p>The multi-region equal-cost multi-path (ECMP) routing feature. Valid values:</p>
         * <ul>
         * <li><p><strong>disable</strong> (default): disables the multi-region ECMP routing feature. If you disable the multi-region ECMP routing feature, routes that are learned from different regions but have the same prefix and attributes select the transit router with the smallest region ID as the next hop. The region ID is sorted in alphabetical order. In this case, the latency and bandwidth consumption of the traffic may change. Make sure that you are aware of the impact before you disable the feature.</p>
         * </li>
         * <li><p><strong>enable</strong>: enables the multi-region ECMP routing feature. If you enable the multi-region ECMP routing feature, routes that are learned from different regions but have the same prefix and attributes are considered ECMP routes. In this case, the latency and bandwidth consumption of the traffic may change. Make sure that you are aware of the impact before you enable the feature.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>disable</p>
         */
        @NameInMap("MultiRegionECMP")
        public String multiRegionECMP;

        public static CreateTransitRouterRouteTableRequestRouteTableOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateTransitRouterRouteTableRequestRouteTableOptions self = new CreateTransitRouterRouteTableRequestRouteTableOptions();
            return TeaModel.build(map, self);
        }

        public CreateTransitRouterRouteTableRequestRouteTableOptions setMultiRegionECMP(String multiRegionECMP) {
            this.multiRegionECMP = multiRegionECMP;
            return this;
        }
        public String getMultiRegionECMP() {
            return this.multiRegionECMP;
        }

    }

    public static class CreateTransitRouterRouteTableRequestTag extends TeaModel {
        /**
         * <p>The tag key of the resource.</p>
         * <p>The tag key cannot be an empty string. The tag key can be up to 64 characters in length and cannot start with \<code>aliyun\\</code> or \<code>acs:\\</code>. It cannot contain \<code>http\\://\\</code> or \<code>https\\://\\</code>.</p>
         * <p>You can specify up to 20 tag keys.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the resource.</p>
         * <p>The tag value can be an empty string or a string of up to 128 characters. It cannot start with \<code>aliyun\\</code> or \<code>acs:\\</code> and cannot contain \<code>http\\://\\</code> or \<code>https\\://\\</code>.</p>
         * <p>Each tag key must have a unique tag value. You can specify up to 20 tag values.</p>
         * 
         * <strong>example:</strong>
         * <p>tagtest</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateTransitRouterRouteTableRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateTransitRouterRouteTableRequestTag self = new CreateTransitRouterRouteTableRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateTransitRouterRouteTableRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateTransitRouterRouteTableRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
