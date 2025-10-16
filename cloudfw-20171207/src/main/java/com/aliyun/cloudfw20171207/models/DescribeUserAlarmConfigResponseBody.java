// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeUserAlarmConfigResponseBody extends TeaModel {
    @NameInMap("AlarmConfig")
    public java.util.List<DescribeUserAlarmConfigResponseBodyAlarmConfig> alarmConfig;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AlarmLang")
    public String alarmLang;

    @NameInMap("ContactConfig")
    public java.util.List<DescribeUserAlarmConfigResponseBodyContactConfig> contactConfig;

    @NameInMap("DefaultContact")
    public DescribeUserAlarmConfigResponseBodyDefaultContact defaultContact;

    @NameInMap("NotifyConfig")
    public java.util.List<DescribeUserAlarmConfigResponseBodyNotifyConfig> notifyConfig;

    /**
     * <strong>example:</strong>
     * <p>9D250177-4F11-58B8-9AFE-A4624FF1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUserAlarmConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserAlarmConfigResponseBody self = new DescribeUserAlarmConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserAlarmConfigResponseBody setAlarmConfig(java.util.List<DescribeUserAlarmConfigResponseBodyAlarmConfig> alarmConfig) {
        this.alarmConfig = alarmConfig;
        return this;
    }
    public java.util.List<DescribeUserAlarmConfigResponseBodyAlarmConfig> getAlarmConfig() {
        return this.alarmConfig;
    }

    public DescribeUserAlarmConfigResponseBody setAlarmLang(String alarmLang) {
        this.alarmLang = alarmLang;
        return this;
    }
    public String getAlarmLang() {
        return this.alarmLang;
    }

    public DescribeUserAlarmConfigResponseBody setContactConfig(java.util.List<DescribeUserAlarmConfigResponseBodyContactConfig> contactConfig) {
        this.contactConfig = contactConfig;
        return this;
    }
    public java.util.List<DescribeUserAlarmConfigResponseBodyContactConfig> getContactConfig() {
        return this.contactConfig;
    }

    public DescribeUserAlarmConfigResponseBody setDefaultContact(DescribeUserAlarmConfigResponseBodyDefaultContact defaultContact) {
        this.defaultContact = defaultContact;
        return this;
    }
    public DescribeUserAlarmConfigResponseBodyDefaultContact getDefaultContact() {
        return this.defaultContact;
    }

    public DescribeUserAlarmConfigResponseBody setNotifyConfig(java.util.List<DescribeUserAlarmConfigResponseBodyNotifyConfig> notifyConfig) {
        this.notifyConfig = notifyConfig;
        return this;
    }
    public java.util.List<DescribeUserAlarmConfigResponseBodyNotifyConfig> getNotifyConfig() {
        return this.notifyConfig;
    }

    public DescribeUserAlarmConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUserAlarmConfigResponseBodyAlarmConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AlarmHour")
        public Integer alarmHour;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AlarmNotify")
        public Integer alarmNotify;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("AlarmPeriod")
        public Integer alarmPeriod;

        /**
         * <strong>example:</strong>
         * <p>bandwidth</p>
         */
        @NameInMap("AlarmType")
        public String alarmType;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("AlarmValue")
        public String alarmValue;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AlarmWeekDay")
        public Integer alarmWeekDay;

        public static DescribeUserAlarmConfigResponseBodyAlarmConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserAlarmConfigResponseBodyAlarmConfig self = new DescribeUserAlarmConfigResponseBodyAlarmConfig();
            return TeaModel.build(map, self);
        }

        public DescribeUserAlarmConfigResponseBodyAlarmConfig setAlarmHour(Integer alarmHour) {
            this.alarmHour = alarmHour;
            return this;
        }
        public Integer getAlarmHour() {
            return this.alarmHour;
        }

        public DescribeUserAlarmConfigResponseBodyAlarmConfig setAlarmNotify(Integer alarmNotify) {
            this.alarmNotify = alarmNotify;
            return this;
        }
        public Integer getAlarmNotify() {
            return this.alarmNotify;
        }

        public DescribeUserAlarmConfigResponseBodyAlarmConfig setAlarmPeriod(Integer alarmPeriod) {
            this.alarmPeriod = alarmPeriod;
            return this;
        }
        public Integer getAlarmPeriod() {
            return this.alarmPeriod;
        }

        public DescribeUserAlarmConfigResponseBodyAlarmConfig setAlarmType(String alarmType) {
            this.alarmType = alarmType;
            return this;
        }
        public String getAlarmType() {
            return this.alarmType;
        }

        public DescribeUserAlarmConfigResponseBodyAlarmConfig setAlarmValue(String alarmValue) {
            this.alarmValue = alarmValue;
            return this;
        }
        public String getAlarmValue() {
            return this.alarmValue;
        }

        public DescribeUserAlarmConfigResponseBodyAlarmConfig setAlarmWeekDay(Integer alarmWeekDay) {
            this.alarmWeekDay = alarmWeekDay;
            return this;
        }
        public Integer getAlarmWeekDay() {
            return this.alarmWeekDay;
        }

    }

    public static class DescribeUserAlarmConfigResponseBodyContactConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1530811****@qq.com</p>
         */
        @NameInMap("Email")
        public String email;

        @NameInMap("MobilePhone")
        public String mobilePhone;

        /**
         * <strong>example:</strong>
         * <p>1531123****</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static DescribeUserAlarmConfigResponseBodyContactConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserAlarmConfigResponseBodyContactConfig self = new DescribeUserAlarmConfigResponseBodyContactConfig();
            return TeaModel.build(map, self);
        }

        public DescribeUserAlarmConfigResponseBodyContactConfig setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public DescribeUserAlarmConfigResponseBodyContactConfig setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }
        public String getMobilePhone() {
            return this.mobilePhone;
        }

        public DescribeUserAlarmConfigResponseBodyContactConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeUserAlarmConfigResponseBodyContactConfig setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class DescribeUserAlarmConfigResponseBodyDefaultContact extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1530811****@qq.com</p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <strong>example:</strong>
         * <p>1531123****</p>
         */
        @NameInMap("MobilePhone")
        public String mobilePhone;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeUserAlarmConfigResponseBodyDefaultContact build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserAlarmConfigResponseBodyDefaultContact self = new DescribeUserAlarmConfigResponseBodyDefaultContact();
            return TeaModel.build(map, self);
        }

        public DescribeUserAlarmConfigResponseBodyDefaultContact setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public DescribeUserAlarmConfigResponseBodyDefaultContact setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }
        public String getMobilePhone() {
            return this.mobilePhone;
        }

        public DescribeUserAlarmConfigResponseBodyDefaultContact setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeUserAlarmConfigResponseBodyDefaultContact setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeUserAlarmConfigResponseBodyNotifyConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>mail</p>
         */
        @NameInMap("NotifyType")
        public String notifyType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NotifyValue")
        public String notifyValue;

        public static DescribeUserAlarmConfigResponseBodyNotifyConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserAlarmConfigResponseBodyNotifyConfig self = new DescribeUserAlarmConfigResponseBodyNotifyConfig();
            return TeaModel.build(map, self);
        }

        public DescribeUserAlarmConfigResponseBodyNotifyConfig setNotifyType(String notifyType) {
            this.notifyType = notifyType;
            return this;
        }
        public String getNotifyType() {
            return this.notifyType;
        }

        public DescribeUserAlarmConfigResponseBodyNotifyConfig setNotifyValue(String notifyValue) {
            this.notifyValue = notifyValue;
            return this;
        }
        public String getNotifyValue() {
            return this.notifyValue;
        }

    }

}
