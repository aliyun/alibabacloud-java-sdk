// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class CreateCellClusterOrderRequest extends TeaModel {
    @NameInMap("masterNum")
    public Integer masterNum;

    @NameInMap("masterSpec")
    public String masterSpec;

    @NameInMap("payModel")
    public String payModel;

    @NameInMap("period")
    public Integer period;

    @NameInMap("region")
    public String region;

    @NameInMap("slaveNum")
    public Integer slaveNum;

    @NameInMap("slaveSpec")
    public String slaveSpec;

    public static CreateCellClusterOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCellClusterOrderRequest self = new CreateCellClusterOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateCellClusterOrderRequest setMasterNum(Integer masterNum) {
        this.masterNum = masterNum;
        return this;
    }
    public Integer getMasterNum() {
        return this.masterNum;
    }

    public CreateCellClusterOrderRequest setMasterSpec(String masterSpec) {
        this.masterSpec = masterSpec;
        return this;
    }
    public String getMasterSpec() {
        return this.masterSpec;
    }

    public CreateCellClusterOrderRequest setPayModel(String payModel) {
        this.payModel = payModel;
        return this;
    }
    public String getPayModel() {
        return this.payModel;
    }

    public CreateCellClusterOrderRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateCellClusterOrderRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateCellClusterOrderRequest setSlaveNum(Integer slaveNum) {
        this.slaveNum = slaveNum;
        return this;
    }
    public Integer getSlaveNum() {
        return this.slaveNum;
    }

    public CreateCellClusterOrderRequest setSlaveSpec(String slaveSpec) {
        this.slaveSpec = slaveSpec;
        return this;
    }
    public String getSlaveSpec() {
        return this.slaveSpec;
    }

}
