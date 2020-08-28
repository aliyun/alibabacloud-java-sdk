// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupInstancesRequest extends TeaModel {
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("GroupId")
    @Validation(required = true)
    public Long groupId;

    @NameInMap("Category")
    public String category;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("InstanceIds")
    public String instanceIds;

    public static DescribeMonitorGroupInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorGroupInstancesRequest self = new DescribeMonitorGroupInstancesRequest();
        return TeaModel.build(map, self);
    }

}
