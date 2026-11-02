// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSceneMediaSelectionJobRequest extends TeaModel {
    /**
     * <p>The editing configuration, which is the same as the EditingConfig parameter for the intelligent graphic matching and highlight mashup features of one-click video production.</p>
     * <ul>
     * <li>When JobType is set to Smart_Mix_Media_Select, see <a href="https://www.alibabacloud.com/help/en/ims/use-cases/intelligent-graphic-matching-into-a-piece/">Intelligent graphic matching parameter settings</a>.</li>
     * <li>When JobType is set to Screen_Media_Highlights_Media_Select, see <a href="https://www.alibabacloud.com/help/en/ims/use-cases/create-highlight-videos">Highlight mashup parameter settings</a>.</li>
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
     * <p>The input configuration, which is the same as the InputConfig parameter for the intelligent graphic matching and highlight mashup features of one-click video production.</p>
     * <ul>
     * <li>When JobType is set to Smart_Mix_Media_Select, see <a href="https://www.alibabacloud.com/help/en/ims/use-cases/intelligent-graphic-matching-into-a-piece/">Intelligent graphic matching parameter settings</a>.</li>
     * <li>When JobType is set to Screen_Media_Highlights_Media_Select, see <a href="https://www.alibabacloud.com/help/en/ims/use-cases/create-highlight-videos">Highlight mashup parameter settings</a>.</li>
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
     *         &quot;A new Hema Fresh store just opened at the mall nearby, and today is its grand opening.&quot;,
     *         &quot;There are quite a few people in the mall, and snacks and drinks are pretty affordable—come check it out!&quot;
     *     ]
     * }</p>
     */
    @NameInMap("InputConfig")
    public String inputConfig;

    /**
     * <p>The task type. Valid values:</p>
     * <ul>
     * <li>Smart_Mix_Media_Select: intelligent matching material selection.</li>
     * <li>Screen_Media_Highlights_Media_Select: highlight mashup material selection.</li>
     * </ul>
     * <p>Differences between the two scenarios:</p>
     * <ul>
     * <li>Intelligent matching: You input voiceover scripts along with video and image materials. The system selects the most matching video and image materials based on the voiceover script content and returns the matching results. This scenario includes two sub-scenarios: general edition and film and television highlight edition. The general edition is suitable for daily general-purpose materials such as lifestyle, travel, and marketing. The film and television highlight edition is more suitable for plot-driven materials such as TV series and movies.</li>
     * <li>Highlight mashup: You input video materials (typically multi-episode short dramas). The system automatically selects appropriate highlight segments based on highlight definitions or storylines for subsequent mashup production.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Smart_Mix_Media_Select</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The output configuration, which is the same as the OutputConfig parameter for the intelligent graphic matching and highlight mashup features of one-click video production.</p>
     * <ul>
     * <li>When JobType is set to Smart_Mix_Media_Select, see <a href="https://www.alibabacloud.com/help/en/ims/use-cases/intelligent-graphic-matching-into-a-piece/">Intelligent graphic matching parameter settings</a>.</li>
     * <li>When JobType is set to Screen_Media_Highlights_Media_Select, see <a href="https://www.alibabacloud.com/help/en/ims/use-cases/create-highlight-videos">Highlight mashup parameter settings</a>.</li>
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
     * <p>The user business and callback configurations. For more information about the structure, see <a href="~~357745#section-urj-v3f-0s1~~">UserData configuration</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;NotifyAddress&quot;:&quot;<a href="http://xx.xx.xxx%22%7D">http://xx.xx.xxx&quot;}</a> or {&quot;NotifyAddress&quot;:&quot;<a href="https://xx.xx.xxx%22%7D">https://xx.xx.xxx&quot;}</a> or {&quot;NotifyAddress&quot;:&quot;ice-callback-demo&quot;}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitSceneMediaSelectionJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSceneMediaSelectionJobRequest self = new SubmitSceneMediaSelectionJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSceneMediaSelectionJobRequest setEditingConfig(String editingConfig) {
        this.editingConfig = editingConfig;
        return this;
    }
    public String getEditingConfig() {
        return this.editingConfig;
    }

    public SubmitSceneMediaSelectionJobRequest setInputConfig(String inputConfig) {
        this.inputConfig = inputConfig;
        return this;
    }
    public String getInputConfig() {
        return this.inputConfig;
    }

    public SubmitSceneMediaSelectionJobRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public SubmitSceneMediaSelectionJobRequest setOutputConfig(String outputConfig) {
        this.outputConfig = outputConfig;
        return this;
    }
    public String getOutputConfig() {
        return this.outputConfig;
    }

    public SubmitSceneMediaSelectionJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
