// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetInstanceRequest extends TeaModel {
    // The endpoint of the database instance. You can call the [ListInstances](~~141936~~) operation to obtain the endpoint.
    @NameInMap("Host")
    public String host;

    // The port number that is used to connect to the database instance. You can call the [ListInstances](~~141936~~) operation to obtain the port number.
    @NameInMap("Port")
    public Integer port;

    // The system ID (SID) of the database instance. You can call the [ListInstances](~~141936~~) operation to obtain the SID.
    @NameInMap("Sid")
    public String sid;

    // The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to obtain the tenant ID.
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
