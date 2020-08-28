// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePictureFileRequest extends TeaModel {
    @NameInMap("IotId")
    @Validation(required = true)
    public String iotId;

    @NameInMap("CaptureId")
    @Validation(required = true)
    public String captureId;

    @NameInMap("PictureType")
    public Integer pictureType;

    public static QueryDevicePictureFileRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePictureFileRequest self = new QueryDevicePictureFileRequest();
        return TeaModel.build(map, self);
    }

    public QueryDevicePictureFileRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryDevicePictureFileRequest setCaptureId(String captureId) {
        this.captureId = captureId;
        return this;
    }
    public String getCaptureId() {
        return this.captureId;
    }

    public QueryDevicePictureFileRequest setPictureType(Integer pictureType) {
        this.pictureType = pictureType;
        return this;
    }
    public Integer getPictureType() {
        return this.pictureType;
    }

}
