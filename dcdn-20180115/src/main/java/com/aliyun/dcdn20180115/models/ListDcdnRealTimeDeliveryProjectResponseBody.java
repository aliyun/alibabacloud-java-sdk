// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class ListDcdnRealTimeDeliveryProjectResponseBody extends TeaModel {
    @NameInMap("Content")
    public ListDcdnRealTimeDeliveryProjectResponseBodyContent content;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("BusinessType")
        public String businessType;

        @NameInMap("DataCenter")
        public String dataCenter;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("FieldName")
        public String fieldName;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("SLSLogStore")
        public String SLSLogStore;

        @NameInMap("SLSProject")
        public String SLSProject;

        @NameInMap("SLSRegion")
        public String SLSRegion;

        @NameInMap("SamplingRate")
        public Float samplingRate;

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
