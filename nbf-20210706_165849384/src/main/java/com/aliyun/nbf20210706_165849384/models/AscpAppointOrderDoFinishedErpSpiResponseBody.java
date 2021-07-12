// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210706_165849384.models;

import com.aliyun.tea.*;

public class AscpAppointOrderDoFinishedErpSpiResponseBody extends TeaModel {
    // 错误描述，失败情况下返回
    @NameInMap("errroMsg")
    public String errroMsg;

    // 请求是否成功
    @NameInMap("success")
    public Boolean success;

    // 错误编码，失败情况下返回
    @NameInMap("errorCode")
    public String errorCode;

    public static AscpAppointOrderDoFinishedErpSpiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AscpAppointOrderDoFinishedErpSpiResponseBody self = new AscpAppointOrderDoFinishedErpSpiResponseBody();
        return TeaModel.build(map, self);
    }

    public AscpAppointOrderDoFinishedErpSpiResponseBody setErrroMsg(String errroMsg) {
        this.errroMsg = errroMsg;
        return this;
    }
    public String getErrroMsg() {
        return this.errroMsg;
    }

    public AscpAppointOrderDoFinishedErpSpiResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AscpAppointOrderDoFinishedErpSpiResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

}
