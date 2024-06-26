// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateBlockchainApplyRequest extends TeaModel {
    @NameInMap("Bizid")
    public String bizid;

    @NameInMap("LiveTime")
    public Integer liveTime;

    @NameInMap("MachineNum")
    public Integer machineNum;

    @NameInMap("Size")
    public Integer size;

    public static CreateBlockchainApplyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBlockchainApplyRequest self = new CreateBlockchainApplyRequest();
        return TeaModel.build(map, self);
    }

    public CreateBlockchainApplyRequest setBizid(String bizid) {
        this.bizid = bizid;
        return this;
    }
    public String getBizid() {
        return this.bizid;
    }

    public CreateBlockchainApplyRequest setLiveTime(Integer liveTime) {
        this.liveTime = liveTime;
        return this;
    }
    public Integer getLiveTime() {
        return this.liveTime;
    }

    public CreateBlockchainApplyRequest setMachineNum(Integer machineNum) {
        this.machineNum = machineNum;
        return this;
    }
    public Integer getMachineNum() {
        return this.machineNum;
    }

    public CreateBlockchainApplyRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
