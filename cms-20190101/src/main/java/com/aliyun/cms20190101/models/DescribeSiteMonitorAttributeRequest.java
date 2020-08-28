// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorAttributeRequest extends TeaModel {
    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    @NameInMap("IncludeAlert")
    public Boolean includeAlert;

    public static DescribeSiteMonitorAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteMonitorAttributeRequest self = new DescribeSiteMonitorAttributeRequest();
        return TeaModel.build(map, self);
    }

}
