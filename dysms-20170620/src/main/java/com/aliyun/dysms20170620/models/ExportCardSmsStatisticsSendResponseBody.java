// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class ExportCardSmsStatisticsSendResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Model")
    public String model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ExportCardSmsStatisticsSendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportCardSmsStatisticsSendResponseBody self = new ExportCardSmsStatisticsSendResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportCardSmsStatisticsSendResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExportCardSmsStatisticsSendResponseBody setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public ExportCardSmsStatisticsSendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportCardSmsStatisticsSendResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
