// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class UserAPICountInfo extends TeaModel {
    @NameInMap("apiType")
    public String apiType;

    @NameInMap("scope")
    public String scope;

    @NameInMap("usedCount")
    public Integer usedCount;

    public static UserAPICountInfo build(java.util.Map<String, ?> map) throws Exception {
        UserAPICountInfo self = new UserAPICountInfo();
        return TeaModel.build(map, self);
    }

    public UserAPICountInfo setApiType(String apiType) {
        this.apiType = apiType;
        return this;
    }
    public String getApiType() {
        return this.apiType;
    }

    public UserAPICountInfo setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public UserAPICountInfo setUsedCount(Integer usedCount) {
        this.usedCount = usedCount;
        return this;
    }
    public Integer getUsedCount() {
        return this.usedCount;
    }

}
