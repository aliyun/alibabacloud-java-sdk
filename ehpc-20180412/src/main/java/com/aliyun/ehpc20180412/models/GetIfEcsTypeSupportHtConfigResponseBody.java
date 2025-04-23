// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class GetIfEcsTypeSupportHtConfigResponseBody extends TeaModel {
    /**
     * <p>Indicates whether Hyper-Threading is enabled by default. Valid values:</p>
     * <ul>
     * <li>true: Hyper-Threading is enabled by default.</li>
     * <li>false: Hyper-Threading is disabled by default.</li>
     * </ul>
     * <blockquote>
     * <p> By default, Hyper-Threading is not enabled for Super Computing Cluster (SCC) instance families but is enabled for other instance families.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DefaultHtEnabled")
    public Boolean defaultHtEnabled;

    /**
     * <p>The ECS instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.g6.large</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>80CA7A93-7291-4402-B63D-86DF334E0A1F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether hyper-threading is supported. Valid values:</p>
     * <ul>
     * <li>true: Hyper-threading is supported.</li>
     * <li>false: Hyper-threading is not supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
