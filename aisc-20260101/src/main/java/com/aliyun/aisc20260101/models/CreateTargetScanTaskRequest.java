// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101.models;

import com.aliyun.tea.*;

public class CreateTargetScanTaskRequest extends TeaModel {
    /**
     * <p>The language filter for samples, in locale format (such as zh_CN or en_US, which is internally normalized to zh or en). If this parameter is not specified, samples are selected based on the default language policy combined with general-purpose samples.</p>
     * 
     * <strong>example:</strong>
     * <p>zh_CN</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The detection intensity. The backend derives the corresponding technique level based on this value. If this parameter is not specified, the system falls back to the scan task configuration saved for the target, and then to the system default value.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("SampleLevel")
    public Long sampleLevel;

    /**
     * <p>The unique identifier of the scan target. The target must have passed connectivity verification (verifyStatus=verified). Otherwise, a 400 error is returned. You can call TestConnectivity to complete the verification first.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>target-abc123def4567</p>
     */
    @NameInMap("TargetId")
    public String targetId;

    public static CreateTargetScanTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTargetScanTaskRequest self = new CreateTargetScanTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateTargetScanTaskRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateTargetScanTaskRequest setSampleLevel(Long sampleLevel) {
        this.sampleLevel = sampleLevel;
        return this;
    }
    public Long getSampleLevel() {
        return this.sampleLevel;
    }

    public CreateTargetScanTaskRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

}
