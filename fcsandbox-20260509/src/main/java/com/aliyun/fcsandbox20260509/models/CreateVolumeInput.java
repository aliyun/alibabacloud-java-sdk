// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class CreateVolumeInput extends TeaModel {
    @NameInMap("agenticFSVolumeConfig")
    public AgenticFSVolumeConfig agenticFSVolumeConfig;

    @NameInMap("ossVolumeConfig")
    public OSSVolumeConfig ossVolumeConfig;

    @NameInMap("teamID")
    public String teamID;

    @NameInMap("volumeName")
    public String volumeName;

    public static CreateVolumeInput build(java.util.Map<String, ?> map) throws Exception {
        CreateVolumeInput self = new CreateVolumeInput();
        return TeaModel.build(map, self);
    }

    public CreateVolumeInput setAgenticFSVolumeConfig(AgenticFSVolumeConfig agenticFSVolumeConfig) {
        this.agenticFSVolumeConfig = agenticFSVolumeConfig;
        return this;
    }
    public AgenticFSVolumeConfig getAgenticFSVolumeConfig() {
        return this.agenticFSVolumeConfig;
    }

    public CreateVolumeInput setOssVolumeConfig(OSSVolumeConfig ossVolumeConfig) {
        this.ossVolumeConfig = ossVolumeConfig;
        return this;
    }
    public OSSVolumeConfig getOssVolumeConfig() {
        return this.ossVolumeConfig;
    }

    public CreateVolumeInput setTeamID(String teamID) {
        this.teamID = teamID;
        return this;
    }
    public String getTeamID() {
        return this.teamID;
    }

    public CreateVolumeInput setVolumeName(String volumeName) {
        this.volumeName = volumeName;
        return this;
    }
    public String getVolumeName() {
        return this.volumeName;
    }

}
