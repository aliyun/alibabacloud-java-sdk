// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetClusterDiagnosisResultRequest extends TeaModel {
    /**
     * <p>查询语言。</p>
     * 
     * <strong>example:</strong>
     * <p>zh_CN</p>
     */
    @NameInMap("language")
    public String language;

    public static GetClusterDiagnosisResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterDiagnosisResultRequest self = new GetClusterDiagnosisResultRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterDiagnosisResultRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

}
