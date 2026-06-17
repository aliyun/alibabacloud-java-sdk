// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyUserAlarmConfigRequest extends TeaModel {
    /**
     * <p>Alert configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AlarmConfig")
    public java.util.List<ModifyUserAlarmConfigRequestAlarmConfig> alarmConfig;

    /**
     * <p>Language for message notifications.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AlarmLang")
    public String alarmLang;

    /**
     * <p>Contact configuration.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("ContactConfig")
    public java.util.List<ModifyUserAlarmConfigRequestContactConfig> contactConfig;

    /**
     * <p>Language used for requests and responses.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Source IP address of the requester.</p>
     * 
     * <strong>example:</strong>
     * <p>117.129.64.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>Use default contact method.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("UseDefaultContact")
    public Integer useDefaultContact;

    public static ModifyUserAlarmConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserAlarmConfigRequest self = new ModifyUserAlarmConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyUserAlarmConfigRequest setAlarmConfig(java.util.List<ModifyUserAlarmConfigRequestAlarmConfig> alarmConfig) {
        this.alarmConfig = alarmConfig;
        return this;
    }
    public java.util.List<ModifyUserAlarmConfigRequestAlarmConfig> getAlarmConfig() {
        return this.alarmConfig;
    }

    public ModifyUserAlarmConfigRequest setAlarmLang(String alarmLang) {
        this.alarmLang = alarmLang;
        return this;
    }
    public String getAlarmLang() {
        return this.alarmLang;
    }

    public ModifyUserAlarmConfigRequest setContactConfig(java.util.List<ModifyUserAlarmConfigRequestContactConfig> contactConfig) {
        this.contactConfig = contactConfig;
        return this;
    }
    public java.util.List<ModifyUserAlarmConfigRequestContactConfig> getContactConfig() {
        return this.contactConfig;
    }

    public ModifyUserAlarmConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyUserAlarmConfigRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyUserAlarmConfigRequest setUseDefaultContact(Integer useDefaultContact) {
        this.useDefaultContact = useDefaultContact;
        return this;
    }
    public Integer getUseDefaultContact() {
        return this.useDefaultContact;
    }

    public static class ModifyUserAlarmConfigRequestAlarmConfig extends TeaModel {
        /**
         * <p>Hour for alert notifications.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AlarmHour")
        public String alarmHour;

        /**
         * <p>Notification method.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AlarmNotify")
        public String alarmNotify;

        /**
         * <p>Alert period.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AlarmPeriod")
        public String alarmPeriod;

        /**
         * <p>Alarm metric.</p>
         * 
         * <strong>example:</strong>
         * <p>bandwidth</p>
         */
        @NameInMap("AlarmType")
        public String alarmType;

        /**
         * <p>Alert notification message.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("AlarmValue")
        public String alarmValue;

        /**
         * <p>Day of the week for alert notifications.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AlarmWeekDay")
        public String alarmWeekDay;

        public static ModifyUserAlarmConfigRequestAlarmConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyUserAlarmConfigRequestAlarmConfig self = new ModifyUserAlarmConfigRequestAlarmConfig();
            return TeaModel.build(map, self);
        }

        public ModifyUserAlarmConfigRequestAlarmConfig setAlarmHour(String alarmHour) {
            this.alarmHour = alarmHour;
            return this;
        }
        public String getAlarmHour() {
            return this.alarmHour;
        }

        public ModifyUserAlarmConfigRequestAlarmConfig setAlarmNotify(String alarmNotify) {
            this.alarmNotify = alarmNotify;
            return this;
        }
        public String getAlarmNotify() {
            return this.alarmNotify;
        }

        public ModifyUserAlarmConfigRequestAlarmConfig setAlarmPeriod(String alarmPeriod) {
            this.alarmPeriod = alarmPeriod;
            return this;
        }
        public String getAlarmPeriod() {
            return this.alarmPeriod;
        }

        public ModifyUserAlarmConfigRequestAlarmConfig setAlarmType(String alarmType) {
            this.alarmType = alarmType;
            return this;
        }
        public String getAlarmType() {
            return this.alarmType;
        }

        public ModifyUserAlarmConfigRequestAlarmConfig setAlarmValue(String alarmValue) {
            this.alarmValue = alarmValue;
            return this;
        }
        public String getAlarmValue() {
            return this.alarmValue;
        }

        public ModifyUserAlarmConfigRequestAlarmConfig setAlarmWeekDay(String alarmWeekDay) {
            this.alarmWeekDay = alarmWeekDay;
            return this;
        }
        public String getAlarmWeekDay() {
            return this.alarmWeekDay;
        }

    }

    public static class ModifyUserAlarmConfigRequestContactConfig extends TeaModel {
        /**
         * <p>Mailbox.</p>
         * 
         * <strong>example:</strong>
         * <p>91632****@qq.com</p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>Mobile number.</p>
         * 
         * <strong>example:</strong>
         * <p>1351234****</p>
         */
        @NameInMap("MobilePhone")
        public String mobilePhone;

        /**
         * <p>Alert notification recipient.</p>
         * 
         * <strong>example:</strong>
         * <p>Ben</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Alert status.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static ModifyUserAlarmConfigRequestContactConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyUserAlarmConfigRequestContactConfig self = new ModifyUserAlarmConfigRequestContactConfig();
            return TeaModel.build(map, self);
        }

        public ModifyUserAlarmConfigRequestContactConfig setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ModifyUserAlarmConfigRequestContactConfig setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }
        public String getMobilePhone() {
            return this.mobilePhone;
        }

        public ModifyUserAlarmConfigRequestContactConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyUserAlarmConfigRequestContactConfig setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
