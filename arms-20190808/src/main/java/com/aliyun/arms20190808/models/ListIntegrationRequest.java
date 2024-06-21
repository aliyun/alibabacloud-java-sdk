// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListIntegrationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>云监控集成</p>
     */
    @NameInMap("IntegrationName")
    public String integrationName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CLOUD_MONITOR</p>
     */
    @NameInMap("IntegrationProductType")
    public String integrationProductType;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsDetail")
    public Boolean isDetail;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Long page;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
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
