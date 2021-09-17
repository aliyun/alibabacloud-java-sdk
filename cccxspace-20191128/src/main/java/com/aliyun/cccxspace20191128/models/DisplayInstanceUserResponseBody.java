// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class DisplayInstanceUserResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public DisplayInstanceUserResponseBodyData data;

    public static DisplayInstanceUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisplayInstanceUserResponseBody self = new DisplayInstanceUserResponseBody();
        return TeaModel.build(map, self);
    }

    public DisplayInstanceUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DisplayInstanceUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DisplayInstanceUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DisplayInstanceUserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DisplayInstanceUserResponseBody setData(DisplayInstanceUserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DisplayInstanceUserResponseBodyData getData() {
        return this.data;
    }

    public static class DisplayInstanceUserResponseBodyDataAdministratorInfo extends TeaModel {
        @NameInMap("BuName")
        public String buName;

        @NameInMap("LogName")
        public String logName;

        @NameInMap("Email")
        public String email;

        @NameInMap("PhoneNumber")
        public String phoneNumber;

        @NameInMap("RealName")
        public String realName;

        public static DisplayInstanceUserResponseBodyDataAdministratorInfo build(java.util.Map<String, ?> map) throws Exception {
            DisplayInstanceUserResponseBodyDataAdministratorInfo self = new DisplayInstanceUserResponseBodyDataAdministratorInfo();
            return TeaModel.build(map, self);
        }

        public DisplayInstanceUserResponseBodyDataAdministratorInfo setBuName(String buName) {
            this.buName = buName;
            return this;
        }
        public String getBuName() {
            return this.buName;
        }

        public DisplayInstanceUserResponseBodyDataAdministratorInfo setLogName(String logName) {
            this.logName = logName;
            return this;
        }
        public String getLogName() {
            return this.logName;
        }

        public DisplayInstanceUserResponseBodyDataAdministratorInfo setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public DisplayInstanceUserResponseBodyDataAdministratorInfo setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public DisplayInstanceUserResponseBodyDataAdministratorInfo setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

    }

    public static class DisplayInstanceUserResponseBodyData extends TeaModel {
        @NameInMap("AdministratorInfo")
        public DisplayInstanceUserResponseBodyDataAdministratorInfo administratorInfo;

        public static DisplayInstanceUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DisplayInstanceUserResponseBodyData self = new DisplayInstanceUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DisplayInstanceUserResponseBodyData setAdministratorInfo(DisplayInstanceUserResponseBodyDataAdministratorInfo administratorInfo) {
            this.administratorInfo = administratorInfo;
            return this;
        }
        public DisplayInstanceUserResponseBodyDataAdministratorInfo getAdministratorInfo() {
            return this.administratorInfo;
        }

    }

}
