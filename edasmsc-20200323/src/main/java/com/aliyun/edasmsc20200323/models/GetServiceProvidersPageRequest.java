// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edasmsc20200323.models;

import com.aliyun.tea.*;

public class GetServiceProvidersPageRequest extends TeaModel {
    @NameInMap("Region")
    public String region;

    @NameInMap("ServiceType")
    public String serviceType;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("AppId")
    public String appId;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("ServiceVersion")
    public String serviceVersion;

    @NameInMap("ServiceGroup")
    public String serviceGroup;

    @NameInMap("Ip")
    public String ip;

    public static GetServiceProvidersPageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceProvidersPageRequest self = new GetServiceProvidersPageRequest();
        return TeaModel.build(map, self);
    }

}
