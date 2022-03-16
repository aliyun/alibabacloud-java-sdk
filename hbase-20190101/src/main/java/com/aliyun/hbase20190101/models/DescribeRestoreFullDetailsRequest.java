// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeRestoreFullDetailsRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RestoreRecordId")
    public String restoreRecordId;

    public static DescribeRestoreFullDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestoreFullDetailsRequest self = new DescribeRestoreFullDetailsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRestoreFullDetailsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeRestoreFullDetailsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRestoreFullDetailsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRestoreFullDetailsRequest setRestoreRecordId(String restoreRecordId) {
        this.restoreRecordId = restoreRecordId;
        return this;
    }
    public String getRestoreRecordId() {
        return this.restoreRecordId;
    }

}
