// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class SendValidateFileResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>yyyy-yyyy-yyyy-yyyy</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx-xxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SendValidateFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendValidateFileResponseBody self = new SendValidateFileResponseBody();
        return TeaModel.build(map, self);
    }

    public SendValidateFileResponseBody setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public SendValidateFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
