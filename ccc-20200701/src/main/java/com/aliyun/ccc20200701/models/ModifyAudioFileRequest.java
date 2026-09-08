// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ModifyAudioFileRequest extends TeaModel {
    /**
     * <p>Name of the audio file to be modified. You can specify new content for the audio file here.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>new-test-file.wav</p>
     */
    @NameInMap("AudioFileName")
    public String audioFileName;

    /**
     * <p>Audio resource ID, which uniquely identifies an audio file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>acc300c4-75c9-41ba-ba5e-2a365c96c248</p>
     */
    @NameInMap("AudioResourceId")
    public String audioResourceId;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Display name of the audio file. It must be 1 to 32 characters in length. The display name cannot be changed when modifying the audio file, so you must provide the original display name here.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>欢迎语</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The OSS key of the audio file to be modified.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test/new-test-file.wav</p>
     */
    @NameInMap("OssFileKey")
    public String ossFileKey;

    /**
     * <p>Usage of the audio file. The default value is General (used in scenarios such as IVR). Other valid values include HoldMusic (hold music during call waiting).</p>
     * 
     * <strong>example:</strong>
     * <p>General</p>
     */
    @NameInMap("Usage")
    public String usage;

    public static ModifyAudioFileRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAudioFileRequest self = new ModifyAudioFileRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAudioFileRequest setAudioFileName(String audioFileName) {
        this.audioFileName = audioFileName;
        return this;
    }
    public String getAudioFileName() {
        return this.audioFileName;
    }

    public ModifyAudioFileRequest setAudioResourceId(String audioResourceId) {
        this.audioResourceId = audioResourceId;
        return this;
    }
    public String getAudioResourceId() {
        return this.audioResourceId;
    }

    public ModifyAudioFileRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyAudioFileRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyAudioFileRequest setOssFileKey(String ossFileKey) {
        this.ossFileKey = ossFileKey;
        return this;
    }
    public String getOssFileKey() {
        return this.ossFileKey;
    }

    public ModifyAudioFileRequest setUsage(String usage) {
        this.usage = usage;
        return this;
    }
    public String getUsage() {
        return this.usage;
    }

}
