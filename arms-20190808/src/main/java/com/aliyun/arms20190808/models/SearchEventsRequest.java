// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchEventsRequest extends TeaModel {
    @NameInMap("ProxyUserId")
    public String proxyUserId;

    @NameInMap("AlertId")
    public Long alertId;

    @NameInMap("Pid")
    public String pid;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("AppType")
    public String appType;

    @NameInMap("AlertType")
    public Integer alertType;

    @NameInMap("IsTrigger")
    public Integer isTrigger;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    public static SearchEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchEventsRequest self = new SearchEventsRequest();
        return TeaModel.build(map, self);
    }

}
