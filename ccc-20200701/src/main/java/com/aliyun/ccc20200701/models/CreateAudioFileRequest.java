// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CreateAudioFileRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AudioFileName")
    public String audioFileName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OssFileKey")
    public String ossFileKey;

    @NameInMap("Usage")
    public String usage;

    public static CreateAudioFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAudioFileRequest self = new CreateAudioFileRequest();
        return TeaModel.build(map, self);
    }

    public CreateAudioFileRequest setAudioFileName(String audioFileName) {
        this.audioFileName = audioFileName;
        return this;
    }
    public String getAudioFileName() {
        return this.audioFileName;
    }

    public CreateAudioFileRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateAudioFileRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAudioFileRequest setOssFileKey(String ossFileKey) {
        this.ossFileKey = ossFileKey;
        return this;
    }
    public String getOssFileKey() {
        return this.ossFileKey;
    }

    public CreateAudioFileRequest setUsage(String usage) {
        this.usage = usage;
        return this;
    }
    public String getUsage() {
        return this.usage;
    }

}
