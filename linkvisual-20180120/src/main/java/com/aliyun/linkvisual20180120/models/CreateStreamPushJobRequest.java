// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateStreamPushJobRequest extends TeaModel {
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("JobType")
    public Integer jobType;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("PushUrl")
    public String pushUrl;

    @NameInMap("StreamType")
    public Integer streamType;

    public static CreateStreamPushJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStreamPushJobRequest self = new CreateStreamPushJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateStreamPushJobRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public CreateStreamPushJobRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public CreateStreamPushJobRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateStreamPushJobRequest setJobType(Integer jobType) {
        this.jobType = jobType;
        return this;
    }
    public Integer getJobType() {
        return this.jobType;
    }

    public CreateStreamPushJobRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public CreateStreamPushJobRequest setPushUrl(String pushUrl) {
        this.pushUrl = pushUrl;
        return this;
    }
    public String getPushUrl() {
        return this.pushUrl;
    }

    public CreateStreamPushJobRequest setStreamType(Integer streamType) {
        this.streamType = streamType;
        return this;
    }
    public Integer getStreamType() {
        return this.streamType;
    }

}
