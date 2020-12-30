// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class GetQueueSubmissionStatisticInfoRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("FromDatetime")
    public String fromDatetime;

    @NameInMap("ToDatetime")
    public String toDatetime;

    @NameInMap("ApplicationType")
    public String applicationType;

    @NameInMap("FinalStatus")
    public String finalStatus;

    public static GetQueueSubmissionStatisticInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQueueSubmissionStatisticInfoRequest self = new GetQueueSubmissionStatisticInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetQueueSubmissionStatisticInfoRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetQueueSubmissionStatisticInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetQueueSubmissionStatisticInfoRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetQueueSubmissionStatisticInfoRequest setFromDatetime(String fromDatetime) {
        this.fromDatetime = fromDatetime;
        return this;
    }
    public String getFromDatetime() {
        return this.fromDatetime;
    }

    public GetQueueSubmissionStatisticInfoRequest setToDatetime(String toDatetime) {
        this.toDatetime = toDatetime;
        return this;
    }
    public String getToDatetime() {
        return this.toDatetime;
    }

    public GetQueueSubmissionStatisticInfoRequest setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public GetQueueSubmissionStatisticInfoRequest setFinalStatus(String finalStatus) {
        this.finalStatus = finalStatus;
        return this;
    }
    public String getFinalStatus() {
        return this.finalStatus;
    }

}
