// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class SetRetcodeShareStatusRequest extends TeaModel {
    @NameInMap("Pid")
    public String pid;

    @NameInMap("Status")
    public Boolean status;

    public static SetRetcodeShareStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetRetcodeShareStatusRequest self = new SetRetcodeShareStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetRetcodeShareStatusRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public SetRetcodeShareStatusRequest setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

}
