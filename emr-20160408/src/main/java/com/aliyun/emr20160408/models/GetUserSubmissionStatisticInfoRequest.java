// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class GetUserSubmissionStatisticInfoRequest extends TeaModel {
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

    public static GetUserSubmissionStatisticInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserSubmissionStatisticInfoRequest self = new GetUserSubmissionStatisticInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetUserSubmissionStatisticInfoRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetUserSubmissionStatisticInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetUserSubmissionStatisticInfoRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetUserSubmissionStatisticInfoRequest setFromDatetime(String fromDatetime) {
        this.fromDatetime = fromDatetime;
        return this;
    }
    public String getFromDatetime() {
        return this.fromDatetime;
    }

    public GetUserSubmissionStatisticInfoRequest setToDatetime(String toDatetime) {
        this.toDatetime = toDatetime;
        return this;
    }
    public String getToDatetime() {
        return this.toDatetime;
    }

    public GetUserSubmissionStatisticInfoRequest setApplicationType(String applicationType) {
        this.applicationType = applicationType;
        return this;
    }
    public String getApplicationType() {
        return this.applicationType;
    }

    public GetUserSubmissionStatisticInfoRequest setFinalStatus(String finalStatus) {
        this.finalStatus = finalStatus;
        return this;
    }
    public String getFinalStatus() {
        return this.finalStatus;
    }

}
