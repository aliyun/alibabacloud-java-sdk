// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeDownloadBackupSetStorageInfoResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>DBS.ParamIsInValid</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeDownloadBackupSetStorageInfoResponseBodyData data;

    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>DBS.ParamIsInValid</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>Argument: regionCode Must not be empty</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>Argument: regionCode Must not be empty</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>44B8C2F5-919D-5D29-BCD5-DEB03467****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The request was successful.</li>
     * <li><strong>false</strong>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeDownloadBackupSetStorageInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadBackupSetStorageInfoResponseBody self = new DescribeDownloadBackupSetStorageInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadBackupSetStorageInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDownloadBackupSetStorageInfoResponseBody setData(DescribeDownloadBackupSetStorageInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDownloadBackupSetStorageInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeDownloadBackupSetStorageInfoResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeDownloadBackupSetStorageInfoResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeDownloadBackupSetStorageInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDownloadBackupSetStorageInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDownloadBackupSetStorageInfoResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeDownloadBackupSetStorageInfoResponseBodyData extends TeaModel {
        /**
         * <p>The validity period of the URL.</p>
         * <blockquote>
         * <p>This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1661329050</p>
         */
        @NameInMap("ExpirationTime")
        public Long expirationTime;

        /**
         * <p>The private download URL of the backup set.</p>
         */
        @NameInMap("PrivateUrl")
        public String privateUrl;

        /**
         * <p>The public download URL of the backup set.</p>
         */
        @NameInMap("PublicUrl")
        public String publicUrl;

        public static DescribeDownloadBackupSetStorageInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDownloadBackupSetStorageInfoResponseBodyData self = new DescribeDownloadBackupSetStorageInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDownloadBackupSetStorageInfoResponseBodyData setExpirationTime(Long expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public Long getExpirationTime() {
            return this.expirationTime;
        }

        public DescribeDownloadBackupSetStorageInfoResponseBodyData setPrivateUrl(String privateUrl) {
            this.privateUrl = privateUrl;
            return this;
        }
        public String getPrivateUrl() {
            return this.privateUrl;
        }

        public DescribeDownloadBackupSetStorageInfoResponseBodyData setPublicUrl(String publicUrl) {
            this.publicUrl = publicUrl;
            return this;
        }
        public String getPublicUrl() {
            return this.publicUrl;
        }

    }

}
