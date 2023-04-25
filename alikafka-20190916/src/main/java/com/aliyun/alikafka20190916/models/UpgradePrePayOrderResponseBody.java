// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpgradePrePayOrderResponseBody extends TeaModel {
    /**
     * <p>Upgrades a Message Queue for Apache Kafka instance that uses the subscription billing method.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>261860</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpgradePrePayOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradePrePayOrderResponseBody self = new UpgradePrePayOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradePrePayOrderResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpgradePrePayOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpgradePrePayOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradePrePayOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
