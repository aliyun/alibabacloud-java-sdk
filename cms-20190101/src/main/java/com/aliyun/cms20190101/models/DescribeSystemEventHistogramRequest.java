// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSystemEventHistogramRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    @NameInMap("EventType")
    public String eventType;

    @NameInMap("Name")
    public String name;

    @NameInMap("Level")
    public String level;

    @NameInMap("Status")
    public String status;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SearchKeywords")
    public String searchKeywords;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeSystemEventHistogramRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSystemEventHistogramRequest self = new DescribeSystemEventHistogramRequest();
        return TeaModel.build(map, self);
    }

}
