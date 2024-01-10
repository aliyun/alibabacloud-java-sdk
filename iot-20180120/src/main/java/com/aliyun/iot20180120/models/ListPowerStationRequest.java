// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListPowerStationRequest extends TeaModel {
    @NameInMap("AlgorithmInstanceUid")
    public String algorithmInstanceUid;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PowerStationName")
    public String powerStationName;

    public static ListPowerStationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPowerStationRequest self = new ListPowerStationRequest();
        return TeaModel.build(map, self);
    }

    public ListPowerStationRequest setAlgorithmInstanceUid(String algorithmInstanceUid) {
        this.algorithmInstanceUid = algorithmInstanceUid;
        return this;
    }
    public String getAlgorithmInstanceUid() {
        return this.algorithmInstanceUid;
    }

    public ListPowerStationRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public ListPowerStationRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListPowerStationRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPowerStationRequest setPowerStationName(String powerStationName) {
        this.powerStationName = powerStationName;
        return this;
    }
    public String getPowerStationName() {
        return this.powerStationName;
    }

}
