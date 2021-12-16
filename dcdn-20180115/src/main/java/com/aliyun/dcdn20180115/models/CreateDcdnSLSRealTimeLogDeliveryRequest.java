// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateDcdnSLSRealTimeLogDeliveryRequest extends TeaModel {
    @NameInMap("BusinessType")
    public String businessType;

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

    public static CreateDcdnSLSRealTimeLogDeliveryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDcdnSLSRealTimeLogDeliveryRequest self = new CreateDcdnSLSRealTimeLogDeliveryRequest();
        return TeaModel.build(map, self);
    }

    public CreateDcdnSLSRealTimeLogDeliveryRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public CreateDcdnSLSRealTimeLogDeliveryRequest setDataCenter(String dataCenter) {
        this.dataCenter = dataCenter;
        return this;
    }
    public String getDataCenter() {
        return this.dataCenter;
    }

    public CreateDcdnSLSRealTimeLogDeliveryRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateDcdnSLSRealTimeLogDeliveryRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDcdnSLSRealTimeLogDeliveryRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateDcdnSLSRealTimeLogDeliveryRequest setSLSLogStore(String SLSLogStore) {
        this.SLSLogStore = SLSLogStore;
        return this;
    }
    public String getSLSLogStore() {
        return this.SLSLogStore;
    }

    public CreateDcdnSLSRealTimeLogDeliveryRequest setSLSProject(String SLSProject) {
        this.SLSProject = SLSProject;
        return this;
    }
    public String getSLSProject() {
        return this.SLSProject;
    }

    public CreateDcdnSLSRealTimeLogDeliveryRequest setSLSRegion(String SLSRegion) {
        this.SLSRegion = SLSRegion;
        return this;
    }
    public String getSLSRegion() {
        return this.SLSRegion;
    }

    public CreateDcdnSLSRealTimeLogDeliveryRequest setSamplingRate(String samplingRate) {
        this.samplingRate = samplingRate;
        return this;
    }
    public String getSamplingRate() {
        return this.samplingRate;
    }

}
