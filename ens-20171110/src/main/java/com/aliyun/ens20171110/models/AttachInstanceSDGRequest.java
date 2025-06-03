// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AttachInstanceSDGRequest extends TeaModel {
    /**
     * <p>The IDs of the instances.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

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
        @NameInMap("BlockRwSplit")
        public Boolean blockRwSplit;

        @NameInMap("BlockRwSplitSize")
        public Integer blockRwSplitSize;

        @NameInMap("Cache")
        public Boolean cache;

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
