// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class HighCodeDeployResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;key&quot;: &quot;value&quot;}</p>
     */
    @NameInMap("data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>404</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>用户不存在</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    @NameInMap("success")
    public Boolean success;

    public static HighCodeDeployResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HighCodeDeployResponseBody self = new HighCodeDeployResponseBody();
        return TeaModel.build(map, self);
    }

    public HighCodeDeployResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public HighCodeDeployResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public HighCodeDeployResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public HighCodeDeployResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
