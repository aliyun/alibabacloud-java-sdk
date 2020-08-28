// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListAlertMessagesRequest extends TeaModel {
    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("BeginTime")
    @Validation(required = true)
    public String beginTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("RemindId")
    public Long remindId;

    @NameInMap("AlertMethods")
    public String alertMethods;

    @NameInMap("AlertUser")
    public String alertUser;

    @NameInMap("AlertRuleTypes")
    public String alertRuleTypes;

    public static ListAlertMessagesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlertMessagesRequest self = new ListAlertMessagesRequest();
        return TeaModel.build(map, self);
    }

}
