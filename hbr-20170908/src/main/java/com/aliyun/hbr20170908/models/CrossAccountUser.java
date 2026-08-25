// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CrossAccountUser extends TeaModel {
    @NameInMap("CrossAccountRoleName")
    public String crossAccountRoleName;

    @NameInMap("CrossAccountType")
    public String crossAccountType;

    @NameInMap("CrossAccountUserId")
    public Long crossAccountUserId;

    public static CrossAccountUser build(java.util.Map<String, ?> map) throws Exception {
        CrossAccountUser self = new CrossAccountUser();
        return TeaModel.build(map, self);
    }

    public CrossAccountUser setCrossAccountRoleName(String crossAccountRoleName) {
        this.crossAccountRoleName = crossAccountRoleName;
        return this;
    }
    public String getCrossAccountRoleName() {
        return this.crossAccountRoleName;
    }

    public CrossAccountUser setCrossAccountType(String crossAccountType) {
        this.crossAccountType = crossAccountType;
        return this;
    }
    public String getCrossAccountType() {
        return this.crossAccountType;
    }

    public CrossAccountUser setCrossAccountUserId(Long crossAccountUserId) {
        this.crossAccountUserId = crossAccountUserId;
        return this;
    }
    public Long getCrossAccountUserId() {
        return this.crossAccountUserId;
    }

}
