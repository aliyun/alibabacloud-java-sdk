// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class GenerateFileUploadParamsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>CloneVoice</p>
     */
    @NameInMap("BusinessType")
    public String businessType;

    /**
     * <strong>example:</strong>
     * <p>llm-c11iig67g863rih8</p>
     */
    @NameInMap("BusinessUnitId")
    public String businessUnitId;

    /**
     * <strong>example:</strong>
     * <p>test.wav</p>
     */
    @NameInMap("FileName")
    public String fileName;

    public static GenerateFileUploadParamsRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateFileUploadParamsRequest self = new GenerateFileUploadParamsRequest();
        return TeaModel.build(map, self);
    }

    public GenerateFileUploadParamsRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public GenerateFileUploadParamsRequest setBusinessUnitId(String businessUnitId) {
        this.businessUnitId = businessUnitId;
        return this;
    }
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    public GenerateFileUploadParamsRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

}
