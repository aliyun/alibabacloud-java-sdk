// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class DeleteNormalizationSchemaRequest extends TeaModel {
    /**
     * <p>The language of the response message. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the normalization schema.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PROCESS_QUERY_DNS_ACTIVITY</p>
     */
    @NameInMap("NormalizationSchemaId")
    public String normalizationSchemaId;

    /**
     * <p>The type of the normalization schema. Valid values:</p>
     * <ul>
     * <li>log: Log.</li>
     * <li>entity: Entity.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>log</p>
     */
    @NameInMap("NormalizationSchemaType")
    public String normalizationSchemaType;

    /**
     * <p>The region where the data management center of Threat Analysis is located. You must select the region of the management center based on the region where your assets are located. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Assets are located in the Chinese mainland.</li>
     * <li>ap-southeast-1: Assets are located outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the user whose perspective the administrator switches to.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static DeleteNormalizationSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNormalizationSchemaRequest self = new DeleteNormalizationSchemaRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNormalizationSchemaRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteNormalizationSchemaRequest setNormalizationSchemaId(String normalizationSchemaId) {
        this.normalizationSchemaId = normalizationSchemaId;
        return this;
    }
    public String getNormalizationSchemaId() {
        return this.normalizationSchemaId;
    }

    public DeleteNormalizationSchemaRequest setNormalizationSchemaType(String normalizationSchemaType) {
        this.normalizationSchemaType = normalizationSchemaType;
        return this;
    }
    public String getNormalizationSchemaType() {
        return this.normalizationSchemaType;
    }

    public DeleteNormalizationSchemaRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteNormalizationSchemaRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
