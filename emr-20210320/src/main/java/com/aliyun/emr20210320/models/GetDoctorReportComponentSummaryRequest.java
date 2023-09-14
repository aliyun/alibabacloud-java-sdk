// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetDoctorReportComponentSummaryRequest extends TeaModel {
    /**
     * <p>集群ID。</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>component type</p>
     */
    @NameInMap("ComponentType")
    public String componentType;

    /**
     * <p>dateTime for specify report</p>
     */
    @NameInMap("DateTime")
    public String dateTime;

    /**
     * <p>区域ID。</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetDoctorReportComponentSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDoctorReportComponentSummaryRequest self = new GetDoctorReportComponentSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetDoctorReportComponentSummaryRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetDoctorReportComponentSummaryRequest setComponentType(String componentType) {
        this.componentType = componentType;
        return this;
    }
    public String getComponentType() {
        return this.componentType;
    }

    public GetDoctorReportComponentSummaryRequest setDateTime(String dateTime) {
        this.dateTime = dateTime;
        return this;
    }
    public String getDateTime() {
        return this.dateTime;
    }

    public GetDoctorReportComponentSummaryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
