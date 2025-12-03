// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class GenerateUploadFilePolicyForPartnerRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>esp.website</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <strong>example:</strong>
     * <p>2024/06/25/website_partner_third_party_leads_02.csv</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <strong>example:</strong>
     * <p>website_partner_third_party_leads</p>
     */
    @NameInMap("FileType")
    public String fileType;

    public static GenerateUploadFilePolicyForPartnerRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateUploadFilePolicyForPartnerRequest self = new GenerateUploadFilePolicyForPartnerRequest();
        return TeaModel.build(map, self);
    }

    public GenerateUploadFilePolicyForPartnerRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public GenerateUploadFilePolicyForPartnerRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public GenerateUploadFilePolicyForPartnerRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

}
