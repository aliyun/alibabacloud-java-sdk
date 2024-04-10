// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatappPhoneNumberMetricRequest extends TeaModel {
    /**
     * <p>The space ID of the user within the ISV account.</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The end of the time range to query.</p>
     */
    @NameInMap("End")
    public Long end;

    /**
     * <p>The metric granularity.</p>
     */
    @NameInMap("Granularity")
    public String granularity;

    /**
     * <p>The verification code used to verify whether the RAM user is authorized by the independent software vendor (ISV) account.</p>
     */
    @NameInMap("IsvCode")
    public String isvCode;

    /**
     * <p>The business phone number.</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    /**
     * <p>The beginning of the time range to query.</p>
     */
    @NameInMap("Start")
    public Long start;

    public static GetChatappPhoneNumberMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        GetChatappPhoneNumberMetricRequest self = new GetChatappPhoneNumberMetricRequest();
        return TeaModel.build(map, self);
    }

    public GetChatappPhoneNumberMetricRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public GetChatappPhoneNumberMetricRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public GetChatappPhoneNumberMetricRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public GetChatappPhoneNumberMetricRequest setIsvCode(String isvCode) {
        this.isvCode = isvCode;
        return this;
    }
    public String getIsvCode() {
        return this.isvCode;
    }

    public GetChatappPhoneNumberMetricRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public GetChatappPhoneNumberMetricRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
