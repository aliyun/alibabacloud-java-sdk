// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainStopoverSearchRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("arr_station")
    public String arrStation;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("dep_station")
    public String depStation;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("train_date")
    public String trainDate;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("train_no")
    public String trainNo;

    public static TrainStopoverSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        TrainStopoverSearchRequest self = new TrainStopoverSearchRequest();
        return TeaModel.build(map, self);
    }

    public TrainStopoverSearchRequest setArrStation(String arrStation) {
        this.arrStation = arrStation;
        return this;
    }
    public String getArrStation() {
        return this.arrStation;
    }

    public TrainStopoverSearchRequest setDepStation(String depStation) {
        this.depStation = depStation;
        return this;
    }
    public String getDepStation() {
        return this.depStation;
    }

    public TrainStopoverSearchRequest setTrainDate(String trainDate) {
        this.trainDate = trainDate;
        return this;
    }
    public String getTrainDate() {
        return this.trainDate;
    }

    public TrainStopoverSearchRequest setTrainNo(String trainNo) {
        this.trainNo = trainNo;
        return this;
    }
    public String getTrainNo() {
        return this.trainNo;
    }

}
