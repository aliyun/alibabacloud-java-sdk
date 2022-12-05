// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SendMessageToGroupUsersRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Data")
    public String data;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("OperatorUserId")
    public String operatorUserId;

    @NameInMap("ReceiverIdList")
    public java.util.List<String> receiverIdList;

    @NameInMap("Type")
    public Integer type;

    public static SendMessageToGroupUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        SendMessageToGroupUsersRequest self = new SendMessageToGroupUsersRequest();
        return TeaModel.build(map, self);
    }

    public SendMessageToGroupUsersRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SendMessageToGroupUsersRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SendMessageToGroupUsersRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SendMessageToGroupUsersRequest setOperatorUserId(String operatorUserId) {
        this.operatorUserId = operatorUserId;
        return this;
    }
    public String getOperatorUserId() {
        return this.operatorUserId;
    }

    public SendMessageToGroupUsersRequest setReceiverIdList(java.util.List<String> receiverIdList) {
        this.receiverIdList = receiverIdList;
        return this;
    }
    public java.util.List<String> getReceiverIdList() {
        return this.receiverIdList;
    }

    public SendMessageToGroupUsersRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
