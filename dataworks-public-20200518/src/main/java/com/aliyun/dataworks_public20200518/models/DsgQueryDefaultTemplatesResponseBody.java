// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgQueryDefaultTemplatesResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DsgQueryDefaultTemplatesResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("DataType")
        public String dataType;

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
