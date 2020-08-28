// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchAlertHistoriesRequest extends TeaModel {
    @NameInMap("ProxyUserId")
    public String proxyUserId;

    @NameInMap("AlertId")
    public Long alertId;

    @NameInMap("AlertType")
    public Integer alertType;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    public static SearchAlertHistoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchAlertHistoriesRequest self = new SearchAlertHistoriesRequest();
        return TeaModel.build(map, self);
    }

}
