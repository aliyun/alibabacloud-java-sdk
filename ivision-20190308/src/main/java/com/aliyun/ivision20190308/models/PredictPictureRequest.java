// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class PredictPictureRequest extends TeaModel {
    @NameInMap("AlgorithmCode")
    public String algorithmCode;

    @NameInMap("OssPath")
    public String ossPath;

    @NameInMap("ResourceUrl")
    public String resourceUrl;

    @NameInMap("CustomerData")
    public String customerData;

    @NameInMap("ImageUrl")
    public String imageUrl;

    public static PredictPictureRequest build(java.util.Map<String, ?> map) throws Exception {
        PredictPictureRequest self = new PredictPictureRequest();
        return TeaModel.build(map, self);
    }

    public PredictPictureRequest setAlgorithmCode(String algorithmCode) {
        this.algorithmCode = algorithmCode;
        return this;
    }
    public String getAlgorithmCode() {
        return this.algorithmCode;
    }

    public PredictPictureRequest setOssPath(String ossPath) {
        this.ossPath = ossPath;
        return this;
    }
    public String getOssPath() {
        return this.ossPath;
    }

    public PredictPictureRequest setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
        return this;
    }
    public String getResourceUrl() {
        return this.resourceUrl;
    }

    public PredictPictureRequest setCustomerData(String customerData) {
        this.customerData = customerData;
        return this;
    }
    public String getCustomerData() {
        return this.customerData;
    }

    public PredictPictureRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

}
