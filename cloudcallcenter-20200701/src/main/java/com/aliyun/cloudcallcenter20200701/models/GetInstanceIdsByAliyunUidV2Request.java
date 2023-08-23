// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class GetInstanceIdsByAliyunUidV2Request extends TeaModel {
    @NameInMap("AliyunUid")
    public String aliyunUid;

    public static GetInstanceIdsByAliyunUidV2Request build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceIdsByAliyunUidV2Request self = new GetInstanceIdsByAliyunUidV2Request();
        return TeaModel.build(map, self);
    }

    public GetInstanceIdsByAliyunUidV2Request setAliyunUid(String aliyunUid) {
        this.aliyunUid = aliyunUid;
        return this;
    }
    public String getAliyunUid() {
        return this.aliyunUid;
    }

}
