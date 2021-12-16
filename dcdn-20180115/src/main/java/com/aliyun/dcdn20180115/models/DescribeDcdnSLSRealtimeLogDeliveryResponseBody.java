// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnSLSRealtimeLogDeliveryResponseBody extends TeaModel {
    @NameInMap("Content")
    public DescribeDcdnSLSRealtimeLogDeliveryResponseBodyContent content;

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
        public String samplingRate;

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

        public DescribeDcdnSLSRealtimeLogDeliveryResponseBodyContent setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
