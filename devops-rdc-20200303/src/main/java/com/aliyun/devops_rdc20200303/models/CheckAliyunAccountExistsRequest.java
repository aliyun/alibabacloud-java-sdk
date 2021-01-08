// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class CheckAliyunAccountExistsRequest extends TeaModel {
    @NameInMap("UserPk")
    public String userPk;

    public static CheckAliyunAccountExistsRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAliyunAccountExistsRequest self = new CheckAliyunAccountExistsRequest();
        return TeaModel.build(map, self);
    }

    public CheckAliyunAccountExistsRequest setUserPk(String userPk) {
        this.userPk = userPk;
        return this;
    }
    public String getUserPk() {
        return this.userPk;
    }

}
