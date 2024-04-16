// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSensitivityLevelResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID. You can use the ID to query logs and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The sensitivity levels.</p>
     */
    @NameInMap("SensitivityLevelList")
    public java.util.List<ListSensitivityLevelResponseBodySensitivityLevelList> sensitivityLevelList;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListSensitivityLevelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSensitivityLevelResponseBody self = new ListSensitivityLevelResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSensitivityLevelResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListSensitivityLevelResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListSensitivityLevelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSensitivityLevelResponseBody setSensitivityLevelList(java.util.List<ListSensitivityLevelResponseBodySensitivityLevelList> sensitivityLevelList) {
        this.sensitivityLevelList = sensitivityLevelList;
        return this;
    }
    public java.util.List<ListSensitivityLevelResponseBodySensitivityLevelList> getSensitivityLevelList() {
        return this.sensitivityLevelList;
    }

    public ListSensitivityLevelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSensitivityLevelResponseBodySensitivityLevelList extends TeaModel {
        /**
         * <p>Indicates whether the fields of the sensitive level are displayed in plaintext.</p>
         */
        @NameInMap("IsPlain")
        public Boolean isPlain;

        /**
         * <p>The name of the sensitive level.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the classification template.</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The type of the classification template. Valid values:</p>
         * <br>
         * <p>*   **INNER**: a built-in template.</p>
         * <p>*   **USER_DEFINE**: a custom template.</p>
         */
        @NameInMap("TemplateType")
        public String templateType;

        public static ListSensitivityLevelResponseBodySensitivityLevelList build(java.util.Map<String, ?> map) throws Exception {
            ListSensitivityLevelResponseBodySensitivityLevelList self = new ListSensitivityLevelResponseBodySensitivityLevelList();
            return TeaModel.build(map, self);
        }

        public ListSensitivityLevelResponseBodySensitivityLevelList setIsPlain(Boolean isPlain) {
            this.isPlain = isPlain;
            return this;
        }
        public Boolean getIsPlain() {
            return this.isPlain;
        }

        public ListSensitivityLevelResponseBodySensitivityLevelList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSensitivityLevelResponseBodySensitivityLevelList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListSensitivityLevelResponseBodySensitivityLevelList setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

    }

}
