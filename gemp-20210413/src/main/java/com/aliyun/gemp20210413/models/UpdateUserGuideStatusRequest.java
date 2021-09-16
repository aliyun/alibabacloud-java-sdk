// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UpdateUserGuideStatusRequest extends TeaModel {
    // 幂等校验
    @NameInMap("clientToken")
    public String clientToken;

    // INCIDENT_GUIDE	事件线 INCIDENT_GUIDE配置人员 USER_GUIDE 服务组 SERVICE_GROUP_GUIDE 服务 SERVICE_GUIDE 集成配置 MONITOR_GUIDE 流转规则 ROUTE_RULE_GUIDE 通知订阅 NOTICE_GUIDE
    @NameInMap("guideAction")
    public String guideAction;

    public static UpdateUserGuideStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserGuideStatusRequest self = new UpdateUserGuideStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserGuideStatusRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateUserGuideStatusRequest setGuideAction(String guideAction) {
        this.guideAction = guideAction;
        return this;
    }
    public String getGuideAction() {
        return this.guideAction;
    }

}
