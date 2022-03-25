// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ScanDataQueryProjectRequest extends TeaModel {
    // 业务幂等ID，用于防止重复请求，写操作必传
    @NameInMap("BizOrderNo")
    public String bizOrderNo;

    // 查询的项目ID
    @NameInMap("ProjectId")
    public Long projectId;

    // 数据源，目前只有3VJIA，需要新增请联系接口owner
    @NameInMap("Source")
    public String source;

    public static ScanDataQueryProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        ScanDataQueryProjectRequest self = new ScanDataQueryProjectRequest();
        return TeaModel.build(map, self);
    }

    public ScanDataQueryProjectRequest setBizOrderNo(String bizOrderNo) {
        this.bizOrderNo = bizOrderNo;
        return this;
    }
    public String getBizOrderNo() {
        return this.bizOrderNo;
    }

    public ScanDataQueryProjectRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ScanDataQueryProjectRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
