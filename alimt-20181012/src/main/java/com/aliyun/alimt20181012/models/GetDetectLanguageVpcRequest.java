// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetDetectLanguageVpcRequest extends TeaModel {
    @NameInMap("SourceText")
    public String sourceText;

    public static GetDetectLanguageVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDetectLanguageVpcRequest self = new GetDetectLanguageVpcRequest();
        return TeaModel.build(map, self);
    }

    public GetDetectLanguageVpcRequest setSourceText(String sourceText) {
        this.sourceText = sourceText;
        return this;
    }
    public String getSourceText() {
        return this.sourceText;
    }

}
