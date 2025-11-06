// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class GetBindingCountRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BindingType")
    public Integer bindingType;

    @NameInMap("ConsoleSessionId")
    public String consoleSessionId;

    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Upstream")
    public Boolean upstream;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VhostName")
    public String vhostName;

    public static GetBindingCountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBindingCountRequest self = new GetBindingCountRequest();
        return TeaModel.build(map, self);
    }

    public GetBindingCountRequest setBindingType(Integer bindingType) {
        this.bindingType = bindingType;
        return this;
    }
    public Integer getBindingType() {
        return this.bindingType;
    }

    public GetBindingCountRequest setConsoleSessionId(String consoleSessionId) {
        this.consoleSessionId = consoleSessionId;
        return this;
    }
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    public GetBindingCountRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetBindingCountRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public GetBindingCountRequest setUpstream(Boolean upstream) {
        this.upstream = upstream;
        return this;
    }
    public Boolean getUpstream() {
        return this.upstream;
    }

    public GetBindingCountRequest setVhostName(String vhostName) {
        this.vhostName = vhostName;
        return this;
    }
    public String getVhostName() {
        return this.vhostName;
    }

}
