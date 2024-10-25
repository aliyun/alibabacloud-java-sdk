// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetDoctorReportComponentSummaryRequest extends TeaModel {
    /**
     * <p>Cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b933c5aac8fe****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Select component filter type. Values: </p>
     * <ul>
     * <li>compute </li>
     * <li>hive</li>
     * <li>hdfs</li>
     * <li>yarn</li>
     * <li>oss</li>
     * <li>hbase</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>compute</p>
     */
    @NameInMap("ComponentType")
    public String componentType;

    /**
     * <p>Report date.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-01-01</p>
     */
    @NameInMap("DateTime")
    public String dateTime;

    /**
     * <p>Region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
