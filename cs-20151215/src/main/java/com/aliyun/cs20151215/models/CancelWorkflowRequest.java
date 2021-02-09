// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class CancelWorkflowRequest extends TeaModel {
    // 执行的操作，目前只支持cancel。
    @NameInMap("action")
    public String action;

    public static CancelWorkflowRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelWorkflowRequest self = new CancelWorkflowRequest();
        return TeaModel.build(map, self);
    }

    public CancelWorkflowRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

}
