// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetValidateFileResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://xxxxxx/yyy">https://xxxxxx/yyy</a></p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    /**
     * <strong>example:</strong>
     * <p>yyyy-yyyy-yyyy-yyyy</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetValidateFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetValidateFileResponseBody self = new GetValidateFileResponseBody();
        return TeaModel.build(map, self);
    }

    public GetValidateFileResponseBody setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public GetValidateFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
