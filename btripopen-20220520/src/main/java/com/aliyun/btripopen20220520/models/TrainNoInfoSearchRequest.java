// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TrainNoInfoSearchRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("arr_location")
    public String arrLocation;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("dep_date")
    public String depDate;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("dep_location")
    public String depLocation;

    @NameInMap("line_key")
    public String lineKey;

    @NameInMap("middle_date")
    public String middleDate;

    @NameInMap("middle_station")
    public String middleStation;

    @NameInMap("order_id")
    public String orderId;

    @NameInMap("train_no")
    public String trainNo;

    public static TrainNoInfoSearchRequest build(java.util.Map<String, ?> map) throws Exception {
        TrainNoInfoSearchRequest self = new TrainNoInfoSearchRequest();
        return TeaModel.build(map, self);
    }

    public TrainNoInfoSearchRequest setArrLocation(String arrLocation) {
        this.arrLocation = arrLocation;
        return this;
    }
    public String getArrLocation() {
        return this.arrLocation;
    }

    public TrainNoInfoSearchRequest setDepDate(String depDate) {
        this.depDate = depDate;
        return this;
    }
    public String getDepDate() {
        return this.depDate;
    }

    public TrainNoInfoSearchRequest setDepLocation(String depLocation) {
        this.depLocation = depLocation;
        return this;
    }
    public String getDepLocation() {
        return this.depLocation;
    }

    public TrainNoInfoSearchRequest setLineKey(String lineKey) {
        this.lineKey = lineKey;
        return this;
    }
    public String getLineKey() {
        return this.lineKey;
    }

    public TrainNoInfoSearchRequest setMiddleDate(String middleDate) {
        this.middleDate = middleDate;
        return this;
    }
    public String getMiddleDate() {
        return this.middleDate;
    }

    public TrainNoInfoSearchRequest setMiddleStation(String middleStation) {
        this.middleStation = middleStation;
        return this;
    }
    public String getMiddleStation() {
        return this.middleStation;
    }

    public TrainNoInfoSearchRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public TrainNoInfoSearchRequest setTrainNo(String trainNo) {
        this.trainNo = trainNo;
        return this;
    }
    public String getTrainNo() {
        return this.trainNo;
    }

}
