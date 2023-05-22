// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UpdateDcdnSLSRealtimeLogDeliveryRequest extends TeaModel {
    /**
     * <p>The region from which logs are collected.</p>
     * <br>
     * <p>*   **cn**: Chinese mainland</p>
     * <p>*   **sg**: Singapore</p>
     * <p>*   **in**: India</p>
     * <p>*   **eu**: Europe</p>
     * <p>*   **us**: United States</p>
     */
    @NameInMap("DataCenter")
    public String dataCenter;

    /**
     * <p>The domain names from which logs were collected. You can specify one or more domain names. Separate multiple domain names with commas (,).</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The name of the project.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The name of the Logstore.</p>
     */
    @NameInMap("SLSLogStore")
    public String SLSLogStore;

    /**
     * <p>The name of the log file.</p>
     */
    @NameInMap("SLSProject")
    public String SLSProject;

    /**
     * <p>The region to which logs were delivered.</p>
     */
    @NameInMap("SLSRegion")
    public String SLSRegion;

    /**
     * <p>The sampling rate.</p>
     */
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
