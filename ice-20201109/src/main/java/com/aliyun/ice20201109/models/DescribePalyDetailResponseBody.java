// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribePalyDetailResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribePalyDetailResponseBodyData> data;

    // Id
    @NameInMap("RequestId")
    public String requestId;

    public static DescribePalyDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePalyDetailResponseBody self = new DescribePalyDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePalyDetailResponseBody setData(java.util.List<DescribePalyDetailResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribePalyDetailResponseBodyData> getData() {
        return this.data;
    }

    public DescribePalyDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePalyDetailResponseBodyData extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Bps")
        public String bps;

        @NameInMap("BroadcastPace")
        public String broadcastPace;

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

        @NameInMap("NetWorkDuration")
        public String netWorkDuration;

        @NameInMap("Network")
        public String network;

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

        public static DescribePalyDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePalyDetailResponseBodyData self = new DescribePalyDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePalyDetailResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribePalyDetailResponseBodyData setBps(String bps) {
            this.bps = bps;
            return this;
        }
        public String getBps() {
            return this.bps;
        }

        public DescribePalyDetailResponseBodyData setBroadcastPace(String broadcastPace) {
            this.broadcastPace = broadcastPace;
            return this;
        }
        public String getBroadcastPace() {
            return this.broadcastPace;
        }

        public DescribePalyDetailResponseBodyData setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public DescribePalyDetailResponseBodyData setDecodeStuckTime(String decodeStuckTime) {
            this.decodeStuckTime = decodeStuckTime;
            return this;
        }
        public String getDecodeStuckTime() {
            return this.decodeStuckTime;
        }

        public DescribePalyDetailResponseBodyData setDefinition(String definition) {
            this.definition = definition;
            return this;
        }
        public String getDefinition() {
            return this.definition;
        }

        public DescribePalyDetailResponseBodyData setFirstFrameDuration(String firstFrameDuration) {
            this.firstFrameDuration = firstFrameDuration;
            return this;
        }
        public String getFirstFrameDuration() {
            return this.firstFrameDuration;
        }

        public DescribePalyDetailResponseBodyData setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public DescribePalyDetailResponseBodyData setIsHardDecode(String isHardDecode) {
            this.isHardDecode = isHardDecode;
            return this;
        }
        public String getIsHardDecode() {
            return this.isHardDecode;
        }

        public DescribePalyDetailResponseBodyData setMdat(String mdat) {
            this.mdat = mdat;
            return this;
        }
        public String getMdat() {
            return this.mdat;
        }

        public DescribePalyDetailResponseBodyData setMoov(String moov) {
            this.moov = moov;
            return this;
        }
        public String getMoov() {
            return this.moov;
        }

        public DescribePalyDetailResponseBodyData setNetWorkDuration(String netWorkDuration) {
            this.netWorkDuration = netWorkDuration;
            return this;
        }
        public String getNetWorkDuration() {
            return this.netWorkDuration;
        }

        public DescribePalyDetailResponseBodyData setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public DescribePalyDetailResponseBodyData setNetworkStuckTime(String networkStuckTime) {
            this.networkStuckTime = networkStuckTime;
            return this;
        }
        public String getNetworkStuckTime() {
            return this.networkStuckTime;
        }

        public DescribePalyDetailResponseBodyData setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public DescribePalyDetailResponseBodyData setPlayTs(String playTs) {
            this.playTs = playTs;
            return this;
        }
        public String getPlayTs() {
            return this.playTs;
        }

        public DescribePalyDetailResponseBodyData setPlayerLoadDuration(String playerLoadDuration) {
            this.playerLoadDuration = playerLoadDuration;
            return this;
        }
        public String getPlayerLoadDuration() {
            return this.playerLoadDuration;
        }

        public DescribePalyDetailResponseBodyData setPlayerPreDealDuration(String playerPreDealDuration) {
            this.playerPreDealDuration = playerPreDealDuration;
            return this;
        }
        public String getPlayerPreDealDuration() {
            return this.playerPreDealDuration;
        }

        public DescribePalyDetailResponseBodyData setPlayerReadyDuration(String playerReadyDuration) {
            this.playerReadyDuration = playerReadyDuration;
            return this;
        }
        public String getPlayerReadyDuration() {
            return this.playerReadyDuration;
        }

        public DescribePalyDetailResponseBodyData setSdkVersion(String sdkVersion) {
            this.sdkVersion = sdkVersion;
            return this;
        }
        public String getSdkVersion() {
            return this.sdkVersion;
        }

        public DescribePalyDetailResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public DescribePalyDetailResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribePalyDetailResponseBodyData setTerminalType(String terminalType) {
            this.terminalType = terminalType;
            return this;
        }
        public String getTerminalType() {
            return this.terminalType;
        }

    }

}
