// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class QueryInstanceInfoByConnRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Host")
    public String host;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static QueryInstanceInfoByConnRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryInstanceInfoByConnRequest self = new QueryInstanceInfoByConnRequest();
        return TeaModel.build(map, self);
    }

    public QueryInstanceInfoByConnRequest setHost(String host) {
        this.host = host;
        return this;
    }
    public String getHost() {
        return this.host;
    }

    public QueryInstanceInfoByConnRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public QueryInstanceInfoByConnRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
