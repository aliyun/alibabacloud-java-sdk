// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class CreateStandardMappingResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The creation result.</p>
     */
    @NameInMap("Data")
    public CreateStandardMappingResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The details of the backend exception.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateStandardMappingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateStandardMappingResponseBody self = new CreateStandardMappingResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateStandardMappingResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateStandardMappingResponseBody setData(CreateStandardMappingResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateStandardMappingResponseBodyData getData() {
        return this.data;
    }

    public CreateStandardMappingResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateStandardMappingResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateStandardMappingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateStandardMappingResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateStandardMappingResponseBodyData extends TeaModel {
        /**
         * <p>The list of asset GUIDs that failed to be created.</p>
         */
        @NameInMap("FailedGuidList")
        public java.util.List<String> failedGuidList;

        /**
         * <p>The number of successfully added mappings.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SuccessCount")
        public Long successCount;

        public static CreateStandardMappingResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateStandardMappingResponseBodyData self = new CreateStandardMappingResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateStandardMappingResponseBodyData setFailedGuidList(java.util.List<String> failedGuidList) {
            this.failedGuidList = failedGuidList;
            return this;
        }
        public java.util.List<String> getFailedGuidList() {
            return this.failedGuidList;
        }

        public CreateStandardMappingResponseBodyData setSuccessCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }
        public Long getSuccessCount() {
            return this.successCount;
        }

    }

}
