// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetDataCheckTemplateListResponseBody extends TeaModel {
    /**
     * <p>The data list returned by the operation. For the structure of each element, see the child field descriptions.</p>
     */
    @NameInMap("data")
    public java.util.List<GetDataCheckTemplateListResponseBodyData> data;

    /**
     * <p>The error code. An empty string is returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message. An empty string is returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li>true: The call is successful.</li>
     * <li>false: The call failed. Check errCode and errMessage for details.</li>
     * </ul>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetDataCheckTemplateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataCheckTemplateListResponseBody self = new GetDataCheckTemplateListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataCheckTemplateListResponseBody setData(java.util.List<GetDataCheckTemplateListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetDataCheckTemplateListResponseBodyData> getData() {
        return this.data;
    }

    public GetDataCheckTemplateListResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetDataCheckTemplateListResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public GetDataCheckTemplateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataCheckTemplateListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataCheckTemplateListResponseBodyData extends TeaModel {
        /**
         * <p>The validation rule type. Valid values:</p>
         * <ul>
         * <li>0: data volume comparison.</li>
         * <li>1: metric comparison.</li>
         * <li>2: weak content comparison.</li>
         * <li>3: custom comparison.</li>
         * <li>4: full-text comparison.</li>
         * <li>5: null rate comparison.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("checkType")
        public Integer checkType;

        /**
         * <p>The display name of the check type, used in exported reports.</p>
         * 
         * <strong>example:</strong>
         * <p>Metric Comparison</p>
         */
        @NameInMap("checkTypeExport")
        public String checkTypeExport;

        /**
         * <p>The name of the check type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("checkTypeName")
        public Integer checkTypeName;

        /**
         * <p>The list of covered data source types. Multiple values are separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>Hive,MaxCompute</p>
         */
        @NameInMap("dsTypes")
        public String dsTypes;

        /**
         * <p>The list of covered validation engine types, such as Tez and MapReduce. When returned as a string, multiple values are separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>Tez,MapReduce</p>
         */
        @NameInMap("engineTypes")
        public String engineTypes;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-16 10:00:00</p>
         */
        @NameInMap("gmtModified")
        public String gmtModified;

        /**
         * <p>Specifies whether the template is built-in. Valid values:</p>
         * <ul>
         * <li>0: No. The template is a custom template.</li>
         * <li>1: Yes. The template is a built-in template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("isBuiltin")
        public Integer isBuiltin;

        /**
         * <p>Indicates whether the template is referenced by a validation task. Valid values:</p>
         * <ul>
         * <li>true: The template is referenced.</li>
         * <li>false: The template is not referenced.
         * The delete operation does not verify this reference relationship. Confirm before deleting.</li>
         * </ul>
         */
        @NameInMap("isUsedByTask")
        public Boolean isUsedByTask;

        /**
         * <p>The template description.</p>
         * 
         * <strong>example:</strong>
         * <p>Description of the data volume validation template</p>
         */
        @NameInMap("templateDesc")
        public String templateDesc;

        /**
         * <p>The validation template ID (logical foreign key) that uniquely identifies a validation template.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("templateId")
        public String templateId;

        /**
         * <p>The name of the validation template.</p>
         * 
         * <strong>example:</strong>
         * <p>DataVolumeValidationTemplate</p>
         */
        @NameInMap("templateName")
        public String templateName;

        public static GetDataCheckTemplateListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataCheckTemplateListResponseBodyData self = new GetDataCheckTemplateListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataCheckTemplateListResponseBodyData setCheckType(Integer checkType) {
            this.checkType = checkType;
            return this;
        }
        public Integer getCheckType() {
            return this.checkType;
        }

        public GetDataCheckTemplateListResponseBodyData setCheckTypeExport(String checkTypeExport) {
            this.checkTypeExport = checkTypeExport;
            return this;
        }
        public String getCheckTypeExport() {
            return this.checkTypeExport;
        }

        public GetDataCheckTemplateListResponseBodyData setCheckTypeName(Integer checkTypeName) {
            this.checkTypeName = checkTypeName;
            return this;
        }
        public Integer getCheckTypeName() {
            return this.checkTypeName;
        }

        public GetDataCheckTemplateListResponseBodyData setDsTypes(String dsTypes) {
            this.dsTypes = dsTypes;
            return this;
        }
        public String getDsTypes() {
            return this.dsTypes;
        }

        public GetDataCheckTemplateListResponseBodyData setEngineTypes(String engineTypes) {
            this.engineTypes = engineTypes;
            return this;
        }
        public String getEngineTypes() {
            return this.engineTypes;
        }

        public GetDataCheckTemplateListResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetDataCheckTemplateListResponseBodyData setIsBuiltin(Integer isBuiltin) {
            this.isBuiltin = isBuiltin;
            return this;
        }
        public Integer getIsBuiltin() {
            return this.isBuiltin;
        }

        public GetDataCheckTemplateListResponseBodyData setIsUsedByTask(Boolean isUsedByTask) {
            this.isUsedByTask = isUsedByTask;
            return this;
        }
        public Boolean getIsUsedByTask() {
            return this.isUsedByTask;
        }

        public GetDataCheckTemplateListResponseBodyData setTemplateDesc(String templateDesc) {
            this.templateDesc = templateDesc;
            return this;
        }
        public String getTemplateDesc() {
            return this.templateDesc;
        }

        public GetDataCheckTemplateListResponseBodyData setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetDataCheckTemplateListResponseBodyData setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

    }

}
