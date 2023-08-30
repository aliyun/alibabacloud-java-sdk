// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SaveTraceAppConfigRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <br>
     * <p>Log on to the **ARMS console**. In the left-side navigation pane, choose **Application Monitoring** > **Applications**. On the **Applications** page, click the name of an application. The URL in the address bar contains the process ID (PID) of the application. The PID is indicated in the pid=xxx format. The PID is usually percent encoded as xxx%40xxx. You must modify this value to remove the percent encoding. For example, if the PID in the URL is eb4zdose6v%409781be0f44d\*\*\*\*, you must replace %40 with an at sign (@) to obtain eb4zdose6v@9781be0f44d\*\*\*\*.</p>
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
         * <p>The values of the settings that you want to modify. For information about the supported settings, see the following items:</p>
         * <br>
         * <p>*   Trace sampling settings</p>
         * <p>*   Main switch settings</p>
         * <p>*   Threshold settings</p>
         * <p>*   Advanced settings</p>
         * <p>*   Thread settings</p>
         * <p>*   Memory snapshot settings</p>
         * <p>*   URL convergence settings</p>
         * <p>*   Business log association settings</p>
         * <p>*   Business monitoring settings</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The values of the settings that you want to modify. For information about the supported settings, see the following items:</p>
         * <br>
         * <p>*   Trace sampling settings</p>
         * <p>*   Main switch settings</p>
         * <p>*   Threshold settings</p>
         * <p>*   Advanced settings</p>
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
