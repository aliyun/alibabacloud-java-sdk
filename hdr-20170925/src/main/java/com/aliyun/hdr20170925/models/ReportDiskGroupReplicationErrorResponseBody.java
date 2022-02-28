// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ReportDiskGroupReplicationErrorResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ReportDiskGroupReplicationErrorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReportDiskGroupReplicationErrorResponseBody self = new ReportDiskGroupReplicationErrorResponseBody();
        return TeaModel.build(map, self);
    }

    public ReportDiskGroupReplicationErrorResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReportDiskGroupReplicationErrorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReportDiskGroupReplicationErrorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReportDiskGroupReplicationErrorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
