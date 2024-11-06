// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateDcdnSLSRealTimeLogDeliveryRequest extends TeaModel {
    /**
     * <p>The type of the collected logs. Default value: cdn_log_access_l1. Valid values:</p>
     * <ul>
     * <li><strong>cdn_log_access_l1</strong>: access logs of Dynamic Content Delivery Network (DCDN) points of presence (POPs)</li>
     * <li><strong>cdn_log_origin</strong>: back-to-origin logs</li>
     * <li><strong>cdn_log_er</strong>: EdgeRoutine logs</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cdn_log_access_l1</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <p>The data center. Valid values:</p>
     * <ul>
     * <li>cn: China</li>
     * <li>sg: Singapore</li>
     * <li>eu: Europe</li>
     * <li>us: United States</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn</p>
     */
    @NameInMap("DataCenter")
    public String dataCenter;

    /**
     * <p>The domain names from which logs were collected. You can specify one or more domain names. Separate multiple domain names with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The name of a real-time log delivery project.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The name of the Log Service Logstore.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("SLSLogStore")
    public String SLSLogStore;

    /**
     * <p>The name of the Log Service project.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyundoc</p>
     */
    @NameInMap("SLSProject")
    public String SLSProject;

    /**
     * <p>The region to which real-time logs are delivered.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("SLSRegion")
    public String SLSRegion;

    /**
     * <p>The sampling rate.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
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
