// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAutoResourceOptimizeConfigRequest extends TeaModel {
    @NameInMap("AccessKey")
    public String accessKey;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Signature")
    public String signature;

    @NameInMap("Uid")
    public String uid;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("__context")
    public String context;

    public static GetAutoResourceOptimizeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAutoResourceOptimizeConfigRequest self = new GetAutoResourceOptimizeConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetAutoResourceOptimizeConfigRequest setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public GetAutoResourceOptimizeConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAutoResourceOptimizeConfigRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public GetAutoResourceOptimizeConfigRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public GetAutoResourceOptimizeConfigRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public GetAutoResourceOptimizeConfigRequest setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

}
