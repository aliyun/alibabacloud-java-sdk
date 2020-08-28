// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeCustomEventCountRequest extends TeaModel {
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

    public static DescribeCustomEventCountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomEventCountRequest self = new DescribeCustomEventCountRequest();
        return TeaModel.build(map, self);
    }

}
