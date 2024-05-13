// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetDoNotCallFileUploadParametersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetDoNotCallFileUploadParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDoNotCallFileUploadParametersRequest self = new GetDoNotCallFileUploadParametersRequest();
        return TeaModel.build(map, self);
    }

    public GetDoNotCallFileUploadParametersRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GetDoNotCallFileUploadParametersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
