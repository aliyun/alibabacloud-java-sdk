// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UpdateFlexAccTcpPortsRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("EsnBizId")
    public Long esnBizId;

    @NameInMap("Ports")
    public String ports;

    public static UpdateFlexAccTcpPortsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlexAccTcpPortsRequest self = new UpdateFlexAccTcpPortsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFlexAccTcpPortsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public UpdateFlexAccTcpPortsRequest setEsnBizId(Long esnBizId) {
        this.esnBizId = esnBizId;
        return this;
    }
    public Long getEsnBizId() {
        return this.esnBizId;
    }

    public UpdateFlexAccTcpPortsRequest setPorts(String ports) {
        this.ports = ports;
        return this;
    }
    public String getPorts() {
        return this.ports;
    }

}
