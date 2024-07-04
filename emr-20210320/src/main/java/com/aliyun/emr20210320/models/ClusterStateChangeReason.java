// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ClusterStateChangeReason extends TeaModel {
    /**
     * <p>状态码。取值范围：</p>
     * <ul>
     * <li>UserRequest：用户请求。</li>
     * <li>OutOfStock：请求的ECS实例类型无库存。</li>
     * <li>NotAuthorized：无权限。</li>
     * <li>QuotaExceeded：Quota超出。</li>
     * <li>OperationDenied：操作被拒绝。</li>
     * <li>AccountException：账号异常。</li>
     * <li>NodeFailure：ECS节点异常。</li>
     * <li>BootstrapFailure：引导失败。</li>
     * <li>ValidationFail：业务逻辑校验失败。</li>
     * <li>ServiceFailure：依赖的其他服务失败。</li>
     * <li>InternalError：内部错误。</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OutOfStock</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>状态变化信息。</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource is sold out in the specified zone, try other types of resources or other regions and zones.</p>
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
