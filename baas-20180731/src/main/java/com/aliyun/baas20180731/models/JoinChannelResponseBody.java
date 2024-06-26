// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class JoinChannelResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("ErrorCode")
    public Integer errorCode;

    /**
     * <strong>example:</strong>
     * <p>1890FA4F-067A-4CE9-AC9B-2BD2E58FB5D3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<JoinChannelResponseBodyResult> result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static JoinChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        JoinChannelResponseBody self = new JoinChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public JoinChannelResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public JoinChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public JoinChannelResponseBody setResult(java.util.List<JoinChannelResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<JoinChannelResponseBodyResult> getResult() {
        return this.result;
    }

    public JoinChannelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class JoinChannelResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1533025590</p>
         */
        @NameInMap("AcceptTime")
        public String acceptTime;

        /**
         * <strong>example:</strong>
         * <p>1533025590</p>
         */
        @NameInMap("ApproveTime")
        public String approveTime;

        /**
         * <strong>example:</strong>
         * <p>channelid</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <strong>example:</strong>
         * <p>1533025590</p>
         */
        @NameInMap("ConfirmTime")
        public String confirmTime;

        /**
         * <strong>example:</strong>
         * <p>1533025590</p>
         */
        @NameInMap("DestroyTime")
        public String destroyTime;

        /**
         * <strong>example:</strong>
         * <p>1533025590</p>
         */
        @NameInMap("InviteTime")
        public String inviteTime;

        /**
         * <strong>example:</strong>
         * <p>peers-aaaaaa2-1eqnj5o5w9dt3</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("WithPeer")
        public Boolean withPeer;

        public static JoinChannelResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            JoinChannelResponseBodyResult self = new JoinChannelResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public JoinChannelResponseBodyResult setAcceptTime(String acceptTime) {
            this.acceptTime = acceptTime;
            return this;
        }
        public String getAcceptTime() {
            return this.acceptTime;
        }

        public JoinChannelResponseBodyResult setApproveTime(String approveTime) {
            this.approveTime = approveTime;
            return this;
        }
        public String getApproveTime() {
            return this.approveTime;
        }

        public JoinChannelResponseBodyResult setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public JoinChannelResponseBodyResult setConfirmTime(String confirmTime) {
            this.confirmTime = confirmTime;
            return this;
        }
        public String getConfirmTime() {
            return this.confirmTime;
        }

        public JoinChannelResponseBodyResult setDestroyTime(String destroyTime) {
            this.destroyTime = destroyTime;
            return this;
        }
        public String getDestroyTime() {
            return this.destroyTime;
        }

        public JoinChannelResponseBodyResult setInviteTime(String inviteTime) {
            this.inviteTime = inviteTime;
            return this;
        }
        public String getInviteTime() {
            return this.inviteTime;
        }

        public JoinChannelResponseBodyResult setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

        public JoinChannelResponseBodyResult setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public JoinChannelResponseBodyResult setWithPeer(Boolean withPeer) {
            this.withPeer = withPeer;
            return this;
        }
        public Boolean getWithPeer() {
            return this.withPeer;
        }

    }

}
