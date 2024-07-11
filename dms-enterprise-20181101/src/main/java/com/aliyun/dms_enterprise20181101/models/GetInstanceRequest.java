// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetInstanceRequest extends TeaModel {
    /**
     * <p>The endpoint of the database instance. You can call the <a href="https://help.aliyun.com/document_detail/141936.html">ListInstances</a> operation to obtain the endpoint.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>172.17.XXX.XXX</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>The port number that is used to connect to the database instance. You can call the <a href="https://help.aliyun.com/document_detail/141936.html">ListInstances</a> operation to obtain the port number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5432</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The system ID (SID) of the database instance. You can call the <a href="https://help.aliyun.com/document_detail/141936.html">ListInstances</a> operation to obtain the SID.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Sid")
    public String sid;

    /**
     * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> operation to obtain the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2***</p>
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
