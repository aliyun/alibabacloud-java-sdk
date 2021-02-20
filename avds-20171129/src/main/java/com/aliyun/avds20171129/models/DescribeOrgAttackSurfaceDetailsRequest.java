// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeOrgAttackSurfaceDetailsRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("RecordId")
    public Integer recordId;

    @NameInMap("OrgId")
    public Integer orgId;

    @NameInMap("Source")
    public String source;

    public static DescribeOrgAttackSurfaceDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrgAttackSurfaceDetailsRequest self = new DescribeOrgAttackSurfaceDetailsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOrgAttackSurfaceDetailsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeOrgAttackSurfaceDetailsRequest setRecordId(Integer recordId) {
        this.recordId = recordId;
        return this;
    }
    public Integer getRecordId() {
        return this.recordId;
    }

    public DescribeOrgAttackSurfaceDetailsRequest setOrgId(Integer orgId) {
        this.orgId = orgId;
        return this;
    }
    public Integer getOrgId() {
        return this.orgId;
    }

    public DescribeOrgAttackSurfaceDetailsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
