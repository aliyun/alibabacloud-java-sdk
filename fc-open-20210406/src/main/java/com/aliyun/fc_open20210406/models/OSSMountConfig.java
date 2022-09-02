// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class OSSMountConfig extends TeaModel {
    @NameInMap("mountPoints")
    public java.util.List<OSSMountConfigMountPoints> mountPoints;

    public static OSSMountConfig build(java.util.Map<String, ?> map) throws Exception {
        OSSMountConfig self = new OSSMountConfig();
        return TeaModel.build(map, self);
    }

    public OSSMountConfig setMountPoints(java.util.List<OSSMountConfigMountPoints> mountPoints) {
        this.mountPoints = mountPoints;
        return this;
    }
    public java.util.List<OSSMountConfigMountPoints> getMountPoints() {
        return this.mountPoints;
    }

    public static class OSSMountConfigMountPoints extends TeaModel {
        @NameInMap("bucketName")
        public String bucketName;

        @NameInMap("endpoint")
        public String endpoint;

        @NameInMap("mountDir")
        public String mountDir;

        @NameInMap("readOnly")
        public Boolean readOnly;

        public static OSSMountConfigMountPoints build(java.util.Map<String, ?> map) throws Exception {
            OSSMountConfigMountPoints self = new OSSMountConfigMountPoints();
            return TeaModel.build(map, self);
        }

        public OSSMountConfigMountPoints setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public OSSMountConfigMountPoints setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public OSSMountConfigMountPoints setMountDir(String mountDir) {
            this.mountDir = mountDir;
            return this;
        }
        public String getMountDir() {
            return this.mountDir;
        }

        public OSSMountConfigMountPoints setReadOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }
        public Boolean getReadOnly() {
            return this.readOnly;
        }

    }

}
