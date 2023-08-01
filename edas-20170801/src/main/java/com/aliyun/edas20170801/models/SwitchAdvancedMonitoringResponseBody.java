// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class SwitchAdvancedMonitoringResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the advanced application monitoring feature is enabled. Valid values:</p>
     * <br>
     * <p>*   true: The advanced application monitoring feature is enabled.</p>
     * <p>*   false: The advanced application monitoring feature is disabled.</p>
     */
    @NameInMap("AdvancedMonitoringEnabled")
    public Boolean advancedMonitoringEnabled;

    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The additional information that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SwitchAdvancedMonitoringResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwitchAdvancedMonitoringResponseBody self = new SwitchAdvancedMonitoringResponseBody();
        return TeaModel.build(map, self);
    }

    public SwitchAdvancedMonitoringResponseBody setAdvancedMonitoringEnabled(Boolean advancedMonitoringEnabled) {
        this.advancedMonitoringEnabled = advancedMonitoringEnabled;
        return this;
    }
    public Boolean getAdvancedMonitoringEnabled() {
        return this.advancedMonitoringEnabled;
    }

    public SwitchAdvancedMonitoringResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SwitchAdvancedMonitoringResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SwitchAdvancedMonitoringResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
