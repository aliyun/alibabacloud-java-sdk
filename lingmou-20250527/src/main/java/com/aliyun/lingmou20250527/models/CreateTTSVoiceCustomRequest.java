// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class CreateTTSVoiceCustomRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TestTTSVoiceName.mp3</p>
     */
    @NameInMap("fileName")
    public String fileName;

    /**
     * <strong>example:</strong>
     * <p>FEMALE</p>
     */
    @NameInMap("gender")
    public String gender;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TestTTSVoiceName</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>material/INPUT_TRAIN_AUDIO/Mt.CN2VNOPRC5QU2</p>
     */
    @NameInMap("ossKey")
    public String ossKey;

    public static CreateTTSVoiceCustomRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTTSVoiceCustomRequest self = new CreateTTSVoiceCustomRequest();
        return TeaModel.build(map, self);
    }

    public CreateTTSVoiceCustomRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateTTSVoiceCustomRequest setGender(String gender) {
        this.gender = gender;
        return this;
    }
    public String getGender() {
        return this.gender;
    }

    public CreateTTSVoiceCustomRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTTSVoiceCustomRequest setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

}
