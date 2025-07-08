// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class DelCardSendExportInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Model")
    public String model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DelCardSendExportInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DelCardSendExportInfoResponseBody self = new DelCardSendExportInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DelCardSendExportInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DelCardSendExportInfoResponseBody setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public DelCardSendExportInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DelCardSendExportInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
