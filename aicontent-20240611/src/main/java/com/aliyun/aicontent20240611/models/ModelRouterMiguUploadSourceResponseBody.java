// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterMiguUploadSourceResponseBody extends TeaModel {
    /**
     * <p>The data object.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("data")
    public MiguSourceUploadDTO data;

    /**
     * <p>The business error code. The console passes through the original value without mapping to standard platform error codes. Valid values:</p>
     * <ul>
     * <li>ERROR_PARAMETERS: Missing or invalid parameters.</li>
     * <li>ERROR_SERVER_INTERNAL: Internal error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ERROR_PARAMETERS</p>
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
     * <p>The business status code. Valid values:</p>
     * <ul>
     * <li>0: Success.</li>
     * <li>400/403/500: Business error. For details, see errCode.</li>
     * </ul>
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
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ModelRouterMiguUploadSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterMiguUploadSourceResponseBody self = new ModelRouterMiguUploadSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModelRouterMiguUploadSourceResponseBody setData(MiguSourceUploadDTO data) {
        this.data = data;
        return this;
    }
    public MiguSourceUploadDTO getData() {
        return this.data;
    }

    public ModelRouterMiguUploadSourceResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ModelRouterMiguUploadSourceResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ModelRouterMiguUploadSourceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModelRouterMiguUploadSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModelRouterMiguUploadSourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
