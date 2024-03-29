// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class SaveWebRTCStatsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RowCount")
    public Long rowCount;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TimeStamp")
    public Long timeStamp;

    public static SaveWebRTCStatsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveWebRTCStatsResponseBody self = new SaveWebRTCStatsResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveWebRTCStatsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SaveWebRTCStatsResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SaveWebRTCStatsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SaveWebRTCStatsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveWebRTCStatsResponseBody setRowCount(Long rowCount) {
        this.rowCount = rowCount;
        return this;
    }
    public Long getRowCount() {
        return this.rowCount;
    }

    public SaveWebRTCStatsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SaveWebRTCStatsResponseBody setTimeStamp(Long timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }
    public Long getTimeStamp() {
        return this.timeStamp;
    }

}
