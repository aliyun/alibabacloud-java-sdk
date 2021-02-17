// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class DetectQRCodesRequest extends TeaModel {
    @NameInMap("Project")
    public String project;

    @NameInMap("SrcUris")
    public String srcUris;

    public static DetectQRCodesRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectQRCodesRequest self = new DetectQRCodesRequest();
        return TeaModel.build(map, self);
    }

    public DetectQRCodesRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public DetectQRCodesRequest setSrcUris(String srcUris) {
        this.srcUris = srcUris;
        return this;
    }
    public String getSrcUris() {
        return this.srcUris;
    }

}
