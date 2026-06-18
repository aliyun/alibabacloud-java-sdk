// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class UpdateFileTagResponseBody extends TeaModel {
    /**
     * <p>The result code. A value of <code>Success</code> indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public UpdateFileTagResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Requests throttling triggered.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>35A267BF-xxxx-54DB-8394-AA3B0742D833</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: The request was successful.</p>
     * </li>
     * <li><p><code>false</code>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateFileTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileTagResponseBody self = new UpdateFileTagResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFileTagResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateFileTagResponseBody setData(UpdateFileTagResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateFileTagResponseBodyData getData() {
        return this.data;
    }

    public UpdateFileTagResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateFileTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateFileTagResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateFileTagResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateFileTagResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>file_9a65732555b54d5ea10796ca5742ba22_xxxxxxxx</p>
         */
        @NameInMap("FileId")
        public String fileId;

        public static UpdateFileTagResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateFileTagResponseBodyData self = new UpdateFileTagResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateFileTagResponseBodyData setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

    }

}
