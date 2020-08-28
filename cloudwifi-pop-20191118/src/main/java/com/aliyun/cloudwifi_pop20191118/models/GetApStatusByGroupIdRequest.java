// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetApStatusByGroupIdRequest extends TeaModel {
    @NameInMap("AppName")
    @Validation(required = true)
    public String appName;

    @NameInMap("AppCode")
    @Validation(required = true)
    public String appCode;

    @NameInMap("Cursor")
    @Validation(required = true)
    public Long cursor;

    @NameInMap("ApgroupId")
    @Validation(required = true)
    public String apgroupId;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    public static GetApStatusByGroupIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApStatusByGroupIdRequest self = new GetApStatusByGroupIdRequest();
        return TeaModel.build(map, self);
    }

}
