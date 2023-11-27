// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class RequestParamsUserConversationsValue extends TeaModel {
    @NameInMap("Top")
    public Boolean top;

    @NameInMap("RedPoint")
    public Long redPoint;

    @NameInMap("Mute")
    public Boolean mute;

    @NameInMap("Visible")
    public Boolean visible;

    @NameInMap("CreateTime")
    public Long createTime;

    @NameInMap("ModifyTime")
    public Long modifyTime;

    @NameInMap("UserExtensions")
    public java.util.Map<String, String> userExtensions;

    public static RequestParamsUserConversationsValue build(java.util.Map<String, ?> map) throws Exception {
        RequestParamsUserConversationsValue self = new RequestParamsUserConversationsValue();
        return TeaModel.build(map, self);
    }

    public RequestParamsUserConversationsValue setTop(Boolean top) {
        this.top = top;
        return this;
    }
    public Boolean getTop() {
        return this.top;
    }

    public RequestParamsUserConversationsValue setRedPoint(Long redPoint) {
        this.redPoint = redPoint;
        return this;
    }
    public Long getRedPoint() {
        return this.redPoint;
    }

    public RequestParamsUserConversationsValue setMute(Boolean mute) {
        this.mute = mute;
        return this;
    }
    public Boolean getMute() {
        return this.mute;
    }

    public RequestParamsUserConversationsValue setVisible(Boolean visible) {
        this.visible = visible;
        return this;
    }
    public Boolean getVisible() {
        return this.visible;
    }

    public RequestParamsUserConversationsValue setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public RequestParamsUserConversationsValue setModifyTime(Long modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public Long getModifyTime() {
        return this.modifyTime;
    }

    public RequestParamsUserConversationsValue setUserExtensions(java.util.Map<String, String> userExtensions) {
        this.userExtensions = userExtensions;
        return this;
    }
    public java.util.Map<String, String> getUserExtensions() {
        return this.userExtensions;
    }

}
