// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GenerateOTAUploadURLRequest extends TeaModel {
    @NameInMap("FileSuffix")
    public String fileSuffix;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static GenerateOTAUploadURLRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateOTAUploadURLRequest self = new GenerateOTAUploadURLRequest();
        return TeaModel.build(map, self);
    }

    public GenerateOTAUploadURLRequest setFileSuffix(String fileSuffix) {
        this.fileSuffix = fileSuffix;
        return this;
    }
    public String getFileSuffix() {
        return this.fileSuffix;
    }

    public GenerateOTAUploadURLRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
