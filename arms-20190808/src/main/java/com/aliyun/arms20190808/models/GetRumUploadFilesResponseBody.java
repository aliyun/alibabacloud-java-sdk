// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRumUploadFilesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<GetRumUploadFilesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2983BEF7-4A0D-47A2-94A2-8E9C5E63****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetRumUploadFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRumUploadFilesResponseBody self = new GetRumUploadFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRumUploadFilesResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetRumUploadFilesResponseBody setData(java.util.List<GetRumUploadFilesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetRumUploadFilesResponseBodyData> getData() {
        return this.data;
    }

    public GetRumUploadFilesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetRumUploadFilesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRumUploadFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRumUploadFilesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRumUploadFilesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test.js.map</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>1682863151000</p>
         */
        @NameInMap("LastModifiedTime")
        public Object lastModifiedTime;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Size")
        public String size;

        /**
         * <strong>example:</strong>
         * <p>cxxxerfewrfwerfwerffvrt</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("VersionId")
        public String versionId;

        public static GetRumUploadFilesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRumUploadFilesResponseBodyData self = new GetRumUploadFilesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRumUploadFilesResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetRumUploadFilesResponseBodyData setLastModifiedTime(Object lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public Object getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public GetRumUploadFilesResponseBodyData setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public GetRumUploadFilesResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public GetRumUploadFilesResponseBodyData setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

}
