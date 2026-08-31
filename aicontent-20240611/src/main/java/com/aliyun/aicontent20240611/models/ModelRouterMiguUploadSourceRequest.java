// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterMiguUploadSourceRequest extends TeaModel {
    /**
     * <p>The source file type. Valid values: VIDEO, IMAGE, AUDIO, and TEXT.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VIDEO</p>
     */
    @NameInMap("fileType")
    public String fileType;

    /**
     * <p>The business service name, such as kling, vidu, or wonder.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kling</p>
     */
    @NameInMap("serviceName")
    public String serviceName;

    public static ModelRouterMiguUploadSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterMiguUploadSourceRequest self = new ModelRouterMiguUploadSourceRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterMiguUploadSourceRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public ModelRouterMiguUploadSourceRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
