// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceAttachmentAttributesRequest extends TeaModel {
    @NameInMap("PrivatePoolOptions")
    public ModifyInstanceAttachmentAttributesRequestPrivatePoolOptions privatePoolOptions;

    /**
     * <p>The instance ID of the instance for which you want to modify the private pool matching property.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-bp67acfmxazb4****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the private pool. You can call <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> to query the most recent region list.</p>
     * <p>This parameter is required.</p>
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

    public static ModifyInstanceAttachmentAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAttachmentAttributesRequest self = new ModifyInstanceAttachmentAttributesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAttachmentAttributesRequest setPrivatePoolOptions(ModifyInstanceAttachmentAttributesRequestPrivatePoolOptions privatePoolOptions) {
        this.privatePoolOptions = privatePoolOptions;
        return this;
    }
    public ModifyInstanceAttachmentAttributesRequestPrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    public ModifyInstanceAttachmentAttributesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceAttachmentAttributesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyInstanceAttachmentAttributesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyInstanceAttachmentAttributesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyInstanceAttachmentAttributesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyInstanceAttachmentAttributesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class ModifyInstanceAttachmentAttributesRequestPrivatePoolOptions extends TeaModel {
        /**
         * <p>The private pool ID, which is the elasticity assurance ID or capacity reservation ID.</p>
         * <ul>
         * <li>This parameter is required when PrivatePoolOptions.MatchCriteria is set to <code>Target</code>.</li>
         * <li>Leave this parameter empty when PrivatePoolOptions.MatchCriteria is set to <code>Open</code> or <code>None</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>eap-bp67acfmxazb4****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The private pool matching mode of the instance. Valid values:</p>
         * <ul>
         * <li>Open: open mode. The system automatically matches the instance with an open private pool. If no matching private pool capacity is available, public pool resources are used to launch the instance.</li>
         * <li>Target: targeted mode. The instance is launched by using the capacity of the specified private pool. If the specified private pool capacity is unavailable, the instance fails to be launched. If you set this parameter to Target, you must also specify the PrivatePoolOptions.Id parameter to specify the private pool ID.</li>
         * <li>None: none. The instance is launched normally without using a private pool.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Open</p>
         */
        @NameInMap("MatchCriteria")
        public String matchCriteria;

        public static ModifyInstanceAttachmentAttributesRequestPrivatePoolOptions build(java.util.Map<String, ?> map) throws Exception {
            ModifyInstanceAttachmentAttributesRequestPrivatePoolOptions self = new ModifyInstanceAttachmentAttributesRequestPrivatePoolOptions();
            return TeaModel.build(map, self);
        }

        public ModifyInstanceAttachmentAttributesRequestPrivatePoolOptions setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ModifyInstanceAttachmentAttributesRequestPrivatePoolOptions setMatchCriteria(String matchCriteria) {
            this.matchCriteria = matchCriteria;
            return this;
        }
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

    }

}
