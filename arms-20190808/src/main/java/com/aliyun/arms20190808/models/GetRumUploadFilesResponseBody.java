// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRumUploadFilesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. The status code 200 indicates that the request was successful. Other status codes indicate that the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The queried files.</p>
     */
    @NameInMap("Data")
    public GetRumUploadFilesResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2983BEF7-4A0D-47A2-94A2-8E9C5E63****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
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

    public GetRumUploadFilesResponseBody setData(GetRumUploadFilesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRumUploadFilesResponseBodyData getData() {
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

    public static class GetRumUploadFilesResponseBodyDataFileList extends TeaModel {
        @NameInMap("FileName")
        public String fileName;

        @NameInMap("LastModifiedTime")
        public Object lastModifiedTime;

        @NameInMap("Size")
        public String size;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("VersionId")
        public String versionId;

        public static GetRumUploadFilesResponseBodyDataFileList build(java.util.Map<String, ?> map) throws Exception {
            GetRumUploadFilesResponseBodyDataFileList self = new GetRumUploadFilesResponseBodyDataFileList();
            return TeaModel.build(map, self);
        }

        public GetRumUploadFilesResponseBodyDataFileList setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public GetRumUploadFilesResponseBodyDataFileList setLastModifiedTime(Object lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public Object getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public GetRumUploadFilesResponseBodyDataFileList setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public GetRumUploadFilesResponseBodyDataFileList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public GetRumUploadFilesResponseBodyDataFileList setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

    public static class GetRumUploadFilesResponseBodyData extends TeaModel {
        @NameInMap("FileList")
        public java.util.List<GetRumUploadFilesResponseBodyDataFileList> fileList;

        @NameInMap("NextToken")
        public String nextToken;

        public static GetRumUploadFilesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRumUploadFilesResponseBodyData self = new GetRumUploadFilesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRumUploadFilesResponseBodyData setFileList(java.util.List<GetRumUploadFilesResponseBodyDataFileList> fileList) {
            this.fileList = fileList;
            return this;
        }
        public java.util.List<GetRumUploadFilesResponseBodyDataFileList> getFileList() {
            return this.fileList;
        }

        public GetRumUploadFilesResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

    }

}
