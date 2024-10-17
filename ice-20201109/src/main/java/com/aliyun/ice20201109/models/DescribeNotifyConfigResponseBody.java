// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DescribeNotifyConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="http://customer.com/callback">http://customer.com/callback</a></p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableNotify")
    public Boolean enableNotify;

    /**
     * <strong>example:</strong>
     * <p>agent_start,agent_stop,error</p>
     */
    @NameInMap("EventTypes")
    public String eventTypes;

    /**
     * <strong>example:</strong>
     * <p>7B117AF5-2A16-412C-B127-FA6175ED1AD0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>eyJhcHBpZCI6ICIxMjM0MTIzNxxxxx</p>
     */
    @NameInMap("Token")
    public String token;

    public static DescribeNotifyConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNotifyConfigResponseBody self = new DescribeNotifyConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNotifyConfigResponseBody setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public DescribeNotifyConfigResponseBody setEnableNotify(Boolean enableNotify) {
        this.enableNotify = enableNotify;
        return this;
    }
    public Boolean getEnableNotify() {
        return this.enableNotify;
    }

    public DescribeNotifyConfigResponseBody setEventTypes(String eventTypes) {
        this.eventTypes = eventTypes;
        return this;
    }
    public String getEventTypes() {
        return this.eventTypes;
    }

    public DescribeNotifyConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeNotifyConfigResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
