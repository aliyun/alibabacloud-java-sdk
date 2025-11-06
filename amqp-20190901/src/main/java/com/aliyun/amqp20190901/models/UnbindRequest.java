// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class UnbindRequest extends TeaModel {
    @NameInMap("BindingKey")
    public String bindingKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("BindingType")
    public Integer bindingType;

    @NameInMap("ConsoleSessionId")
    public String consoleSessionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DstName")
    public String dstName;

    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SrcName")
    public String srcName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("VhostName")
    public String vhostName;

    public static UnbindRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindRequest self = new UnbindRequest();
        return TeaModel.build(map, self);
    }

    public UnbindRequest setBindingKey(String bindingKey) {
        this.bindingKey = bindingKey;
        return this;
    }
    public String getBindingKey() {
        return this.bindingKey;
    }

    public UnbindRequest setBindingType(Integer bindingType) {
        this.bindingType = bindingType;
        return this;
    }
    public Integer getBindingType() {
        return this.bindingType;
    }

    public UnbindRequest setConsoleSessionId(String consoleSessionId) {
        this.consoleSessionId = consoleSessionId;
        return this;
    }
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    public UnbindRequest setDstName(String dstName) {
        this.dstName = dstName;
        return this;
    }
    public String getDstName() {
        return this.dstName;
    }

    public UnbindRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UnbindRequest setSrcName(String srcName) {
        this.srcName = srcName;
        return this;
    }
    public String getSrcName() {
        return this.srcName;
    }

    public UnbindRequest setVhostName(String vhostName) {
        this.vhostName = vhostName;
        return this;
    }
    public String getVhostName() {
        return this.vhostName;
    }

}
