// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class SaveWebRTCStatsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("CallId")
    public String callId;

    @NameInMap("GeneralInfo")
    public String generalInfo;

    @NameInMap("SenderReport")
    public String senderReport;

    @NameInMap("ReceiverReport")
    public String receiverReport;

    @NameInMap("GoogAddress")
    public String googAddress;

    public static SaveWebRTCStatsRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveWebRTCStatsRequest self = new SaveWebRTCStatsRequest();
        return TeaModel.build(map, self);
    }

    public SaveWebRTCStatsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SaveWebRTCStatsRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public SaveWebRTCStatsRequest setGeneralInfo(String generalInfo) {
        this.generalInfo = generalInfo;
        return this;
    }
    public String getGeneralInfo() {
        return this.generalInfo;
    }

    public SaveWebRTCStatsRequest setSenderReport(String senderReport) {
        this.senderReport = senderReport;
        return this;
    }
    public String getSenderReport() {
        return this.senderReport;
    }

    public SaveWebRTCStatsRequest setReceiverReport(String receiverReport) {
        this.receiverReport = receiverReport;
        return this;
    }
    public String getReceiverReport() {
        return this.receiverReport;
    }

    public SaveWebRTCStatsRequest setGoogAddress(String googAddress) {
        this.googAddress = googAddress;
        return this;
    }
    public String getGoogAddress() {
        return this.googAddress;
    }

}
