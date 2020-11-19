// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class MyCatCustomImportPreCheckResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public Long data;

    public static MyCatCustomImportPreCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        MyCatCustomImportPreCheckResponse self = new MyCatCustomImportPreCheckResponse();
        return TeaModel.build(map, self);
    }

    public MyCatCustomImportPreCheckResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MyCatCustomImportPreCheckResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public MyCatCustomImportPreCheckResponse setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

}
