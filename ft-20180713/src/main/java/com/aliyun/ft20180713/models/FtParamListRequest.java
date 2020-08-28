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

    }

}
