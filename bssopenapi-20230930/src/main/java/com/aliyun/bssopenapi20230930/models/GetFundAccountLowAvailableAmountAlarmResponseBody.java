// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class GetFundAccountLowAvailableAmountAlarmResponseBody extends TeaModel {
    /**
     * <p>Whether the alert is enabled</p>
     */
    @NameInMap("AlarmEnabled")
    public Boolean alarmEnabled;

    /**
     * <p>Response structure metadata</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>6000EE23-274B-4E07-A697-FF2E999520A4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Alert threshold</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ThresholdAmount")
    public String thresholdAmount;

    public static GetFundAccountLowAvailableAmountAlarmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFundAccountLowAvailableAmountAlarmResponseBody self = new GetFundAccountLowAvailableAmountAlarmResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFundAccountLowAvailableAmountAlarmResponseBody setAlarmEnabled(Boolean alarmEnabled) {
        this.alarmEnabled = alarmEnabled;
        return this;
    }
    public Boolean getAlarmEnabled() {
        return this.alarmEnabled;
    }

    public GetFundAccountLowAvailableAmountAlarmResponseBody setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
    public Object getMetadata() {
        return this.metadata;
    }

    public GetFundAccountLowAvailableAmountAlarmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFundAccountLowAvailableAmountAlarmResponseBody setThresholdAmount(String thresholdAmount) {
        this.thresholdAmount = thresholdAmount;
        return this;
    }
    public String getThresholdAmount() {
        return this.thresholdAmount;
    }

}
