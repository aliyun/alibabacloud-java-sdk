// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class AliyunRamJwtCreateRequest extends TeaModel {
    @NameInMap("AliyunUidType")
    public String aliyunUidType;

    @NameInMap("Name")
    public String name;

    @NameInMap("ParentUid")
    public String parentUid;

    public static AliyunRamJwtCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        AliyunRamJwtCreateRequest self = new AliyunRamJwtCreateRequest();
        return TeaModel.build(map, self);
    }

    public AliyunRamJwtCreateRequest setAliyunUidType(String aliyunUidType) {
        this.aliyunUidType = aliyunUidType;
        return this;
    }
    public String getAliyunUidType() {
        return this.aliyunUidType;
    }

    public AliyunRamJwtCreateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AliyunRamJwtCreateRequest setParentUid(String parentUid) {
        this.parentUid = parentUid;
        return this;
    }
    public String getParentUid() {
        return this.parentUid;
    }

}
