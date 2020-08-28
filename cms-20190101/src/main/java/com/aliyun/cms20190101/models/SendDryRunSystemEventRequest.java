// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class SendDryRunSystemEventRequest extends TeaModel {
    @NameInMap("Product")
    @Validation(required = true)
    public String product;

    @NameInMap("EventName")
    @Validation(required = true)
    public String eventName;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("EventContent")
    public String eventContent;

    public static SendDryRunSystemEventRequest build(java.util.Map<String, ?> map) throws Exception {
        SendDryRunSystemEventRequest self = new SendDryRunSystemEventRequest();
        return TeaModel.build(map, self);
    }

}
