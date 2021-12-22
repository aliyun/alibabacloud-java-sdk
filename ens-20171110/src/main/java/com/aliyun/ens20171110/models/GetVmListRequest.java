// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class GetVmListRequest extends TeaModel {
    @NameInMap("AliUid")
    public Long aliUid;

    @NameInMap("GroupUuid")
    public String groupUuid;

    @NameInMap("InstanceUuid")
    public String instanceUuid;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("WorkloadUuid")
    public String workloadUuid;

    public static GetVmListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVmListRequest self = new GetVmListRequest();
        return TeaModel.build(map, self);
    }

    public GetVmListRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public GetVmListRequest setGroupUuid(String groupUuid) {
        this.groupUuid = groupUuid;
        return this;
    }
    public String getGroupUuid() {
        return this.groupUuid;
    }

    public GetVmListRequest setInstanceUuid(String instanceUuid) {
        this.instanceUuid = instanceUuid;
        return this;
    }
    public String getInstanceUuid() {
        return this.instanceUuid;
    }

    public GetVmListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetVmListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetVmListRequest setWorkloadUuid(String workloadUuid) {
        this.workloadUuid = workloadUuid;
        return this;
    }
    public String getWorkloadUuid() {
        return this.workloadUuid;
    }

}
