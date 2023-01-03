// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteTraceAppRequest extends TeaModel {
    // The ID of the application that you want to delete. You can call the SearchTraceAppByName operation to query the application ID. For more information, see [SearchTraceAppByName](~~130676~~).
    @NameInMap("AppId")
    public String appId;

    // The PID of the application that you want to delete. For more information about how to obtain the PID, see [Obtain the PID of an application](https://www.alibabacloud.com/help/zh/doc-detail/186100.htm?spm=a2cdw.13409063.0.0.7a72281f0bkTfx#title-imy-7gj-qhr).
    @NameInMap("Pid")
    public String pid;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    // The type of the application that you want to delete. You can call the SearchTraceAppByName operation to query the application type. For more information, see [SearchTraceAppByName](~~130676~~). Valid values:
    // 
    // *   `TRACE`: application monitoring
    // *   `RETCODE`: frontend monitoring
    @NameInMap("Type")
    public String type;

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

    public DeleteTraceAppRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
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

}
