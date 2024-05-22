// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetTemplateMaterialsRequest extends TeaModel {
    @NameInMap("FileList")
    public String fileList;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static GetTemplateMaterialsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateMaterialsRequest self = new GetTemplateMaterialsRequest();
        return TeaModel.build(map, self);
    }

    public GetTemplateMaterialsRequest setFileList(String fileList) {
        this.fileList = fileList;
        return this;
    }
    public String getFileList() {
        return this.fileList;
    }

    public GetTemplateMaterialsRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
