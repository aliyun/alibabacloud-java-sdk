// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSceneMediaSelectionJobRequest extends TeaModel {
    /**
     * <p>The editing configuration. Its structure depends on the value of JobType.</p>
     * <ul>
     * <li>When JobType is set to Smart_Mix_Media_Select, see <a href="https://help.aliyun.com/zh/ims/use-cases/intelligent-graphic-matching-into-a-piece/?spm=a2c4g.11186623.help-menu-193643.d_3_2_0_1.7c3d6997qndkZj">Image-text matching</a>.</li>
     * <li>When JobType is set to Screen_Media_Highlights_Media_Select, see <a href="https://help.aliyun.com/zh/ims/use-cases/create-highlight-videos?spm=a2c4g.11186623.help-menu-193643.d_3_2_0_3.84b5661bIcQULE">Highlight mashup</a>.</li>
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
     * <p>The input configuration. Its structure and required fields depend on the value of JobType.</p>
     * <ul>
     * <li>When JobType is set to Smart_Mix_Media_Select, see <a href="https://help.aliyun.com/zh/ims/use-cases/intelligent-graphic-matching-into-a-piece/?spm=a2c4g.11186623.help-menu-193643.d_3_2_0_1.7c3d6997qndkZj">Image-text matching</a>.</li>
     * <li>When JobType is set to Screen_Media_Highlights_Media_Select, see <a href="https://help.aliyun.com/zh/ims/use-cases/create-highlight-videos?spm=a2c4g.11186623.help-menu-193643.d_3_2_0_3.84b5661bIcQULE">Highlight mashup</a>.</li>
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
     *         &quot;Grand opening! A Freshippo store opens today at the nearby mall.&quot;,
     *         &quot;Great deals on snacks and drinks. Stop by!&quot;
     *     ]
     * }</p>
     */
    @NameInMap("InputConfig")
    public String inputConfig;

    /**
     * <p>The job type. Valid values:</p>
     * <ul>
     * <li>Smart_Mix_Media_Select</li>
     * <li>Screen_Media_Highlights_Media_Select</li>
     * </ul>
     * <p>Differences:</p>
     * <ul>
     * <li>Smart_Mix_Media_Select: Matches voiceover scripts with provided video/image materials to select the most relevant clips and returns the matching results. Two options are available: Common mode, which is suitable for general-purpose materials like lifestyle vlogs, travel videos, and marketing content; Movie collections, which is optimized for materials with a coherent plot and specific characters, such as TV series and movies.</li>
     * <li>Screen_Media_Highlights_Media_Select: Automatically identifies and selects clips that are exciting or represent key story points from longer video materials.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Smart_Mix_Media_Select</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The output configuration. Its structure and required fields depend on the value of JobType.</p>
     * <ul>
     * <li>When JobType is set to Smart_Mix_Media_Select, see <a href="https://help.aliyun.com/zh/ims/use-cases/intelligent-graphic-matching-into-a-piece/?spm=a2c4g.11186623.help-menu-193643.d_3_2_0_1.7c3d6997qndkZj">Image-text matching</a>.</li>
     * <li>When JobType is set to Screen_Media_Highlights_Media_Select, see <a href="https://help.aliyun.com/zh/ims/use-cases/create-highlight-videos?spm=a2c4g.11186623.help-menu-193643.d_3_2_0_3.84b5661bIcQULE">Highlight mashup</a>.</li>
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
     * <p>The user-defined data, including the business and callback configurations. For more information, see <a href="~~357745#section-urj-v3f-0s1~~">UserData</a>.</p>
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
