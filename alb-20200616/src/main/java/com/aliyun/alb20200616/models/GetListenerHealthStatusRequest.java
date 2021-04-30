// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class GetListenerHealthStatusRequest extends TeaModel {
    // 监听Id
    @NameInMap("ListenerId")
    public String listenerId;

    // 是否包含转发规则健康检查结果
    @NameInMap("IncludeRule")
    public Boolean includeRule;

    public static GetListenerHealthStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetListenerHealthStatusRequest self = new GetListenerHealthStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetListenerHealthStatusRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public GetListenerHealthStatusRequest setIncludeRule(Boolean includeRule) {
        this.includeRule = includeRule;
        return this;
    }
    public Boolean getIncludeRule() {
        return this.includeRule;
    }

}
