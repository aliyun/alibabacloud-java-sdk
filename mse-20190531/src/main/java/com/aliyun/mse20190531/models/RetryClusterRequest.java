// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class RetryClusterRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The ID of the instance.
    @NameInMap("InstanceId")
    public String instanceId;

    // The extended request parameters in the JSON format.
    @NameInMap("RequestPars")
    public String requestPars;

    public static RetryClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        RetryClusterRequest self = new RetryClusterRequest();
        return TeaModel.build(map, self);
    }

    public RetryClusterRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public RetryClusterRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RetryClusterRequest setRequestPars(String requestPars) {
        this.requestPars = requestPars;
        return this;
    }
    public String getRequestPars() {
        return this.requestPars;
    }

}
