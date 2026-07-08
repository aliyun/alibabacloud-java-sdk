// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetInterveneTemplateFileUrlResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetInterveneTemplateFileUrlResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>DA021073-17CE-5CCF-9FEB-93226C766887</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. \<code>true\\</code> indicates success. \<code>false\\</code> indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetInterveneTemplateFileUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInterveneTemplateFileUrlResponseBody self = new GetInterveneTemplateFileUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInterveneTemplateFileUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInterveneTemplateFileUrlResponseBody setData(GetInterveneTemplateFileUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetInterveneTemplateFileUrlResponseBodyData getData() {
        return this.data;
    }

    public GetInterveneTemplateFileUrlResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetInterveneTemplateFileUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInterveneTemplateFileUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInterveneTemplateFileUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetInterveneTemplateFileUrlResponseBodyData extends TeaModel {
        @NameInMap("Code")
        public Integer code;

        /**
         * <p>The URL of the template file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxx/xxx.xls">http://xxx/xxx.xls</a></p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        public static GetInterveneTemplateFileUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInterveneTemplateFileUrlResponseBodyData self = new GetInterveneTemplateFileUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInterveneTemplateFileUrlResponseBodyData setCode(Integer code) {
            this.code = code;
            return this;
        }
        public Integer getCode() {
            return this.code;
        }

        public GetInterveneTemplateFileUrlResponseBodyData setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

    }

}
