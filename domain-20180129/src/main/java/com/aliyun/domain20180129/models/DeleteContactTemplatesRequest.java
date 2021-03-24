// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class DeleteContactTemplatesRequest extends TeaModel {
    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("RegistrantProfileIds")
    public String registrantProfileIds;

    public static DeleteContactTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteContactTemplatesRequest self = new DeleteContactTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteContactTemplatesRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public DeleteContactTemplatesRequest setRegistrantProfileIds(String registrantProfileIds) {
        this.registrantProfileIds = registrantProfileIds;
        return this;
    }
    public String getRegistrantProfileIds() {
        return this.registrantProfileIds;
    }

}
