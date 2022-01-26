// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class SubmitDiagnoseTaskForSingleCardRequest extends TeaModel {
    @NameInMap("BeginTime")
    public Long beginTime;

    @NameInMap("Destination")
    public String destination;

    @NameInMap("DestinationType")
    public String destinationType;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("IoTCloudConnectorId")
    public String ioTCloudConnectorId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceUid")
    public Long resourceUid;

    @NameInMap("Source")
    public String source;

    @NameInMap("SourceType")
    public String sourceType;

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

    public SubmitDiagnoseTaskForSingleCardRequest setDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    public String getDestinationType() {
        return this.destinationType;
    }

    public SubmitDiagnoseTaskForSingleCardRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public SubmitDiagnoseTaskForSingleCardRequest setIoTCloudConnectorId(String ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    public SubmitDiagnoseTaskForSingleCardRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

    public SubmitDiagnoseTaskForSingleCardRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
