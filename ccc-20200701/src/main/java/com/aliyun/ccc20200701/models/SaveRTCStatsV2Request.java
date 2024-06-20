// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class SaveRTCStatsV2Request extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>257e73de-1ee8-123b-0b9a-00163e0a****</p>
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
     * 
     * <strong>example:</strong>
     * <p>[&quot;47.101.XX.XX&quot;,&quot;44368&quot;,&quot;47.104.XX.XX&quot;,&quot;37947&quot;]</p>
     */
    @NameInMap("GoogAddress")
    public String googAddress;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;1&quot;,&quot;1649328987&quot;,&quot;40&quot;,&quot;PCMU&quot;,&quot;383560&quot;,&quot;89&quot;,&quot;49&quot;,&quot;ssrc_1649328987_recv&quot;,&quot;2022-03-15T09:52:08.820Z&quot;,&quot;&quot;,&quot;0&quot;,&quot;20000&quot;]</p>
     */
    @NameInMap("ReceiverReport")
    public String receiverReport;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;11090&quot;,&quot;2055127460&quot;,&quot;0&quot;,&quot;2236&quot;,&quot;384592&quot;,&quot;ssrc_2055127460_send&quot;,&quot;2022-03-15T09:52:08.820Z&quot;,&quot;1&quot;]</p>
     */
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
