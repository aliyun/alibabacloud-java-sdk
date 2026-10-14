// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class CreateC2paSignTaskRequest extends TeaModel {
    /**
     * <p>The absolute HTTP or HTTPS URL of the file to be signed. The URL can be up to 4,096 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/images/photo.png?token=xxx">https://example.com/images/photo.png?token=xxx</a></p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    /**
     * <p>Not supported in the current version.</p>
     * 
     * <strong>example:</strong>
     * <p>Alibaba Cloud Qwen ImageGen</p>
     */
    @NameInMap("SoftwareAgent")
    public String softwareAgent;

    /**
     * <p>Not supported in the current version.</p>
     * 
     * <strong>example:</strong>
     * <p>trainedAlgorithmicMedia</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static CreateC2paSignTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateC2paSignTaskRequest self = new CreateC2paSignTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateC2paSignTaskRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public CreateC2paSignTaskRequest setSoftwareAgent(String softwareAgent) {
        this.softwareAgent = softwareAgent;
        return this;
    }
    public String getSoftwareAgent() {
        return this.softwareAgent;
    }

    public CreateC2paSignTaskRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
