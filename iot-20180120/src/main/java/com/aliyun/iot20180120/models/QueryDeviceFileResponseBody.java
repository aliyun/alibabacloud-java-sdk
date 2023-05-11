// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceFileResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The file information returned if the call succeeds.</p>
     */
    @NameInMap("Data")
    public QueryDeviceFileResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <br>
     * <p>*   **true**: The call was successful.</p>
     * <p>*   **false**: The call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryDeviceFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceFileResponseBody self = new QueryDeviceFileResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceFileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceFileResponseBody setData(QueryDeviceFileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceFileResponseBodyData getData() {
        return this.data;
    }

    public QueryDeviceFileResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceFileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryDeviceFileResponseBodyData extends TeaModel {
        /**
         * <p>The download URL of the file.</p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The ID of the file.</p>
         */
        @NameInMap("FileId")
        public String fileId;

        /**
         * <p>The name of the file.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The size of the file. Unit: KB.</p>
         */
        @NameInMap("Size")
        public String size;

        /**
         * <p>The time when the file was created.</p>
         */
        @NameInMap("UtcCreatedOn")
        public String utcCreatedOn;

        public static QueryDeviceFileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceFileResponseBodyData self = new QueryDeviceFileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceFileResponseBodyData setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public QueryDeviceFileResponseBodyData setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }
        public String getFileId() {
            return this.fileId;
        }

        public QueryDeviceFileResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryDeviceFileResponseBodyData setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public QueryDeviceFileResponseBodyData setUtcCreatedOn(String utcCreatedOn) {
            this.utcCreatedOn = utcCreatedOn;
            return this;
        }
        public String getUtcCreatedOn() {
            return this.utcCreatedOn;
        }

    }

}
