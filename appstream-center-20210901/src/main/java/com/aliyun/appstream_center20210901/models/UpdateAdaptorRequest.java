// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class UpdateAdaptorRequest extends TeaModel {
    /**
     * <p>The ID of the application adapter to be modified. This parameter is required and must belong to an application adapter manageable by the current account.</p>
     * 
     * <strong>example:</strong>
     * <p>adt-bp1example****</p>
     */
    @NameInMap("AdaptorId")
    public String adaptorId;

    /**
     * <p><strong>Not enabled. Do not pass this parameter.</strong> This operation does not support modifying application scripts through this parameter.</p>
     * <p>The example &quot;Not applicable (not enabled)&quot; is only a description of the field status and is not a valid parameter value.</p>
     * 
     * <strong>example:</strong>
     * <p>Not applicable (not enabled)</p>
     */
    @NameInMap("AppScript")
    public String appScript;

    /**
     * <p><strong>Not enabled. Do not pass this parameter.</strong> This operation does not support modifying executable file paths through this parameter.</p>
     * <p>The example &quot;Not applicable (not enabled)&quot; is only a description of the field status and is not a valid parameter value.</p>
     * 
     * <strong>example:</strong>
     * <p>Not applicable (not enabled)</p>
     */
    @NameInMap("ExecuteFileAddress")
    public String executeFileAddress;

    /**
     * <p>The application optimization configuration, represented as a JSON object string. Pass this parameter only when specific optimization configuration requirements exist. The content must be a valid JSON object.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("OptimizeParam")
    public String optimizeParam;

    /**
     * <p>The command-line parameters used when the application starts. If not empty, this parameter is used to update the startup parameters of the application adapter. Specify the value based on the startup requirements of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>--lang=zh-CN</p>
     */
    @NameInMap("SilenceParam")
    public String silenceParam;

    /**
     * <p>The application runtime configuration object. If this parameter is omitted, the existing user configuration is not modified.</p>
     * <p><strong>If passed, the original UserConfig is entirely replaced and not merged item by item.</strong> Submit the complete configuration and include the configuration items that need to be retained. Subfields that are not provided do not automatically inherit the original values.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;FixedResolution&quot;:&quot;1440x2560&quot;,&quot;DisconnectAction&quot;:&quot;KEEP_CURRENT&quot;,&quot;ShowWindow&quot;:&quot;HIDE&quot;}</p>
     */
    @NameInMap("UserConfig")
    public UpdateAdaptorRequestUserConfig userConfig;

    public static UpdateAdaptorRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAdaptorRequest self = new UpdateAdaptorRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAdaptorRequest setAdaptorId(String adaptorId) {
        this.adaptorId = adaptorId;
        return this;
    }
    public String getAdaptorId() {
        return this.adaptorId;
    }

    public UpdateAdaptorRequest setAppScript(String appScript) {
        this.appScript = appScript;
        return this;
    }
    public String getAppScript() {
        return this.appScript;
    }

    public UpdateAdaptorRequest setExecuteFileAddress(String executeFileAddress) {
        this.executeFileAddress = executeFileAddress;
        return this;
    }
    public String getExecuteFileAddress() {
        return this.executeFileAddress;
    }

    public UpdateAdaptorRequest setOptimizeParam(String optimizeParam) {
        this.optimizeParam = optimizeParam;
        return this;
    }
    public String getOptimizeParam() {
        return this.optimizeParam;
    }

    public UpdateAdaptorRequest setSilenceParam(String silenceParam) {
        this.silenceParam = silenceParam;
        return this;
    }
    public String getSilenceParam() {
        return this.silenceParam;
    }

    public UpdateAdaptorRequest setUserConfig(UpdateAdaptorRequestUserConfig userConfig) {
        this.userConfig = userConfig;
        return this;
    }
    public UpdateAdaptorRequestUserConfig getUserConfig() {
        return this.userConfig;
    }

    public static class UpdateAdaptorRequestUserConfig extends TeaModel {
        /**
         * <p>The processing policy after a connection is disconnected. When modifying other UserConfig configurations, if you need to retain the original policy, pass the original value in the complete configuration object. This operation does not automatically populate default values.</p>
         * 
         * <strong>example:</strong>
         * <p>KEEP_CURRENT</p>
         */
        @NameInMap("DisconnectAction")
        public String disconnectAction;

        /**
         * <p>The fixed resolution used when the application runs, in the format of width × height, in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>1440x2560</p>
         */
        @NameInMap("FixedResolution")
        public String fixedResolution;

        /**
         * <p>The application window display configuration. When modifying other UserConfig configurations, if you need to retain the original configuration, pass the original value in the complete configuration object. This operation does not automatically populate default values.</p>
         * 
         * <strong>example:</strong>
         * <p>HIDE</p>
         */
        @NameInMap("ShowWindow")
        public String showWindow;

        public static UpdateAdaptorRequestUserConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateAdaptorRequestUserConfig self = new UpdateAdaptorRequestUserConfig();
            return TeaModel.build(map, self);
        }

        public UpdateAdaptorRequestUserConfig setDisconnectAction(String disconnectAction) {
            this.disconnectAction = disconnectAction;
            return this;
        }
        public String getDisconnectAction() {
            return this.disconnectAction;
        }

        public UpdateAdaptorRequestUserConfig setFixedResolution(String fixedResolution) {
            this.fixedResolution = fixedResolution;
            return this;
        }
        public String getFixedResolution() {
            return this.fixedResolution;
        }

        public UpdateAdaptorRequestUserConfig setShowWindow(String showWindow) {
            this.showWindow = showWindow;
            return this;
        }
        public String getShowWindow() {
            return this.showWindow;
        }

    }

}
