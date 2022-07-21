// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class BatchCreateInstantSiteMonitorResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BatchCreateInstantSiteMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateInstantSiteMonitorResponseBody self = new BatchCreateInstantSiteMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchCreateInstantSiteMonitorResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchCreateInstantSiteMonitorResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public BatchCreateInstantSiteMonitorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchCreateInstantSiteMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchCreateInstantSiteMonitorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
