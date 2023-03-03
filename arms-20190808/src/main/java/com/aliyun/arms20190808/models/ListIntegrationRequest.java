// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListIntegrationRequest extends TeaModel {
    /**
     * <p>The name of the alert integration.</p>
     */
    @NameInMap("IntegrationName")
    public String integrationName;

    /**
     * <p>The service of the alert integration. Valid values:</p>
     * <br>
     * <p>*   CLOUD_MONITOR: CloudMonitor</p>
     * <p>*   LOG_SERVICE: Log Service</p>
     */
    @NameInMap("IntegrationProductType")
    public String integrationProductType;

    /**
     * <p>Specifies whether to display the details of each alert integration:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("IsDetail")
    public Boolean isDetail;

    /**
     * <p>The number of the page to return.</p>
     */
    @NameInMap("Page")
    public Long page;

    /**
     * <p>The number of alert integrations to return on each page.</p>
     */
    @NameInMap("Size")
    public Long size;

    public static ListIntegrationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIntegrationRequest self = new ListIntegrationRequest();
        return TeaModel.build(map, self);
    }

    public ListIntegrationRequest setIntegrationName(String integrationName) {
        this.integrationName = integrationName;
        return this;
    }
    public String getIntegrationName() {
        return this.integrationName;
    }

    public ListIntegrationRequest setIntegrationProductType(String integrationProductType) {
        this.integrationProductType = integrationProductType;
        return this;
    }
    public String getIntegrationProductType() {
        return this.integrationProductType;
    }

    public ListIntegrationRequest setIsDetail(Boolean isDetail) {
        this.isDetail = isDetail;
        return this;
    }
    public Boolean getIsDetail() {
        return this.isDetail;
    }

    public ListIntegrationRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListIntegrationRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
