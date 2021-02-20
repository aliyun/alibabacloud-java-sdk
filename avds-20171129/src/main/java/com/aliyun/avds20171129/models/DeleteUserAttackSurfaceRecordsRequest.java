// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DeleteUserAttackSurfaceRecordsRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Source")
    public String source;

    @NameInMap("Records")
    public java.util.List<Integer> records;

    public static DeleteUserAttackSurfaceRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserAttackSurfaceRecordsRequest self = new DeleteUserAttackSurfaceRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserAttackSurfaceRecordsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DeleteUserAttackSurfaceRecordsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DeleteUserAttackSurfaceRecordsRequest setRecords(java.util.List<Integer> records) {
        this.records = records;
        return this;
    }
    public java.util.List<Integer> getRecords() {
        return this.records;
    }

}
