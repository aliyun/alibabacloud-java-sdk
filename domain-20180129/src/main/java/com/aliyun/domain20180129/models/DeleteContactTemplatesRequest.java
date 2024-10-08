// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class DeleteContactTemplatesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegistrantProfileIds")
    public String registrantProfileIds;

    /**
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    public static DeleteContactTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteContactTemplatesRequest self = new DeleteContactTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteContactTemplatesRequest setRegistrantProfileIds(String registrantProfileIds) {
        this.registrantProfileIds = registrantProfileIds;
        return this;
    }
    public String getRegistrantProfileIds() {
        return this.registrantProfileIds;
    }

    public DeleteContactTemplatesRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
