// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class AliyunMainJwtCreateRequest extends TeaModel {
    @NameInMap("AliyunUid")
    public String aliyunUid;

    @NameInMap("AliyunUidType")
    public String aliyunUidType;

    public static AliyunMainJwtCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        AliyunMainJwtCreateRequest self = new AliyunMainJwtCreateRequest();
        return TeaModel.build(map, self);
    }

    public AliyunMainJwtCreateRequest setAliyunUid(String aliyunUid) {
        this.aliyunUid = aliyunUid;
        return this;
    }
    public String getAliyunUid() {
        return this.aliyunUid;
    }

    public AliyunMainJwtCreateRequest setAliyunUidType(String aliyunUidType) {
        this.aliyunUidType = aliyunUidType;
        return this;
    }
    public String getAliyunUidType() {
        return this.aliyunUidType;
    }

}
