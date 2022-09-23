// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class ApplyGroupNumberExportResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public String data;

    public static ApplyGroupNumberExportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyGroupNumberExportResponseBody self = new ApplyGroupNumberExportResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyGroupNumberExportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyGroupNumberExportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ApplyGroupNumberExportResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
