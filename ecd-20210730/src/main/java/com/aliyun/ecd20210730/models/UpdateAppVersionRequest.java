// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210730.models;

import com.aliyun.tea.*;

public class UpdateAppVersionRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Name")
    public String name;

    @NameInMap("Number")
    public String number;

    public static UpdateAppVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppVersionRequest self = new UpdateAppVersionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppVersionRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public UpdateAppVersionRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateAppVersionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAppVersionRequest setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

}
