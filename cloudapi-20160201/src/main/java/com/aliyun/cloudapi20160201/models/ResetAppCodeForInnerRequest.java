// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class ResetAppCodeForInnerRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("NewAppCode")
    public String newAppCode;

    public static ResetAppCodeForInnerRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetAppCodeForInnerRequest self = new ResetAppCodeForInnerRequest();
        return TeaModel.build(map, self);
    }

    public ResetAppCodeForInnerRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public ResetAppCodeForInnerRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public ResetAppCodeForInnerRequest setNewAppCode(String newAppCode) {
        this.newAppCode = newAppCode;
        return this;
    }
    public String getNewAppCode() {
        return this.newAppCode;
    }

}
