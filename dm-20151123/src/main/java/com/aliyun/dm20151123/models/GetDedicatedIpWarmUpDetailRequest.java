// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetDedicatedIpWarmUpDetailRequest extends TeaModel {
    @NameInMap("DedicatedIp")
    public String dedicatedIp;

    @NameInMap("EndDayMark")
    public Long endDayMark;

    @NameInMap("Esp")
    public String esp;

    @NameInMap("StartDayMark")
    public Long startDayMark;

    public static GetDedicatedIpWarmUpDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDedicatedIpWarmUpDetailRequest self = new GetDedicatedIpWarmUpDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetDedicatedIpWarmUpDetailRequest setDedicatedIp(String dedicatedIp) {
        this.dedicatedIp = dedicatedIp;
        return this;
    }
    public String getDedicatedIp() {
        return this.dedicatedIp;
    }

    public GetDedicatedIpWarmUpDetailRequest setEndDayMark(Long endDayMark) {
        this.endDayMark = endDayMark;
        return this;
    }
    public Long getEndDayMark() {
        return this.endDayMark;
    }

    public GetDedicatedIpWarmUpDetailRequest setEsp(String esp) {
        this.esp = esp;
        return this;
    }
    public String getEsp() {
        return this.esp;
    }

    public GetDedicatedIpWarmUpDetailRequest setStartDayMark(Long startDayMark) {
        this.startDayMark = startDayMark;
        return this;
    }
    public Long getStartDayMark() {
        return this.startDayMark;
    }

}
