// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class SaveWebRTCStatsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CallId")
    public String callId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GeneralInfo")
    public String generalInfo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GoogAddress")
    public String googAddress;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ReceiverReport")
    public String receiverReport;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SenderReport")
    public String senderReport;

    public static SaveWebRTCStatsRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveWebRTCStatsRequest self = new SaveWebRTCStatsRequest();
        return TeaModel.build(map, self);
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

    public SaveWebRTCStatsRequest setGoogAddress(String googAddress) {
        this.googAddress = googAddress;
        return this;
    }
    public String getGoogAddress() {
        return this.googAddress;
    }

    public SaveWebRTCStatsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SaveWebRTCStatsRequest setReceiverReport(String receiverReport) {
        this.receiverReport = receiverReport;
        return this;
    }
    public String getReceiverReport() {
        return this.receiverReport;
    }

    public SaveWebRTCStatsRequest setSenderReport(String senderReport) {
        this.senderReport = senderReport;
        return this;
    }
    public String getSenderReport() {
        return this.senderReport;
    }

}
