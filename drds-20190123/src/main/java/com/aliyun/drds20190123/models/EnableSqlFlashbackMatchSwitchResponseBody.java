// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class EnableSqlFlashbackMatchSwitchResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether SqlFlashbackMatchSwitch is enabled or not.</p>
     */
    @NameInMap("Result")
    public Boolean result;

    /**
     * <p>Indicates whether the request was sent successfully or not.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static EnableSqlFlashbackMatchSwitchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnableSqlFlashbackMatchSwitchResponseBody self = new EnableSqlFlashbackMatchSwitchResponseBody();
        return TeaModel.build(map, self);
    }

    public EnableSqlFlashbackMatchSwitchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnableSqlFlashbackMatchSwitchResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

    public EnableSqlFlashbackMatchSwitchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
