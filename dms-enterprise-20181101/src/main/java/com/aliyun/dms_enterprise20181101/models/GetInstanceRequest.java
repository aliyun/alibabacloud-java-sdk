// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetInstanceRequest extends TeaModel {
    /**
     * <p>The name of the security rule set corresponding to the control mode.</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>The name of the database link for the database instance.</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to obtain the tenant ID.</p>
     */
    @NameInMap("Sid")
    public String sid;

    /**
     * <p>The ID of the virtual private cloud (VPC) to which the database instance belongs.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceRequest self = new GetInstanceRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public GetInstanceRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public GetInstanceRequest setSid(String sid) {
        this.sid = sid;
        return this;
    }
    public String getSid() {
        return this.sid;
    }

    public GetInstanceRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
