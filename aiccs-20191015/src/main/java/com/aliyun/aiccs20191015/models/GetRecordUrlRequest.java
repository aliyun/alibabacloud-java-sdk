// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetRecordUrlRequest extends TeaModel {
    /**
     * <p>The session ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1001067****</p>
     */
    @NameInMap("Acid")
    public String acid;

    /**
     * <p>The Artificial Intelligence Cloud Call Service (AICCS) instance ID. You can obtain it in the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a> &gt; Instance Management.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre-cn-****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The call type. Valid values:</p>
     * <ul>
     * <li><strong>DUP_CALL</strong>: Incoming and outgoing calls.</li>
     * <li><strong>IVR_CALL</strong>: IVR outbound call.</li>
     * <li><strong>SMART_CALL</strong>: Intelligent outbound call.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DUP_CALL</p>
     */
    @NameInMap("RecordType")
    public String recordType;

    public static GetRecordUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRecordUrlRequest self = new GetRecordUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetRecordUrlRequest setAcid(String acid) {
        this.acid = acid;
        return this;
    }
    public String getAcid() {
        return this.acid;
    }

    public GetRecordUrlRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetRecordUrlRequest setRecordType(String recordType) {
        this.recordType = recordType;
        return this;
    }
    public String getRecordType() {
        return this.recordType;
    }

}
