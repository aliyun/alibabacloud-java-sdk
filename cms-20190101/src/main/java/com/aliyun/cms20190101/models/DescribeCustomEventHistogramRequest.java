// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeCustomEventHistogramRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Level")
    public String level;

    @NameInMap("EventId")
    public String eventId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SearchKeywords")
    public String searchKeywords;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    public static DescribeCustomEventHistogramRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomEventHistogramRequest self = new DescribeCustomEventHistogramRequest();
        return TeaModel.build(map, self);
    }

}
