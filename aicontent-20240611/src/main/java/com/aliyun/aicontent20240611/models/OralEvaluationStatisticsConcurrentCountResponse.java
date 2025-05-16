// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class OralEvaluationStatisticsConcurrentCountResponse extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("projectData")
    public OralEvaluationStatisticsConcurrentCountResponseProjectData projectData;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("projectId")
    public String projectId;

    public static OralEvaluationStatisticsConcurrentCountResponse build(java.util.Map<String, ?> map) throws Exception {
        OralEvaluationStatisticsConcurrentCountResponse self = new OralEvaluationStatisticsConcurrentCountResponse();
        return TeaModel.build(map, self);
    }

    public OralEvaluationStatisticsConcurrentCountResponse setProjectData(OralEvaluationStatisticsConcurrentCountResponseProjectData projectData) {
        this.projectData = projectData;
        return this;
    }
    public OralEvaluationStatisticsConcurrentCountResponseProjectData getProjectData() {
        return this.projectData;
    }

    public OralEvaluationStatisticsConcurrentCountResponse setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public static class OralEvaluationStatisticsConcurrentCountResponseProjectDataApplicationDataData extends TeaModel {
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

        public static OralEvaluationStatisticsConcurrentCountResponseProjectDataApplicationDataData build(java.util.Map<String, ?> map) throws Exception {
            OralEvaluationStatisticsConcurrentCountResponseProjectDataApplicationDataData self = new OralEvaluationStatisticsConcurrentCountResponseProjectDataApplicationDataData();
            return TeaModel.build(map, self);
        }

        public OralEvaluationStatisticsConcurrentCountResponseProjectDataApplicationDataData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public OralEvaluationStatisticsConcurrentCountResponseProjectDataApplicationDataData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class OralEvaluationStatisticsConcurrentCountResponseProjectDataApplicationData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<OralEvaluationStatisticsConcurrentCountResponseProjectDataApplicationDataData> data;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("applicationAccessId")
        public String applicationAccessId;

        public static OralEvaluationStatisticsConcurrentCountResponseProjectDataApplicationData build(java.util.Map<String, ?> map) throws Exception {
            OralEvaluationStatisticsConcurrentCountResponseProjectDataApplicationData self = new OralEvaluationStatisticsConcurrentCountResponseProjectDataApplicationData();
            return TeaModel.build(map, self);
        }

        public OralEvaluationStatisticsConcurrentCountResponseProjectDataApplicationData setData(java.util.List<OralEvaluationStatisticsConcurrentCountResponseProjectDataApplicationDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<OralEvaluationStatisticsConcurrentCountResponseProjectDataApplicationDataData> getData() {
            return this.data;
        }

        public OralEvaluationStatisticsConcurrentCountResponseProjectDataApplicationData setApplicationAccessId(String applicationAccessId) {
            this.applicationAccessId = applicationAccessId;
            return this;
        }
        public String getApplicationAccessId() {
            return this.applicationAccessId;
        }

    }

    public static class OralEvaluationStatisticsConcurrentCountResponseProjectData extends TeaModel {
        @NameInMap("ApplicationData")
        public java.util.List<OralEvaluationStatisticsConcurrentCountResponseProjectDataApplicationData> applicationData;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("applicationInternalId")
        public String applicationInternalId;

        public static OralEvaluationStatisticsConcurrentCountResponseProjectData build(java.util.Map<String, ?> map) throws Exception {
            OralEvaluationStatisticsConcurrentCountResponseProjectData self = new OralEvaluationStatisticsConcurrentCountResponseProjectData();
            return TeaModel.build(map, self);
        }

        public OralEvaluationStatisticsConcurrentCountResponseProjectData setApplicationData(java.util.List<OralEvaluationStatisticsConcurrentCountResponseProjectDataApplicationData> applicationData) {
            this.applicationData = applicationData;
            return this;
        }
        public java.util.List<OralEvaluationStatisticsConcurrentCountResponseProjectDataApplicationData> getApplicationData() {
            return this.applicationData;
        }

        public OralEvaluationStatisticsConcurrentCountResponseProjectData setApplicationInternalId(String applicationInternalId) {
            this.applicationInternalId = applicationInternalId;
            return this;
        }
        public String getApplicationInternalId() {
            return this.applicationInternalId;
        }

    }

}
