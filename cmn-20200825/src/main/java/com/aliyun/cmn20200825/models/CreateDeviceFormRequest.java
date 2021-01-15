// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateDeviceFormRequest extends TeaModel {
    // 设备形态名称
    @NameInMap("DeviceFormName")
    public String deviceFormName;

    // 是否支持配置生成
    @NameInMap("ConfigCompare")
    public Boolean configCompare;

    // 是否需要账号配置
    @NameInMap("AccountConfig")
    public Boolean accountConfig;

    // 是否展示设备详情
    @NameInMap("DetailDisplay")
    public Boolean detailDisplay;

    // 设备形态的主键
    @NameInMap("UniqueKey")
    public String uniqueKey;

    // 幂等校验 token
    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateDeviceFormRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceFormRequest self = new CreateDeviceFormRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeviceFormRequest setDeviceFormName(String deviceFormName) {
        this.deviceFormName = deviceFormName;
        return this;
    }
    public String getDeviceFormName() {
        return this.deviceFormName;
    }

    public CreateDeviceFormRequest setConfigCompare(Boolean configCompare) {
        this.configCompare = configCompare;
        return this;
    }
    public Boolean getConfigCompare() {
        return this.configCompare;
    }

    public CreateDeviceFormRequest setAccountConfig(Boolean accountConfig) {
        this.accountConfig = accountConfig;
        return this;
    }
    public Boolean getAccountConfig() {
        return this.accountConfig;
    }

    public CreateDeviceFormRequest setDetailDisplay(Boolean detailDisplay) {
        this.detailDisplay = detailDisplay;
        return this;
    }
    public Boolean getDetailDisplay() {
        return this.detailDisplay;
    }

    public CreateDeviceFormRequest setUniqueKey(String uniqueKey) {
        this.uniqueKey = uniqueKey;
        return this;
    }
    public String getUniqueKey() {
        return this.uniqueKey;
    }

    public CreateDeviceFormRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
