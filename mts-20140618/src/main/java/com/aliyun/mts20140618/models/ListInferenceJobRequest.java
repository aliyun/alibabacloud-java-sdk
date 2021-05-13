// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListInferenceJobRequest extends TeaModel {
    @NameInMap("UserId")
    public Long userId;

    @NameInMap("ServerName")
    public String serverName;

    public static ListInferenceJobRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInferenceJobRequest self = new ListInferenceJobRequest();
        return TeaModel.build(map, self);
    }

    public ListInferenceJobRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public ListInferenceJobRequest setServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }
    public String getServerName() {
        return this.serverName;
    }

}
