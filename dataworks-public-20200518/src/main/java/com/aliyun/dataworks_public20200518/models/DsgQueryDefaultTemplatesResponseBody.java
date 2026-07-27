// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgQueryDefaultTemplatesResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<DsgQueryDefaultTemplatesResponseBodyData> data;

    /**
     * <p>The error code returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>1029030003</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>param error</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The Request ID. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>102400001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p>true: The request was successful.</p>
     * </li>
     * <li><p>false: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DsgQueryDefaultTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DsgQueryDefaultTemplatesResponseBody self = new DsgQueryDefaultTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DsgQueryDefaultTemplatesResponseBody setData(java.util.List<DsgQueryDefaultTemplatesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DsgQueryDefaultTemplatesResponseBodyData> getData() {
        return this.data;
    }

    public DsgQueryDefaultTemplatesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DsgQueryDefaultTemplatesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DsgQueryDefaultTemplatesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DsgQueryDefaultTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DsgQueryDefaultTemplatesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DsgQueryDefaultTemplatesResponseBodyData extends TeaModel {
        /**
         * <p>The Sensitive Data Type.</p>
         * 
         * <strong>example:</strong>
         * <p>phone</p>
         */
        @NameInMap("DataType")
        public String dataType;

        /**
         * <p>A list of supported Desensitization Methods and their parameter descriptions.</p>
         */
        @NameInMap("DesensPlanTemplate")
        public java.util.Map<String, java.util.List<DataDesensPlanTemplateValue>> desensPlanTemplate;

        public static DsgQueryDefaultTemplatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DsgQueryDefaultTemplatesResponseBodyData self = new DsgQueryDefaultTemplatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DsgQueryDefaultTemplatesResponseBodyData setDataType(String dataType) {
            this.dataType = dataType;
            return this;
        }
        public String getDataType() {
            return this.dataType;
        }

        public DsgQueryDefaultTemplatesResponseBodyData setDesensPlanTemplate(java.util.Map<String, java.util.List<DataDesensPlanTemplateValue>> desensPlanTemplate) {
            this.desensPlanTemplate = desensPlanTemplate;
            return this;
        }
        public java.util.Map<String, java.util.List<DataDesensPlanTemplateValue>> getDesensPlanTemplate() {
            return this.desensPlanTemplate;
        }

    }

}
