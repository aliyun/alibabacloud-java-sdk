// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateTransitRouterRouteTableRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>Generate a parameter value from your client to make sure that the value is unique among different requests. The ClientToken can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-001****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. The dry run checks permissions and the status of the instance. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong> (default): Sends a normal request. After the request passes the check, the name and description of the route table are modified.</p>
     * </li>
     * <li><p><strong>true</strong>: Sends a check request. The system checks the required parameters and the request format. If the check fails, the corresponding error is returned. If the check succeeds, the error code <code>DryRunOperation</code> is returned.</p>
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
    public UpdateTransitRouterRouteTableRequestRouteTableOptions routeTableOptions;

    /**
     * <p>The description of the route table.</p>
     * <p>The description can be empty or 1 to 256 characters in length. It cannot start with http\:// or https\://.</p>
     * 
     * <strong>example:</strong>
     * <p>testdesc</p>
     */
    @NameInMap("TransitRouterRouteTableDescription")
    public String transitRouterRouteTableDescription;

    /**
     * <p>The ID of the route table for the Enterprise Edition transit router.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vtb-bp1dudbh2d5na6b50****</p>
     */
    @NameInMap("TransitRouterRouteTableId")
    public String transitRouterRouteTableId;

    /**
     * <p>The name of the route table.</p>
     * <p>The name can be empty or 1 to 128 characters in length. It cannot start with http\:// or https\://.</p>
     * 
     * <strong>example:</strong>
     * <p>testname</p>
     */
    @NameInMap("TransitRouterRouteTableName")
    public String transitRouterRouteTableName;

    public static UpdateTransitRouterRouteTableRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTransitRouterRouteTableRequest self = new UpdateTransitRouterRouteTableRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTransitRouterRouteTableRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateTransitRouterRouteTableRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateTransitRouterRouteTableRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateTransitRouterRouteTableRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateTransitRouterRouteTableRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateTransitRouterRouteTableRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateTransitRouterRouteTableRequest setRouteTableOptions(UpdateTransitRouterRouteTableRequestRouteTableOptions routeTableOptions) {
        this.routeTableOptions = routeTableOptions;
        return this;
    }
    public UpdateTransitRouterRouteTableRequestRouteTableOptions getRouteTableOptions() {
        return this.routeTableOptions;
    }

    public UpdateTransitRouterRouteTableRequest setTransitRouterRouteTableDescription(String transitRouterRouteTableDescription) {
        this.transitRouterRouteTableDescription = transitRouterRouteTableDescription;
        return this;
    }
    public String getTransitRouterRouteTableDescription() {
        return this.transitRouterRouteTableDescription;
    }

    public UpdateTransitRouterRouteTableRequest setTransitRouterRouteTableId(String transitRouterRouteTableId) {
        this.transitRouterRouteTableId = transitRouterRouteTableId;
        return this;
    }
    public String getTransitRouterRouteTableId() {
        return this.transitRouterRouteTableId;
    }

    public UpdateTransitRouterRouteTableRequest setTransitRouterRouteTableName(String transitRouterRouteTableName) {
        this.transitRouterRouteTableName = transitRouterRouteTableName;
        return this;
    }
    public String getTransitRouterRouteTableName() {
        return this.transitRouterRouteTableName;
    }

    public static class UpdateTransitRouterRouteTableRequestRouteTableOptions extends TeaModel {
        /**
         * <p>The multi-region ECMP routing feature. Valid values:</p>
         * <ul>
         * <li><p><strong>disable</strong>: Disables multi-region ECMP routing. After you disable this feature, if routes with the same prefix are learned from different regions and have the same attributes, the route that is learned from the region with the alphabetically smallest ID is used as the next hop. This may change traffic latency and inter-region bandwidth consumption. Evaluate the impact before you disable this feature.</p>
         * </li>
         * <li><p><strong>enable</strong>: Enables multi-region ECMP routing. After you enable this feature, if routes with the same prefix are learned from different regions and have the same attributes, ECMP routes are formed. This may change traffic latency and inter-region bandwidth consumption. Evaluate the impact before you enable this feature.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>disable</p>
         */
        @NameInMap("MultiRegionECMP")
        public String multiRegionECMP;

        public static UpdateTransitRouterRouteTableRequestRouteTableOptions build(java.util.Map<String, ?> map) throws Exception {
            UpdateTransitRouterRouteTableRequestRouteTableOptions self = new UpdateTransitRouterRouteTableRequestRouteTableOptions();
            return TeaModel.build(map, self);
        }

        public UpdateTransitRouterRouteTableRequestRouteTableOptions setMultiRegionECMP(String multiRegionECMP) {
            this.multiRegionECMP = multiRegionECMP;
            return this;
        }
        public String getMultiRegionECMP() {
            return this.multiRegionECMP;
        }

    }

}
