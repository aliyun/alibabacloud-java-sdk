// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ClusterStateChangeReason extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    public static ClusterStateChangeReason build(java.util.Map<String, ?> map) throws Exception {
        ClusterStateChangeReason self = new ClusterStateChangeReason();
        return TeaModel.build(map, self);
    }

    public ClusterStateChangeReason setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClusterStateChangeReason setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
