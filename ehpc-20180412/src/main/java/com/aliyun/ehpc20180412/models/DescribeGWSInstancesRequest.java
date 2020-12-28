// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeGWSInstancesRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("UserUid")
    public Long userUid;

    @NameInMap("UserName")
    public String userName;

    public static DescribeGWSInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGWSInstancesRequest self = new DescribeGWSInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGWSInstancesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeGWSInstancesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeGWSInstancesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGWSInstancesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGWSInstancesRequest setUserUid(Long userUid) {
        this.userUid = userUid;
        return this;
    }
    public Long getUserUid() {
        return this.userUid;
    }

    public DescribeGWSInstancesRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
