// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class PutAlertSettingListRequest extends TeaModel {
    @NameInMap("AlertSettingEditRequestListJson")
    public String alertSettingEditRequestListJson;

    @NameInMap("ContactGroupIdsJson")
    public String contactGroupIdsJson;

    @NameInMap("ContactIdsJson")
    public String contactIdsJson;

    public static PutAlertSettingListRequest build(java.util.Map<String, ?> map) throws Exception {
        PutAlertSettingListRequest self = new PutAlertSettingListRequest();
        return TeaModel.build(map, self);
    }

    public PutAlertSettingListRequest setAlertSettingEditRequestListJson(String alertSettingEditRequestListJson) {
        this.alertSettingEditRequestListJson = alertSettingEditRequestListJson;
        return this;
    }
    public String getAlertSettingEditRequestListJson() {
        return this.alertSettingEditRequestListJson;
    }

    public PutAlertSettingListRequest setContactGroupIdsJson(String contactGroupIdsJson) {
        this.contactGroupIdsJson = contactGroupIdsJson;
        return this;
    }
    public String getContactGroupIdsJson() {
        return this.contactGroupIdsJson;
    }

    public PutAlertSettingListRequest setContactIdsJson(String contactIdsJson) {
        this.contactIdsJson = contactIdsJson;
        return this;
    }
    public String getContactIdsJson() {
        return this.contactIdsJson;
    }

}
