// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetDetectLanguageRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceText")
    public String sourceText;

    public static GetDetectLanguageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDetectLanguageRequest self = new GetDetectLanguageRequest();
        return TeaModel.build(map, self);
    }

    public GetDetectLanguageRequest setSourceText(String sourceText) {
        this.sourceText = sourceText;
        return this;
    }
    public String getSourceText() {
        return this.sourceText;
    }

}
