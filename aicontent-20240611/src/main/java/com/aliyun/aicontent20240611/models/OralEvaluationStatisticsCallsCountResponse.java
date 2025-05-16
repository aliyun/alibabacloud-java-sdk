// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class OralEvaluationStatisticsCallsCountResponse extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("projectData")
    public OralEvaluationStatisticsCallsCountResponseProjectData projectData;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("projectId")
    public String projectId;

    public static OralEvaluationStatisticsCallsCountResponse build(java.util.Map<String, ?> map) throws Exception {
        OralEvaluationStatisticsCallsCountResponse self = new OralEvaluationStatisticsCallsCountResponse();
        return TeaModel.build(map, self);
    }

    public OralEvaluationStatisticsCallsCountResponse setProjectData(OralEvaluationStatisticsCallsCountResponseProjectData projectData) {
        this.projectData = projectData;
        return this;
    }
    public OralEvaluationStatisticsCallsCountResponseProjectData getProjectData() {
        return this.projectData;
    }

    public OralEvaluationStatisticsCallsCountResponse setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public static class OralEvaluationStatisticsCallsCountResponseProjectDataApplicationDataData extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("count")
        public Integer count;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("name")
        public String name;

        public static OralEvaluationStatisticsCallsCountResponseProjectDataApplicationDataData build(java.util.Map<String, ?> map) throws Exception {
            OralEvaluationStatisticsCallsCountResponseProjectDataApplicationDataData self = new OralEvaluationStatisticsCallsCountResponseProjectDataApplicationDataData();
            return TeaModel.build(map, self);
        }

        public OralEvaluationStatisticsCallsCountResponseProjectDataApplicationDataData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public OralEvaluationStatisticsCallsCountResponseProjectDataApplicationDataData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class OralEvaluationStatisticsCallsCountResponseProjectDataApplicationData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<OralEvaluationStatisticsCallsCountResponseProjectDataApplicationDataData> data;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("applicationAccessId")
        public String applicationAccessId;

        public static OralEvaluationStatisticsCallsCountResponseProjectDataApplicationData build(java.util.Map<String, ?> map) throws Exception {
            OralEvaluationStatisticsCallsCountResponseProjectDataApplicationData self = new OralEvaluationStatisticsCallsCountResponseProjectDataApplicationData();
            return TeaModel.build(map, self);
        }

        public OralEvaluationStatisticsCallsCountResponseProjectDataApplicationData setData(java.util.List<OralEvaluationStatisticsCallsCountResponseProjectDataApplicationDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<OralEvaluationStatisticsCallsCountResponseProjectDataApplicationDataData> getData() {
            return this.data;
        }

        public OralEvaluationStatisticsCallsCountResponseProjectDataApplicationData setApplicationAccessId(String applicationAccessId) {
            this.applicationAccessId = applicationAccessId;
            return this;
        }
        public String getApplicationAccessId() {
            return this.applicationAccessId;
        }

    }

    public static class OralEvaluationStatisticsCallsCountResponseProjectData extends TeaModel {
        @NameInMap("ApplicationData")
        public java.util.List<OralEvaluationStatisticsCallsCountResponseProjectDataApplicationData> applicationData;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("applicationInternalId")
        public String applicationInternalId;

        public static OralEvaluationStatisticsCallsCountResponseProjectData build(java.util.Map<String, ?> map) throws Exception {
            OralEvaluationStatisticsCallsCountResponseProjectData self = new OralEvaluationStatisticsCallsCountResponseProjectData();
            return TeaModel.build(map, self);
        }

        public OralEvaluationStatisticsCallsCountResponseProjectData setApplicationData(java.util.List<OralEvaluationStatisticsCallsCountResponseProjectDataApplicationData> applicationData) {
            this.applicationData = applicationData;
            return this;
        }
        public java.util.List<OralEvaluationStatisticsCallsCountResponseProjectDataApplicationData> getApplicationData() {
            return this.applicationData;
        }

        public OralEvaluationStatisticsCallsCountResponseProjectData setApplicationInternalId(String applicationInternalId) {
            this.applicationInternalId = applicationInternalId;
            return this;
        }
        public String getApplicationInternalId() {
            return this.applicationInternalId;
        }

    }

}
