// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SendLikeRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("BroadCastType")
    public Integer broadCastType;

    @NameInMap("Count")
    public String count;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("OperatorUserId")
    public String operatorUserId;

    public static SendLikeRequest build(java.util.Map<String, ?> map) throws Exception {
        SendLikeRequest self = new SendLikeRequest();
        return TeaModel.build(map, self);
    }

    public SendLikeRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SendLikeRequest setBroadCastType(Integer broadCastType) {
        this.broadCastType = broadCastType;
        return this;
    }
    public Integer getBroadCastType() {
        return this.broadCastType;
    }

    public SendLikeRequest setCount(String count) {
        this.count = count;
        return this;
    }
    public String getCount() {
        return this.count;
    }

    public SendLikeRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SendLikeRequest setOperatorUserId(String operatorUserId) {
        this.operatorUserId = operatorUserId;
        return this;
    }
    public String getOperatorUserId() {
        return this.operatorUserId;
    }

}
