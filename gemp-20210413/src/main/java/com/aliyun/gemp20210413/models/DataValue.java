// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class DataValue extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("description")
    public String description;

    @NameInMap("configDescription")
    public String configDescription;

    @NameInMap("configCode")
    public String configCode;

    @NameInMap("parentCode")
    public String parentCode;

    @NameInMap("configKey")
    public String configKey;

    @NameInMap("configValue")
    public String configValue;

    @NameInMap("requirement")
    public Boolean requirement;

    public static DataValue build(java.util.Map<String, ?> map) throws Exception {
        DataValue self = new DataValue();
        return TeaModel.build(map, self);
    }

    public DataValue setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DataValue setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DataValue setConfigDescription(String configDescription) {
        this.configDescription = configDescription;
        return this;
    }
    public String getConfigDescription() {
        return this.configDescription;
    }

    public DataValue setConfigCode(String configCode) {
        this.configCode = configCode;
        return this;
    }
    public String getConfigCode() {
        return this.configCode;
    }

    public DataValue setParentCode(String parentCode) {
        this.parentCode = parentCode;
        return this;
    }
    public String getParentCode() {
        return this.parentCode;
    }

    public DataValue setConfigKey(String configKey) {
        this.configKey = configKey;
        return this;
    }
    public String getConfigKey() {
        return this.configKey;
    }

    public DataValue setConfigValue(String configValue) {
        this.configValue = configValue;
        return this;
    }
    public String getConfigValue() {
        return this.configValue;
    }

    public DataValue setRequirement(Boolean requirement) {
        this.requirement = requirement;
        return this;
    }
    public Boolean getRequirement() {
        return this.requirement;
    }

}
