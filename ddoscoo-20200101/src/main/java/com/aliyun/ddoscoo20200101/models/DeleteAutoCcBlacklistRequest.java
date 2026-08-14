// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteAutoCcBlacklistRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Blacklist")
    public String blacklist;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("QueryType")
    public String queryType;

    public static DeleteAutoCcBlacklistRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAutoCcBlacklistRequest self = new DeleteAutoCcBlacklistRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAutoCcBlacklistRequest setBlacklist(String blacklist) {
        this.blacklist = blacklist;
        return this;
    }
    public String getBlacklist() {
        return this.blacklist;
    }

    public DeleteAutoCcBlacklistRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteAutoCcBlacklistRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

}
