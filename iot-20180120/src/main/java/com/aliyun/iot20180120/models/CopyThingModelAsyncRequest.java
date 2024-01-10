// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CopyThingModelAsyncRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("SourceModelVersion")
    public String sourceModelVersion;

    @NameInMap("SourceProductKey")
    public String sourceProductKey;

    @NameInMap("TargetProductKey")
    public String targetProductKey;

    public static CopyThingModelAsyncRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyThingModelAsyncRequest self = new CopyThingModelAsyncRequest();
        return TeaModel.build(map, self);
    }

    public CopyThingModelAsyncRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CopyThingModelAsyncRequest setSourceModelVersion(String sourceModelVersion) {
        this.sourceModelVersion = sourceModelVersion;
        return this;
    }
    public String getSourceModelVersion() {
        return this.sourceModelVersion;
    }

    public CopyThingModelAsyncRequest setSourceProductKey(String sourceProductKey) {
        this.sourceProductKey = sourceProductKey;
        return this;
    }
    public String getSourceProductKey() {
        return this.sourceProductKey;
    }

    public CopyThingModelAsyncRequest setTargetProductKey(String targetProductKey) {
        this.targetProductKey = targetProductKey;
        return this;
    }
    public String getTargetProductKey() {
        return this.targetProductKey;
    }

}
