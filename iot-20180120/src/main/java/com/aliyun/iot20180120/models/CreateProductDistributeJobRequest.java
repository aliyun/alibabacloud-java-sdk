// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateProductDistributeJobRequest extends TeaModel {
    @NameInMap("SourceInstanceId")
    public String sourceInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("TargetInstanceId")
    public String targetInstanceId;

    @NameInMap("TargetUid")
    public String targetUid;

    @NameInMap("TargetAliyunId")
    public String targetAliyunId;

    public static CreateProductDistributeJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProductDistributeJobRequest self = new CreateProductDistributeJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateProductDistributeJobRequest setSourceInstanceId(String sourceInstanceId) {
        this.sourceInstanceId = sourceInstanceId;
        return this;
    }
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    public CreateProductDistributeJobRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public CreateProductDistributeJobRequest setTargetInstanceId(String targetInstanceId) {
        this.targetInstanceId = targetInstanceId;
        return this;
    }
    public String getTargetInstanceId() {
        return this.targetInstanceId;
    }

    public CreateProductDistributeJobRequest setTargetUid(String targetUid) {
        this.targetUid = targetUid;
        return this;
    }
    public String getTargetUid() {
        return this.targetUid;
    }

    public CreateProductDistributeJobRequest setTargetAliyunId(String targetAliyunId) {
        this.targetAliyunId = targetAliyunId;
        return this;
    }
    public String getTargetAliyunId() {
        return this.targetAliyunId;
    }

}
