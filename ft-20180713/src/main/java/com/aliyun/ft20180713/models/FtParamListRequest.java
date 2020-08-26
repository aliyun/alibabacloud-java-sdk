// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ft20180713.models;

import com.aliyun.tea.*;

public class FtParamListRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("Disk")
    public java.util.List<FtParamListRequestDisk> disk;

    public static FtParamListRequest build(java.util.Map<String, ?> map) throws Exception {
        FtParamListRequest self = new FtParamListRequest();
        return TeaModel.build(map, self);
    }

    public FtParamListRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FtParamListRequest setDisk(java.util.List<FtParamListRequestDisk> disk) {
        this.disk = disk;
        return this;
    }
    public java.util.List<FtParamListRequestDisk> getDisk() {
        return this.disk;
    }

    public static class FtParamListRequestDisk extends TeaModel {
        @NameInMap("Size")
        @Validation(required = true)
        public java.util.List<String> size;

        @NameInMap("Type")
        @Validation(required = true)
        public java.util.List<String> type;

        public static FtParamListRequestDisk build(java.util.Map<String, ?> map) throws Exception {
            FtParamListRequestDisk self = new FtParamListRequestDisk();
            return TeaModel.build(map, self);
        }

        public FtParamListRequestDisk setSize(java.util.List<String> size) {
            this.size = size;
            return this;
        }
        public java.util.List<String> getSize() {
            return this.size;
        }

        public FtParamListRequestDisk setType(java.util.List<String> type) {
            this.type = type;
            return this;
        }
        public java.util.List<String> getType() {
            return this.type;
        }

    }

}
