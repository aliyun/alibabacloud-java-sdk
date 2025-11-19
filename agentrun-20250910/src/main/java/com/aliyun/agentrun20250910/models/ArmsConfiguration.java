// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ArmsConfiguration extends TeaModel {
    /**
     * <p>应用实时监控服务（ARMS）的许可证密钥</p>
     * 
     * <strong>example:</strong>
     * <p>arms-license-key-123456</p>
     */
    @NameInMap("armsLicenseKey")
    public String armsLicenseKey;

    /**
     * <p>是否启用应用实时监控服务（ARMS）</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableArms")
    public Boolean enableArms;

    public static ArmsConfiguration build(java.util.Map<String, ?> map) throws Exception {
        ArmsConfiguration self = new ArmsConfiguration();
        return TeaModel.build(map, self);
    }

    public ArmsConfiguration setArmsLicenseKey(String armsLicenseKey) {
        this.armsLicenseKey = armsLicenseKey;
        return this;
    }
    public String getArmsLicenseKey() {
        return this.armsLicenseKey;
    }

    public ArmsConfiguration setEnableArms(Boolean enableArms) {
        this.enableArms = enableArms;
        return this;
    }
    public Boolean getEnableArms() {
        return this.enableArms;
    }

}
