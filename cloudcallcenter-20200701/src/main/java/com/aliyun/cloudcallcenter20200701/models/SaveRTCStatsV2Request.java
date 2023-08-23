// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class SaveRTCStatsV2Request extends TeaModel {
    @NameInMap("CallId")
    public String callId;

    @NameInMap("GeneralInfo")
    public String generalInfo;

    @NameInMap("GoogAddress")
    public String googAddress;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ReceiverReport")
    public String receiverReport;

    @NameInMap("SenderReport")
    public String senderReport;

    public static SaveRTCStatsV2Request build(java.util.Map<String, ?> map) throws Exception {
        SaveRTCStatsV2Request self = new SaveRTCStatsV2Request();
        return TeaModel.build(map, self);
    }

    public SaveRTCStatsV2Request setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public SaveRTCStatsV2Request setGeneralInfo(String generalInfo) {
        this.generalInfo = generalInfo;
        return this;
    }
    public String getGeneralInfo() {
        return this.generalInfo;
    }

    public SaveRTCStatsV2Request setGoogAddress(String googAddress) {
        this.googAddress = googAddress;
        return this;
    }
    public String getGoogAddress() {
        return this.googAddress;
    }

    public SaveRTCStatsV2Request setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SaveRTCStatsV2Request setReceiverReport(String receiverReport) {
        this.receiverReport = receiverReport;
        return this;
    }
    public String getReceiverReport() {
        return this.receiverReport;
    }

    public SaveRTCStatsV2Request setSenderReport(String senderReport) {
        this.senderReport = senderReport;
        return this;
    }
    public String getSenderReport() {
        return this.senderReport;
    }

}
