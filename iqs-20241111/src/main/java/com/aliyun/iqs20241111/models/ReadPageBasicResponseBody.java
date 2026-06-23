// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class ReadPageBasicResponseBody extends TeaModel {
    /**
     * <p>Parsing result of the target URL</p>
     */
    @NameInMap("data")
    public ReadPageItem data;

    /**
     * <p>Error code</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>Error message</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>Request ID. Provide this information when troubleshooting issues.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ReadPageBasicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReadPageBasicResponseBody self = new ReadPageBasicResponseBody();
        return TeaModel.build(map, self);
    }

    public ReadPageBasicResponseBody setData(ReadPageItem data) {
        this.data = data;
        return this;
    }
    public ReadPageItem getData() {
        return this.data;
    }

    public ReadPageBasicResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ReadPageBasicResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ReadPageBasicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
