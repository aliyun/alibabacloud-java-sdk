// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMetricRulesResponseBody extends TeaModel {
    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Indicates whether the operation was successful. Valid values:</p>
     * <br>
     * <p>*   true: successful.</p>
     * <p>*   false: failed.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Deletes one or more alert rules.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteMetricRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteMetricRulesResponseBody self = new DeleteMetricRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteMetricRulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteMetricRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteMetricRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteMetricRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
