// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class WorkitemAttachmentCreateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1106473328927498/1106473328927498/5ec071g0e5ij85fche8cddchje.xlsx</p>
     */
    @NameInMap("fileKey")
    public String fileKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx.tgz</p>
     */
    @NameInMap("originalFilename")
    public String originalFilename;

    public static WorkitemAttachmentCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        WorkitemAttachmentCreateRequest self = new WorkitemAttachmentCreateRequest();
        return TeaModel.build(map, self);
    }

    public WorkitemAttachmentCreateRequest setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public WorkitemAttachmentCreateRequest setOriginalFilename(String originalFilename) {
        this.originalFilename = originalFilename;
        return this;
    }
    public String getOriginalFilename() {
        return this.originalFilename;
    }

}
