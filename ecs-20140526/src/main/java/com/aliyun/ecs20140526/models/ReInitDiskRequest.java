// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReInitDiskRequest extends TeaModel {
    @NameInMap("DiskId")
    @Validation(required = true)
    public String diskId;

    @NameInMap("Password")
    public String password;

    @NameInMap("KeyPairName")
    public String keyPairName;

    @NameInMap("AutoStartInstance")
    public Boolean autoStartInstance;

    @NameInMap("SecurityEnhancementStrategy")
    public String securityEnhancementStrategy;

    public static ReInitDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        ReInitDiskRequest self = new ReInitDiskRequest();
        return TeaModel.build(map, self);
    }

    public ReInitDiskRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public ReInitDiskRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ReInitDiskRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public ReInitDiskRequest setAutoStartInstance(Boolean autoStartInstance) {
        this.autoStartInstance = autoStartInstance;
        return this;
    }
    public Boolean getAutoStartInstance() {
        return this.autoStartInstance;
    }

    public ReInitDiskRequest setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
        this.securityEnhancementStrategy = securityEnhancementStrategy;
        return this;
    }
    public String getSecurityEnhancementStrategy() {
        return this.securityEnhancementStrategy;
    }

}
