// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class BroadcastAudio extends TeaModel {
    @NameInMap("audioLength")
    public Integer audioLength;

    @NameInMap("createTime")
    public String createTime;

    @NameInMap("id")
    public String id;

    @NameInMap("modifiedTime")
    public String modifiedTime;

    @NameInMap("name")
    public String name;

    @NameInMap("status")
    public String status;

    public static BroadcastAudio build(java.util.Map<String, ?> map) throws Exception {
        BroadcastAudio self = new BroadcastAudio();
        return TeaModel.build(map, self);
    }

    public BroadcastAudio setAudioLength(Integer audioLength) {
        this.audioLength = audioLength;
        return this;
    }
    public Integer getAudioLength() {
        return this.audioLength;
    }

    public BroadcastAudio setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public BroadcastAudio setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public BroadcastAudio setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
        return this;
    }
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public BroadcastAudio setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public BroadcastAudio setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
