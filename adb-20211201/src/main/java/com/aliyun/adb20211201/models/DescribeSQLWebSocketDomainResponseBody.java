// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSQLWebSocketDomainResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 200 indicates that the request succeeded.</p>
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
     * <p>The response message.</p>
     * <ul>
     * <li><p>Returns <strong>Success</strong> if the request succeeds.</p>
     * </li>
     * <li><p>Returns a specific error code if the request fails.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The unique identifier for the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E03F0806-A67B-5B24-8562-9589F20DEEB5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the API call succeeded. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The call succeeded.</p>
     * </li>
     * <li><p><strong>false</strong>: The call failed.</p>
     * </li>
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
