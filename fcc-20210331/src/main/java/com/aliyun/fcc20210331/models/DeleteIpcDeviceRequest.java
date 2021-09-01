// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class DeleteIpcDeviceRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("GbId")
    public String gbId;

    public static DeleteIpcDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteIpcDeviceRequest self = new DeleteIpcDeviceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteIpcDeviceRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public DeleteIpcDeviceRequest setGbId(String gbId) {
        this.gbId = gbId;
        return this;
    }
    public String getGbId() {
        return this.gbId;
    }

}
