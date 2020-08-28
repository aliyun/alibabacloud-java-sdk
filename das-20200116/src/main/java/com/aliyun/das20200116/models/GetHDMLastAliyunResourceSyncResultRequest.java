// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetHDMLastAliyunResourceSyncResultRequest extends TeaModel {
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

    public static GetHDMLastAliyunResourceSyncResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHDMLastAliyunResourceSyncResultRequest self = new GetHDMLastAliyunResourceSyncResultRequest();
        return TeaModel.build(map, self);
    }

}
