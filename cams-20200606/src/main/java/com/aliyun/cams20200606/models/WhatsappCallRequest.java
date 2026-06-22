// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class WhatsappCallRequest extends TeaModel {
    /**
     * <p>The business number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>86138***</p>
     */
    @NameInMap("BusinessNumber")
    public String businessNumber;

    /**
     * <p>The action to perform on the call.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>connect</p>
     */
    @NameInMap("CallAction")
    public String callAction;

    /**
     * <p>The call ID.</p>
     * 
     * <strong>example:</strong>
     * <p>wamid-xx**</p>
     */
    @NameInMap("CallId")
    public String callId;

    /**
     * <p>The Space ID of the ISV sub-customer, or the instance ID of the direct customer. View the Space ID on the</p>
     * <p>&lt;props=&quot;china&quot;&gt;<a href="https://chatapp.console.aliyun.com/ChannelsManagement">Channel Management</a>&lt;props=&quot;intl&quot;&gt;<a href="https://chatapp.console.alibabacloud.com/CustomerList">Channel Management</a> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cams-xx**</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The call negotiation information.</p>
     */
    @NameInMap("Session")
    public WhatsappCallRequestSession session;

    /**
     * <p>The user\&quot;s number.</p>
     * 
     * <strong>example:</strong>
     * <p>86131***</p>
     */
    @NameInMap("UserNumber")
    public String userNumber;

    public static WhatsappCallRequest build(java.util.Map<String, ?> map) throws Exception {
        WhatsappCallRequest self = new WhatsappCallRequest();
        return TeaModel.build(map, self);
    }

    public WhatsappCallRequest setBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
        return this;
    }
    public String getBusinessNumber() {
        return this.businessNumber;
    }

    public WhatsappCallRequest setCallAction(String callAction) {
        this.callAction = callAction;
        return this;
    }
    public String getCallAction() {
        return this.callAction;
    }

    public WhatsappCallRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public WhatsappCallRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public WhatsappCallRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public WhatsappCallRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public WhatsappCallRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public WhatsappCallRequest setSession(WhatsappCallRequestSession session) {
        this.session = session;
        return this;
    }
    public WhatsappCallRequestSession getSession() {
        return this.session;
    }

    public WhatsappCallRequest setUserNumber(String userNumber) {
        this.userNumber = userNumber;
        return this;
    }
    public String getUserNumber() {
        return this.userNumber;
    }

    public static class WhatsappCallRequestSession extends TeaModel {
        /**
         * <p>The Session Description Protocol (SDP) payload used for call negotiation.</p>
         * 
         * <strong>example:</strong>
         * <p>v=0\r\no=- 3978582128 3978582128 IN IP4 0.0.0.0\r\ns=Kurento Media Server\r\nc=IN IP4 0.0.0.0\r\nt=0 0\r\na=group:BUNDLE audio0\r\nm=audio 61903 RTP/SAVPF 96 0 8\r\na=setup:actpass\r\na=extmap:3 <a href="http://www.webrtc.org/experiments/rtp-hdrext/abs-send-time%5C%5Cr%5C%5Cna=rtpmap:96">http://www.webrtc.org/experiments/rtp-hdrext/abs-send-time\\r\\na=rtpmap:96</a> opus/48000/2\r\na=rtcp:9 IN IP4 0.0.0.0\r\na=rtcp-mux\r\na=sendrecv\r\na=mid:audio0\r\na=ssrc:1935711036 cname:user3617531270@host-126a650\r\na=ice-ufrag:/TW8\r\na=ice-pwd:GRKrVHYTLGT69PYlqqWQHO\r\na=fingerprint:sha-256 41:5C:01:6E:C0:1B:21:F1:0D:28:95:2E:4E:42:F6:64:F3:DB:DD:E3:18:54:32:28:3D:2F:9C:80:38:FA:E0:2Ca=candidate:candidate:1 1 UDP 2015363327 47.243.79.43 46008 typ host\r\na=candidate:candidate:1 1 UDP 2015363327 47.243.79.43 46008 typ host\r\na=candidate:candidate:2 1 TCP 1015021823 47.243.79.43 9 typ host tcptype active\r\na=candidate:candidate:3 1 TCP 1010827519 47.243.79.43 32450 typ host tcptype passive\r\na=candidate:candidate:3 1 TCP 1010827519 47.243.79.43 32450 typ host tcptype passive\r\na=candidate:candidate:2 1 TCP 1015021823 47.243.79.43 9 typ host tcptype active\r\na=candidate:candidate:4 1 UDP 2015363583 fe80::216:3eff:fe22:644f 12231 typ host\r\na=candidate:candidate:4 1 UDP 2015363583 fe80::216:3eff:fe22:644f 12231 typ host\r\na=candidate:candidate:5 1 TCP 1015022079 fe80::216:3eff:fe22:644f 9 typ host tcptype active\r\na=candidate:candidate:5 1 TCP 1015022079 fe80::216:3eff:fe22:644f 9 typ host tcptype active\r\na=candidate:candidate:6 1 TCP 1010827775 fe80::216:3eff:fe22:644f 6988 typ host tcptype passive\r\na=candidate:candidate:6 1 TCP 1010827775 fe80::216:3eff:fe22:644f 6988 typ host tcptype passive\r\na=candidate:candidate:1 2 UDP 2015363326 47.243.79.43 40782 typ host\r\na=candidate:candidate:1 2 UDP 2015363326 47.243.79.43 40782 typ host\r\na=candidate:candidate:2 2 TCP 1015021822 47.243.79.43 9 typ host tcptype active\r\na=candidate:candidate:2 2 TCP 1015021822 47.243.79.43 9 typ host tcptype active\r\na=candidate:candidate:3 2 TCP 1010827518 47.243.79.43 64559 typ host tcptype passive\r\na=candidate:candidate:3 2 TCP 1010827518 47.243.79.43 64559 typ host tcptype passive\r\na=candidate:candidate:4 2 UDP 2015363582 fe80::216:3eff:fe22:644f 39166 typ host\r\na=candidate:candidate:5 2 TCP 1015022078 fe80::216:3eff:fe22:644f 9 typ host tcptype active\r\na=candidate:candidate:4 2 UDP 2015363582 fe80::216:3eff:fe22:644f 39166 typ host\r\na=candidate:candidate:5 2 TCP 1015022078 fe80::216:3eff:fe22:644f 9 typ host tcptype active\r\na=candidate:candidate:6 2 TCP 1010827774 fe80::216:3eff:fe22:644f 16286 typ host tcptype passive\r\na=candidate:candidate:6 2 TCP 1010827774 fe80::216:3eff:fe22:644f 16286 typ host tcptype passive\r\na=candidate:candidate:7 1 UDP 1679819007 47.243.79.43 46008 typ srflx raddr 172.22.181.115 rport 46008\r\na=candidate:candidate:7 1 UDP 1679819007 47.243.79.43 46008 typ srflx raddr 172.22.181.115 rport 46008\r\na=candidate:candidate:8 1 TCP 847249663 47.243.79.43 9 typ srflx raddr 172.22.181.115 rport 9 tcptype active\r\na=candidate:candidate:8 1 TCP 847249663 47.243.79.43 9 typ srflx raddr 172.22.181.115 rport 9 tcptype active\r\na=candidate:candidate:9 1 TCP 843055359 47.243.79.43 32450 typ srflx raddr 172.22.181.115 rport 32450 tcptype passive\r\na=candidate:candidate:9 1 TCP 843055359 47.243.79.43 32450 typ srflx raddr 172.22.181.115 rport 32450 tcptype passive\r\na=candidate:candidate:10 1 UDP 505413887 47.243.79.43 61903 typ relay raddr 172.22.181.115 rport 46008\r\na=candidate:candidate:10 1 UDP 505413887 47.243.79.43 61903 typ relay raddr 172.22.181.115 rport 46008\r\na=candidate:candidate:7 2 UDP 1679819006 47.243.79.43 40782 typ srflx raddr 172.22.181.115 rport 40782\r\na=candidate:candidate:7 2 UDP 1679819006 47.243.79.43 40782 typ srflx raddr 172.22.181.115 rport 40782\r\na=candidate:candidate:8 2 TCP 847249662 47.243.79.43 9 typ srflx raddr 172.22.181.115 rport 9 tcptype active\r\na=candidate:candidate:8 2 TCP 847249662 47.243.79.43 9 typ srflx raddr 172.22.181.115 rport 9 tcptype active\r\na=candidate:candidate:9 2 TCP 843055358 47.243.79.43 64559 typ srflx raddr 172.22.181.115 rport 64559 tcptype passive\r\na=candidate:candidate:9 2 TCP 843055358 47.243.79.43 64559 typ srflx raddr 172.22.181.115 rport 64559 tcptype passive\r\na=candidate:candidate:10 2 UDP 505413886 47.243.79.43 63580 typ relay raddr 172.22.181.115 rport 40782\r\na=candidate:candidate:10 2 UDP 505413886 47.243.79.43 63580 typ relay raddr 172.22.181.115 rport 40782\r\n</p>
         */
        @NameInMap("Sdp")
        public String sdp;

        /**
         * <p>The type of the SDP payload.</p>
         * 
         * <strong>example:</strong>
         * <p>offer</p>
         */
        @NameInMap("SdpType")
        public String sdpType;

        public static WhatsappCallRequestSession build(java.util.Map<String, ?> map) throws Exception {
            WhatsappCallRequestSession self = new WhatsappCallRequestSession();
            return TeaModel.build(map, self);
        }

        public WhatsappCallRequestSession setSdp(String sdp) {
            this.sdp = sdp;
            return this;
        }
        public String getSdp() {
            return this.sdp;
        }

        public WhatsappCallRequestSession setSdpType(String sdpType) {
            this.sdpType = sdpType;
            return this;
        }
        public String getSdpType() {
            return this.sdpType;
        }

    }

}
