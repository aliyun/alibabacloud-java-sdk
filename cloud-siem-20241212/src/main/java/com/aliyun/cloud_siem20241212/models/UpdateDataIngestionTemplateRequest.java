// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataIngestionTemplateRequest extends TeaModel {
    /**
     * <p>The status of data ingestion. Valid values:</p>
     * <ul>
     * <li><p>enabled: Enabled.</p>
     * </li>
     * <li><p>disabled: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enabled</p>
     */
    @NameInMap("DataIngestionStatus")
    public String dataIngestionStatus;

    /**
     * <p>The ID of the data ingestion template.</p>
     * 
     * <strong>example:</strong>
     * <p>alibaba_cloud_actiontrail_event_ingestion_173326*******</p>
     */
    @NameInMap("DataIngestionTemplateId")
    public String dataIngestionTemplateId;

    /**
     * <p>The name of the data source template.</p>
     * 
     * <strong>example:</strong>
     * <p>alibaba_cloud_actiontrail_event_ingestion_173326*******</p>
     */
    @NameInMap("DataIngestionTemplateName")
    public String dataIngestionTemplateName;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the normalization rule.</p>
     * 
     * <strong>example:</strong>
     * <p>alibaba_cloud_actiontrail_event_rule</p>
     */
    @NameInMap("NormalizationRuleId")
    public String normalizationRuleId;

    /**
     * <p>The region where the Data Management center for threat analysis is located. Select a region for the management center based on the region of your asset. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: The asset is in the Chinese mainland.</p>
     * </li>
     * <li><p>ap-southeast-1: The asset is outside China.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of the member. This parameter is used by an administrator to switch to the perspective of the member.</p>
     * 
     * <strong>example:</strong>
     * <p>173326*******</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static UpdateDataIngestionTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataIngestionTemplateRequest self = new UpdateDataIngestionTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataIngestionTemplateRequest setDataIngestionStatus(String dataIngestionStatus) {
        this.dataIngestionStatus = dataIngestionStatus;
        return this;
    }
    public String getDataIngestionStatus() {
        return this.dataIngestionStatus;
    }

    public UpdateDataIngestionTemplateRequest setDataIngestionTemplateId(String dataIngestionTemplateId) {
        this.dataIngestionTemplateId = dataIngestionTemplateId;
        return this;
    }
    public String getDataIngestionTemplateId() {
        return this.dataIngestionTemplateId;
    }

    public UpdateDataIngestionTemplateRequest setDataIngestionTemplateName(String dataIngestionTemplateName) {
        this.dataIngestionTemplateName = dataIngestionTemplateName;
        return this;
    }
    public String getDataIngestionTemplateName() {
        return this.dataIngestionTemplateName;
    }

    public UpdateDataIngestionTemplateRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateDataIngestionTemplateRequest setNormalizationRuleId(String normalizationRuleId) {
        this.normalizationRuleId = normalizationRuleId;
        return this;
    }
    public String getNormalizationRuleId() {
        return this.normalizationRuleId;
    }

    public UpdateDataIngestionTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateDataIngestionTemplateRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
