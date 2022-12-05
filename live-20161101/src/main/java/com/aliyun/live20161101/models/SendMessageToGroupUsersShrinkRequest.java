// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SendMessageToGroupUsersShrinkRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Data")
    public String data;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("OperatorUserId")
    public String operatorUserId;

    @NameInMap("ReceiverIdList")
    public String receiverIdListShrink;

    @NameInMap("Type")
    public Integer type;

    public static SendMessageToGroupUsersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SendMessageToGroupUsersShrinkRequest self = new SendMessageToGroupUsersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SendMessageToGroupUsersShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SendMessageToGroupUsersShrinkRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SendMessageToGroupUsersShrinkRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SendMessageToGroupUsersShrinkRequest setOperatorUserId(String operatorUserId) {
        this.operatorUserId = operatorUserId;
        return this;
    }
    public String getOperatorUserId() {
        return this.operatorUserId;
    }

    public SendMessageToGroupUsersShrinkRequest setReceiverIdListShrink(String receiverIdListShrink) {
        this.receiverIdListShrink = receiverIdListShrink;
        return this;
    }
    public String getReceiverIdListShrink() {
        return this.receiverIdListShrink;
    }

    public SendMessageToGroupUsersShrinkRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
