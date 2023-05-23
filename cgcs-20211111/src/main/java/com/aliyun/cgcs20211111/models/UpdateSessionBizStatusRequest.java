// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class UpdateSessionBizStatusRequest extends TeaModel {
    @NameInMap("BizStatus")
    public String bizStatus;

    @NameInMap("PlatformSessionId")
    public String platformSessionId;

    public static UpdateSessionBizStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSessionBizStatusRequest self = new UpdateSessionBizStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSessionBizStatusRequest setBizStatus(String bizStatus) {
        this.bizStatus = bizStatus;
        return this;
    }
    public String getBizStatus() {
        return this.bizStatus;
    }

    public UpdateSessionBizStatusRequest setPlatformSessionId(String platformSessionId) {
        this.platformSessionId = platformSessionId;
        return this;
    }
    public String getPlatformSessionId() {
        return this.platformSessionId;
    }

}
