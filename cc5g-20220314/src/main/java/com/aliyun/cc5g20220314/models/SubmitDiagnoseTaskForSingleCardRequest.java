// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314.models;

import com.aliyun.tea.*;

public class SubmitDiagnoseTaskForSingleCardRequest extends TeaModel {
    @NameInMap("BeginTime")
    public Long beginTime;

    @NameInMap("Destination")
    public String destination;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("RegionNo")
    public String regionNo;

    @NameInMap("ResourceUid")
    public Long resourceUid;

    @NameInMap("Source")
    public String source;

    @NameInMap("WirelessCloudConnectorId")
    public String wirelessCloudConnectorId;

    public static SubmitDiagnoseTaskForSingleCardRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDiagnoseTaskForSingleCardRequest self = new SubmitDiagnoseTaskForSingleCardRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDiagnoseTaskForSingleCardRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public SubmitDiagnoseTaskForSingleCardRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public SubmitDiagnoseTaskForSingleCardRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public SubmitDiagnoseTaskForSingleCardRequest setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public SubmitDiagnoseTaskForSingleCardRequest setResourceUid(Long resourceUid) {
        this.resourceUid = resourceUid;
        return this;
    }
    public Long getResourceUid() {
        return this.resourceUid;
    }

    public SubmitDiagnoseTaskForSingleCardRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public SubmitDiagnoseTaskForSingleCardRequest setWirelessCloudConnectorId(String wirelessCloudConnectorId) {
        this.wirelessCloudConnectorId = wirelessCloudConnectorId;
        return this;
    }
    public String getWirelessCloudConnectorId() {
        return this.wirelessCloudConnectorId;
    }

}
