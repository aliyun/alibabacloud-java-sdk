// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PutKvWithHighCapacityResponseBody extends TeaModel {
    /**
     * <p>The length of the value in the key-value pair.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("Length")
    public String length;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EEEBE525-F576-1196-8DAF-2D70CA3F4D2F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The content of the key. If the length exceeds 256 characters, the first 100 and last 100 characters are displayed, with the middle omitted.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Value")
    public String value;

    public static PutKvWithHighCapacityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PutKvWithHighCapacityResponseBody self = new PutKvWithHighCapacityResponseBody();
        return TeaModel.build(map, self);
    }

    public PutKvWithHighCapacityResponseBody setLength(String length) {
        this.length = length;
        return this;
    }
    public String getLength() {
        return this.length;
    }

    public PutKvWithHighCapacityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PutKvWithHighCapacityResponseBody setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
