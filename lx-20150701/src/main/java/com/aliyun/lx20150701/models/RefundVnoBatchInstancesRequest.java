// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lx20150701.models;

import com.aliyun.tea.*;

public class RefundVnoBatchInstancesRequest extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ParamStr")
    public String paramStr;

    @NameInMap("ComponentsStr")
    public String componentsStr;

    @NameInMap("CallerBid")
    public String callerBid;

    @NameInMap("CallerUid")
    public Long callerUid;

    public static RefundVnoBatchInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        RefundVnoBatchInstancesRequest self = new RefundVnoBatchInstancesRequest();
        return TeaModel.build(map, self);
    }

    public RefundVnoBatchInstancesRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RefundVnoBatchInstancesRequest setParamStr(String paramStr) {
        this.paramStr = paramStr;
        return this;
    }
    public String getParamStr() {
        return this.paramStr;
    }

    public RefundVnoBatchInstancesRequest setComponentsStr(String componentsStr) {
        this.componentsStr = componentsStr;
        return this;
    }
    public String getComponentsStr() {
        return this.componentsStr;
    }

    public RefundVnoBatchInstancesRequest setCallerBid(String callerBid) {
        this.callerBid = callerBid;
        return this;
    }
    public String getCallerBid() {
        return this.callerBid;
    }

    public RefundVnoBatchInstancesRequest setCallerUid(Long callerUid) {
        this.callerUid = callerUid;
        return this;
    }
    public Long getCallerUid() {
        return this.callerUid;
    }

}
