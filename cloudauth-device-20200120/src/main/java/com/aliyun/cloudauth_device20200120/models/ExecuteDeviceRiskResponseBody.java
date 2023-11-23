// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_device20200120.models;

import com.aliyun.tea.*;

public class ExecuteDeviceRiskResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RiskItems")
    public String riskItems;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("Tags")
    public String tags;

    @NameInMap("Umid")
    public String umid;

    public static ExecuteDeviceRiskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteDeviceRiskResponseBody self = new ExecuteDeviceRiskResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteDeviceRiskResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ExecuteDeviceRiskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteDeviceRiskResponseBody setRiskItems(String riskItems) {
        this.riskItems = riskItems;
        return this;
    }
    public String getRiskItems() {
        return this.riskItems;
    }

    public ExecuteDeviceRiskResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public ExecuteDeviceRiskResponseBody setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public ExecuteDeviceRiskResponseBody setUmid(String umid) {
        this.umid = umid;
        return this;
    }
    public String getUmid() {
        return this.umid;
    }

}
