// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ListTextbookAssistantGradeVolumesResponseBody extends TeaModel {
    /**
     * <p>The response data object.</p>
     */
    @NameInMap("data")
    public java.util.List<ListTextbookAssistantGradeVolumesResponseBodyData> data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Unknown error</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F3B1AAF2-3041-5AA7-A352-BD5F998FA465</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ListTextbookAssistantGradeVolumesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTextbookAssistantGradeVolumesResponseBody self = new ListTextbookAssistantGradeVolumesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTextbookAssistantGradeVolumesResponseBody setData(java.util.List<ListTextbookAssistantGradeVolumesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListTextbookAssistantGradeVolumesResponseBodyData> getData() {
        return this.data;
    }

    public ListTextbookAssistantGradeVolumesResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListTextbookAssistantGradeVolumesResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListTextbookAssistantGradeVolumesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTextbookAssistantGradeVolumesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTextbookAssistantGradeVolumesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListTextbookAssistantGradeVolumesResponseBodyDataGradeVolumes extends TeaModel {
        /**
         * <p>The grade. Valid values: 1 to 9, corresponding to the grade level.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("grade")
        public String grade;

        /**
         * <p>The volume. Valid values: 0: full volume, 1: first semester, 2: second semester.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("volume")
        public String volume;

        public static ListTextbookAssistantGradeVolumesResponseBodyDataGradeVolumes build(java.util.Map<String, ?> map) throws Exception {
            ListTextbookAssistantGradeVolumesResponseBodyDataGradeVolumes self = new ListTextbookAssistantGradeVolumesResponseBodyDataGradeVolumes();
            return TeaModel.build(map, self);
        }

        public ListTextbookAssistantGradeVolumesResponseBodyDataGradeVolumes setGrade(String grade) {
            this.grade = grade;
            return this;
        }
        public String getGrade() {
            return this.grade;
        }

        public ListTextbookAssistantGradeVolumesResponseBodyDataGradeVolumes setVolume(String volume) {
            this.volume = volume;
            return this;
        }
        public String getVolume() {
            return this.volume;
        }

    }

    public static class ListTextbookAssistantGradeVolumesResponseBodyData extends TeaModel {
        /**
         * <p>The grade and volume data.</p>
         */
        @NameInMap("gradeVolumes")
        public java.util.List<ListTextbookAssistantGradeVolumesResponseBodyDataGradeVolumes> gradeVolumes;

        /**
         * <p>The textbook version.</p>
         * 
         * <strong>example:</strong>
         * <p>PEP edition</p>
         */
        @NameInMap("textbookVersion")
        public String textbookVersion;

        public static ListTextbookAssistantGradeVolumesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTextbookAssistantGradeVolumesResponseBodyData self = new ListTextbookAssistantGradeVolumesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTextbookAssistantGradeVolumesResponseBodyData setGradeVolumes(java.util.List<ListTextbookAssistantGradeVolumesResponseBodyDataGradeVolumes> gradeVolumes) {
            this.gradeVolumes = gradeVolumes;
            return this;
        }
        public java.util.List<ListTextbookAssistantGradeVolumesResponseBodyDataGradeVolumes> getGradeVolumes() {
            return this.gradeVolumes;
        }

        public ListTextbookAssistantGradeVolumesResponseBodyData setTextbookVersion(String textbookVersion) {
            this.textbookVersion = textbookVersion;
            return this;
        }
        public String getTextbookVersion() {
            return this.textbookVersion;
        }

    }

}
