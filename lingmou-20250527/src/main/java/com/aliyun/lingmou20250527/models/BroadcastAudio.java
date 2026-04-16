// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class BroadcastAudio extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("audioLength")
    public Integer audioLength;

    /**
     * <strong>example:</strong>
     * <p>2026-01-22T01:59:03</p>
     */
    @NameInMap("createTime")
    public String createTime;

    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>M1Ju6XhHog_e-lSeb80Slp9g</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>2026-01-22T01:59:03</p>
     */
    @NameInMap("modifiedTime")
    public String modifiedTime;

    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
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

    public BroadcastAudio setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
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
