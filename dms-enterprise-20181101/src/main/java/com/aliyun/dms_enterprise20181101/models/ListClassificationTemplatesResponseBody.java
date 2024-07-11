// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListClassificationTemplatesResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>90260530-565C-42B9-A6E8-893481FE6AB6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The ID of the classification template.</p>
         * 
         * <strong>example:</strong>
         * <p>3**</p>
         */
        @NameInMap("TemplateId")
        public Long templateId;

        /**
         * <p>The type of the classification template. Valid values:</p>
         * <ul>
         * <li><strong>INNER</strong>: built-in template</li>
         * <li><strong>USER_DEFINE</strong>: custom template</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>USER_DEFINE</p>
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
