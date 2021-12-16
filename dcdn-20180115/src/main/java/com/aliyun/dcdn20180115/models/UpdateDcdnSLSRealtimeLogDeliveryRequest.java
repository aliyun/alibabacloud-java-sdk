// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UpdateDcdnSLSRealtimeLogDeliveryRequest extends TeaModel {
    @NameInMap("DataCenter")
    public String dataCenter;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("SLSLogStore")
    public String SLSLogStore;

    @NameInMap("SLSProject")
    public String SLSProject;

    @NameInMap("SLSRegion")
    public String SLSRegion;

    @NameInMap("SamplingRate")
    public String samplingRate;

    public static UpdateDcdnSLSRealtimeLogDeliveryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDcdnSLSRealtimeLogDeliveryRequest self = new UpdateDcdnSLSRealtimeLogDeliveryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDcdnSLSRealtimeLogDeliveryRequest setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public UpdateDcdnSLSRealtimeLogDeliveryRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateDcdnSLSRealtimeLogDeliveryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateDcdnSLSRealtimeLogDeliveryRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public UpdateDcdnSLSRealtimeLogDeliveryRequest setSLSLogStore(String SLSLogStore) {
        this.SLSLogStore = SLSLogStore;
        return this;
    }
    public String getSLSLogStore() {
        return this.SLSLogStore;
    }

    public UpdateDcdnSLSRealtimeLogDeliveryRequest setSLSProject(String SLSProject) {
        this.SLSProject = SLSProject;
        return this;
    }
    public String getSLSProject() {
        return this.SLSProject;
    }

    public UpdateDcdnSLSRealtimeLogDeliveryRequest setSLSRegion(String SLSRegion) {
        this.SLSRegion = SLSRegion;
        return this;
    }
    public String getSLSRegion() {
        return this.SLSRegion;
    }

    public UpdateDcdnSLSRealtimeLogDeliveryRequest setSamplingRate(String samplingRate) {
        this.samplingRate = samplingRate;
        return this;
    }
    public String getSamplingRate() {
        return this.samplingRate;
    }

}
