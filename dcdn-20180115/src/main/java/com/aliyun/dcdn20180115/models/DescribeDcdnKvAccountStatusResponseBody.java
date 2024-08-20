// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnKvAccountStatusResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5C1E43DC-9E51-4771-82C0-7D5ECEB547A1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the account.</p>
     * <ul>
     * <li><strong>online</strong></li>
     * <li><strong>offline</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>online</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeDcdnKvAccountStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnKvAccountStatusResponseBody self = new DescribeDcdnKvAccountStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnKvAccountStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnKvAccountStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
