// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edasmsc20200323.models;

import com.aliyun.tea.*;

public class GetServiceListPageRequest extends TeaModel {
    @NameInMap("Region")
    public String region;

    @NameInMap("ServiceType")
    public String serviceType;

    @NameInMap("Side")
    public String side;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("Ip")
    public String ip;

    public static GetServiceListPageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceListPageRequest self = new GetServiceListPageRequest();
        return TeaModel.build(map, self);
    }

}
