// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edasmsc20200323.models;

import com.aliyun.tea.*;

public class GetServiceListRequest extends TeaModel {
    @NameInMap("Region")
    public String region;

    @NameInMap("ServiceType")
    public String serviceType;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("Ip")
    public String ip;

    public static GetServiceListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceListRequest self = new GetServiceListRequest();
        return TeaModel.build(map, self);
    }

}
