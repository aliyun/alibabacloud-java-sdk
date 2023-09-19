// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class AyncTradeDocumentPackageExtractSmartAppRequest extends TeaModel {
    @NameInMap("CustomExtractionRange")
    public java.util.List<String> customExtractionRange;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileUrl")
    public String fileUrl;

    @NameInMap("Option")
    public String option;

    @NameInMap("TemplateName")
    public String templateName;

    public static AyncTradeDocumentPackageExtractSmartAppRequest build(java.util.Map<String, ?> map) throws Exception {
        AyncTradeDocumentPackageExtractSmartAppRequest self = new AyncTradeDocumentPackageExtractSmartAppRequest();
        return TeaModel.build(map, self);
    }

    public AyncTradeDocumentPackageExtractSmartAppRequest setCustomExtractionRange(java.util.List<String> customExtractionRange) {
        this.customExtractionRange = customExtractionRange;
        return this;
    }
    public java.util.List<String> getCustomExtractionRange() {
        return this.customExtractionRange;
    }

    public AyncTradeDocumentPackageExtractSmartAppRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public AyncTradeDocumentPackageExtractSmartAppRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public AyncTradeDocumentPackageExtractSmartAppRequest setOption(String option) {
        this.option = option;
        return this;
    }
    public String getOption() {
        return this.option;
    }

    public AyncTradeDocumentPackageExtractSmartAppRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
