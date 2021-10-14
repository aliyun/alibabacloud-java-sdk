// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetGroupMiscAggTimeSerRequest extends TeaModel {
    @NameInMap("ApgroupUuid")
    public String apgroupUuid;

    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("End")
    public Long end;

    @NameInMap("Start")
    public Long start;

    public static GetGroupMiscAggTimeSerRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGroupMiscAggTimeSerRequest self = new GetGroupMiscAggTimeSerRequest();
        return TeaModel.build(map, self);
    }

    public GetGroupMiscAggTimeSerRequest setApgroupUuid(String apgroupUuid) {
        this.apgroupUuid = apgroupUuid;
        return this;
    }
    public String getApgroupUuid() {
        return this.apgroupUuid;
    }

    public GetGroupMiscAggTimeSerRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public GetGroupMiscAggTimeSerRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetGroupMiscAggTimeSerRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public GetGroupMiscAggTimeSerRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
