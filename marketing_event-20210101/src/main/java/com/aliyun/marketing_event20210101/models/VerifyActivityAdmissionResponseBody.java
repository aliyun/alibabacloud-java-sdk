// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class VerifyActivityAdmissionResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public VerifyActivityAdmissionResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static VerifyActivityAdmissionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyActivityAdmissionResponseBody self = new VerifyActivityAdmissionResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyActivityAdmissionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VerifyActivityAdmissionResponseBody setData(VerifyActivityAdmissionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public VerifyActivityAdmissionResponseBodyData getData() {
        return this.data;
    }

    public VerifyActivityAdmissionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VerifyActivityAdmissionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyActivityAdmissionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class VerifyActivityAdmissionResponseBodyData extends TeaModel {
        @NameInMap("ActivityId")
        public Long activityId;

        @NameInMap("ActivityName")
        public String activityName;

        @NameInMap("Address")
        public String address;

        @NameInMap("AdmissionDate")
        public String admissionDate;

        @NameInMap("AllowedDates")
        public java.util.List<String> allowedDates;

        /**
         * <strong>example:</strong>
         * <p>定邀-现场嘉宾</p>
         */
        @NameInMap("ChannelName")
        public String channelName;

        /**
         * <strong>example:</strong>
         * <p>[&quot;VIP&quot;, &quot;思辨场&quot;]</p>
         */
        @NameInMap("CustomerLabels")
        public java.util.List<String> customerLabels;

        @NameInMap("Decision")
        public String decision;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("MaskedIdCardNo")
        public String maskedIdCardNo;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegistrationStatus")
        public Integer registrationStatus;

        @NameInMap("SignedIn")
        public Boolean signedIn;

        @NameInMap("SigninTime")
        public String signinTime;

        @NameInMap("StartTime")
        public String startTime;

        public static VerifyActivityAdmissionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            VerifyActivityAdmissionResponseBodyData self = new VerifyActivityAdmissionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public VerifyActivityAdmissionResponseBodyData setActivityId(Long activityId) {
            this.activityId = activityId;
            return this;
        }
        public Long getActivityId() {
            return this.activityId;
        }

        public VerifyActivityAdmissionResponseBodyData setActivityName(String activityName) {
            this.activityName = activityName;
            return this;
        }
        public String getActivityName() {
            return this.activityName;
        }

        public VerifyActivityAdmissionResponseBodyData setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public VerifyActivityAdmissionResponseBodyData setAdmissionDate(String admissionDate) {
            this.admissionDate = admissionDate;
            return this;
        }
        public String getAdmissionDate() {
            return this.admissionDate;
        }

        public VerifyActivityAdmissionResponseBodyData setAllowedDates(java.util.List<String> allowedDates) {
            this.allowedDates = allowedDates;
            return this;
        }
        public java.util.List<String> getAllowedDates() {
            return this.allowedDates;
        }

        public VerifyActivityAdmissionResponseBodyData setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public VerifyActivityAdmissionResponseBodyData setCustomerLabels(java.util.List<String> customerLabels) {
            this.customerLabels = customerLabels;
            return this;
        }
        public java.util.List<String> getCustomerLabels() {
            return this.customerLabels;
        }

        public VerifyActivityAdmissionResponseBodyData setDecision(String decision) {
            this.decision = decision;
            return this;
        }
        public String getDecision() {
            return this.decision;
        }

        public VerifyActivityAdmissionResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public VerifyActivityAdmissionResponseBodyData setMaskedIdCardNo(String maskedIdCardNo) {
            this.maskedIdCardNo = maskedIdCardNo;
            return this;
        }
        public String getMaskedIdCardNo() {
            return this.maskedIdCardNo;
        }

        public VerifyActivityAdmissionResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public VerifyActivityAdmissionResponseBodyData setRegistrationStatus(Integer registrationStatus) {
            this.registrationStatus = registrationStatus;
            return this;
        }
        public Integer getRegistrationStatus() {
            return this.registrationStatus;
        }

        public VerifyActivityAdmissionResponseBodyData setSignedIn(Boolean signedIn) {
            this.signedIn = signedIn;
            return this;
        }
        public Boolean getSignedIn() {
            return this.signedIn;
        }

        public VerifyActivityAdmissionResponseBodyData setSigninTime(String signinTime) {
            this.signinTime = signinTime;
            return this;
        }
        public String getSigninTime() {
            return this.signinTime;
        }

        public VerifyActivityAdmissionResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
