// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.beian20160810.models;

import com.aliyun.tea.*;

public class ManageAccessorIpRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Caller")
    public String caller;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Ip")
    public String ip;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("IpVersion")
    public Integer ipVersion;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Operation")
    public String operation;

    @NameInMap("Remark")
    public String remark;

    public static ManageAccessorIpRequest build(java.util.Map<String, ?> map) throws Exception {
        ManageAccessorIpRequest self = new ManageAccessorIpRequest();
        return TeaModel.build(map, self);
    }

    public ManageAccessorIpRequest setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public ManageAccessorIpRequest setIp(String ip) {
        this.ip = ip;
        return this;
    }
    public String getIp() {
        return this.ip;
    }

    public ManageAccessorIpRequest setIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public Integer getIpVersion() {
        return this.ipVersion;
    }

    public ManageAccessorIpRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public ManageAccessorIpRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

}
