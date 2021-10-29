// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class TurnOffAutoResourceOptimizeRequest extends TeaModel {
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

    public static TurnOffAutoResourceOptimizeRequest build(java.util.Map<String, ?> map) throws Exception {
        TurnOffAutoResourceOptimizeRequest self = new TurnOffAutoResourceOptimizeRequest();
        return TeaModel.build(map, self);
    }

    public TurnOffAutoResourceOptimizeRequest setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public TurnOffAutoResourceOptimizeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public TurnOffAutoResourceOptimizeRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public TurnOffAutoResourceOptimizeRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public TurnOffAutoResourceOptimizeRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public TurnOffAutoResourceOptimizeRequest setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

}
