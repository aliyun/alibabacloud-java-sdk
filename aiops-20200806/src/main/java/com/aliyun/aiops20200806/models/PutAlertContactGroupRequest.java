// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class PutAlertContactGroupRequest extends TeaModel {
    @NameInMap("AlertContactGroupJson")
    public String alertContactGroupJson;

    @NameInMap("ContactIdsJson")
    public String contactIdsJson;

    @NameInMap("OperaUid")
    public String operaUid;

    public static PutAlertContactGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        PutAlertContactGroupRequest self = new PutAlertContactGroupRequest();
        return TeaModel.build(map, self);
    }

    public PutAlertContactGroupRequest setAlertContactGroupJson(String alertContactGroupJson) {
        this.alertContactGroupJson = alertContactGroupJson;
        return this;
    }
    public String getAlertContactGroupJson() {
        return this.alertContactGroupJson;
    }

    public PutAlertContactGroupRequest setContactIdsJson(String contactIdsJson) {
        this.contactIdsJson = contactIdsJson;
        return this;
    }
    public String getContactIdsJson() {
        return this.contactIdsJson;
    }

    public PutAlertContactGroupRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
