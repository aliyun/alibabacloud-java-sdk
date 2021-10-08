// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DeleteAlertSettingListRequest extends TeaModel {
    @NameInMap("CustomerIdsJson")
    public String customerIdsJson;

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

}
