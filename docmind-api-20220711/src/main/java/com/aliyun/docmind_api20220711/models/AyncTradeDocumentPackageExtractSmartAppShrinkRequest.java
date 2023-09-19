// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class AyncTradeDocumentPackageExtractSmartAppShrinkRequest extends TeaModel {
    @NameInMap("CustomExtractionRange")
    public String customExtractionRangeShrink;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileUrl")
    public String fileUrl;

    @NameInMap("Option")
    public String option;

    @NameInMap("TemplateName")
    public String templateName;

    public static AyncTradeDocumentPackageExtractSmartAppShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AyncTradeDocumentPackageExtractSmartAppShrinkRequest self = new AyncTradeDocumentPackageExtractSmartAppShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AyncTradeDocumentPackageExtractSmartAppShrinkRequest setCustomExtractionRangeShrink(String customExtractionRangeShrink) {
        this.customExtractionRangeShrink = customExtractionRangeShrink;
        return this;
    }
    public String getCustomExtractionRangeShrink() {
        return this.customExtractionRangeShrink;
    }

    public AyncTradeDocumentPackageExtractSmartAppShrinkRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public AyncTradeDocumentPackageExtractSmartAppShrinkRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public AyncTradeDocumentPackageExtractSmartAppShrinkRequest setOption(String option) {
        this.option = option;
        return this;
    }
    public String getOption() {
        return this.option;
    }

    public AyncTradeDocumentPackageExtractSmartAppShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
