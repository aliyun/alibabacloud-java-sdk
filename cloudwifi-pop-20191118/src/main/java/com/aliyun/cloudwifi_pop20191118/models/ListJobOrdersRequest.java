// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class ListJobOrdersRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("Cursor")
    @Validation(required = true)
    public Long cursor;

    @NameInMap("Handler")
    public String handler;

    @NameInMap("ClientSystem")
    public String clientSystem;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Title")
    public String title;

    @NameInMap("OrderStatus")
    public String orderStatus;

    @NameInMap("ClientUniqueId")
    public String clientUniqueId;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Id")
    public String id;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("ChangingType")
    public String changingType;

    @NameInMap("Status")
    public String status;

    public static ListJobOrdersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobOrdersRequest self = new ListJobOrdersRequest();
        return TeaModel.build(map, self);
    }

}
