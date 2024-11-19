// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetDownloadFileRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;xxx&quot;;xxx}</p>
     */
    @NameInMap("Context")
    public java.util.Map<String, ?> context;

    /**
     * <strong>example:</strong>
     * <p>iot-cn-npk1u******</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>62d949808bc742187xxxxxx</p>
     */
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
