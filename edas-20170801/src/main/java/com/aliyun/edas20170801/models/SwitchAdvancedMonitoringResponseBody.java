// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class SwitchAdvancedMonitoringResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the advanced application monitoring feature is enabled. Valid values:</p>
     * <ul>
     * <li>true: The advanced application monitoring feature is enabled.</li>
     * <li>false: The advanced application monitoring feature is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AdvancedMonitoringEnabled")
    public Boolean advancedMonitoringEnabled;

    /**
     * <p>The HTTP status code that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The additional information that is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>The advanced monitoring status is disabled already for application which app_id is 9e224bc6-a646-4484-ae31-e617b7e7****</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>577AED12-32D8-40B6-991F-17D7A601****</p>
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
