// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDevicePictureFileRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("CaptureId")
    public String captureId;

    @NameInMap("PictureType")
    public Integer pictureType;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static QueryDevicePictureFileRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDevicePictureFileRequest self = new QueryDevicePictureFileRequest();
        return TeaModel.build(map, self);
    }

    public QueryDevicePictureFileRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public QueryDevicePictureFileRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
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

    public QueryDevicePictureFileRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
