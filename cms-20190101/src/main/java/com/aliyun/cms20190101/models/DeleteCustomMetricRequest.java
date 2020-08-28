// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteCustomMetricRequest extends TeaModel {
    @NameInMap("GroupId")
    @Validation(required = true)
    public String groupId;

    @NameInMap("MetricName")
    @Validation(required = true)
    public String metricName;

    @NameInMap("Md5")
    public String md5;

    @NameInMap("UUID")
    public String UUID;

    public static DeleteCustomMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomMetricRequest self = new DeleteCustomMetricRequest();
        return TeaModel.build(map, self);
    }

}
