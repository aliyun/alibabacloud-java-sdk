// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetIfEcsTypeSupportHtConfigResponseBody extends TeaModel {
    /**
     * <p>Indicates whether Hyper-Threading is enabled by default. Valid values:</p>
     * <br>
     * <p>*   true: Hyper-Threading is enabled by default.</p>
     * <br>
     * <p>*   false: Hyper-Threading is disabled by default</p>
     * <br>
     * <p>> By default, Hyper-Threading is not enabled for the SCC specification family, while Hyper-Threading is enabled for other specification families by default.</p>
     */
    @NameInMap("DefaultHtEnabled")
    public Boolean defaultHtEnabled;

    /**
     * <p>The instance type of the ECS instance.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether hyper-threading is supported. Valid values:</p>
     * <br>
     * <p>*   true: Hyper-Threading is supported.</p>
     * <p>*   false: Hyper-Threading is not supported.</p>
     */
    @NameInMap("SupportHtConfig")
    public Boolean supportHtConfig;

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

    public GetIfEcsTypeSupportHtConfigResponseBody setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
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

}
