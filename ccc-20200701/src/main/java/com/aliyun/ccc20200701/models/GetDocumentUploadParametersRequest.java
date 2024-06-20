// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetDocumentUploadParametersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>blacklist.xlsx</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9cfad875-6260-4a53-ab6e-b13e3fb31f7d</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>24BE19E8-BF7D-4992-A35E-15EBA874F2E5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDocumentUploadParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentUploadParametersRequest self = new GetDocumentUploadParametersRequest();
        return TeaModel.build(map, self);
    }

    public GetDocumentUploadParametersRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GetDocumentUploadParametersRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetDocumentUploadParametersRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
