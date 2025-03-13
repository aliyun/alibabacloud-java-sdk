// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateTrainTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>13168123111</p>
     */
    @NameInMap("aliyunMainId")
    public String aliyunMainId;

    /**
     * <strong>example:</strong>
     * <p>BASIC_MODEL</p>
     */
    @NameInMap("resSpecType")
    public String resSpecType;

    /**
     * <strong>example:</strong>
     * <p>CopyAnchorAndVoice</p>
     */
    @NameInMap("taskType")
    public String taskType;

    /**
     * <strong>example:</strong>
     * <p>realTimeInteractivity</p>
     */
    @NameInMap("useScene")
    public String useScene;

    /**
     * <strong>example:</strong>
     * <p>M</p>
     */
    @NameInMap("voiceGender")
    public String voiceGender;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("voiceLanguage")
    public String voiceLanguage;

    @NameInMap("voiceName")
    public String voiceName;

    /**
     * <strong>example:</strong>
     * <p><a href="https://yic-pre/video/test-0513.mp3">https://yic-pre/video/test-0513.mp3</a></p>
     */
    @NameInMap("voicePath")
    public String voicePath;

    public static CreateTrainTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTrainTaskRequest self = new CreateTrainTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateTrainTaskRequest setAliyunMainId(String aliyunMainId) {
        this.aliyunMainId = aliyunMainId;
        return this;
    }
    public String getAliyunMainId() {
        return this.aliyunMainId;
    }

    public CreateTrainTaskRequest setResSpecType(String resSpecType) {
        this.resSpecType = resSpecType;
        return this;
    }
    public String getResSpecType() {
        return this.resSpecType;
    }

    public CreateTrainTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public CreateTrainTaskRequest setUseScene(String useScene) {
        this.useScene = useScene;
        return this;
    }
    public String getUseScene() {
        return this.useScene;
    }

    public CreateTrainTaskRequest setVoiceGender(String voiceGender) {
        this.voiceGender = voiceGender;
        return this;
    }
    public String getVoiceGender() {
        return this.voiceGender;
    }

    public CreateTrainTaskRequest setVoiceLanguage(String voiceLanguage) {
        this.voiceLanguage = voiceLanguage;
        return this;
    }
    public String getVoiceLanguage() {
        return this.voiceLanguage;
    }

    public CreateTrainTaskRequest setVoiceName(String voiceName) {
        this.voiceName = voiceName;
        return this;
    }
    public String getVoiceName() {
        return this.voiceName;
    }

    public CreateTrainTaskRequest setVoicePath(String voicePath) {
        this.voicePath = voicePath;
        return this;
    }
    public String getVoicePath() {
        return this.voicePath;
    }

}
