// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpgradeServiceInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F224E002-AB0E-5FD9-A87E-54AEE56F6CAE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>si-5cbae874da0e47xxxxxx</p>
     */
    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    /**
     * <strong>example:</strong>
     * <p>Created</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("UpgradeRequiredParameters")
    public java.util.List<String> upgradeRequiredParameters;

    public static UpgradeServiceInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeServiceInstanceResponseBody self = new UpgradeServiceInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeServiceInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeServiceInstanceResponseBody setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public UpgradeServiceInstanceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpgradeServiceInstanceResponseBody setUpgradeRequiredParameters(java.util.List<String> upgradeRequiredParameters) {
        this.upgradeRequiredParameters = upgradeRequiredParameters;
        return this;
    }
    public java.util.List<String> getUpgradeRequiredParameters() {
        return this.upgradeRequiredParameters;
    }

}
