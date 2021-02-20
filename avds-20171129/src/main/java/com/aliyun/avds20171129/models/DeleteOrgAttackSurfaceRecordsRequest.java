// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DeleteOrgAttackSurfaceRecordsRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Source")
    public String source;

    @NameInMap("OrgId")
    public Integer orgId;

    @NameInMap("Records")
    public java.util.List<Integer> records;

    public static DeleteOrgAttackSurfaceRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOrgAttackSurfaceRecordsRequest self = new DeleteOrgAttackSurfaceRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOrgAttackSurfaceRecordsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DeleteOrgAttackSurfaceRecordsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DeleteOrgAttackSurfaceRecordsRequest setOrgId(Integer orgId) {
        this.orgId = orgId;
        return this;
    }
    public Integer getOrgId() {
        return this.orgId;
    }

    public DeleteOrgAttackSurfaceRecordsRequest setRecords(java.util.List<Integer> records) {
        this.records = records;
        return this;
    }
    public java.util.List<Integer> getRecords() {
        return this.records;
    }

}
