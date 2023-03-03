// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SaveTraceAppConfigRequest extends TeaModel {
    /**
     * <p>The process identifier (PID) of the application. For more information about how to obtain the PID, see [Obtain the PID of an application](https://www.alibabacloud.com/help/zh/doc-detail/186100.htm?spm=a2cdw.13409063.0.0.7a72281f0bkTfx#title-imy-7gj-qhr).</p>
     */
    @NameInMap("Pid")
    public String pid;

    /**
     * <p>The settings of Application Monitoring.</p>
     */
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
        /**
         * <p>The value of the settings that you want to modify. For more information about the supported settings, see the following sections.</p>
         * <br>
         * <p>*   Trace sampling settings</p>
         * <p>*   Main switch settings</p>
         * <p>*   Threshold settings</p>
         * <p>*   Advanced Settings</p>
         * <p>*   Thread settings</p>
         * <p>*   Memory snapshot settings</p>
         * <p>*   URL convergence settings</p>
         * <p>*   Business log association settings</p>
         * <p>*   Business monitoring settings</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the settings that you want to modify. For more information about the supported settings, see the following sections.</p>
         * <br>
         * <p>*   Trace sampling settings</p>
         * <p>*   Main switch settings</p>
         * <p>*   Threshold settings</p>
         * <p>*   Advanced Settings</p>
         * <p>*   Thread settings</p>
         * <p>*   Memory snapshot settings</p>
         * <p>*   URL convergence settings</p>
         * <p>*   Business log association settings</p>
         * <p>*   Business monitoring settings</p>
         */
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
