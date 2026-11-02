// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSceneTimelineOrganizationJobRequest extends TeaModel {
    /**
     * <p>The editing configuration. This parameter is the same as the EditingConfig parameter for the one-click video generation intelligent graphic matching and high-energy mashup features.</p>
     * <ul>
     * <li>When JobType is set to Smart_Mix_Timeline_Organize, see <a href="https://www.alibabacloud.com/help/en/ims/use-cases/intelligent-graphic-matching-into-a-piece/">Parameter settings for intelligent graphic matching</a>.</li>
     * <li>When JobType is set to Screen_Media_Highlights_Timeline_Organize, see <a href="https://www.alibabacloud.com/help/en/ims/use-cases/create-highlight-videos">Parameter settings for high-energy mashup</a>.</li>
     * </ul>
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
     * <p>The input configuration. This parameter is the same as the InputConfig parameter for the one-click video generation intelligent graphic matching and high-energy mashup features.</p>
     * <ul>
     * <li>When JobType is set to Smart_Mix_Timeline_Organize, see <a href="https://www.alibabacloud.com/help/en/ims/use-cases/intelligent-graphic-matching-into-a-piece/">Parameter settings for intelligent graphic matching</a>.</li>
     * <li>When JobType is set to Screen_Media_Highlights_Timeline_Organize, see <a href="https://www.alibabacloud.com/help/en/ims/use-cases/create-highlight-videos">Parameter settings for high-energy mashup</a>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;BackgroundMusic&quot;: &quot;<strong><strong>75c3936f3a8743850f2da942</strong></strong>&quot;,
     *     &quot;MediaArray&quot;: [
     *         &quot;<a href="https://test-bucket.oss-cn-shanghai.aliyuncs.com/test.mp4">https://test-bucket.oss-cn-shanghai.aliyuncs.com/test.mp4</a>&quot;
     *     ],
     *     &quot;SpeechTextArray&quot;: [
     *         &quot;A new Hema Fresh store just opened at the mall nearby, and today is its grand opening.&quot;
     *     ]
     * }</p>
     */
    @NameInMap("InputConfig")
    public String inputConfig;

    /**
     * <p>The task type. Valid values:</p>
     * <ul>
     * <li>Smart_Mix_Timeline_Organize: intelligent matching timeline orchestration.</li>
     * <li>Screen_Media_Highlights_Timeline_Organize: high-energy mashup timeline orchestration.</li>
     * </ul>
     * <p>Differences between the two scenarios:</p>
     * <ul>
     * <li>Intelligent matching: automatically organizes one or more timelines for final videos based on the material selection results of the intelligent matching scenario (the matching results of voiceover scripts and materials). This scenario is mostly applicable to batch marketing and general mashup scenarios.</li>
     * <li>High-energy mashup: automatically organizes one or more timelines for final videos based on the material selection results of the high-energy mashup scenario (the selection results of high-energy clips). This scenario is mostly applicable to high-energy mashup scenarios for short dramas.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Smart_Mix_Timeline_Organize</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The material selection results. You can call SubmitSceneMediaSelectionJob to submit a material selection task and call GetBatchMediaProducingJob to obtain the selection results.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;textMatchMediaOutputList&quot;: [{
     *         &quot;textMatchMediaSentenceOutputList&quot;: [{
     *                 &quot;duration&quot;: 3.366667,
     *                 &quot;matchClipList&quot;: [{
     *                     &quot;endTime&quot;: 11.16,
     *                     &quot;mediaId&quot;: &quot;<strong><strong>a0900f5071efbf1ce7e6c66a</strong></strong>&quot;,
     *                     &quot;startTime&quot;: 8.04
     *                 }],
     *                 &quot;text&quot;: &quot;A new Hema Fresh store just opened at the mall nearby&quot;
     *             },
     *             {
     *                 &quot;duration&quot;: 1.566667,
     *                 &quot;matchClipList&quot;: [{
     *                     &quot;endTime&quot;: 1.54,
     *                     &quot;mediaId&quot;: &quot;<strong><strong>a0900f5071efbf1ce7e6c66a</strong></strong>&quot;,
     *                     &quot;startTime&quot;: 0
     *                 }],
     *                 &quot;text&quot;: &quot;and today is its grand opening&quot;
     *             }
     *         ]
     *     }]
     * }</p>
     */
    @NameInMap("MediaSelectResult")
    public String mediaSelectResult;

    /**
     * <p>The output configuration. This parameter is the same as the OutputConfig parameter for the one-click video generation intelligent graphic matching and high-energy mashup features.</p>
     * <ul>
     * <li>When JobType is set to Smart_Mix_Timeline_Organize, see <a href="https://www.alibabacloud.com/help/en/ims/use-cases/intelligent-graphic-matching-into-a-piece/">Parameter settings for intelligent graphic matching</a>.</li>
     * <li>When JobType is set to Screen_Media_Highlights_Timeline_Organize, see <a href="https://www.alibabacloud.com/help/en/ims/use-cases/create-highlight-videos">Parameter settings for high-energy mashup</a>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;MediaURL&quot;: &quot;<a href="http://test-bucket.oss-cn-shanghai.aliyuncs.com/xxx_%7Bindex%7D.mp4">http://test-bucket.oss-cn-shanghai.aliyuncs.com/xxx_{index}.mp4</a>&quot;,
     *   &quot;Count&quot;: 1,
     *   &quot;Width&quot;: 1080,
     *   &quot;Height&quot;: 1920
     * }</p>
     */
    @NameInMap("OutputConfig")
    public String outputConfig;

    /**
     * <p>The user business and callback configurations. For more information about the structure, see <a href="~~357745#section-urj-v3f-0s1~~">UserData configuration instructions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;NotifyAddress&quot;:&quot;<a href="http://xx.xx.xxx%22%7D">http://xx.xx.xxx&quot;}</a> or {&quot;NotifyAddress&quot;:&quot;<a href="https://xx.xx.xxx%22%7D">https://xx.xx.xxx&quot;}</a> or {&quot;NotifyAddress&quot;:&quot;ice-callback-demo&quot;}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitSceneTimelineOrganizationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSceneTimelineOrganizationJobRequest self = new SubmitSceneTimelineOrganizationJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSceneTimelineOrganizationJobRequest setEditingConfig(String editingConfig) {
        this.editingConfig = editingConfig;
        return this;
    }
    public String getEditingConfig() {
        return this.editingConfig;
    }

    public SubmitSceneTimelineOrganizationJobRequest setInputConfig(String inputConfig) {
        this.inputConfig = inputConfig;
        return this;
    }
    public String getInputConfig() {
        return this.inputConfig;
    }

    public SubmitSceneTimelineOrganizationJobRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public SubmitSceneTimelineOrganizationJobRequest setMediaSelectResult(String mediaSelectResult) {
        this.mediaSelectResult = mediaSelectResult;
        return this;
    }
    public String getMediaSelectResult() {
        return this.mediaSelectResult;
    }

    public SubmitSceneTimelineOrganizationJobRequest setOutputConfig(String outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }
    public String getOutputConfig() {
        return this.outputConfig;
    }

    public SubmitSceneTimelineOrganizationJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
