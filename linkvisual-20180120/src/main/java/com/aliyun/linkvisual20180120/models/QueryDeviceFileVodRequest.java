// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceFileVodRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("ShouldEncrypt")
    public Boolean shouldEncrypt;

    @NameInMap("EncryptType")
    public Integer encryptType;

    public static QueryDeviceFileVodRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceFileVodRequest self = new QueryDeviceFileVodRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceFileVodRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public QueryDeviceFileVodRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public QueryDeviceFileVodRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public QueryDeviceFileVodRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public QueryDeviceFileVodRequest setShouldEncrypt(Boolean shouldEncrypt) {
        this.shouldEncrypt = shouldEncrypt;
        return this;
    }
    public Boolean getShouldEncrypt() {
        return this.shouldEncrypt;
    }

    public QueryDeviceFileVodRequest setEncryptType(Integer encryptType) {
        this.encryptType = encryptType;
        return this;
    }
    public Integer getEncryptType() {
        return this.encryptType;
    }

}
