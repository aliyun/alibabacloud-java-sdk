// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class PushTemplateRequest extends TeaModel {
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

    @NameInMap("NotifyType")
    public String notifyType;

    @NameInMap("PushAction")
    public Long pushAction;

    @NameInMap("Silent")
    public Long silent;

    @NameInMap("TargetMsgkey")
    @Validation(required = true)
    public String targetMsgkey;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("TemplateKeyValue")
    public String templateKeyValue;

    @NameInMap("TemplateName")
    @Validation(required = true)
    public String templateName;

    @NameInMap("WorkspaceId")
    @Validation(required = true)
    public String workspaceId;

    public static PushTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        PushTemplateRequest self = new PushTemplateRequest();
        return TeaModel.build(map, self);
    }

}
