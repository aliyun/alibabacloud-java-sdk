// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribePlayDetailResponseBody extends TeaModel {
    @NameInMap("BaseInfos")
    public java.util.List<DescribePlayDetailResponseBodyBaseInfos> baseInfos;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePlayDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayDetailResponseBody self = new DescribePlayDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePlayDetailResponseBody setBaseInfos(java.util.List<DescribePlayDetailResponseBodyBaseInfos> baseInfos) {
        this.baseInfos = baseInfos;
        return this;
    }
    public java.util.List<DescribePlayDetailResponseBodyBaseInfos> getBaseInfos() {
        return this.baseInfos;
    }

    public DescribePlayDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePlayDetailResponseBodyBaseInfos extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Bps")
        public String bps;

        @NameInMap("BroadcastPace")
        public String broadcastPace;

        @NameInMap("ClientIP")
        public String clientIP;

        @NameInMap("Codec")
        public String codec;

        @NameInMap("DecodeStuckTime")
        public String decodeStuckTime;

        @NameInMap("Definition")
        public String definition;

        @NameInMap("FirstFrameDuration")
        public String firstFrameDuration;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("IsHardDecode")
        public String isHardDecode;

        @NameInMap("Mdat")
        public String mdat;

        @NameInMap("Moov")
        public String moov;

        @NameInMap("Network")
        public String network;

        @NameInMap("NetworkDuration")
        public String networkDuration;

        @NameInMap("NetworkStuckTime")
        public String networkStuckTime;

        @NameInMap("Os")
        public String os;

        @NameInMap("PlayTs")
        public String playTs;

        @NameInMap("PlayerLoadDuration")
        public String playerLoadDuration;

        @NameInMap("PlayerPreDealDuration")
        public String playerPreDealDuration;

        @NameInMap("PlayerReadyDuration")
        public String playerReadyDuration;

        @NameInMap("SdkVersion")
        public String sdkVersion;

        @NameInMap("SessionId")
        public String sessionId;

        @NameInMap("Status")
        public String status;

        @NameInMap("TerminalType")
        public String terminalType;

        public static DescribePlayDetailResponseBodyBaseInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribePlayDetailResponseBodyBaseInfos self = new DescribePlayDetailResponseBodyBaseInfos();
            return TeaModel.build(map, self);
        }

        public DescribePlayDetailResponseBodyBaseInfos setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribePlayDetailResponseBodyBaseInfos setBps(String bps) {
            this.bps = bps;
            return this;
        }
        public String getBps() {
            return this.bps;
        }

        public DescribePlayDetailResponseBodyBaseInfos setBroadcastPace(String broadcastPace) {
            this.broadcastPace = broadcastPace;
            return this;
        }
        public String getBroadcastPace() {
            return this.broadcastPace;
        }

        public DescribePlayDetailResponseBodyBaseInfos setClientIP(String clientIP) {
            this.clientIP = clientIP;
            return this;
        }
        public String getClientIP() {
            return this.clientIP;
        }

        public DescribePlayDetailResponseBodyBaseInfos setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public DescribePlayDetailResponseBodyBaseInfos setDecodeStuckTime(String decodeStuckTime) {
            this.decodeStuckTime = decodeStuckTime;
            return this;
        }
        public String getDecodeStuckTime() {
            return this.decodeStuckTime;
        }

        public DescribePlayDetailResponseBodyBaseInfos setDefinition(String definition) {
            this.definition = definition;
            return this;
        }
        public String getDefinition() {
            return this.definition;
        }

        public DescribePlayDetailResponseBodyBaseInfos setFirstFrameDuration(String firstFrameDuration) {
            this.firstFrameDuration = firstFrameDuration;
            return this;
        }
        public String getFirstFrameDuration() {
            return this.firstFrameDuration;
        }

        public DescribePlayDetailResponseBodyBaseInfos setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public DescribePlayDetailResponseBodyBaseInfos setIsHardDecode(String isHardDecode) {
            this.isHardDecode = isHardDecode;
            return this;
        }
        public String getIsHardDecode() {
            return this.isHardDecode;
        }

        public DescribePlayDetailResponseBodyBaseInfos setMdat(String mdat) {
            this.mdat = mdat;
            return this;
        }
        public String getMdat() {
            return this.mdat;
        }

        public DescribePlayDetailResponseBodyBaseInfos setMoov(String moov) {
            this.moov = moov;
            return this;
        }
        public String getMoov() {
            return this.moov;
        }

        public DescribePlayDetailResponseBodyBaseInfos setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public DescribePlayDetailResponseBodyBaseInfos setNetworkDuration(String networkDuration) {
            this.networkDuration = networkDuration;
            return this;
        }
        public String getNetworkDuration() {
            return this.networkDuration;
        }

        public DescribePlayDetailResponseBodyBaseInfos setNetworkStuckTime(String networkStuckTime) {
            this.networkStuckTime = networkStuckTime;
            return this;
        }
        public String getNetworkStuckTime() {
            return this.networkStuckTime;
        }

        public DescribePlayDetailResponseBodyBaseInfos setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public DescribePlayDetailResponseBodyBaseInfos setPlayTs(String playTs) {
            this.playTs = playTs;
            return this;
        }
        public String getPlayTs() {
            return this.playTs;
        }

        public DescribePlayDetailResponseBodyBaseInfos setPlayerLoadDuration(String playerLoadDuration) {
            this.playerLoadDuration = playerLoadDuration;
            return this;
        }
        public String getPlayerLoadDuration() {
            return this.playerLoadDuration;
        }

        public DescribePlayDetailResponseBodyBaseInfos setPlayerPreDealDuration(String playerPreDealDuration) {
            this.playerPreDealDuration = playerPreDealDuration;
            return this;
        }
        public String getPlayerPreDealDuration() {
            return this.playerPreDealDuration;
        }

        public DescribePlayDetailResponseBodyBaseInfos setPlayerReadyDuration(String playerReadyDuration) {
            this.playerReadyDuration = playerReadyDuration;
            return this;
        }
        public String getPlayerReadyDuration() {
            return this.playerReadyDuration;
        }

        public DescribePlayDetailResponseBodyBaseInfos setSdkVersion(String sdkVersion) {
            this.sdkVersion = sdkVersion;
            return this;
        }
        public String getSdkVersion() {
            return this.sdkVersion;
        }

        public DescribePlayDetailResponseBodyBaseInfos setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public DescribePlayDetailResponseBodyBaseInfos setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribePlayDetailResponseBodyBaseInfos setTerminalType(String terminalType) {
            this.terminalType = terminalType;
            return this;
        }
        public String getTerminalType() {
            return this.terminalType;
        }

    }

}
