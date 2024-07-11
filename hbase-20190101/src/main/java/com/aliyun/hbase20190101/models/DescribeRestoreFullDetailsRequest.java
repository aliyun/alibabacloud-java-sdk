// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeRestoreFullDetailsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-m5eznlga4k5bcxxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020110514xxxx</p>
     */
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
