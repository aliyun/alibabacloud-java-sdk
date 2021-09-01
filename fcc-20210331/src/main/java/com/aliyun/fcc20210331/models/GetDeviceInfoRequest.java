// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetDeviceInfoRequest extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("IsvId")
    public String isvId;

    public static GetDeviceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceInfoRequest self = new GetDeviceInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceInfoRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetDeviceInfoRequest setIsvId(String isvId) {
        this.isvId = isvId;
        return this;
    }
    public String getIsvId() {
        return this.isvId;
    }

}
