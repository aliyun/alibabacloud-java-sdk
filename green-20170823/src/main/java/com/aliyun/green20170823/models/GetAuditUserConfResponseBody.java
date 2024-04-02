// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class GetAuditUserConfResponseBody extends TeaModel {
    @NameInMap("CustomAudit")
    public Boolean customAudit;

    @NameInMap("RcpLabels")
    public java.util.Map<String, java.util.List<String>> rcpLabels;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserLabels")
    public java.util.Map<String, java.util.List<String>> userLabels;

    public static GetAuditUserConfResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAuditUserConfResponseBody self = new GetAuditUserConfResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAuditUserConfResponseBody setCustomAudit(Boolean customAudit) {
        this.customAudit = customAudit;
        return this;
    }
    public Boolean getCustomAudit() {
        return this.customAudit;
    }

    public GetAuditUserConfResponseBody setRcpLabels(java.util.Map<String, java.util.List<String>> rcpLabels) {
        this.rcpLabels = rcpLabels;
        return this;
    }
    public java.util.Map<String, java.util.List<String>> getRcpLabels() {
        return this.rcpLabels;
    }

    public GetAuditUserConfResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAuditUserConfResponseBody setUserLabels(java.util.Map<String, java.util.List<String>> userLabels) {
        this.userLabels = userLabels;
        return this;
    }
    public java.util.Map<String, java.util.List<String>> getUserLabels() {
        return this.userLabels;
    }

}
