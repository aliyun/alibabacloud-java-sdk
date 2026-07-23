// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class GetManagedDataKeyRequest extends TeaModel {
    /**
     * <p>The name of the managed data key (DK). This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example-data-key</p>
     */
    @NameInMap("DataKeyName")
    public String dataKeyName;

    /**
     * <p>The version number of the managed data key (DK). This parameter is optional. If you set this parameter to a specific version number, the plaintext of the specified version of the managed data key (DK) is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>xH6OPUmz</p>
     */
    @NameInMap("DataKeyVersionId")
    public String dataKeyVersionId;

    /**
     * <p>Specifies whether to use the latest version of the managed data key (DK) when no version number is provided. Valid values:</p>
     * <ul>
     * <li>true: Returns the latest version of the managed data key (DK).</li>
     * <li>false: Returns the first version of the managed data key (DK).</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UseLatest")
    public Boolean useLatest;

    public static GetManagedDataKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetManagedDataKeyRequest self = new GetManagedDataKeyRequest();
        return TeaModel.build(map, self);
    }

    public GetManagedDataKeyRequest setDataKeyName(String dataKeyName) {
        this.dataKeyName = dataKeyName;
        return this;
    }
    public String getDataKeyName() {
        return this.dataKeyName;
    }

    public GetManagedDataKeyRequest setDataKeyVersionId(String dataKeyVersionId) {
        this.dataKeyVersionId = dataKeyVersionId;
        return this;
    }
    public String getDataKeyVersionId() {
        return this.dataKeyVersionId;
    }

    public GetManagedDataKeyRequest setUseLatest(Boolean useLatest) {
        this.useLatest = useLatest;
        return this;
    }
    public Boolean getUseLatest() {
        return this.useLatest;
    }

}
