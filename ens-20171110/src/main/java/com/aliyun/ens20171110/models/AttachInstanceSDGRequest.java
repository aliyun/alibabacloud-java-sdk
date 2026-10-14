// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AttachInstanceSDGRequest extends TeaModel {
    /**
     * <p>The cloud disk access protocol type. Valid values:</p>
     * <ul>
     * <li><p>iscsi: the default protocol for standard cloud disks. Both rbd cloud disks and standard cloud disks support this protocol.</p>
     * </li>
     * <li><p>rbd: the default protocol for rbd cloud disks. Only rbd cloud disks support this mount protocol.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>iscsi</p>
     */
    @NameInMap("DiskAccessProtocol")
    public String diskAccessProtocol;

    /**
     * <p>The type of the shared cloud disk to be created. Valid values:</p>
     * <ul>
     * <li>standard: standard cloud disk.</li>
     * <li>rbd: rbd cloud disk.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If no shared cloud disk type is specified, a standard cloud disk is created by default.</li>
     * <li>An rbd shared cloud disk can be created only when the parent disk type is rbd.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("DiskType")
    public String diskType;

    /**
     * <p>The list of instance IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>The file loading rate optimization parameter.</p>
     */
    @NameInMap("LoadOpt")
    public AttachInstanceSDGRequestLoadOpt loadOpt;

    /**
     * <p>The ID of the SDG.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sdg-xxxx</p>
     */
    @NameInMap("SDGId")
    public String SDGId;

    public static AttachInstanceSDGRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachInstanceSDGRequest self = new AttachInstanceSDGRequest();
        return TeaModel.build(map, self);
    }

    public AttachInstanceSDGRequest setDiskAccessProtocol(String diskAccessProtocol) {
        this.diskAccessProtocol = diskAccessProtocol;
        return this;
    }
    public String getDiskAccessProtocol() {
        return this.diskAccessProtocol;
    }

    public AttachInstanceSDGRequest setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public AttachInstanceSDGRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public AttachInstanceSDGRequest setLoadOpt(AttachInstanceSDGRequestLoadOpt loadOpt) {
        this.loadOpt = loadOpt;
        return this;
    }
    public AttachInstanceSDGRequestLoadOpt getLoadOpt() {
        return this.loadOpt;
    }

    public AttachInstanceSDGRequest setSDGId(String SDGId) {
        this.SDGId = SDGId;
        return this;
    }
    public String getSDGId() {
        return this.SDGId;
    }

    public static class AttachInstanceSDGRequestLoadOpt extends TeaModel {
        /**
         * <p>Specifies whether to enable block device read/write splitting. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BlockRwSplit")
        public Boolean blockRwSplit;

        /**
         * <p>The size for block device read/write splitting, in GiB. A value of 0 indicates that the default size is used.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("BlockRwSplitSize")
        public Integer blockRwSplitSize;

        /**
         * <p>Specifies whether to enable caching. Block device read/write splitting must be enabled before caching can be used. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Cache")
        public Boolean cache;

        /**
         * <p>The cache size, in GiB. A value of 0 indicates that the default size is used.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("CacheSize")
        public Integer cacheSize;

        public static AttachInstanceSDGRequestLoadOpt build(java.util.Map<String, ?> map) throws Exception {
            AttachInstanceSDGRequestLoadOpt self = new AttachInstanceSDGRequestLoadOpt();
            return TeaModel.build(map, self);
        }

        public AttachInstanceSDGRequestLoadOpt setBlockRwSplit(Boolean blockRwSplit) {
            this.blockRwSplit = blockRwSplit;
            return this;
        }
        public Boolean getBlockRwSplit() {
            return this.blockRwSplit;
        }

        public AttachInstanceSDGRequestLoadOpt setBlockRwSplitSize(Integer blockRwSplitSize) {
            this.blockRwSplitSize = blockRwSplitSize;
            return this;
        }
        public Integer getBlockRwSplitSize() {
            return this.blockRwSplitSize;
        }

        public AttachInstanceSDGRequestLoadOpt setCache(Boolean cache) {
            this.cache = cache;
            return this;
        }
        public Boolean getCache() {
            return this.cache;
        }

        public AttachInstanceSDGRequestLoadOpt setCacheSize(Integer cacheSize) {
            this.cacheSize = cacheSize;
            return this;
        }
        public Integer getCacheSize() {
            return this.cacheSize;
        }

    }

}
