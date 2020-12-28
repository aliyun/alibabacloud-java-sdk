// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetIfEcsTypeSupportHtConfigResponseBody extends TeaModel {
    @NameInMap("DefaultHtEnabled")
    public Boolean defaultHtEnabled;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SupportHtConfig")
    public Boolean supportHtConfig;

    @NameInMap("InstanceType")
    public String instanceType;

    public static GetIfEcsTypeSupportHtConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIfEcsTypeSupportHtConfigResponseBody self = new GetIfEcsTypeSupportHtConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIfEcsTypeSupportHtConfigResponseBody setDefaultHtEnabled(Boolean defaultHtEnabled) {
        this.defaultHtEnabled = defaultHtEnabled;
        return this;
    }
    public Boolean getDefaultHtEnabled() {
        return this.defaultHtEnabled;
    }

    public GetIfEcsTypeSupportHtConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetIfEcsTypeSupportHtConfigResponseBody setSupportHtConfig(Boolean supportHtConfig) {
        this.supportHtConfig = supportHtConfig;
        return this;
    }
    public Boolean getSupportHtConfig() {
        return this.supportHtConfig;
    }

    public GetIfEcsTypeSupportHtConfigResponseBody setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

}
