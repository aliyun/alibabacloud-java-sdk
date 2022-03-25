// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class AliyunUidWhiteListRequest extends TeaModel {
    @NameInMap("AliyunUid")
    public String aliyunUid;

    public static AliyunUidWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        AliyunUidWhiteListRequest self = new AliyunUidWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public AliyunUidWhiteListRequest setAliyunUid(String aliyunUid) {
        this.aliyunUid = aliyunUid;
        return this;
    }
    public String getAliyunUid() {
        return this.aliyunUid;
    }

}
