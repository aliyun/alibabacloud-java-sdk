// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class DetachSharedStoragesRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The information about mounted shared storage resources.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SharedStorages")
    public java.util.List<DetachSharedStoragesRequestSharedStorages> sharedStorages;

    public static DetachSharedStoragesRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachSharedStoragesRequest self = new DetachSharedStoragesRequest();
        return TeaModel.build(map, self);
    }

    public DetachSharedStoragesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DetachSharedStoragesRequest setSharedStorages(java.util.List<DetachSharedStoragesRequestSharedStorages> sharedStorages) {
        this.sharedStorages = sharedStorages;
        return this;
    }
    public java.util.List<DetachSharedStoragesRequestSharedStorages> getSharedStorages() {
        return this.sharedStorages;
    }

    public static class DetachSharedStoragesRequestSharedStorages extends TeaModel {
        /**
         * <p>The local mount directory of the mounted file system.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/test</p>
         */
        @NameInMap("MountDirectory")
        public String mountDirectory;

        public static DetachSharedStoragesRequestSharedStorages build(java.util.Map<String, ?> map) throws Exception {
            DetachSharedStoragesRequestSharedStorages self = new DetachSharedStoragesRequestSharedStorages();
            return TeaModel.build(map, self);
        }

        public DetachSharedStoragesRequestSharedStorages setMountDirectory(String mountDirectory) {
            this.mountDirectory = mountDirectory;
            return this;
        }
        public String getMountDirectory() {
            return this.mountDirectory;
        }

    }

}
