// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListDataIngestionsShrinkRequest extends TeaModel {
    @NameInMap("DataIngestionIds")
    public String dataIngestionIdsShrink;

    /**
     * <strong>example:</strong>
     * <p>enabled。</p>
     */
    @NameInMap("DataIngestionStatus")
    public String dataIngestionStatus;

    @NameInMap("DataIngestionTemplateIds")
    public String dataIngestionTemplateIdsShrink;

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

    public static ListDataIngestionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataIngestionsShrinkRequest self = new ListDataIngestionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListDataIngestionsShrinkRequest setDataIngestionIdsShrink(String dataIngestionIdsShrink) {
        this.dataIngestionIdsShrink = dataIngestionIdsShrink;
        return this;
    }
    public String getDataIngestionIdsShrink() {
        return this.dataIngestionIdsShrink;
    }

    public ListDataIngestionsShrinkRequest setDataIngestionStatus(String dataIngestionStatus) {
        this.dataIngestionStatus = dataIngestionStatus;
        return this;
    }
    public String getDataIngestionStatus() {
        return this.dataIngestionStatus;
    }

    public ListDataIngestionsShrinkRequest setDataIngestionTemplateIdsShrink(String dataIngestionTemplateIdsShrink) {
        this.dataIngestionTemplateIdsShrink = dataIngestionTemplateIdsShrink;
        return this;
    }
    public String getDataIngestionTemplateIdsShrink() {
        return this.dataIngestionTemplateIdsShrink;
    }

    public ListDataIngestionsShrinkRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListDataIngestionsShrinkRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public ListDataIngestionsShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDataIngestionsShrinkRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
