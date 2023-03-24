// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class PutDcdnKvResponseBody extends TeaModel {
    /**
     * <p>The length of the key.</p>
     */
    @NameInMap("Length")
    public Integer length;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The content of the key. If the value exceeds 256 characters in length, the first 100 characters and the last 100 characters are retained and other characters are discarded.</p>
     */
    @NameInMap("Value")
    public String value;

    public static PutDcdnKvResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutDcdnKvResponseBody self = new PutDcdnKvResponseBody();
        return TeaModel.build(map, self);
    }

    public PutDcdnKvResponseBody setLength(Integer length) {
        this.length = length;
        return this;
    }
    public Integer getLength() {
        return this.length;
    }

    public PutDcdnKvResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PutDcdnKvResponseBody setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
