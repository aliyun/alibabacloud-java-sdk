// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSceneTimelineOrganizationJobRequest extends TeaModel {
    /**
     * <p>The editing configuration. Its structure depends on the value of JobType.</p>
     * <ul>
     * <li>When JobType is set to Smart_Mix_Timeline_Organize, see <a href="https://help.aliyun.com/zh/ims/use-cases/intelligent-graphic-matching-into-a-piece/?spm=a2c4g.11186623.help-menu-193643.d_3_2_0_1.7c3d6997qndkZj">Image-text matching</a>.</li>
     * <li>When JobType is set to Screen_Media_Highlights_Timeline_Organize, see <a href="https://help.aliyun.com/zh/ims/use-cases/create-highlight-videos?spm=a2c4g.11186623.help-menu-193643.d_3_2_0_3.84b5661bIcQULE">Highlight mashup</a>.</li>
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
     * <li>When JobType is set to Smart_Mix_Timeline_Organize, see <a href="https://help.aliyun.com/zh/ims/use-cases/intelligent-graphic-matching-into-a-piece/?spm=a2c4g.11186623.help-menu-193643.d_3_2_0_1.7c3d6997qndkZj">Image-text matching</a>.</li>
     * <li>When JobType is set to Screen_Media_Highlights_Timeline_Organize, see <a href="https://help.aliyun.com/zh/ims/use-cases/create-highlight-videos?spm=a2c4g.11186623.help-menu-193643.d_3_2_0_3.84b5661bIcQULE">Highlight mashup</a>.</li>
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
     *         &quot;A new Freshippo store just opened in the nearby mall. Today is the grand opening.&quot;
     *     ]
     * }</p>
     */
    @NameInMap("InputConfig")
    public String inputConfig;

    /**
     * <p>The job type. Valid values:</p>
     * <ul>
     * <li>Smart_Mix_Timeline_Organize: Image-text matching.</li>
     * <li>Screen_Media_Highlights_Timeline_Organize: Highlight mashup.</li>
     * </ul>
     * <p>Differences:</p>
     * <ul>
     * <li>Image-text matching: Arranges a timeline based on the results of matching a voiceover script to media assets. Ideal for bulk marketing videos and general-purpose montages.</li>
     * <li>Highlight mashup: Arranges a timeline based on the results of highlight clip selection. Ideal for creating action-packed highlight reels from short-form dramas.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Smart_Mix_Timeline_Organize</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The media selection results from a previously run SubmitSceneMediaSelectionJob. You can retrieve this result by calling GetBatchMediaProducingJob.</p>
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
     *                 &quot;text&quot;: &quot;A new Freshippo store just opened in the nearby mall&quot;
     *             },
     *             {
     *                 &quot;duration&quot;: 1.566667,
     *                 &quot;matchClipList&quot;: [{
     *                     &quot;endTime&quot;: 1.54,
     *                     &quot;mediaId&quot;: &quot;<strong><strong>a0900f5071efbf1ce7e6c66a</strong></strong>&quot;,
     *                     &quot;startTime&quot;: 0
     *                 }],
     *                 &quot;text&quot;: &quot;Today is the grand opening&quot;
     *             }
     *         ]
     *     }]
     * }</p>
     */
    @NameInMap("MediaSelectResult")
    public String mediaSelectResult;

    /**
     * <p>The output configuration. Its structure and required fields depend on the value of JobType.</p>
     * <ul>
     * <li>When JobType is set to Smart_Mix_Timeline_Organize, see <a href="https://help.aliyun.com/zh/ims/use-cases/intelligent-graphic-matching-into-a-piece/?spm=a2c4g.11186623.help-menu-193643.d_3_2_0_1.7c3d6997qndkZj">Image-text matching</a>.</li>
     * <li>When JobType is set to Screen_Media_Highlights_Timeline_Organize, see <a href="https://help.aliyun.com/zh/ims/use-cases/create-highlight-videos?spm=a2c4g.11186623.help-menu-193643.d_3_2_0_3.84b5661bIcQULE">Highlight mashup</a>.</li>
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
