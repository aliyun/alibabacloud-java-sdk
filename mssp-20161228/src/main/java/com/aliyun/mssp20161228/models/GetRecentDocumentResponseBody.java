// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mssp20161228.models;

import com.aliyun.tea.*;

public class GetRecentDocumentResponseBody extends TeaModel {
    /**
     * <p>Interface response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data returned by the interface.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetRecentDocumentResponseBodyData> data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Response message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4916FA8D-F294-518D-B373-8B59D63CAB19</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether the call was successful. - <strong>true</strong>: The call was successful. - <strong>false</strong>: The call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetRecentDocumentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRecentDocumentResponseBody self = new GetRecentDocumentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRecentDocumentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRecentDocumentResponseBody setData(java.util.List<GetRecentDocumentResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetRecentDocumentResponseBodyData> getData() {
        return this.data;
    }

    public GetRecentDocumentResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetRecentDocumentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRecentDocumentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRecentDocumentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRecentDocumentResponseBodyData extends TeaModel {
        /**
         * <p>Primary key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>360491</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Document name</p>
         * 
         * <strong>example:</strong>
         * <p>文档名称测试</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Upload time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-20 14:30:38</p>
         */
        @NameInMap("UploadTime")
        public String uploadTime;

        public static GetRecentDocumentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRecentDocumentResponseBodyData self = new GetRecentDocumentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRecentDocumentResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetRecentDocumentResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRecentDocumentResponseBodyData setUploadTime(String uploadTime) {
            this.uploadTime = uploadTime;
            return this;
        }
        public String getUploadTime() {
            return this.uploadTime;
        }

    }

}
