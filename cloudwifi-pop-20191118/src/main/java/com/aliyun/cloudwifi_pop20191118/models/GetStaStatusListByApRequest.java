// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetStaStatusListByApRequest extends TeaModel {
    @NameInMap("AppName")
    @Validation(required = true)
    public String appName;

    @NameInMap("AppCode")
    @Validation(required = true)
    public String appCode;

    @NameInMap("Cursor")
    @Validation(required = true)
    public Long cursor;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("ApMac")
    @Validation(required = true)
    public String apMac;

    public static GetStaStatusListByApRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStaStatusListByApRequest self = new GetStaStatusListByApRequest();
        return TeaModel.build(map, self);
    }

}
