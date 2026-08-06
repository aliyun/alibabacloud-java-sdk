// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class StopCrawlerResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>9252F32F-D855-549E-8898-61CF5A733050</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StopAccepted")
    public Boolean stopAccepted;

    @NameInMap("Success")
    public Boolean success;

    public static StopCrawlerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopCrawlerResponseBody self = new StopCrawlerResponseBody();
        return TeaModel.build(map, self);
    }

    public StopCrawlerResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public StopCrawlerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopCrawlerResponseBody setStopAccepted(Boolean stopAccepted) {
        this.stopAccepted = stopAccepted;
        return this;
    }
    public Boolean getStopAccepted() {
        return this.stopAccepted;
    }

    public StopCrawlerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
