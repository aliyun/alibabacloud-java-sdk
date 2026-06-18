// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListRobotCallDialogRequest extends TeaModel {
    /**
     * <p>Unique call ID. You can invoke the <a href="https://help.aliyun.com/document_detail/2717996.html">RobotCall</a> API and check the <strong>Data</strong> field in the response to obtain it.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12516551<strong><strong>^11195613</strong></strong></p>
     */
    @NameInMap("CallId")
    public String callId;

    /**
     * <p>Creation Time. Format: YYYY-MM-DD hh:mm:ss. The time must be precise. You can invoke the <a href="https://help.aliyun.com/document_detail/2717996.html">RobotCall</a> API and view the <strong>date</strong> parameter in the <strong>Response Header</strong> of the response to obtain this value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-05-20 00:00:00</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ListRobotCallDialogRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRobotCallDialogRequest self = new ListRobotCallDialogRequest();
        return TeaModel.build(map, self);
    }

    public ListRobotCallDialogRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public ListRobotCallDialogRequest setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public ListRobotCallDialogRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListRobotCallDialogRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListRobotCallDialogRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
