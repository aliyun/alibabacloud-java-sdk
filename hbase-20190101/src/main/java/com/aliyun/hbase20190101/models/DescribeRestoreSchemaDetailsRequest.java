// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeRestoreSchemaDetailsRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RestoreRecordId")
    public String restoreRecordId;

    public static DescribeRestoreSchemaDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestoreSchemaDetailsRequest self = new DescribeRestoreSchemaDetailsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRestoreSchemaDetailsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeRestoreSchemaDetailsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRestoreSchemaDetailsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRestoreSchemaDetailsRequest setRestoreRecordId(String restoreRecordId) {
        this.restoreRecordId = restoreRecordId;
        return this;
    }
    public String getRestoreRecordId() {
        return this.restoreRecordId;
    }

}
