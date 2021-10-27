// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class MyCatCustomImportPreCheckResponseBody extends TeaModel {
    @NameInMap("Data")
    public Long data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static MyCatCustomImportPreCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MyCatCustomImportPreCheckResponseBody self = new MyCatCustomImportPreCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public MyCatCustomImportPreCheckResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public MyCatCustomImportPreCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MyCatCustomImportPreCheckResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
