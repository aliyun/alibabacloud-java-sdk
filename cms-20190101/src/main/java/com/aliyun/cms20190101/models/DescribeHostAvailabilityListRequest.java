// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeHostAvailabilityListRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("GroupId")
    public Long groupId;

    public static DescribeHostAvailabilityListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHostAvailabilityListRequest self = new DescribeHostAvailabilityListRequest();
        return TeaModel.build(map, self);
    }

}
