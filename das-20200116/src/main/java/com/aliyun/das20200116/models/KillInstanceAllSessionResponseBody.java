// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class KillInstanceAllSessionResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The reserved parameter.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>>  If the request was successful, **Successful** is returned. If the request failed, an error message such as an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public String success;

    public static KillInstanceAllSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        KillInstanceAllSessionResponseBody self = new KillInstanceAllSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public KillInstanceAllSessionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public KillInstanceAllSessionResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public KillInstanceAllSessionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public KillInstanceAllSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public KillInstanceAllSessionResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
