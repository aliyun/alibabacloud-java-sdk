// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.customerservice20231228.models;

import com.aliyun.tea.*;

public class GetPreViewUrlRequest extends TeaModel {
    @NameInMap("applyCode")
    public String applyCode;

    @NameInMap("fileId")
    public Long fileId;

    @NameInMap("fileKey")
    public String fileKey;

    @NameInMap("orderId")
    public String orderId;

    @NameInMap("scene")
    public String scene;

    public static GetPreViewUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPreViewUrlRequest self = new GetPreViewUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetPreViewUrlRequest setApplyCode(String applyCode) {
        this.applyCode = applyCode;
        return this;
    }
    public String getApplyCode() {
        return this.applyCode;
    }

    public GetPreViewUrlRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public GetPreViewUrlRequest setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public GetPreViewUrlRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public GetPreViewUrlRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
