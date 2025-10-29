// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class ReadPageScrapeResponseBody extends TeaModel {
    @NameInMap("data")
    public ReadPageItem data;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>7cd43c86-731a-4d4c-8385-d070cfc509a4</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ReadPageScrapeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReadPageScrapeResponseBody self = new ReadPageScrapeResponseBody();
        return TeaModel.build(map, self);
    }

    public ReadPageScrapeResponseBody setData(ReadPageItem data) {
        this.data = data;
        return this;
    }
    public ReadPageItem getData() {
        return this.data;
    }

    public ReadPageScrapeResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ReadPageScrapeResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ReadPageScrapeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
