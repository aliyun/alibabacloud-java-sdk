// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetCaseFileUploadUrlRequest extends TeaModel {
    /**
     * <p>The file name of the predictive outbound calling Activity list. The name must consist of uppercase and lowercase English letters, and the file format must be CSV.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>case.csv</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetCaseFileUploadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCaseFileUploadUrlRequest self = new GetCaseFileUploadUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetCaseFileUploadUrlRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GetCaseFileUploadUrlRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
