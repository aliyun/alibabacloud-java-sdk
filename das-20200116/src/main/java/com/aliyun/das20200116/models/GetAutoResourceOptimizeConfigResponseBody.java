// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAutoResourceOptimizeConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("Synchro")
    public String synchro;

    public static GetAutoResourceOptimizeConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAutoResourceOptimizeConfigResponseBody self = new GetAutoResourceOptimizeConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAutoResourceOptimizeConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAutoResourceOptimizeConfigResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetAutoResourceOptimizeConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAutoResourceOptimizeConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAutoResourceOptimizeConfigResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public GetAutoResourceOptimizeConfigResponseBody setSynchro(String synchro) {
        this.synchro = synchro;
        return this;
    }
    public String getSynchro() {
        return this.synchro;
    }

}
