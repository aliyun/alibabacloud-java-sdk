// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitBatchMediaProducingJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><strong><strong>12e8864746a0a398</strong></strong></p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>{
     *   &quot;MediaConfig&quot;: {
     *       &quot;Volume&quot;: 0
     *   },
     *   &quot;SpeechConfig&quot;: {
     *       &quot;Volume&quot;: 1
     *   },
     *  &quot;BackgroundMusicConfig&quot;: {
     *       &quot;Volume&quot;: 0.3
     *   }
     * }</p>
     */
    @NameInMap("EditingConfig")
    public String editingConfig;

    @NameInMap("InputConfig")
    public String inputConfig;

    /**
     * <strong>example:</strong>
     * <p>{
     *   &quot;MediaURL&quot;: &quot;<a href="http://xxx.oss-cn-shanghai.aliyuncs.com/xxx_%7Bindex%7D.mp4">http://xxx.oss-cn-shanghai.aliyuncs.com/xxx_{index}.mp4</a>&quot;,
     *   &quot;Count&quot;: 20,
     *   &quot;MaxDuration&quot;: 15,
     *   &quot;Width&quot;: 1080,
     *   &quot;Height&quot;: 1920,
     *   &quot;Video&quot;: {&quot;Crf&quot;: 27}
     * }</p>
     */
    @NameInMap("OutputConfig")
    public String outputConfig;

    @NameInMap("UserData")
    public String userData;

    public static SubmitBatchMediaProducingJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitBatchMediaProducingJobRequest self = new SubmitBatchMediaProducingJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitBatchMediaProducingJobRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SubmitBatchMediaProducingJobRequest setEditingConfig(String editingConfig) {
        this.editingConfig = editingConfig;
        return this;
    }
    public String getEditingConfig() {
        return this.editingConfig;
    }

    public SubmitBatchMediaProducingJobRequest setInputConfig(String inputConfig) {
        this.inputConfig = inputConfig;
        return this;
    }
    public String getInputConfig() {
        return this.inputConfig;
    }

    public SubmitBatchMediaProducingJobRequest setOutputConfig(String outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }
    public String getOutputConfig() {
        return this.outputConfig;
    }

    public SubmitBatchMediaProducingJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
