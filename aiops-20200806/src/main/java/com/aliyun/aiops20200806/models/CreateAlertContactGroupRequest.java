// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class CreateAlertContactGroupRequest extends TeaModel {
    @NameInMap("AlertContactGroupJson")
    public String alertContactGroupJson;

    @NameInMap("ContactIdsJson")
    public String contactIdsJson;

    @NameInMap("OperaUid")
    public String operaUid;

    public static CreateAlertContactGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertContactGroupRequest self = new CreateAlertContactGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateAlertContactGroupRequest setAlertContactGroupJson(String alertContactGroupJson) {
        this.alertContactGroupJson = alertContactGroupJson;
        return this;
    }
    public String getAlertContactGroupJson() {
        return this.alertContactGroupJson;
    }

    public CreateAlertContactGroupRequest setContactIdsJson(String contactIdsJson) {
        this.contactIdsJson = contactIdsJson;
        return this;
    }
    public String getContactIdsJson() {
        return this.contactIdsJson;
    }

    public CreateAlertContactGroupRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
