// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edasmsc20200323.models;

import com.aliyun.tea.*;

public class GetServiceConsumersPageRequest extends TeaModel {
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

    public static GetServiceConsumersPageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceConsumersPageRequest self = new GetServiceConsumersPageRequest();
        return TeaModel.build(map, self);
    }

}
