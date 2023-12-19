// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class OtsDetail extends TeaModel {
    @NameInMap("TableNames")
    public java.util.List<String> tableNames;

    public static OtsDetail build(java.util.Map<String, ?> map) throws Exception {
        OtsDetail self = new OtsDetail();
        return TeaModel.build(map, self);
    }

    public OtsDetail setTableNames(java.util.List<String> tableNames) {
        this.tableNames = tableNames;
        return this;
    }
    public java.util.List<String> getTableNames() {
        return this.tableNames;
    }

}
