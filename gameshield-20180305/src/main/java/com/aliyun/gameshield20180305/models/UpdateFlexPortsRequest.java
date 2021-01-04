// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class UpdateFlexPortsRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("EsnBizId")
    public Long esnBizId;

    @NameInMap("Ports")
    public String ports;

    public static UpdateFlexPortsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFlexPortsRequest self = new UpdateFlexPortsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFlexPortsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public UpdateFlexPortsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateFlexPortsRequest setEsnBizId(Long esnBizId) {
        this.esnBizId = esnBizId;
        return this;
    }
    public Long getEsnBizId() {
        return this.esnBizId;
    }

    public UpdateFlexPortsRequest setPorts(String ports) {
        this.ports = ports;
        return this;
    }
    public String getPorts() {
        return this.ports;
    }

}
