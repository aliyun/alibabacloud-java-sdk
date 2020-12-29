// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class JoinFabricChannelResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<JoinFabricChannelResponseBodyResult> result;

    public static JoinFabricChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        JoinFabricChannelResponseBody self = new JoinFabricChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public JoinFabricChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public JoinFabricChannelResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public JoinFabricChannelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public JoinFabricChannelResponseBody setResult(java.util.List<JoinFabricChannelResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<JoinFabricChannelResponseBodyResult> getResult() {
        return this.result;
    }

    public static class JoinFabricChannelResponseBodyResult extends TeaModel {
        @NameInMap("WithPeer")
        public Boolean withPeer;

        @NameInMap("AcceptTime")
        public String acceptTime;

        @NameInMap("State")
        public String state;

        @NameInMap("DestroyTime")
        public String destroyTime;

        @NameInMap("InviteTime")
        public String inviteTime;

        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("ConfirmTime")
        public String confirmTime;

        @NameInMap("ApproveTime")
        public String approveTime;

        @NameInMap("OrganizationId")
        public String organizationId;

        public static JoinFabricChannelResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            JoinFabricChannelResponseBodyResult self = new JoinFabricChannelResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public JoinFabricChannelResponseBodyResult setWithPeer(Boolean withPeer) {
            this.withPeer = withPeer;
            return this;
        }
        public Boolean getWithPeer() {
            return this.withPeer;
        }

        public JoinFabricChannelResponseBodyResult setAcceptTime(String acceptTime) {
            this.acceptTime = acceptTime;
            return this;
        }
        public String getAcceptTime() {
            return this.acceptTime;
        }

        public JoinFabricChannelResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public JoinFabricChannelResponseBodyResult setDestroyTime(String destroyTime) {
            this.destroyTime = destroyTime;
            return this;
        }
        public String getDestroyTime() {
            return this.destroyTime;
        }

        public JoinFabricChannelResponseBodyResult setInviteTime(String inviteTime) {
            this.inviteTime = inviteTime;
            return this;
        }
        public String getInviteTime() {
            return this.inviteTime;
        }

        public JoinFabricChannelResponseBodyResult setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public JoinFabricChannelResponseBodyResult setConfirmTime(String confirmTime) {
            this.confirmTime = confirmTime;
            return this;
        }
        public String getConfirmTime() {
            return this.confirmTime;
        }

        public JoinFabricChannelResponseBodyResult setApproveTime(String approveTime) {
            this.approveTime = approveTime;
            return this;
        }
        public String getApproveTime() {
            return this.approveTime;
        }

        public JoinFabricChannelResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
