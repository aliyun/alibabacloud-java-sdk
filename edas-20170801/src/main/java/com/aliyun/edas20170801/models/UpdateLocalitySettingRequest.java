// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateLocalitySettingRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can call the <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a> operation to obtain this ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bfa00cfb-9642-4292-bb78-1d7d4c86004c</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Specifies whether the setting is active:</p>
     * <ul>
     * <li><p>true: The setting is active.</p>
     * </li>
     * <li><p>false: The setting is not active.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Enabled")
    public Boolean enabled;

    /**
     * <p>The ID of the namespace. This ID cannot be changed after the namespace is created. The format is [unk]physical space identifier[unk].</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The ID of the region where the elastic compute unit (ECU) is located.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The total number of items that satisfy the threshold expression.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("Threshold")
    public Float threshold;

    public static UpdateLocalitySettingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLocalitySettingRequest self = new UpdateLocalitySettingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLocalitySettingRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateLocalitySettingRequest setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public UpdateLocalitySettingRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public UpdateLocalitySettingRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public UpdateLocalitySettingRequest setThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }
    public Float getThreshold() {
        return this.threshold;
    }

}
