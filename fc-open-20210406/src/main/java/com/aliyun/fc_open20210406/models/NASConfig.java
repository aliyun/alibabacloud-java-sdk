// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class NASConfig extends TeaModel {
    @NameInMap("groupId")
    public Integer groupId;

    @NameInMap("mountPoints")
    public java.util.List<NASConfigMountPoints> mountPoints;

    @NameInMap("userId")
    public Integer userId;

    public static NASConfig build(java.util.Map<String, ?> map) throws Exception {
        NASConfig self = new NASConfig();
        return TeaModel.build(map, self);
    }

    public NASConfig setGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }
    public Integer getGroupId() {
        return this.groupId;
    }

    public NASConfig setMountPoints(java.util.List<NASConfigMountPoints> mountPoints) {
        this.mountPoints = mountPoints;
        return this;
    }
    public java.util.List<NASConfigMountPoints> getMountPoints() {
        return this.mountPoints;
    }

    public NASConfig setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }
    public Integer getUserId() {
        return this.userId;
    }

    public static class NASConfigMountPoints extends TeaModel {
        @NameInMap("enableTLS")
        public Boolean enableTLS;

        @NameInMap("mountDir")
        public String mountDir;

        @NameInMap("serverAddr")
        public String serverAddr;

        public static NASConfigMountPoints build(java.util.Map<String, ?> map) throws Exception {
            NASConfigMountPoints self = new NASConfigMountPoints();
            return TeaModel.build(map, self);
        }

        public NASConfigMountPoints setEnableTLS(Boolean enableTLS) {
            this.enableTLS = enableTLS;
            return this;
        }
        public Boolean getEnableTLS() {
            return this.enableTLS;
        }

        public NASConfigMountPoints setMountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }
        public String getMountDir() {
            return this.mountDir;
        }

        public NASConfigMountPoints setServerAddr(String serverAddr) {
            this.serverAddr = serverAddr;
            return this;
        }
        public String getServerAddr() {
            return this.serverAddr;
        }

    }

}
