// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class ListDcdnRealTimeDeliveryProjectResponseBody extends TeaModel {
    /**
     * <p>The configuration results of the domain name.</p>
     */
    @NameInMap("Content")
    public ListDcdnRealTimeDeliveryProjectResponseBodyContent content;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListDcdnRealTimeDeliveryProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDcdnRealTimeDeliveryProjectResponseBody self = new ListDcdnRealTimeDeliveryProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDcdnRealTimeDeliveryProjectResponseBody setContent(ListDcdnRealTimeDeliveryProjectResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public ListDcdnRealTimeDeliveryProjectResponseBodyContent getContent() {
        return this.content;
    }

    public ListDcdnRealTimeDeliveryProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDcdnRealTimeDeliveryProjectResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListDcdnRealTimeDeliveryProjectResponseBodyContentProjects extends TeaModel {
        /**
         * <p>The type of the collected logs. Default value: cdn_log_access_l1. Valid values:</p>
         * <br>
         * <p>*   **cdn_log_access_l1**: access logs of DCDN POPs</p>
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
        public Float samplingRate;

        /**
         * <p>The type of log delivery. Only **SLS_POST** is supported.</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListDcdnRealTimeDeliveryProjectResponseBodyContentProjects build(java.util.Map<String, ?> map) throws Exception {
            ListDcdnRealTimeDeliveryProjectResponseBodyContentProjects self = new ListDcdnRealTimeDeliveryProjectResponseBodyContentProjects();
            return TeaModel.build(map, self);
        }

        public ListDcdnRealTimeDeliveryProjectResponseBodyContentProjects setBusinessType(String businessType) {
            this.businessType = businessType;
            return this;
        }
        public String getBusinessType() {
            return this.businessType;
        }

        public ListDcdnRealTimeDeliveryProjectResponseBodyContentProjects setDataCenter(String dataCenter) {
            this.dataCenter = dataCenter;
            return this;
        }
        public String getDataCenter() {
            return this.dataCenter;
        }

        public ListDcdnRealTimeDeliveryProjectResponseBodyContentProjects setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public ListDcdnRealTimeDeliveryProjectResponseBodyContentProjects setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public ListDcdnRealTimeDeliveryProjectResponseBodyContentProjects setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListDcdnRealTimeDeliveryProjectResponseBodyContentProjects setSLSLogStore(String SLSLogStore) {
            this.SLSLogStore = SLSLogStore;
            return this;
        }
        public String getSLSLogStore() {
            return this.SLSLogStore;
        }

        public ListDcdnRealTimeDeliveryProjectResponseBodyContentProjects setSLSProject(String SLSProject) {
            this.SLSProject = SLSProject;
            return this;
        }
        public String getSLSProject() {
            return this.SLSProject;
        }

        public ListDcdnRealTimeDeliveryProjectResponseBodyContentProjects setSLSRegion(String SLSRegion) {
            this.SLSRegion = SLSRegion;
            return this;
        }
        public String getSLSRegion() {
            return this.SLSRegion;
        }

        public ListDcdnRealTimeDeliveryProjectResponseBodyContentProjects setSamplingRate(Float samplingRate) {
            this.samplingRate = samplingRate;
            return this;
        }
        public Float getSamplingRate() {
            return this.samplingRate;
        }

        public ListDcdnRealTimeDeliveryProjectResponseBodyContentProjects setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListDcdnRealTimeDeliveryProjectResponseBodyContent extends TeaModel {
        @NameInMap("Projects")
        public java.util.List<ListDcdnRealTimeDeliveryProjectResponseBodyContentProjects> projects;

        public static ListDcdnRealTimeDeliveryProjectResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            ListDcdnRealTimeDeliveryProjectResponseBodyContent self = new ListDcdnRealTimeDeliveryProjectResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public ListDcdnRealTimeDeliveryProjectResponseBodyContent setProjects(java.util.List<ListDcdnRealTimeDeliveryProjectResponseBodyContentProjects> projects) {
            this.projects = projects;
            return this;
        }
        public java.util.List<ListDcdnRealTimeDeliveryProjectResponseBodyContentProjects> getProjects() {
            return this.projects;
        }

    }

}
