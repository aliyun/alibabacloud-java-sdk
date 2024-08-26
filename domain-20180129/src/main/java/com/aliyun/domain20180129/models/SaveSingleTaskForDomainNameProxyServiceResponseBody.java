// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForDomainNameProxyServiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F51977F9-2B40-462B-BCCD-CF5BB1E9DB56</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>3cb1adc3-20e8-44ae-9e76-e812fa6fc9d8</p>
     */
    @NameInMap("TaskNo")
    public String taskNo;

    public static SaveSingleTaskForDomainNameProxyServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForDomainNameProxyServiceResponseBody self = new SaveSingleTaskForDomainNameProxyServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForDomainNameProxyServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveSingleTaskForDomainNameProxyServiceResponseBody setTaskNo(String taskNo) {
        this.taskNo = taskNo;
        return this;
    }
    public String getTaskNo() {
        return this.taskNo;
    }

}
