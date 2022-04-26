// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectImageCroppingRequest extends TeaModel {
    @NameInMap("AspectRatios")
    public String aspectRatios;

    // 项目名称
    @NameInMap("ProjectName")
    public String projectName;

    // SourceURI
    @NameInMap("SourceURI")
    public String sourceURI;

    public static DetectImageCroppingRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectImageCroppingRequest self = new DetectImageCroppingRequest();
        return TeaModel.build(map, self);
    }

    public DetectImageCroppingRequest setAspectRatios(String aspectRatios) {
        this.aspectRatios = aspectRatios;
        return this;
    }
    public String getAspectRatios() {
        return this.aspectRatios;
    }

    public DetectImageCroppingRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public DetectImageCroppingRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

}
