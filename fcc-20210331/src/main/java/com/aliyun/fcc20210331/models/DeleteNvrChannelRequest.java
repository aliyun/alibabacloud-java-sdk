// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class DeleteNvrChannelRequest extends TeaModel {
    @NameInMap("DeviceCodes")
    public String deviceCodes;

    public static DeleteNvrChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNvrChannelRequest self = new DeleteNvrChannelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNvrChannelRequest setDeviceCodes(String deviceCodes) {
        this.deviceCodes = deviceCodes;
        return this;
    }
    public String getDeviceCodes() {
        return this.deviceCodes;
    }

}
