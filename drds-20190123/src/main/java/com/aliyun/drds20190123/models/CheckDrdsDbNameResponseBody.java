// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class CheckDrdsDbNameResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the DRDS database name is valid. Valid values: true: The database name is valid. false: the database name is invalid.</p>
     */
    @NameInMap("Result")
    public Boolean result;

    /**
     * <p>Indicates whether the call is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CheckDrdsDbNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckDrdsDbNameResponseBody self = new CheckDrdsDbNameResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckDrdsDbNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckDrdsDbNameResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public CheckDrdsDbNameResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
