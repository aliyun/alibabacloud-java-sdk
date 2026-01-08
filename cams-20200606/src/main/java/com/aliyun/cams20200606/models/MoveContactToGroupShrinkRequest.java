// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class MoveContactToGroupShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ALICOM_OPAAS</p>
     */
    @NameInMap("BizCode")
    public String bizCode;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("BizExtend")
    public String bizExtendShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;id&quot;:1}]</p>
     */
    @NameInMap("Contacts")
    public String contacts;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;id&quot;:1}]</p>
     */
    @NameInMap("LinkExistGroups")
    public String linkExistGroups;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;groupName&quot;:&quot;aaa&quot;}]</p>
     */
    @NameInMap("LinkNewGroups")
    public String linkNewGroups;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static MoveContactToGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveContactToGroupShrinkRequest self = new MoveContactToGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public MoveContactToGroupShrinkRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public MoveContactToGroupShrinkRequest setBizExtendShrink(String bizExtendShrink) {
        this.bizExtendShrink = bizExtendShrink;
        return this;
    }
    public String getBizExtendShrink() {
        return this.bizExtendShrink;
    }

    public MoveContactToGroupShrinkRequest setContacts(String contacts) {
        this.contacts = contacts;
        return this;
    }
    public String getContacts() {
        return this.contacts;
    }

    public MoveContactToGroupShrinkRequest setLinkExistGroups(String linkExistGroups) {
        this.linkExistGroups = linkExistGroups;
        return this;
    }
    public String getLinkExistGroups() {
        return this.linkExistGroups;
    }

    public MoveContactToGroupShrinkRequest setLinkNewGroups(String linkNewGroups) {
        this.linkNewGroups = linkNewGroups;
        return this;
    }
    public String getLinkNewGroups() {
        return this.linkNewGroups;
    }

    public MoveContactToGroupShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public MoveContactToGroupShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public MoveContactToGroupShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
