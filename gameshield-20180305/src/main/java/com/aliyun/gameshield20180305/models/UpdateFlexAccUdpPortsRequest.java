// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UpdateFlexAccUdpPortsRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("EsnBizId")
    public Long esnBizId;

    @NameInMap("Ports")
    public String ports;

    public static UpdateFlexAccUdpPortsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlexAccUdpPortsRequest self = new UpdateFlexAccUdpPortsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFlexAccUdpPortsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public UpdateFlexAccUdpPortsRequest setEsnBizId(Long esnBizId) {
        this.esnBizId = esnBizId;
        return this;
    }
    public Long getEsnBizId() {
        return this.esnBizId;
    }

    public UpdateFlexAccUdpPortsRequest setPorts(String ports) {
        this.ports = ports;
        return this;
    }
    public String getPorts() {
        return this.ports;
    }

}
