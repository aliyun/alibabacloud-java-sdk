// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.customerservice20231228.models;

import com.aliyun.tea.*;

public class MarkFileReadedRequest extends TeaModel {
    @NameInMap("applyCode")
    public String applyCode;

    @NameInMap("fileId")
    public Long fileId;

    @NameInMap("orderId")
    public String orderId;

    @NameInMap("scene")
    public String scene;

    public static MarkFileReadedRequest build(java.util.Map<String, ?> map) throws Exception {
        MarkFileReadedRequest self = new MarkFileReadedRequest();
        return TeaModel.build(map, self);
    }

    public MarkFileReadedRequest setApplyCode(String applyCode) {
        this.applyCode = applyCode;
        return this;
    }
    public String getApplyCode() {
        return this.applyCode;
    }

    public MarkFileReadedRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public MarkFileReadedRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public MarkFileReadedRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
