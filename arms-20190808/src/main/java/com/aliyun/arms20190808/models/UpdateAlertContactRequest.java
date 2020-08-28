// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateAlertContactRequest extends TeaModel {
    @NameInMap("ContactName")
    public String contactName;

    @NameInMap("PhoneNum")
    public String phoneNum;

    @NameInMap("Email")
    public String email;

    @NameInMap("DingRobotWebhookUrl")
    public String dingRobotWebhookUrl;

    @NameInMap("SystemNoc")
    public Boolean systemNoc;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ProxyUserId")
    public String proxyUserId;

    @NameInMap("ContactId")
    @Validation(required = true)
    public Long contactId;

    public static UpdateAlertContactRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertContactRequest self = new UpdateAlertContactRequest();
        return TeaModel.build(map, self);
    }

}
