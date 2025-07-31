// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetDataQualityTemplateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>a7ef0634-20ec-4a7c-a214-54020f91XXXX</p>
     */
    @NameInMap("Id")
    public String id;

    public static GetDataQualityTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataQualityTemplateRequest self = new GetDataQualityTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetDataQualityTemplateRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
