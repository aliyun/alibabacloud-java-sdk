// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnSLSRealtimeLogDeliveryResponseBody extends TeaModel {
    /**
     * <p>The configuration results of the domain name.</p>
     */
    @NameInMap("Content")
    public DescribeDcdnSLSRealtimeLogDeliveryResponseBodyContent content;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnSLSRealtimeLogDeliveryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnSLSRealtimeLogDeliveryResponseBody self = new DescribeDcdnSLSRealtimeLogDeliveryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnSLSRealtimeLogDeliveryResponseBody setContent(DescribeDcdnSLSRealtimeLogDeliveryResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public DescribeDcdnSLSRealtimeLogDeliveryResponseBodyContent getContent() {
        return this.content;
    }

    public DescribeDcdnSLSRealtimeLogDeliveryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnSLSRealtimeLogDeliveryResponseBodyContent extends TeaModel {
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
         * <p>The region from which logs were collected.</p>
         */
        @NameInMap("DataCenter")
        public String dataCenter;

        /**
         * <p>The domain names from which logs were collected. You can specify one or more domain names. Separate multiple domain names with commas (,).</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The name of the field. For more information about fields in real-time log entries, see [Fields in a real-time log](~~324199~~).</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

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

        /**
         * <p>The status of real-time logs.</p>
         * <br>
         * <p>*   **success**</p>
         * <p>*   **fail**</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The type of log delivery. Only **SLS_POST** is supported.</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeDcdnSLSRealtimeLogDeliveryResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnSLSRealtimeLogDeliveryResponseBodyContent self = new DescribeDcdnSLSRealtimeLogDeliveryResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnSLSRealtimeLogDeliveryResponseBodyContent setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public DescribeDcdnSLSRealtimeLogDeliveryResponseBodyContent setDataCenter(String dataCenter) {
            this.dataCenter = dataCenter;
            return this;
        }
        public String getDataCenter() {
            return this.dataCenter;
        }

        public DescribeDcdnSLSRealtimeLogDeliveryResponseBodyContent setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDcdnSLSRealtimeLogDeliveryResponseBodyContent setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public DescribeDcdnSLSRealtimeLogDeliveryResponseBodyContent setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeDcdnSLSRealtimeLogDeliveryResponseBodyContent setSLSLogStore(String SLSLogStore) {
            this.SLSLogStore = SLSLogStore;
            return this;
        }
        public String getSLSLogStore() {
            return this.SLSLogStore;
        }

        public DescribeDcdnSLSRealtimeLogDeliveryResponseBodyContent setSLSProject(String SLSProject) {
            this.SLSProject = SLSProject;
            return this;
        }
        public String getSLSProject() {
            return this.SLSProject;
        }

        public DescribeDcdnSLSRealtimeLogDeliveryResponseBodyContent setSLSRegion(String SLSRegion) {
            this.SLSRegion = SLSRegion;
            return this;
        }
        public String getSLSRegion() {
            return this.SLSRegion;
        }

        public DescribeDcdnSLSRealtimeLogDeliveryResponseBodyContent setSamplingRate(String samplingRate) {
            this.samplingRate = samplingRate;
            return this;
        }
        public String getSamplingRate() {
            return this.samplingRate;
        }

        public DescribeDcdnSLSRealtimeLogDeliveryResponseBodyContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDcdnSLSRealtimeLogDeliveryResponseBodyContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
