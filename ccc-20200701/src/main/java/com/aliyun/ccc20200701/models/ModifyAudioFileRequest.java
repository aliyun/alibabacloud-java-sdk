// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ModifyAudioFileRequest extends TeaModel {
    @NameInMap("AudioFileName")
    public String audioFileName;

    @NameInMap("AudioResourceId")
    public String audioResourceId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("OssFileKey")
    public String ossFileKey;

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
