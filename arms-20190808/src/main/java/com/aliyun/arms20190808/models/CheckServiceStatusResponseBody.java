// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CheckServiceStatusResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true.</li>
     * <li>false.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The request ID. You can use the ID to find logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>5710C923-AD09-4293-9E11-DCBE3D15F8D4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceStatusResponseBody self = new CheckServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckServiceStatusResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CheckServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
