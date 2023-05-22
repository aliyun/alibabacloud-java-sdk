// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateDcdnSLSRealTimeLogDeliveryRequest extends TeaModel {
    /**
     * <p>The type of the collected logs. Default value: cdn_log_access_l1. Valid values:</p>
     * <br>
     * <p>*   **cdn_log_access_l1**: access logs of Dynamic Content Delivery Network (DCDN) points of presence (POPs)</p>
     * <p>*   **cdn_log_origin**: back-to-origin logs</p>
     * <p>*   **cdn_log_er**: EdgeRoutine logs</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <p>The data center. Valid values:</p>
     * <br>
     * <p>*   cn: China</p>
     * <p>*   sg: Singapore</p>
     * <p>*   in: India</p>
     * <p>*   eu: Europe</p>
     * <p>*   us: United States</p>
     */
    @NameInMap("DataCenter")
    public String dataCenter;

    /**
     * <p>The domain names from which logs were collected. You can specify one or more domain names. Separate multiple domain names with commas (,).</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The name of a real-time log delivery project.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The name of the Log Service Logstore.</p>
     */
    @NameInMap("SLSLogStore")
    public String SLSLogStore;

    /**
     * <p>The name of the Log Service project.</p>
     */
    @NameInMap("SLSProject")
    public String SLSProject;

    /**
     * <p>The region to which real-time logs are delivered.</p>
     */
    @NameInMap("SLSRegion")
    public String SLSRegion;

    /**
     * <p>The sampling rate.</p>
     */
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
