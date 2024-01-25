// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetNewOptimizationItemDataRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("OperaUid")
    public String operaUid;

    public static GetNewOptimizationItemDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNewOptimizationItemDataRequest self = new GetNewOptimizationItemDataRequest();
        return TeaModel.build(map, self);
    }

    public GetNewOptimizationItemDataRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetNewOptimizationItemDataRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
