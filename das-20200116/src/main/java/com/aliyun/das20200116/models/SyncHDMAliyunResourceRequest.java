// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class SyncHDMAliyunResourceRequest extends TeaModel {
    @NameInMap("Uid")
    public String uid;

    @NameInMap("accessKey")
    public String accessKey;

    @NameInMap("signature")
    public String signature;

    @NameInMap("timestamp")
    public String timestamp;

    @NameInMap("__context")
    public String context;

    @NameInMap("skipAuth")
    public String skipAuth;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("Async")
    public String async;

    @NameInMap("WaitForModifySecurityIps")
    public String waitForModifySecurityIps;

    @NameInMap("ResourceTypes")
    public String resourceTypes;

    public static SyncHDMAliyunResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncHDMAliyunResourceRequest self = new SyncHDMAliyunResourceRequest();
        return TeaModel.build(map, self);
    }

}
