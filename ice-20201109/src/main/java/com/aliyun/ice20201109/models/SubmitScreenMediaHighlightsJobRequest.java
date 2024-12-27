// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitScreenMediaHighlightsJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;MediaConfig&quot;: {
     *         &quot;Volume&quot;: 1
     *     },
     *     &quot;ProcessConfig&quot;: {
     *         &quot;AllowTransition&quot;: true,
     *         &quot;TransitionList&quot;: [&quot;fadecolor&quot;]
     *     }
     * }</p>
     */
    @NameInMap("EditingConfig")
    public String editingConfig;

    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;MediaArray&quot;: [
     *         &quot;<strong><strong>9d46c886b45481030f6e</strong></strong>&quot;,
     *         &quot;<strong><strong>6c886b4549d481030f6e</strong></strong>&quot;
     *     ]
     * }</p>
     */
    @NameInMap("InputConfig")
    public String inputConfig;

    /**
     * <strong>example:</strong>
     * <p>{
     *   &quot;MediaURL&quot;: &quot;<a href="http://xxx.oss-cn-shanghai.aliyuncs.com/xxx_%7Bindex%7D.mp4">http://xxx.oss-cn-shanghai.aliyuncs.com/xxx_{index}.mp4</a>&quot;,
     *   &quot;Count&quot;: 1,
     *   &quot;Width&quot;: 1080,
     *   &quot;Height&quot;: 1920
     * }</p>
     */
    @NameInMap("OutputConfig")
    public String outputConfig;

    @NameInMap("UserData")
    public String userData;

    public static SubmitScreenMediaHighlightsJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitScreenMediaHighlightsJobRequest self = new SubmitScreenMediaHighlightsJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitScreenMediaHighlightsJobRequest setEditingConfig(String editingConfig) {
        this.editingConfig = editingConfig;
        return this;
    }
    public String getEditingConfig() {
        return this.editingConfig;
    }

    public SubmitScreenMediaHighlightsJobRequest setInputConfig(String inputConfig) {
        this.inputConfig = inputConfig;
        return this;
    }
    public String getInputConfig() {
        return this.inputConfig;
    }

    public SubmitScreenMediaHighlightsJobRequest setOutputConfig(String outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }
    public String getOutputConfig() {
        return this.outputConfig;
    }

    public SubmitScreenMediaHighlightsJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
