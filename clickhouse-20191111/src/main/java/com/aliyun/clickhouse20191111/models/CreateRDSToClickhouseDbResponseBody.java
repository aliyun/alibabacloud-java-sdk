// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CreateRDSToClickhouseDbResponseBody extends TeaModel {
    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RepeatedDbs")
    public java.util.List<String> repeatedDbs;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public Long status;

    public static CreateRDSToClickhouseDbResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRDSToClickhouseDbResponseBody self = new CreateRDSToClickhouseDbResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRDSToClickhouseDbResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CreateRDSToClickhouseDbResponseBody setRepeatedDbs(java.util.List<String> repeatedDbs) {
        this.repeatedDbs = repeatedDbs;
        return this;
    }
    public java.util.List<String> getRepeatedDbs() {
        return this.repeatedDbs;
    }

    public CreateRDSToClickhouseDbResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateRDSToClickhouseDbResponseBody setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

}
