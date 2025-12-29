// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ListServiceInstanceForPageShrinkRequest extends TeaModel {
    /**
     * <p>服务实例号</p>
     * 
     * <strong>example:</strong>
     * <p>0571****1234</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Pager")
    public String pagerShrink;

    /**
     * <p>关联实体号码</p>
     * 
     * <strong>example:</strong>
     * <p>131****1111</p>
     */
    @NameInMap("RelationNumber")
    public String relationNumber;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>场景ID</p>
     * 
     * <strong>example:</strong>
     * <p>56</p>
     */
    @NameInMap("SceneId")
    public Long sceneId;

    /**
     * <p>用途ID</p>
     * 
     * <strong>example:</strong>
     * <p>89</p>
     */
    @NameInMap("UsageId")
    public Long usageId;

    public static ListServiceInstanceForPageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListServiceInstanceForPageShrinkRequest self = new ListServiceInstanceForPageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListServiceInstanceForPageShrinkRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListServiceInstanceForPageShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListServiceInstanceForPageShrinkRequest setPagerShrink(String pagerShrink) {
        this.pagerShrink = pagerShrink;
        return this;
    }
    public String getPagerShrink() {
        return this.pagerShrink;
    }

    public ListServiceInstanceForPageShrinkRequest setRelationNumber(String relationNumber) {
        this.relationNumber = relationNumber;
        return this;
    }
    public String getRelationNumber() {
        return this.relationNumber;
    }

    public ListServiceInstanceForPageShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListServiceInstanceForPageShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListServiceInstanceForPageShrinkRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

    public ListServiceInstanceForPageShrinkRequest setUsageId(Long usageId) {
        this.usageId = usageId;
        return this;
    }
    public Long getUsageId() {
        return this.usageId;
    }

}
