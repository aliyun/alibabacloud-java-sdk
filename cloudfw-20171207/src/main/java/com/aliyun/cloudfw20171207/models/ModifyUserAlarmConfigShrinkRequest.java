// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyUserAlarmConfigShrinkRequest extends TeaModel {
    /**
     * <p>Alert configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AlarmConfig")
    public java.util.List<ModifyUserAlarmConfigShrinkRequestAlarmConfig> alarmConfig;

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
    public String contactConfigShrink;

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

    public static ModifyUserAlarmConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserAlarmConfigShrinkRequest self = new ModifyUserAlarmConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyUserAlarmConfigShrinkRequest setAlarmConfig(java.util.List<ModifyUserAlarmConfigShrinkRequestAlarmConfig> alarmConfig) {
        this.alarmConfig = alarmConfig;
        return this;
    }
    public java.util.List<ModifyUserAlarmConfigShrinkRequestAlarmConfig> getAlarmConfig() {
        return this.alarmConfig;
    }

    public ModifyUserAlarmConfigShrinkRequest setAlarmLang(String alarmLang) {
        this.alarmLang = alarmLang;
        return this;
    }
    public String getAlarmLang() {
        return this.alarmLang;
    }

    public ModifyUserAlarmConfigShrinkRequest setContactConfigShrink(String contactConfigShrink) {
        this.contactConfigShrink = contactConfigShrink;
        return this;
    }
    public String getContactConfigShrink() {
        return this.contactConfigShrink;
    }

    public ModifyUserAlarmConfigShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyUserAlarmConfigShrinkRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ModifyUserAlarmConfigShrinkRequest setUseDefaultContact(Integer useDefaultContact) {
        this.useDefaultContact = useDefaultContact;
        return this;
    }
    public Integer getUseDefaultContact() {
        return this.useDefaultContact;
    }

    public static class ModifyUserAlarmConfigShrinkRequestAlarmConfig extends TeaModel {
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

        public static ModifyUserAlarmConfigShrinkRequestAlarmConfig build(java.util.Map<String, ?> map) throws Exception {
            ModifyUserAlarmConfigShrinkRequestAlarmConfig self = new ModifyUserAlarmConfigShrinkRequestAlarmConfig();
            return TeaModel.build(map, self);
        }

        public ModifyUserAlarmConfigShrinkRequestAlarmConfig setAlarmHour(String alarmHour) {
            this.alarmHour = alarmHour;
            return this;
        }
        public String getAlarmHour() {
            return this.alarmHour;
        }

        public ModifyUserAlarmConfigShrinkRequestAlarmConfig setAlarmNotify(String alarmNotify) {
            this.alarmNotify = alarmNotify;
            return this;
        }
        public String getAlarmNotify() {
            return this.alarmNotify;
        }

        public ModifyUserAlarmConfigShrinkRequestAlarmConfig setAlarmPeriod(String alarmPeriod) {
            this.alarmPeriod = alarmPeriod;
            return this;
        }
        public String getAlarmPeriod() {
            return this.alarmPeriod;
        }

        public ModifyUserAlarmConfigShrinkRequestAlarmConfig setAlarmType(String alarmType) {
            this.alarmType = alarmType;
            return this;
        }
        public String getAlarmType() {
            return this.alarmType;
        }

        public ModifyUserAlarmConfigShrinkRequestAlarmConfig setAlarmValue(String alarmValue) {
            this.alarmValue = alarmValue;
            return this;
        }
        public String getAlarmValue() {
            return this.alarmValue;
        }

        public ModifyUserAlarmConfigShrinkRequestAlarmConfig setAlarmWeekDay(String alarmWeekDay) {
            this.alarmWeekDay = alarmWeekDay;
            return this;
        }
        public String getAlarmWeekDay() {
            return this.alarmWeekDay;
        }

    }

}
