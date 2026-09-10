// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ExecDataCheckSqlPreviewResponseBody extends TeaModel {
    /**
     * <p>The preview SQL statement.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("data")
    public String data;

    /**
     * <p>The error code. An empty string is returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message. An empty string is returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues with this call.</p>
     * 
     * <strong>example:</strong>
     * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values: true and false. If false is returned, use errCode and errMessage to troubleshoot the issue.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ExecDataCheckSqlPreviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecDataCheckSqlPreviewResponseBody self = new ExecDataCheckSqlPreviewResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecDataCheckSqlPreviewResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ExecDataCheckSqlPreviewResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ExecDataCheckSqlPreviewResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ExecDataCheckSqlPreviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecDataCheckSqlPreviewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
