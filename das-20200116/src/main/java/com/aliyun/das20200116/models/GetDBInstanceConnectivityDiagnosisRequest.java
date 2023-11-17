// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetDBInstanceConnectivityDiagnosisRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The source IP address.</p>
     */
    @NameInMap("SrcIp")
    public String srcIp;

    public static GetDBInstanceConnectivityDiagnosisRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDBInstanceConnectivityDiagnosisRequest self = new GetDBInstanceConnectivityDiagnosisRequest();
        return TeaModel.build(map, self);
    }

    public GetDBInstanceConnectivityDiagnosisRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetDBInstanceConnectivityDiagnosisRequest setSrcIp(String srcIp) {
        this.srcIp = srcIp;
        return this;
    }
    public String getSrcIp() {
        return this.srcIp;
    }

}
