// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class StartTaskByAppResponseBody extends TeaModel {
    // status
    @NameInMap("Status")
    public String status;

    // message
    @NameInMap("Message")
    public String message;

    // buildId
    @NameInMap("BuildId")
    public String buildId;

    // passNumber
    @NameInMap("PassNumber")
    public Long passNumber;

    // totalNumber
    @NameInMap("TotalNumber")
    public Long totalNumber;

    // url
    @NameInMap("Url")
    public String url;

    // success
    @NameInMap("Success")
    public Boolean success;

    // testSetRecordId
    @NameInMap("TestSetRecordId")
    public Long testSetRecordId;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    public static StartTaskByAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartTaskByAppResponseBody self = new StartTaskByAppResponseBody();
        return TeaModel.build(map, self);
    }

    public StartTaskByAppResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public StartTaskByAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StartTaskByAppResponseBody setBuildId(String buildId) {
        this.buildId = buildId;
        return this;
    }
    public String getBuildId() {
        return this.buildId;
    }

    public StartTaskByAppResponseBody setPassNumber(Long passNumber) {
        this.passNumber = passNumber;
        return this;
    }
    public Long getPassNumber() {
        return this.passNumber;
    }

    public StartTaskByAppResponseBody setTotalNumber(Long totalNumber) {
        this.totalNumber = totalNumber;
        return this;
    }
    public Long getTotalNumber() {
        return this.totalNumber;
    }

    public StartTaskByAppResponseBody setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public StartTaskByAppResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public StartTaskByAppResponseBody setTestSetRecordId(Long testSetRecordId) {
        this.testSetRecordId = testSetRecordId;
        return this;
    }
    public Long getTestSetRecordId() {
        return this.testSetRecordId;
    }

    public StartTaskByAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
