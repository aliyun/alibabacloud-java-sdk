// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DeleteBackupFileResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>425F351C-3F8E-5218-A520-B6311D0D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteBackupFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackupFileResponseBody self = new DeleteBackupFileResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBackupFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
