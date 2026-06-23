// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GenerateUploadAuthRequest extends TeaModel {
    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idaas_111ccc11xxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>File purpose.</p>
     * 
     * <strong>example:</strong>
     * <p>user_import</p>
     */
    @NameInMap("Purpose")
    public String purpose;

    /**
     * <p>File type.</p>
     * 
     * <strong>example:</strong>
     * <p>image</p>
     */
    @NameInMap("Type")
    public String type;

    public static GenerateUploadAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateUploadAuthRequest self = new GenerateUploadAuthRequest();
        return TeaModel.build(map, self);
    }

    public GenerateUploadAuthRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GenerateUploadAuthRequest setPurpose(String purpose) {
        this.purpose = purpose;
        return this;
    }
    public String getPurpose() {
        return this.purpose;
    }

    public GenerateUploadAuthRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
