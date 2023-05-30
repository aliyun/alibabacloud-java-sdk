// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class UpdateTriggerHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The name of the service.</p>
     */
    @NameInMap("If-Match")
    public String ifMatch;

    /**
     * <p>The time when the request is initiated on the client. The format of the value is: **EEE,d MMM yyyy HH:mm:ss GMT**.</p>
     */
    @NameInMap("X-Fc-Account-Id")
    public String xFcAccountId;

    /**
     * <p>The custom request ID.</p>
     */
    @NameInMap("X-Fc-Date")
    public String xFcDate;

    /**
     * <p>The ETag that is used to modify the trigger. This parameter is used to ensure that the modified trigger is consistent with the trigger to be modified.</p>
     */
    @NameInMap("X-Fc-Trace-Id")
    public String xFcTraceId;

    public static UpdateTriggerHeaders build(java.util.Map<String, ?> map) throws Exception {
        UpdateTriggerHeaders self = new UpdateTriggerHeaders();
        return TeaModel.build(map, self);
    }

    public UpdateTriggerHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public UpdateTriggerHeaders setIfMatch(String ifMatch) {
        this.ifMatch = ifMatch;
        return this;
    }
    public String getIfMatch() {
        return this.ifMatch;
    }

    public UpdateTriggerHeaders setXFcAccountId(String xFcAccountId) {
        this.xFcAccountId = xFcAccountId;
        return this;
    }
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    public UpdateTriggerHeaders setXFcDate(String xFcDate) {
        this.xFcDate = xFcDate;
        return this;
    }
    public String getXFcDate() {
        return this.xFcDate;
    }

    public UpdateTriggerHeaders setXFcTraceId(String xFcTraceId) {
        this.xFcTraceId = xFcTraceId;
        return this;
    }
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

}
