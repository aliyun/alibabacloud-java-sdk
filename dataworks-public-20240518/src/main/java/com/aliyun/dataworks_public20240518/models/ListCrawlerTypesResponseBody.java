// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListCrawlerTypesResponseBody extends TeaModel {
    @NameInMap("CrawlerTypes")
    public java.util.List<CrawlerType> crawlerTypes;

    /**
     * <strong>example:</strong>
     * <p>0000-ABCD-EFG****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListCrawlerTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCrawlerTypesResponseBody self = new ListCrawlerTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCrawlerTypesResponseBody setCrawlerTypes(java.util.List<CrawlerType> crawlerTypes) {
        this.crawlerTypes = crawlerTypes;
        return this;
    }
    public java.util.List<CrawlerType> getCrawlerTypes() {
        return this.crawlerTypes;
    }

    public ListCrawlerTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCrawlerTypesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
