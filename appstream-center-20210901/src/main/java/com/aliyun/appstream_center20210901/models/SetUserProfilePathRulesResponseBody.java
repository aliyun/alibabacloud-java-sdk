// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class SetUserProfilePathRulesResponseBody extends TeaModel {
    /**
     * <p>The error code returned when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter.UserProfileRuleType</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The error message returned when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>The parameter UserProfileRuleType is invalid.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier of the request. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>01A1CEEB-CDFF-18F9-B2BF-9997600D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SetUserProfilePathRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetUserProfilePathRulesResponseBody self = new SetUserProfilePathRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public SetUserProfilePathRulesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SetUserProfilePathRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SetUserProfilePathRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
