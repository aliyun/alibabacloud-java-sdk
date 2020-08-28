// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteSiteMonitorsRequest extends TeaModel {
    @NameInMap("TaskIds")
    @Validation(required = true)
    public String taskIds;

    @NameInMap("IsDeleteAlarms")
    public Boolean isDeleteAlarms;

    public static DeleteSiteMonitorsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSiteMonitorsRequest self = new DeleteSiteMonitorsRequest();
        return TeaModel.build(map, self);
    }

}
