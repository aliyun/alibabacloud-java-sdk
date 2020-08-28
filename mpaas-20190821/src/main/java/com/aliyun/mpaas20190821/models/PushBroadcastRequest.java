// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class PushBroadcastRequest extends TeaModel {
    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("DeliveryType")
    @Validation(required = true)
    public Long deliveryType;

    @NameInMap("ExpiredSeconds")
    @Validation(required = true)
    public Long expiredSeconds;

    @NameInMap("ExtendedParams")
    public String extendedParams;

    @NameInMap("Msgkey")
    @Validation(required = true)
    public String msgkey;

    @NameInMap("NotifyType")
    public String notifyType;

    @NameInMap("PushAction")
    public Long pushAction;

    @NameInMap("PushStatus")
    public Long pushStatus;

    @NameInMap("Silent")
    public Long silent;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("TemplateKeyValue")
    public String templateKeyValue;

    @NameInMap("TemplateName")
    @Validation(required = true)
    public String templateName;

    @NameInMap("UnBindPeriod")
    public Long unBindPeriod;

    @NameInMap("WorkspaceId")
    @Validation(required = true)
    public String workspaceId;

    public static PushBroadcastRequest build(java.util.Map<String, ?> map) throws Exception {
        PushBroadcastRequest self = new PushBroadcastRequest();
        return TeaModel.build(map, self);
    }

}
