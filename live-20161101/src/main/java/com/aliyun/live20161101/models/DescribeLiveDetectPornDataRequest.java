// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDetectPornDataRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("App")
    public String app;

    @NameInMap("Stream")
    public String stream;

    @NameInMap("Fee")
    public String fee;

    @NameInMap("Scene")
    public String scene;

    @NameInMap("Region")
    public String region;

    @NameInMap("SplitBy")
    public String splitBy;

    public static DescribeLiveDetectPornDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDetectPornDataRequest self = new DescribeLiveDetectPornDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDetectPornDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveDetectPornDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveDetectPornDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeLiveDetectPornDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeLiveDetectPornDataRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public DescribeLiveDetectPornDataRequest setStream(String stream) {
        this.stream = stream;
        return this;
    }
    public String getStream() {
        return this.stream;
    }

    public DescribeLiveDetectPornDataRequest setFee(String fee) {
        this.fee = fee;
        return this;
    }
    public String getFee() {
        return this.fee;
    }

    public DescribeLiveDetectPornDataRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public DescribeLiveDetectPornDataRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeLiveDetectPornDataRequest setSplitBy(String splitBy) {
        this.splitBy = splitBy;
        return this;
    }
    public String getSplitBy() {
        return this.splitBy;
    }

}
