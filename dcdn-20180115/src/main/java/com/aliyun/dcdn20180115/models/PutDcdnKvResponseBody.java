// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class PutDcdnKvResponseBody extends TeaModel {
    /**
     * <p>The length of the key.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Length")
    public Integer length;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>96ED3127-EC7A-57C5-AFA6-A689B24B2530</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The value of the key. If the value exceeds 256 characters in length, the first 100 characters and the last 100 characters are retained and other characters are not displayed.</p>
     * 
     * <strong>example:</strong>
     * <p>value1</p>
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
