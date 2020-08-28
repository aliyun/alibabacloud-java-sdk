// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edasmsc20200323.models;

import com.aliyun.tea.*;

public class GetServiceMethodPageRequest extends TeaModel {
    @NameInMap("Region")
    public String region;

    @NameInMap("ServiceType")
    public String serviceType;

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

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("MethodController")
    public String methodController;

    @NameInMap("Path")
    public String path;

    @NameInMap("Name")
    public String name;

    public static GetServiceMethodPageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetServiceMethodPageRequest self = new GetServiceMethodPageRequest();
        return TeaModel.build(map, self);
    }

}
