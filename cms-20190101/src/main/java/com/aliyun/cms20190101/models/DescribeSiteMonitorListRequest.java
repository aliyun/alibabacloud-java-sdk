// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorListRequest extends TeaModel {
    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TaskType")
    public String taskType;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeSiteMonitorListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteMonitorListRequest self = new DescribeSiteMonitorListRequest();
        return TeaModel.build(map, self);
    }

}
