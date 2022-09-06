// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetDownloadFileRequest extends TeaModel {
    @NameInMap("Context")
    public java.util.Map<String, ?> context;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("LongJobId")
    public String longJobId;

    public static GetDownloadFileRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDownloadFileRequest self = new GetDownloadFileRequest();
        return TeaModel.build(map, self);
    }

    public GetDownloadFileRequest setContext(java.util.Map<String, ?> context) {
        this.context = context;
        return this;
    }
    public java.util.Map<String, ?> getContext() {
        return this.context;
    }

    public GetDownloadFileRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public GetDownloadFileRequest setLongJobId(String longJobId) {
        this.longJobId = longJobId;
        return this;
    }
    public String getLongJobId() {
        return this.longJobId;
    }

}
