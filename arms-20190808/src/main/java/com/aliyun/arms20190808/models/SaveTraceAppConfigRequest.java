// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SaveTraceAppConfigRequest extends TeaModel {
    /**
     * <p>The process ID (PID) of the application.</p>
     * <p>Log on to the ARMS console. In the left-side navigation pane, choose <strong>Application Monitoring</strong> &gt; <strong>Application List</strong>. On the Application List page, click the name of an application. The URL in the address bar contains the PID of the application. The PID is indicated in the pid=xxx format. The PID is usually percent encoded as xxx%40xxx. You must modify this value to remove the percent encoding. For example, if the PID in the URL is xxx%4074xxx, you must replace %40 with an at sign (@) to obtain xxx@74xxx.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a2n80plglh@745eddxxx</p>
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
         * <p>The key of the settings that you want to modify. For more information about the supported settings, see the following sections.</p>
         * <ul>
         * <li>Trace sampling settings</li>
         * <li>Agent switch settings</li>
         * <li>Threshold settings</li>
         * <li>Advanced settings</li>
         * <li>Thread settings</li>
         * <li>Memory snapshot settings</li>
         * <li>URL convergence settings</li>
         * <li>Business log association settings</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sampling.enable</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the settings that you want to modify. For more information about the supported settings, see the following sections.</p>
         * <ul>
         * <li>Trace sampling settings</li>
         * <li>Agent switch settings</li>
         * <li>Threshold settings</li>
         * <li>Advanced settings</li>
         * <li>Thread settings</li>
         * <li>Memory snapshot settings</li>
         * <li>URL convergence settings</li>
         * <li>Business log association settings</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
