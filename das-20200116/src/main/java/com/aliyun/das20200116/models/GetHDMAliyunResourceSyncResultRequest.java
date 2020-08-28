// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetHDMAliyunResourceSyncResultRequest extends TeaModel {
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

    @NameInMap("TaskId")
    public String taskId;

    public static GetHDMAliyunResourceSyncResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHDMAliyunResourceSyncResultRequest self = new GetHDMAliyunResourceSyncResultRequest();
        return TeaModel.build(map, self);
    }

}
