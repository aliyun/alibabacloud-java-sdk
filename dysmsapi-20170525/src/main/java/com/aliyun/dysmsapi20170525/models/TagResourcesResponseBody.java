// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class TagResourcesResponseBody extends TeaModel {
    /**
     * <p>The request status code. Valid values:</p>
     * <ul>
     * <li>OK: The request was successful.</li>
     * <li>For other error codes, see <a href="https://help.aliyun.com/document_detail/101346.html">Error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The result of adding the tags. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: success.</li>
     * <li><strong>false</strong>: failure.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>819BE656-D2E0-4858-8B21-B2E477085AAF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static TagResourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesResponseBody self = new TagResourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public TagResourcesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public TagResourcesResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public TagResourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
