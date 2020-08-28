// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeEventRuleListRequest extends TeaModel {
    @NameInMap("NamePrefix")
    public String namePrefix;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("GroupId")
    public String groupId;

    public static DescribeEventRuleListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventRuleListRequest self = new DescribeEventRuleListRequest();
        return TeaModel.build(map, self);
    }

}
