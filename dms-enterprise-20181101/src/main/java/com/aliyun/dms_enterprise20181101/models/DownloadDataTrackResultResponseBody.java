// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DownloadDataTrackResultResponseBody extends TeaModel {
    /**
     * <p>The ID of the download key, which is used to download the parsing result of the data tracking task.</p>
     * 
     * <strong>example:</strong>
     * <p>e23dd7ec-a19f-4a69-8eb3-8ffd26e6****</p>
     */
    @NameInMap("DownloadKeyId")
    public String downloadKeyId;

    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B43AD641-49C2-5299-9E06-1B37EC1B****</p>
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
    public Boolean success;

    public static DownloadDataTrackResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DownloadDataTrackResultResponseBody self = new DownloadDataTrackResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DownloadDataTrackResultResponseBody setDownloadKeyId(String downloadKeyId) {
        this.downloadKeyId = downloadKeyId;
        return this;
    }
    public String getDownloadKeyId() {
        return this.downloadKeyId;
    }

    public DownloadDataTrackResultResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DownloadDataTrackResultResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DownloadDataTrackResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DownloadDataTrackResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
