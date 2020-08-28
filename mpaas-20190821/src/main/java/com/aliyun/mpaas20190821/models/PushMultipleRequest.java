// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class PushMultipleRequest extends TeaModel {
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

    @NameInMap("TargetMsg")
    @Validation(required = true)
    public java.util.List<PushMultipleRequestTargetMsg> targetMsg;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("TemplateName")
    @Validation(required = true)
    public String templateName;

    @NameInMap("WorkspaceId")
    @Validation(required = true)
    public String workspaceId;

    public static PushMultipleRequest build(java.util.Map<String, ?> map) throws Exception {
        PushMultipleRequest self = new PushMultipleRequest();
        return TeaModel.build(map, self);
    }

    public static class PushMultipleRequestTargetMsg extends TeaModel {
        @NameInMap("ExtendedParams")
        public String extendedParams;

        @NameInMap("MsgKey")
        @Validation(required = true)
        public String msgKey;

        @NameInMap("Target")
        @Validation(required = true)
        public String target;

        @NameInMap("TemplateKeyValue")
        public String templateKeyValue;

        public static PushMultipleRequestTargetMsg build(java.util.Map<String, ?> map) throws Exception {
            PushMultipleRequestTargetMsg self = new PushMultipleRequestTargetMsg();
            return TeaModel.build(map, self);
        }

    }

}
