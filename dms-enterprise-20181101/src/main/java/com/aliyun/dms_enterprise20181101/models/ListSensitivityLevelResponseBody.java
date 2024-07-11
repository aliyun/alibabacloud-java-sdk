// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListSensitivityLevelResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID. You can use the ID to query logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>4E1D2B4D-3E53-4ABC-999D-1D2520B3471A</p>
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
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsPlain")
        public Boolean isPlain;

        /**
         * <p>The name of the sensitive level.</p>
         * 
         * <strong>example:</strong>
         * <p>S2</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the classification template.</p>
         * 
         * <strong>example:</strong>
         * <p>1070</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The type of the classification template. Valid values:</p>
         * <ul>
         * <li><strong>INNER</strong>: a built-in template.</li>
         * <li><strong>USER_DEFINE</strong>: a custom template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INNER</p>
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
