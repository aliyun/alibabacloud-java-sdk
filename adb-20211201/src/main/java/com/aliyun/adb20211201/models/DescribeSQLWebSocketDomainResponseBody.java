// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSQLWebSocketDomainResponseBody extends TeaModel {
    /**
     * <p>The status code. The status code 200 indicates that the request was successful. Other status codes indicate that the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>adb-ws-beijing.console.aliyun.com/query</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The returned message. Valid values:</p>
     * <ul>
     * <li>If the request was successful, a success message is returned.****</li>
     * <li>If the request failed, an error message is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E03F0806-A67B-5B24-8562-9589F20DEEB5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeSQLWebSocketDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLWebSocketDomainResponseBody self = new DescribeSQLWebSocketDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSQLWebSocketDomainResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DescribeSQLWebSocketDomainResponseBody setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeSQLWebSocketDomainResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSQLWebSocketDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSQLWebSocketDomainResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
