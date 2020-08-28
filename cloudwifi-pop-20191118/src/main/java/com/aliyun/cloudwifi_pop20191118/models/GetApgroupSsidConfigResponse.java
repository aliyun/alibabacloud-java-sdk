// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class GetApgroupSsidConfigResponse extends TeaModel {
    @NameInMap("IsSuccess")
    @Validation(required = true)
    public Boolean isSuccess;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public Integer errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<java.util.Map<String, ?>> data;

    public static GetApgroupSsidConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApgroupSsidConfigResponse self = new GetApgroupSsidConfigResponse();
        return TeaModel.build(map, self);
    }

}
