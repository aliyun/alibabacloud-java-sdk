// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListDataIngestionsRequest extends TeaModel {
    @NameInMap("DataIngestionIds")
    public java.util.List<String> dataIngestionIds;

    /**
     * <strong>example:</strong>
     * <p>enabled。</p>
     */
    @NameInMap("DataIngestionStatus")
    public String dataIngestionStatus;

    @NameInMap("DataIngestionTemplateIds")
    public java.util.List<String> dataIngestionTemplateIds;

    /**
     * <strong>example:</strong>
     * <p>zh。</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>alibaba_cloud_sas。</p>
     */
    @NameInMap("ProductId")
    public String productId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou。</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>173326*******。</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static ListDataIngestionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataIngestionsRequest self = new ListDataIngestionsRequest();
        return TeaModel.build(map, self);
    }

    public ListDataIngestionsRequest setDataIngestionIds(java.util.List<String> dataIngestionIds) {
        this.dataIngestionIds = dataIngestionIds;
        return this;
    }
    public java.util.List<String> getDataIngestionIds() {
        return this.dataIngestionIds;
    }

    public ListDataIngestionsRequest setDataIngestionStatus(String dataIngestionStatus) {
        this.dataIngestionStatus = dataIngestionStatus;
        return this;
    }
    public String getDataIngestionStatus() {
        return this.dataIngestionStatus;
    }

    public ListDataIngestionsRequest setDataIngestionTemplateIds(java.util.List<String> dataIngestionTemplateIds) {
        this.dataIngestionTemplateIds = dataIngestionTemplateIds;
        return this;
    }
    public java.util.List<String> getDataIngestionTemplateIds() {
        return this.dataIngestionTemplateIds;
    }

    public ListDataIngestionsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListDataIngestionsRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public ListDataIngestionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDataIngestionsRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
