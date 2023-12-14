// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DataProductListLogMapValue extends TeaModel {
    /**
     * <p>The code of the log.</p>
     */
    @NameInMap("LogCode")
    public String logCode;

    /**
     * <p>This parameter is deprecated.</p>
     */
    @NameInMap("LogName")
    public String logName;

    /**
     * <p>This parameter is deprecated.</p>
     */
    @NameInMap("LogNameEn")
    public String logNameEn;

    /**
     * <p>The language code of the log that is used to indicate the language in which the log is displayed.</p>
     */
    @NameInMap("LogNameKey")
    public String logNameKey;

    /**
     * <p>The status of the log delivery. Valid values:</p>
     * <br>
     * <p>*   true: The logs are being delivered.</p>
     * <p>*   false: The log delivery feature is disabled.</p>
     */
    @NameInMap("Status")
    public Boolean status;

    /**
     * <p>Indicates whether the log delivery feature can be enabled or disabled. The feature can be enabled or disabled only by the administrator of the threat analysis feature. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("CanOperateOrNot")
    public Boolean canOperateOrNot;

    /**
     * <p>The topic of the log in the Logstore. The value is an index field in the Logstore that can be used to distinguish different logs.</p>
     */
    @NameInMap("Topic")
    public String topic;

    /**
     * <p>The extended parameter.</p>
     */
    @NameInMap("ExtraParameters")
    public java.util.List<DataProductListLogMapValueExtraParameters> extraParameters;

    public static DataProductListLogMapValue build(java.util.Map<String, ?> map) throws Exception {
        DataProductListLogMapValue self = new DataProductListLogMapValue();
        return TeaModel.build(map, self);
    }

    public DataProductListLogMapValue setLogCode(String logCode) {
        this.logCode = logCode;
        return this;
    }
    public String getLogCode() {
        return this.logCode;
    }

    public DataProductListLogMapValue setLogName(String logName) {
        this.logName = logName;
        return this;
    }
    public String getLogName() {
        return this.logName;
    }

    public DataProductListLogMapValue setLogNameEn(String logNameEn) {
        this.logNameEn = logNameEn;
        return this;
    }
    public String getLogNameEn() {
        return this.logNameEn;
    }

    public DataProductListLogMapValue setLogNameKey(String logNameKey) {
        this.logNameKey = logNameKey;
        return this;
    }
    public String getLogNameKey() {
        return this.logNameKey;
    }

    public DataProductListLogMapValue setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public DataProductListLogMapValue setCanOperateOrNot(Boolean canOperateOrNot) {
        this.canOperateOrNot = canOperateOrNot;
        return this;
    }
    public Boolean getCanOperateOrNot() {
        return this.canOperateOrNot;
    }

    public DataProductListLogMapValue setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public DataProductListLogMapValue setExtraParameters(java.util.List<DataProductListLogMapValueExtraParameters> extraParameters) {
        this.extraParameters = extraParameters;
        return this;
    }
    public java.util.List<DataProductListLogMapValueExtraParameters> getExtraParameters() {
        return this.extraParameters;
    }

    public static class DataProductListLogMapValueExtraParameters extends TeaModel {
        /**
         * <p>The ID of the extended parameter.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the extended parameter.</p>
         */
        @NameInMap("Value")
        public String value;

        public static DataProductListLogMapValueExtraParameters build(java.util.Map<String, ?> map) throws Exception {
            DataProductListLogMapValueExtraParameters self = new DataProductListLogMapValueExtraParameters();
            return TeaModel.build(map, self);
        }

        public DataProductListLogMapValueExtraParameters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DataProductListLogMapValueExtraParameters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
