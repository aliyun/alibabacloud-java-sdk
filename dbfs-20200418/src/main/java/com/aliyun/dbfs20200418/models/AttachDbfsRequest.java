// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class AttachDbfsRequest extends TeaModel {
    @NameInMap("AttachMode")
    public String attachMode;

    @NameInMap("AttachPoint")
    public String attachPoint;

    @NameInMap("ECSInstanceId")
    public String ECSInstanceId;

    @NameInMap("FsId")
    public String fsId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ServerUrl")
    public String serverUrl;

    public static AttachDbfsRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachDbfsRequest self = new AttachDbfsRequest();
        return TeaModel.build(map, self);
    }

    public AttachDbfsRequest setAttachMode(String attachMode) {
        this.attachMode = attachMode;
        return this;
    }
    public String getAttachMode() {
        return this.attachMode;
    }

    public AttachDbfsRequest setAttachPoint(String attachPoint) {
        this.attachPoint = attachPoint;
        return this;
    }
    public String getAttachPoint() {
        return this.attachPoint;
    }

    public AttachDbfsRequest setECSInstanceId(String ECSInstanceId) {
        this.ECSInstanceId = ECSInstanceId;
        return this;
    }
    public String getECSInstanceId() {
        return this.ECSInstanceId;
    }

    public AttachDbfsRequest setFsId(String fsId) {
        this.fsId = fsId;
        return this;
    }
    public String getFsId() {
        return this.fsId;
    }

    public AttachDbfsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachDbfsRequest setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
        return this;
    }
    public String getServerUrl() {
        return this.serverUrl;
    }

}
