// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteCrawlerResponseBody extends TeaModel {
    /**
     * <p>The ID of the deleted metadata crawler.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The request ID. Used to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>9252F32F-D855-549E-8898-61CF5A733050</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DeleteCrawlerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCrawlerResponseBody self = new DeleteCrawlerResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCrawlerResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteCrawlerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteCrawlerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
