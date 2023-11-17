// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630.models;

import com.aliyun.tea.*;

public class ListBindingDeviceByAccountRequest extends TeaModel {
    @NameInMap("IdentityId")
    public String identityId;

    @NameInMap("OpenId")
    public String openId;

    @NameInMap("OpenIdAppKey")
    public String openIdAppKey;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SubDevice")
    public Boolean subDevice;

    public static ListBindingDeviceByAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBindingDeviceByAccountRequest self = new ListBindingDeviceByAccountRequest();
        return TeaModel.build(map, self);
    }

    public ListBindingDeviceByAccountRequest setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public ListBindingDeviceByAccountRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public ListBindingDeviceByAccountRequest setOpenIdAppKey(String openIdAppKey) {
        this.openIdAppKey = openIdAppKey;
        return this;
    }
    public String getOpenIdAppKey() {
        return this.openIdAppKey;
    }

    public ListBindingDeviceByAccountRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public ListBindingDeviceByAccountRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBindingDeviceByAccountRequest setSubDevice(Boolean subDevice) {
        this.subDevice = subDevice;
        return this;
    }
    public Boolean getSubDevice() {
        return this.subDevice;
    }

}
