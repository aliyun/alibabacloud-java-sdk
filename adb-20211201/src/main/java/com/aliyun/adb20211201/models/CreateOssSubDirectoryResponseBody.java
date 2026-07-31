// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateOssSubDirectoryResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public CreateOssSubDirectoryResponseBodyData data;

    /**
     * <p>The HTTP status code returned. A value of 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <p>The additional information about the call result. Valid values:</p>
     * <ul>
     * <li>If the request was successful, <strong>Success</strong> is returned.                                </li>
     * <li>If the request failed, a specific error code is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3A0DE2E0-A37B-5EE4-9136-C4C473714802</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateOssSubDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOssSubDirectoryResponseBody self = new CreateOssSubDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOssSubDirectoryResponseBody setData(CreateOssSubDirectoryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateOssSubDirectoryResponseBodyData getData() {
        return this.data;
    }

    public CreateOssSubDirectoryResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateOssSubDirectoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateOssSubDirectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOssSubDirectoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateOssSubDirectoryResponseBodyData extends TeaModel {
        /**
         * <p>The client CRC check value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ClientCRC")
        public Long clientCRC;

        /**
         * <p>The ETag of the OSS path.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ETag")
        public String ETag;

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3A0DE2E0-A37B-5EE4-9136-C4C473714802</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>The CRC-64 value of the Alibaba Cloud OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ServerCRC")
        public Long serverCRC;

        public static CreateOssSubDirectoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateOssSubDirectoryResponseBodyData self = new CreateOssSubDirectoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateOssSubDirectoryResponseBodyData setClientCRC(Long clientCRC) {
            this.clientCRC = clientCRC;
            return this;
        }
        public Long getClientCRC() {
            return this.clientCRC;
        }

        public CreateOssSubDirectoryResponseBodyData setETag(String ETag) {
            this.ETag = ETag;
            return this;
        }
        public String getETag() {
            return this.ETag;
        }

        public CreateOssSubDirectoryResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public CreateOssSubDirectoryResponseBodyData setServerCRC(Long serverCRC) {
            this.serverCRC = serverCRC;
            return this;
        }
        public Long getServerCRC() {
            return this.serverCRC;
        }

    }

}
