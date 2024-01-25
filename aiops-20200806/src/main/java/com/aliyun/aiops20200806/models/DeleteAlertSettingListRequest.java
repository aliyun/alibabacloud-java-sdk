// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DeleteAlertSettingListRequest extends TeaModel {
    @NameInMap("CustomerIdsJson")
    public String customerIdsJson;

    @NameInMap("OperaUid")
    public String operaUid;

    public static DeleteAlertSettingListRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertSettingListRequest self = new DeleteAlertSettingListRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlertSettingListRequest setCustomerIdsJson(String customerIdsJson) {
        this.customerIdsJson = customerIdsJson;
        return this;
    }
    public String getCustomerIdsJson() {
        return this.customerIdsJson;
    }

    public DeleteAlertSettingListRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
