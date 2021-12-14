// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class ApplyDownloadQualificationsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static ApplyDownloadQualificationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyDownloadQualificationsResponseBody self = new ApplyDownloadQualificationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyDownloadQualificationsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ApplyDownloadQualificationsResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public ApplyDownloadQualificationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
