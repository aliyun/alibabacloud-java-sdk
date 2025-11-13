// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSceneTimelineOrganizationJobRequest extends TeaModel {
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

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InputConfig")
    public String inputConfig;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Smart_Mix_Timeline_Organize</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MediaSelectResult")
    public String mediaSelectResult;

    /**
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
