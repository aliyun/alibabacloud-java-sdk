// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeUserAlarmConfigResponseBody extends TeaModel {
    /**
     * <p>The alarm configuration.</p>
     */
    @NameInMap("AlarmConfig")
    public java.util.List<DescribeUserAlarmConfigResponseBodyAlarmConfig> alarmConfig;

    /**
     * <p>The language of the alarm notifications.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AlarmLang")
    public String alarmLang;

    /**
     * <p>The contact information.</p>
     */
    @NameInMap("ContactConfig")
    public java.util.List<DescribeUserAlarmConfigResponseBodyContactConfig> contactConfig;

    /**
     * <p>Information about the default alarm contact.</p>
     */
    @NameInMap("DefaultContact")
    public DescribeUserAlarmConfigResponseBodyDefaultContact defaultContact;

    /**
     * <p>The request ID.</p>
     * 
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

    public DescribeUserAlarmConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUserAlarmConfigResponseBodyAlarmConfig extends TeaModel {
        /**
         * <p>The alarm threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AlarmHour")
        public Integer alarmHour;

        /**
         * <p>The notification method.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AlarmNotify")
        public Integer alarmNotify;

        /**
         * <p>The alarm period.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("AlarmPeriod")
        public Integer alarmPeriod;

        /**
         * <p>The alarm type.</p>
         * 
         * <strong>example:</strong>
         * <p>bandwidth</p>
         */
        @NameInMap("AlarmType")
        public String alarmType;

        /**
         * <p>The value that triggers the alarm.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("AlarmValue")
        public String alarmValue;

        /**
         * <p>The alarm retry count.</p>
         * 
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
         * <p>The email address.</p>
         * 
         * <strong>example:</strong>
         * <p>1530811****@qq.com</p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The mobile number.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("MobilePhone")
        public String mobilePhone;

        /**
         * <p>The contact name.</p>
         * 
         * <strong>example:</strong>
         * <p>1531123****</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of the contact. Valid values: <strong>0</strong> (Disabled) and <strong>1</strong> (Enabled).</p>
         * 
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
         * <p>The email address of the default contact.</p>
         * 
         * <strong>example:</strong>
         * <p>1530811****@qq.com</p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The mobile number of the default contact.</p>
         * 
         * <strong>example:</strong>
         * <p>1531123****</p>
         */
        @NameInMap("MobilePhone")
        public String mobilePhone;

        /**
         * <p>The name of the default contact.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status. Valid values: <strong>normal</strong> (Normal) and <strong>disable</strong> (Disabled).</p>
         * 
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

}
