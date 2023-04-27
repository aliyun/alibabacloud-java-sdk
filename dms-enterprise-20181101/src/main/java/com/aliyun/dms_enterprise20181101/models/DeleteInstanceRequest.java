// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteInstanceRequest extends TeaModel {
    /**
     * <p>The error code that is returned.</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>The operation that you want to perform. Set the value to **DeleteInstance**.</p>
     */
    @NameInMap("Sid")
    public String sid;

    /**
     * <p>The system ID (SID) of the database instance. You can call the [ListInstances](~~141936~~) or [GetInstance](~~141567~~) operation to obtain the SID.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static DeleteInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceRequest self = new DeleteInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public DeleteInstanceRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public DeleteInstanceRequest setSid(String sid) {
        this.sid = sid;
        return this;
    }
    public String getSid() {
        return this.sid;
    }

    public DeleteInstanceRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
