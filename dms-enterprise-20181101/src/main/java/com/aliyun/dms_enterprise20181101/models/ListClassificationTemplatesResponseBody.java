// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListClassificationTemplatesResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The list of templates.</p>
     */
    @NameInMap("TemplateList")
    public java.util.List<ListClassificationTemplatesResponseBodyTemplateList> templateList;

    public static ListClassificationTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClassificationTemplatesResponseBody self = new ListClassificationTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClassificationTemplatesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListClassificationTemplatesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListClassificationTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClassificationTemplatesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListClassificationTemplatesResponseBody setTemplateList(java.util.List<ListClassificationTemplatesResponseBodyTemplateList> templateList) {
        this.templateList = templateList;
        return this;
    }
    public java.util.List<ListClassificationTemplatesResponseBodyTemplateList> getTemplateList() {
        return this.templateList;
    }

    public static class ListClassificationTemplatesResponseBodyTemplateList extends TeaModel {
        /**
         * <p>The name of the classification template.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The remarks.</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The ID of the classification template.</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        /**
         * <p>The type of the classification template. Valid values:</p>
         * <br>
         * <p>*   **INNER**: built-in template</p>
         * <p>*   **USER_DEFINE**: custom template</p>
         */
        @NameInMap("TemplateType")
        public String templateType;

        public static ListClassificationTemplatesResponseBodyTemplateList build(java.util.Map<String, ?> map) throws Exception {
            ListClassificationTemplatesResponseBodyTemplateList self = new ListClassificationTemplatesResponseBodyTemplateList();
            return TeaModel.build(map, self);
        }

        public ListClassificationTemplatesResponseBodyTemplateList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListClassificationTemplatesResponseBodyTemplateList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListClassificationTemplatesResponseBodyTemplateList setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public ListClassificationTemplatesResponseBodyTemplateList setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

    }

}
