// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SaveTraceAppConfigRequest extends TeaModel {
    @NameInMap("Pid")
    public String pid;

    @NameInMap("Settings")
    public java.util.List<SaveTraceAppConfigRequestSettings> settings;

    public static SaveTraceAppConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveTraceAppConfigRequest self = new SaveTraceAppConfigRequest();
        return TeaModel.build(map, self);
    }

    public SaveTraceAppConfigRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public SaveTraceAppConfigRequest setSettings(java.util.List<SaveTraceAppConfigRequestSettings> settings) {
        this.settings = settings;
        return this;
    }
    public java.util.List<SaveTraceAppConfigRequestSettings> getSettings() {
        return this.settings;
    }

    public static class SaveTraceAppConfigRequestSettings extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static SaveTraceAppConfigRequestSettings build(java.util.Map<String, ?> map) throws Exception {
            SaveTraceAppConfigRequestSettings self = new SaveTraceAppConfigRequestSettings();
            return TeaModel.build(map, self);
        }

        public SaveTraceAppConfigRequestSettings setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SaveTraceAppConfigRequestSettings setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
