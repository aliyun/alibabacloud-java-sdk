// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetUploadDeleteOssFileResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DatasetUploadDeleteOssFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DatasetUploadDeleteOssFileResponseBody self = new DatasetUploadDeleteOssFileResponseBody();
        return TeaModel.build(map, self);
    }

    public DatasetUploadDeleteOssFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
