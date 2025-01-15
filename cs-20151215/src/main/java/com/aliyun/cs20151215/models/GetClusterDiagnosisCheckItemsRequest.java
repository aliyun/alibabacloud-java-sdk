// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetClusterDiagnosisCheckItemsRequest extends TeaModel {
    /**
     * <p>The query language.</p>
     * 
     * <strong>example:</strong>
     * <p>zh_CN</p>
     */
    @NameInMap("language")
    public String language;

    public static GetClusterDiagnosisCheckItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterDiagnosisCheckItemsRequest self = new GetClusterDiagnosisCheckItemsRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterDiagnosisCheckItemsRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

}
