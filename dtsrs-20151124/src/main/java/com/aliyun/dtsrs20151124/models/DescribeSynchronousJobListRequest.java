// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dtsrs20151124.models;

import com.aliyun.tea.*;

public class DescribeSynchronousJobListRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SynchronousJobName")
    public String synchronousJobName;

    public static DescribeSynchronousJobListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSynchronousJobListRequest self = new DescribeSynchronousJobListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSynchronousJobListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeSynchronousJobListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeSynchronousJobListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSynchronousJobListRequest setSynchronousJobName(String synchronousJobName) {
        this.synchronousJobName = synchronousJobName;
        return this;
    }
    public String getSynchronousJobName() {
        return this.synchronousJobName;
    }

}
