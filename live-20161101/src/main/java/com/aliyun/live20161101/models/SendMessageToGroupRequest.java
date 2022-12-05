// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SendMessageToGroupRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Data")
    public String data;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("OperatorUserId")
    public String operatorUserId;

    @NameInMap("Type")
    public Integer type;

    public static SendMessageToGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        SendMessageToGroupRequest self = new SendMessageToGroupRequest();
        return TeaModel.build(map, self);
    }

    public SendMessageToGroupRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SendMessageToGroupRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SendMessageToGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SendMessageToGroupRequest setOperatorUserId(String operatorUserId) {
        this.operatorUserId = operatorUserId;
        return this;
    }
    public String getOperatorUserId() {
        return this.operatorUserId;
    }

    public SendMessageToGroupRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
