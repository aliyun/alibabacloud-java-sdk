// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class DeleteDIAlarmRuleResponseBody extends TeaModel {
    /**
     * <p>代表资源一级ID的资源属性字段</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteDIAlarmRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDIAlarmRuleResponseBody self = new DeleteDIAlarmRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDIAlarmRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDIAlarmRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
