// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class PartitionSpec extends TeaModel {
    @NameInMap("SharedSDPartitions")
    public java.util.List<Partition> sharedSDPartitions;

    @NameInMap("SharedStorageDescriptor")
    public PartitionSpecSharedStorageDescriptor sharedStorageDescriptor;

    public static PartitionSpec build(java.util.Map<String, ?> map) throws Exception {
        PartitionSpec self = new PartitionSpec();
        return TeaModel.build(map, self);
    }

    public PartitionSpec setSharedSDPartitions(java.util.List<Partition> sharedSDPartitions) {
        this.sharedSDPartitions = sharedSDPartitions;
        return this;
    }
    public java.util.List<Partition> getSharedSDPartitions() {
        return this.sharedSDPartitions;
    }

    public PartitionSpec setSharedStorageDescriptor(PartitionSpecSharedStorageDescriptor sharedStorageDescriptor) {
        this.sharedStorageDescriptor = sharedStorageDescriptor;
        return this;
    }
    public PartitionSpecSharedStorageDescriptor getSharedStorageDescriptor() {
        return this.sharedStorageDescriptor;
    }

    public static class PartitionSpecSharedStorageDescriptor extends TeaModel {
        @NameInMap("Cols")
        public java.util.List<FieldSchema> cols;

        /**
         * <strong>example:</strong>
         * <p>相对路径</p>
         */
        @NameInMap("Location")
        public String location;

        public static PartitionSpecSharedStorageDescriptor build(java.util.Map<String, ?> map) throws Exception {
            PartitionSpecSharedStorageDescriptor self = new PartitionSpecSharedStorageDescriptor();
            return TeaModel.build(map, self);
        }

        public PartitionSpecSharedStorageDescriptor setCols(java.util.List<FieldSchema> cols) {
            this.cols = cols;
            return this;
        }
        public java.util.List<FieldSchema> getCols() {
            return this.cols;
        }

        public PartitionSpecSharedStorageDescriptor setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

    }

}
