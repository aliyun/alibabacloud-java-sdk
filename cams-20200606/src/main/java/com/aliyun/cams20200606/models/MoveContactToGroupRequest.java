// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class MoveContactToGroupRequest extends TeaModel {
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
    public java.util.Map<String, ?> bizExtend;

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

    public static MoveContactToGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveContactToGroupRequest self = new MoveContactToGroupRequest();
        return TeaModel.build(map, self);
    }

    public MoveContactToGroupRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public MoveContactToGroupRequest setBizExtend(java.util.Map<String, ?> bizExtend) {
        this.bizExtend = bizExtend;
        return this;
    }
    public java.util.Map<String, ?> getBizExtend() {
        return this.bizExtend;
    }

    public MoveContactToGroupRequest setContacts(String contacts) {
        this.contacts = contacts;
        return this;
    }
    public String getContacts() {
        return this.contacts;
    }

    public MoveContactToGroupRequest setLinkExistGroups(String linkExistGroups) {
        this.linkExistGroups = linkExistGroups;
        return this;
    }
    public String getLinkExistGroups() {
        return this.linkExistGroups;
    }

    public MoveContactToGroupRequest setLinkNewGroups(String linkNewGroups) {
        this.linkNewGroups = linkNewGroups;
        return this;
    }
    public String getLinkNewGroups() {
        return this.linkNewGroups;
    }

    public MoveContactToGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public MoveContactToGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public MoveContactToGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
