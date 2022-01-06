// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class DisplayInstanceUserSaleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DisplayInstanceUserSaleResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DisplayInstanceUserSaleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisplayInstanceUserSaleResponseBody self = new DisplayInstanceUserSaleResponseBody();
        return TeaModel.build(map, self);
    }

    public DisplayInstanceUserSaleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DisplayInstanceUserSaleResponseBody setData(DisplayInstanceUserSaleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DisplayInstanceUserSaleResponseBodyData getData() {
        return this.data;
    }

    public DisplayInstanceUserSaleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DisplayInstanceUserSaleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DisplayInstanceUserSaleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DisplayInstanceUserSaleResponseBodyDataAdministratorInfo extends TeaModel {
        @NameInMap("BuName")
        public String buName;

        @NameInMap("Email")
        public String email;

        @NameInMap("LogName")
        public String logName;

        @NameInMap("PhoneNumber")
        public String phoneNumber;

        @NameInMap("RealName")
        public String realName;

        public static DisplayInstanceUserSaleResponseBodyDataAdministratorInfo build(java.util.Map<String, ?> map) throws Exception {
            DisplayInstanceUserSaleResponseBodyDataAdministratorInfo self = new DisplayInstanceUserSaleResponseBodyDataAdministratorInfo();
            return TeaModel.build(map, self);
        }

        public DisplayInstanceUserSaleResponseBodyDataAdministratorInfo setBuName(String buName) {
            this.buName = buName;
            return this;
        }
        public String getBuName() {
            return this.buName;
        }

        public DisplayInstanceUserSaleResponseBodyDataAdministratorInfo setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public DisplayInstanceUserSaleResponseBodyDataAdministratorInfo setLogName(String logName) {
            this.logName = logName;
            return this;
        }
        public String getLogName() {
            return this.logName;
        }

        public DisplayInstanceUserSaleResponseBodyDataAdministratorInfo setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public DisplayInstanceUserSaleResponseBodyDataAdministratorInfo setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

    }

    public static class DisplayInstanceUserSaleResponseBodyData extends TeaModel {
        @NameInMap("AdministratorInfo")
        public DisplayInstanceUserSaleResponseBodyDataAdministratorInfo administratorInfo;

        public static DisplayInstanceUserSaleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DisplayInstanceUserSaleResponseBodyData self = new DisplayInstanceUserSaleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DisplayInstanceUserSaleResponseBodyData setAdministratorInfo(DisplayInstanceUserSaleResponseBodyDataAdministratorInfo administratorInfo) {
            this.administratorInfo = administratorInfo;
            return this;
        }
        public DisplayInstanceUserSaleResponseBodyDataAdministratorInfo getAdministratorInfo() {
            return this.administratorInfo;
        }

    }

}
