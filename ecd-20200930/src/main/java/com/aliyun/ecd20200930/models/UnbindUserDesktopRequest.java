// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class UnbindUserDesktopRequest extends TeaModel {
    @NameInMap("DesktopAgentIds")
    public java.util.List<String> desktopAgentIds;

    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    @NameInMap("DesktopIds")
    public java.util.List<String> desktopIds;

    @NameInMap("Force")
    public Boolean force;

    @NameInMap("Reason")
    public String reason;

    @NameInMap("UserDesktopIds")
    public java.util.List<String> userDesktopIds;

    public static UnbindUserDesktopRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindUserDesktopRequest self = new UnbindUserDesktopRequest();
        return TeaModel.build(map, self);
    }

    public UnbindUserDesktopRequest setDesktopAgentIds(java.util.List<String> desktopAgentIds) {
        this.desktopAgentIds = desktopAgentIds;
        return this;
    }
    public java.util.List<String> getDesktopAgentIds() {
        return this.desktopAgentIds;
    }

    public UnbindUserDesktopRequest setDesktopGroupId(String desktopGroupId) {
        this.desktopGroupId = desktopGroupId;
        return this;
    }
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    public UnbindUserDesktopRequest setDesktopIds(java.util.List<String> desktopIds) {
        this.desktopIds = desktopIds;
        return this;
    }
    public java.util.List<String> getDesktopIds() {
        return this.desktopIds;
    }

    public UnbindUserDesktopRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public UnbindUserDesktopRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public UnbindUserDesktopRequest setUserDesktopIds(java.util.List<String> userDesktopIds) {
        this.userDesktopIds = userDesktopIds;
        return this;
    }
    public java.util.List<String> getUserDesktopIds() {
        return this.userDesktopIds;
    }

}
