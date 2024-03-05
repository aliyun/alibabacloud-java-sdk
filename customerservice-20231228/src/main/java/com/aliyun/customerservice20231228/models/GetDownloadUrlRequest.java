// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.customerservice20231228.models;

import com.aliyun.tea.*;

public class GetDownloadUrlRequest extends TeaModel {
    @NameInMap("fileId")
    public Long fileId;

    @NameInMap("fileKey")
    public String fileKey;

    @NameInMap("freeOrderApplyCode")
    public String freeOrderApplyCode;

    @NameInMap("orderId")
    public String orderId;

    @NameInMap("scene")
    public String scene;

    public static GetDownloadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDownloadUrlRequest self = new GetDownloadUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetDownloadUrlRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public GetDownloadUrlRequest setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public GetDownloadUrlRequest setFreeOrderApplyCode(String freeOrderApplyCode) {
        this.freeOrderApplyCode = freeOrderApplyCode;
        return this;
    }
    public String getFreeOrderApplyCode() {
        return this.freeOrderApplyCode;
    }

    public GetDownloadUrlRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public GetDownloadUrlRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
