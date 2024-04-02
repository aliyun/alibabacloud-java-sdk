// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeBizTypesRequest extends TeaModel {
    @NameInMap("ImportFlag")
    public Boolean importFlag;

    public static DescribeBizTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBizTypesRequest self = new DescribeBizTypesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBizTypesRequest setImportFlag(Boolean importFlag) {
        this.importFlag = importFlag;
        return this;
    }
    public Boolean getImportFlag() {
        return this.importFlag;
    }

}
