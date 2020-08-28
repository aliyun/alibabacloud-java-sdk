// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetGroupMiscAggTimeSerRequest extends TeaModel {
    @NameInMap("AppName")
    @Validation(required = true)
    public String appName;

    @NameInMap("AppCode")
    @Validation(required = true)
    public String appCode;

    @NameInMap("Start")
    @Validation(required = true)
    public Long start;

    @NameInMap("End")
    @Validation(required = true)
    public Long end;

    @NameInMap("ApgroupUuid")
    @Validation(required = true)
    public String apgroupUuid;

    public static GetGroupMiscAggTimeSerRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGroupMiscAggTimeSerRequest self = new GetGroupMiscAggTimeSerRequest();
        return TeaModel.build(map, self);
    }

}
