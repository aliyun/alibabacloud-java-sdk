// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class OralEvaluationStatisticsErrorCountResponse extends TeaModel {
    @NameInMap("ProjectData")
    public OralEvaluationStatisticsErrorCountResponseProjectData projectData;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("projectId")
    public String projectId;

    public static OralEvaluationStatisticsErrorCountResponse build(java.util.Map<String, ?> map) throws Exception {
        OralEvaluationStatisticsErrorCountResponse self = new OralEvaluationStatisticsErrorCountResponse();
        return TeaModel.build(map, self);
    }

    public OralEvaluationStatisticsErrorCountResponse setProjectData(OralEvaluationStatisticsErrorCountResponseProjectData projectData) {
        this.projectData = projectData;
        return this;
    }
    public OralEvaluationStatisticsErrorCountResponseProjectData getProjectData() {
        return this.projectData;
    }

    public OralEvaluationStatisticsErrorCountResponse setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public static class OralEvaluationStatisticsErrorCountResponseProjectDataApplicationDataDataData extends TeaModel {
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

        public static OralEvaluationStatisticsErrorCountResponseProjectDataApplicationDataDataData build(java.util.Map<String, ?> map) throws Exception {
            OralEvaluationStatisticsErrorCountResponseProjectDataApplicationDataDataData self = new OralEvaluationStatisticsErrorCountResponseProjectDataApplicationDataDataData();
            return TeaModel.build(map, self);
        }

        public OralEvaluationStatisticsErrorCountResponseProjectDataApplicationDataDataData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public OralEvaluationStatisticsErrorCountResponseProjectDataApplicationDataDataData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class OralEvaluationStatisticsErrorCountResponseProjectDataApplicationDataData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<OralEvaluationStatisticsErrorCountResponseProjectDataApplicationDataDataData> data;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        public static OralEvaluationStatisticsErrorCountResponseProjectDataApplicationDataData build(java.util.Map<String, ?> map) throws Exception {
            OralEvaluationStatisticsErrorCountResponseProjectDataApplicationDataData self = new OralEvaluationStatisticsErrorCountResponseProjectDataApplicationDataData();
            return TeaModel.build(map, self);
        }

        public OralEvaluationStatisticsErrorCountResponseProjectDataApplicationDataData setData(java.util.List<OralEvaluationStatisticsErrorCountResponseProjectDataApplicationDataDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<OralEvaluationStatisticsErrorCountResponseProjectDataApplicationDataDataData> getData() {
            return this.data;
        }

        public OralEvaluationStatisticsErrorCountResponseProjectDataApplicationDataData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public OralEvaluationStatisticsErrorCountResponseProjectDataApplicationDataData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

    }

    public static class OralEvaluationStatisticsErrorCountResponseProjectDataApplicationData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<OralEvaluationStatisticsErrorCountResponseProjectDataApplicationDataData> data;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("applicationAccessId")
        public String applicationAccessId;

        public static OralEvaluationStatisticsErrorCountResponseProjectDataApplicationData build(java.util.Map<String, ?> map) throws Exception {
            OralEvaluationStatisticsErrorCountResponseProjectDataApplicationData self = new OralEvaluationStatisticsErrorCountResponseProjectDataApplicationData();
            return TeaModel.build(map, self);
        }

        public OralEvaluationStatisticsErrorCountResponseProjectDataApplicationData setData(java.util.List<OralEvaluationStatisticsErrorCountResponseProjectDataApplicationDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<OralEvaluationStatisticsErrorCountResponseProjectDataApplicationDataData> getData() {
            return this.data;
        }

        public OralEvaluationStatisticsErrorCountResponseProjectDataApplicationData setApplicationAccessId(String applicationAccessId) {
            this.applicationAccessId = applicationAccessId;
            return this;
        }
        public String getApplicationAccessId() {
            return this.applicationAccessId;
        }

    }

    public static class OralEvaluationStatisticsErrorCountResponseProjectData extends TeaModel {
        @NameInMap("ApplicationData")
        public java.util.List<OralEvaluationStatisticsErrorCountResponseProjectDataApplicationData> applicationData;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("applicationInternalId")
        public String applicationInternalId;

        public static OralEvaluationStatisticsErrorCountResponseProjectData build(java.util.Map<String, ?> map) throws Exception {
            OralEvaluationStatisticsErrorCountResponseProjectData self = new OralEvaluationStatisticsErrorCountResponseProjectData();
            return TeaModel.build(map, self);
        }

        public OralEvaluationStatisticsErrorCountResponseProjectData setApplicationData(java.util.List<OralEvaluationStatisticsErrorCountResponseProjectDataApplicationData> applicationData) {
            this.applicationData = applicationData;
            return this;
        }
        public java.util.List<OralEvaluationStatisticsErrorCountResponseProjectDataApplicationData> getApplicationData() {
            return this.applicationData;
        }

        public OralEvaluationStatisticsErrorCountResponseProjectData setApplicationInternalId(String applicationInternalId) {
            this.applicationInternalId = applicationInternalId;
            return this;
        }
        public String getApplicationInternalId() {
            return this.applicationInternalId;
        }

    }

}
