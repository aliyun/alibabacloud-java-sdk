// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class RemoveWhiteListSettingRequest extends TeaModel {
    @NameInMap("Ids")
    public java.util.List<Long> ids;

    /**
     * <strong>example:</strong>
     * <p>antcloudauth</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    public static RemoveWhiteListSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveWhiteListSettingRequest self = new RemoveWhiteListSettingRequest();
        return TeaModel.build(map, self);
    }

    public RemoveWhiteListSettingRequest setIds(java.util.List<Long> ids) {
        this.ids = ids;
        return this;
    }
    public java.util.List<Long> getIds() {
        return this.ids;
    }

    public RemoveWhiteListSettingRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

}
