// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class AddFileResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>DataCenter.FileTooLarge</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned for the request.</p>
     */
    @NameInMap("Data")
    public AddFileResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>User not authorized to operate on the specified resource.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>778C0B3B-xxxx-5FC1-A947-36EDD13606AB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status code of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the API call was successful. Valid values:</p>
     * <ul>
     * <li><p><code>true</code>: The call was successful.</p>
     * </li>
     * <li><p><code>false</code>: The call failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static AddFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddFileResponseBody self = new AddFileResponseBody();
        return TeaModel.build(map, self);
    }

    public AddFileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddFileResponseBody setData(AddFileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddFileResponseBodyData getData() {
        return this.data;
    }

    public AddFileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddFileResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AddFileResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class AddFileResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the file. Save this ID for use in subsequent API calls involving this file.</p>
         * 
         * <strong>example:</strong>
         * <p>file_9a65732555b54d5ea10796ca5742ba22_xxxxxxxx</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>The parser that was used for the file. A possible value is:</p>
         * <ul>
         * <li><code>DASHSCOPE_DOCMIND</code>: Alibaba Cloud Document Intelligence</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DASHSCOPE_DOCMIND</p>
         */
        @NameInMap("Parser")
        public String parser;

        public static AddFileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddFileResponseBodyData self = new AddFileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddFileResponseBodyData setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public AddFileResponseBodyData setParser(String parser) {
            this.parser = parser;
            return this;
        }
        public String getParser() {
            return this.parser;
        }

    }

}
