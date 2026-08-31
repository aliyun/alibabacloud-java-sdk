// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterMiguDownloadSourceResponseBody extends TeaModel {
    /**
     * <p>The data object.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public MiguSourceDownloadDTO data;

    /**
     * <p>The business error code. This value is passed through as-is from the console and is not mapped to platform standard error codes. Valid values: ERROR_PARAMETERS: Missing or invalid parameters. ERROR_NOT_FOUND: The source file does not exist or does not belong to the current account. ERROR_SOURCE_TRANSFERRING: The source file is being transferred. ERROR_SOURCE_EXPIRED: The source file has expired. ERROR_SERVER_INTERNAL: Internal error.</p>
     * 
     * <strong>example:</strong>
     * <p>ERROR_NOT_FOUND</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Unknown error</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The business status code. Valid values: 0: Success. 400/403/404/409/410/500: Business error. Refer to errCode for details.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ModelRouterMiguDownloadSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterMiguDownloadSourceResponseBody self = new ModelRouterMiguDownloadSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModelRouterMiguDownloadSourceResponseBody setData(MiguSourceDownloadDTO data) {
        this.data = data;
        return this;
    }
    public MiguSourceDownloadDTO getData() {
        return this.data;
    }

    public ModelRouterMiguDownloadSourceResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModelRouterMiguDownloadSourceResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModelRouterMiguDownloadSourceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModelRouterMiguDownloadSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModelRouterMiguDownloadSourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
