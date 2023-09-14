// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ClusterStateChangeReason extends TeaModel {
    /**
     * <p>状态码。取值范围：</p>
     * <p>- UserRequest：用户请求。</p>
     * <p>- OutOfStock：请求的ECS实例类型无库存。</p>
     * <p>- NotAuthorized：无权限。</p>
     * <p>- QuotaExceeded：Quota超出。</p>
     * <p>- OperationDenied：操作被拒绝。</p>
     * <p>- AccountException：账号异常。</p>
     * <p>- NodeFailure：ECS节点异常。</p>
     * <p>- BootstrapFailure：引导失败。</p>
     * <p>- ValidationFail：业务逻辑校验失败。</p>
     * <p>- ServiceFailure：依赖的其他服务失败。</p>
     * <p>- InternalError：内部错误。</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>状态变化信息。</p>
     */
    @NameInMap("Message")
    public String message;

    public static ClusterStateChangeReason build(java.util.Map<String, ?> map) throws Exception {
        ClusterStateChangeReason self = new ClusterStateChangeReason();
        return TeaModel.build(map, self);
    }

    public ClusterStateChangeReason setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClusterStateChangeReason setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
