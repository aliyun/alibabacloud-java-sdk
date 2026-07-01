// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SetContentAnalyzeConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically start Intelligent Content Analysis after a Media Asset is registered.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>true: Enable</p>
     * </li>
     * <li><p>false: Disable (Default)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Auto")
    public Boolean auto;

    /**
     * <p>The storage type for analysis results. This parameter applies only when Auto is set to true. Default: Empty.</p>
     * <ul>
     * <li><p>TEXT: Label</p>
     * </li>
     * <li><p>FACE: Face</p>
     * </li>
     * <li><p>DNA: Similar Image</p>
     * </li>
     * </ul>
     * <p>You can specify multiple values separated by commas. If this parameter is empty, Intelligent Content Analysis results are not saved to any search library, and you cannot perform content searches.</p>
     * 
     * <strong>example:</strong>
     * <p>TEXT,FACE</p>
     */
    @NameInMap("SaveType")
    public String saveType;

    /**
     * <p>The ID of the Intelligent Content Analysis Template. Each Template includes the following AI analysis features:</p>
     * <ul>
     * <li><p>S00000101-100040: Text Recognition</p>
     * </li>
     * <li><p>S00000101-100060: Video Categorization and Face Recognition</p>
     * </li>
     * <li><p>S00000101-100070: Text Recognition, Video Categorization, and Face Recognition</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>S00000101-100070</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static SetContentAnalyzeConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetContentAnalyzeConfigRequest self = new SetContentAnalyzeConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetContentAnalyzeConfigRequest setAuto(Boolean auto) {
        this.auto = auto;
        return this;
    }
    public Boolean getAuto() {
        return this.auto;
    }

    public SetContentAnalyzeConfigRequest setSaveType(String saveType) {
        this.saveType = saveType;
        return this;
    }
    public String getSaveType() {
        return this.saveType;
    }

    public SetContentAnalyzeConfigRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
