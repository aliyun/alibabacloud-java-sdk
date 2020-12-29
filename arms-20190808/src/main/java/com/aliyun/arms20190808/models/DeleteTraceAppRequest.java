// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteTraceAppRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Type")
    public String type;

    @NameInMap("Pid")
    public String pid;

    public static DeleteTraceAppRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTraceAppRequest self = new DeleteTraceAppRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTraceAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteTraceAppRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteTraceAppRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DeleteTraceAppRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

}
