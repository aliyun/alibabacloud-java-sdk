// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitBatchMediaProducingJobRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotency of the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>12e8864746a0a398</strong></strong></p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The editing configuration. For the specific structure definition, see <a href="~~2692547#1be9bba03b7qu~~">EditingConfig</a>.</p>
     * 
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

    /**
     * <p>The input configuration. For the specific structure definition, see <a href="~~2692547#2faed1559549n~~">InputConfig</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;MediaGroupArray&quot;: [{
     *       &quot;GroupName&quot;: &quot;MediaGroup1&quot;,
     *       &quot;MediaArray&quot;: [
     *         &quot;<strong><strong>9d46c886b45481030f6e</strong></strong>&quot;,
     *         &quot;<strong><strong>6c886b4549d481030f6e</strong></strong>&quot; ]
     *     }, {
     *       &quot;GroupName&quot;: &quot;MediaGroup2&quot;,
     *       &quot;MediaArray&quot;: [
     *         &quot;<strong><strong>d46c886810b454930f6e</strong></strong>&quot;,
     *         &quot;<strong><strong>4549d886810b46c30f6e</strong></strong>&quot; ]
     *   }],
     *   &quot;TitleArray&quot;: [
     *       &quot;Hema Fresh grand opening in Huilongguan&quot;,
     *       &quot;Hema Fresh grand opening&quot; ],
     *   &quot;SpeechTextArray&quot;: [
     *       &quot;A new Hema Fresh store just opened in the nearby mall, today is the first day of business&quot;
     *       &quot;There are quite a few people in the mall, snacks and beverages are relatively cheap, come check it out&quot; ]
     * }</p>
     */
    @NameInMap("InputConfig")
    public String inputConfig;

    /**
     * <p>The output configuration. For the specific structure definition, see <a href="~~2692547#447b928fcbuoa~~">OutputConfig</a>.</p>
     * 
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

    /**
     * <p>The template parameters. You can configure multiple one-click video production templates, and one is randomly selected and applied. For details, see <a href="https://www.alibabacloud.com/help/en/ims/use-cases/batch-video-production-public-parameters#32c3bea6182sy">TemplateConfig metric description</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;<strong><strong>b4549d46c88681030f6e</strong></strong>&quot;,&quot;<strong><strong>549d46c88b4681030f6e</strong></strong>&quot;]</p>
     */
    @NameInMap("TemplateConfig")
    public String templateConfig;

    /**
     * <p>The user business configuration and callback configuration. For the specific structure definition, see <a href="~~357745#section-urj-v3f-0s1~~">UserData configuration</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;NotifyAddress&quot;:&quot;<a href="http://xx.xx.xxx%22%7D">http://xx.xx.xxx&quot;}</a> or {&quot;NotifyAddress&quot;:&quot;<a href="https://xx.xx.xxx%22%7D">https://xx.xx.xxx&quot;}</a> or {&quot;NotifyAddress&quot;:&quot;ice-callback-demo&quot;}</p>
     */
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

    public SubmitBatchMediaProducingJobRequest setTemplateConfig(String templateConfig) {
        this.templateConfig = templateConfig;
        return this;
    }
    public String getTemplateConfig() {
        return this.templateConfig;
    }

    public SubmitBatchMediaProducingJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
