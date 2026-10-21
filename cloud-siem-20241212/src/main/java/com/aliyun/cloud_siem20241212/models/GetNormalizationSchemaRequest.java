// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetNormalizationSchemaRequest extends TeaModel {
    /**
     * <p>The language of the response message. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * <p>Note: This parameter is required in actual API calls. If you do not specify this parameter, the service returns a 400 error with the message &quot;The specified Lang can not be empty.&quot; Explicitly specify the language code.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the normalized rule category.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP_ACTIVITY</p>
     */
    @NameInMap("NormalizationSchemaId")
    public String normalizationSchemaId;

    /**
     * <p>The type of the normalized schema. Valid values:</p>
     * <ul>
     * <li>log: Log.</li>
     * <li>entity: Entity. This parameter is required in actual API calls. If you do not specify this parameter, the service returns a 400 error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>log</p>
     */
    @NameInMap("NormalizationSchemaType")
    public String normalizationSchemaType;

    /**
     * <p>The region of the data management center for Threat Analysis. Select the region of the management center based on the region where your assets are located. Valid values:</p>
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
     * <p>173326*******</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static GetNormalizationSchemaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNormalizationSchemaRequest self = new GetNormalizationSchemaRequest();
        return TeaModel.build(map, self);
    }

    public GetNormalizationSchemaRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetNormalizationSchemaRequest setNormalizationSchemaId(String normalizationSchemaId) {
        this.normalizationSchemaId = normalizationSchemaId;
        return this;
    }
    public String getNormalizationSchemaId() {
        return this.normalizationSchemaId;
    }

    public GetNormalizationSchemaRequest setNormalizationSchemaType(String normalizationSchemaType) {
        this.normalizationSchemaType = normalizationSchemaType;
        return this;
    }
    public String getNormalizationSchemaType() {
        return this.normalizationSchemaType;
    }

    public GetNormalizationSchemaRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetNormalizationSchemaRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
