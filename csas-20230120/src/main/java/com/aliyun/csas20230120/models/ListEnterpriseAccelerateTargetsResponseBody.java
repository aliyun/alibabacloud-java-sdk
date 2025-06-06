// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListEnterpriseAccelerateTargetsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>eap-7fed37a757a0de24</p>
     */
    @NameInMap("EapId")
    public String eapId;

    /**
     * <strong>example:</strong>
     * <p>529F755E-2E75-52EC-9C2E-6293FB8BF986</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Targets")
    public java.util.List<String> targets;

    /**
     * <strong>example:</strong>
     * <p>103</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static ListEnterpriseAccelerateTargetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEnterpriseAccelerateTargetsResponseBody self = new ListEnterpriseAccelerateTargetsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEnterpriseAccelerateTargetsResponseBody setEapId(String eapId) {
        this.eapId = eapId;
        return this;
    }
    public String getEapId() {
        return this.eapId;
    }

    public ListEnterpriseAccelerateTargetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEnterpriseAccelerateTargetsResponseBody setTargets(java.util.List<String> targets) {
        this.targets = targets;
        return this;
    }
    public java.util.List<String> getTargets() {
        return this.targets;
    }

    public ListEnterpriseAccelerateTargetsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
