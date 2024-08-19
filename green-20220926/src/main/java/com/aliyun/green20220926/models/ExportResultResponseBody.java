// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ExportResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p><a href="https://oss-cip-shanghai.oss-cn-shanghai.aliyuncs.com/console_data/production/scanResult/osscheck/ossCheckResult_aliiGGXhSMvmIvsS7Lrl3LaUZ-1A9%24oZ.xlsx">https://oss-cip-shanghai.oss-cn-shanghai.aliyuncs.com/console_data/production/scanResult/osscheck/ossCheckResult_aliiGGXhSMvmIvsS7Lrl3LaUZ-1A9%24oZ.xlsx</a></p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Msg")
    public String msg;

    /**
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ExportResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportResultResponseBody self = new ExportResultResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportResultResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ExportResultResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ExportResultResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ExportResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
