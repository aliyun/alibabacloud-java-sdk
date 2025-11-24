// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateProjectModelTierResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;data&quot;:{
     *         &quot;data&quot;:&quot;success&quot;,
     *         &quot;requestId&quot;:&quot;****&quot;
     *     }</p>
     */
    @NameInMap("data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>OBJECT_NOT_EXIST</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>this project is not exist.</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <strong>example:</strong>
     * <p>73207140-0FD5-588A-B11A-3CE093924196</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateProjectModelTierResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectModelTierResponseBody self = new UpdateProjectModelTierResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProjectModelTierResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UpdateProjectModelTierResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateProjectModelTierResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public UpdateProjectModelTierResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public UpdateProjectModelTierResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
