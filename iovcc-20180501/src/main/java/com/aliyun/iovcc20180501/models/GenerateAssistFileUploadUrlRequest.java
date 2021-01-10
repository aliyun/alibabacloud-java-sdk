// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GenerateAssistFileUploadUrlRequest extends TeaModel {
    @NameInMap("Filename")
    public String filename;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("DeviceId")
    public String deviceId;

    public static GenerateAssistFileUploadUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateAssistFileUploadUrlRequest self = new GenerateAssistFileUploadUrlRequest();
        return TeaModel.build(map, self);
    }

    public GenerateAssistFileUploadUrlRequest setFilename(String filename) {
        this.filename = filename;
        return this;
    }
    public String getFilename() {
        return this.filename;
    }

    public GenerateAssistFileUploadUrlRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GenerateAssistFileUploadUrlRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

}
