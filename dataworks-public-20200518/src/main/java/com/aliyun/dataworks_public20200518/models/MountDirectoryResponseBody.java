// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class MountDirectoryResponseBody extends TeaModel {
    /**
     * <p>The number of directories that are added. Valid values:</p>
     * <br>
     * <p>*   0: No directories are added. The left-side navigation pane may contain the specified directory.</p>
     * <p>*   1: One directory is added.</p>
     */
    @NameInMap("Data")
    public Integer data;

    /**
     * <p>The error code returned. The value 200 indicates that the add task is successful.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request failed.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The ID of the request. You can use the ID to troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   true: The request was successful.</p>
     * <p>*   false: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static MountDirectoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MountDirectoryResponseBody self = new MountDirectoryResponseBody();
        return TeaModel.build(map, self);
    }

    public MountDirectoryResponseBody setData(Integer data) {
        this.data = data;
        return this;
    }
    public Integer getData() {
        return this.data;
    }

    public MountDirectoryResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public MountDirectoryResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public MountDirectoryResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public MountDirectoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MountDirectoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
