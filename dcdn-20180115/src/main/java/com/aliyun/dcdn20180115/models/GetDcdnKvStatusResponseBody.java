// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class GetDcdnKvStatusResponseBody extends TeaModel {
    /**
     * <p>Specifies whether the configured key has taken effect on all points of presence (POPs).</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Complete")
    public Boolean complete;

    /**
     * <p>The timeout period of the configured key. The value is an absolute timestamp, such as 2023-09-11T15:39:44+08:00. This parameter is not returned if the key is permanently stored.</p>
     */
    @NameInMap("Expire")
    public String expire;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDcdnKvStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDcdnKvStatusResponseBody self = new GetDcdnKvStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDcdnKvStatusResponseBody setComplete(Boolean complete) {
        this.complete = complete;
        return this;
    }
    public Boolean getComplete() {
        return this.complete;
    }

    public GetDcdnKvStatusResponseBody setExpire(String expire) {
        this.expire = expire;
        return this;
    }
    public String getExpire() {
        return this.expire;
    }

    public GetDcdnKvStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
