// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SetContentAnalyzeConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically initiate intelligent content analysis after media asset registration is complete.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false: Disabled. Default value: false.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Auto")
    public Boolean auto;

    /**
     * <p>The type of library to which analysis results are saved. This parameter can be configured only when Auto is set to true. Default value: empty.</p>
     * <ul>
     * <li>TEXT: label</li>
     * <li>FACE: face</li>
     * <li>DNA: similar image</li>
     * </ul>
     * <p>Multiple values are supported. Separate multiple values with commas (,). If this field is empty, the results of intelligent content analysis are not saved to any search library by default, and no content search of any form can be performed subsequently.</p>
     * 
     * <strong>example:</strong>
     * <p>TEXT,FACE</p>
     */
    @NameInMap("SaveType")
    public String saveType;

    /**
     * <p>The ID of the intelligent content analysis template. Each template includes the following AI analysis features:</p>
     * <ul>
     * <li>S00000101-100040: optical character recognition (OCR)</li>
     * <li>S00000101-100060: video classification + face recognition</li>
     * <li>S00000101-100070: OCR + video classification + face recognition</li>
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
