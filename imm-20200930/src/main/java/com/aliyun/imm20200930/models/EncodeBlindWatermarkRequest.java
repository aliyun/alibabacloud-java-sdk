// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class EncodeBlindWatermarkRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("ImageQuality")
    public Integer imageQuality;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceURI")
    public String sourceURI;

    @NameInMap("StrengthLevel")
    public String strengthLevel;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TargetURI")
    public String targetURI;

    public static EncodeBlindWatermarkRequest build(java.util.Map<String, ?> map) throws Exception {
        EncodeBlindWatermarkRequest self = new EncodeBlindWatermarkRequest();
        return TeaModel.build(map, self);
    }

    public EncodeBlindWatermarkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public EncodeBlindWatermarkRequest setImageQuality(Integer imageQuality) {
        this.imageQuality = imageQuality;
        return this;
    }
    public Integer getImageQuality() {
        return this.imageQuality;
    }

    public EncodeBlindWatermarkRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public EncodeBlindWatermarkRequest setSourceURI(String sourceURI) {
        this.sourceURI = sourceURI;
        return this;
    }
    public String getSourceURI() {
        return this.sourceURI;
    }

    public EncodeBlindWatermarkRequest setStrengthLevel(String strengthLevel) {
        this.strengthLevel = strengthLevel;
        return this;
    }
    public String getStrengthLevel() {
        return this.strengthLevel;
    }

    public EncodeBlindWatermarkRequest setTargetURI(String targetURI) {
        this.targetURI = targetURI;
        return this;
    }
    public String getTargetURI() {
        return this.targetURI;
    }

}
