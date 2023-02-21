// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListSparkTemplateFileIdsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<Long> data;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListSparkTemplateFileIdsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSparkTemplateFileIdsResponseBody self = new ListSparkTemplateFileIdsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSparkTemplateFileIdsResponseBody setData(java.util.List<Long> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Long> getData() {
        return this.data;
    }

    public ListSparkTemplateFileIdsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
