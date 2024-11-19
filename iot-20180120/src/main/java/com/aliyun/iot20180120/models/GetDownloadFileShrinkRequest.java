// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetDownloadFileShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;xxx&quot;;xxx}</p>
     */
    @NameInMap("Context")
    public String contextShrink;

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

    public static GetDownloadFileShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDownloadFileShrinkRequest self = new GetDownloadFileShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetDownloadFileShrinkRequest setContextShrink(String contextShrink) {
        this.contextShrink = contextShrink;
        return this;
    }
    public String getContextShrink() {
        return this.contextShrink;
    }

    public GetDownloadFileShrinkRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public GetDownloadFileShrinkRequest setLongJobId(String longJobId) {
        this.longJobId = longJobId;
        return this;
    }
    public String getLongJobId() {
        return this.longJobId;
    }

}
