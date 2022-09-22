// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeInstanceNeedRebootResponseBody extends TeaModel {
    @NameInMap("InstanceInfo")
    public InstanceInfo instanceInfo;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeInstanceNeedRebootResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceNeedRebootResponseBody self = new DescribeInstanceNeedRebootResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceNeedRebootResponseBody setInstanceInfo(InstanceInfo instanceInfo) {
        this.instanceInfo = instanceInfo;
        return this;
    }
    public InstanceInfo getInstanceInfo() {
        return this.instanceInfo;
    }

    public DescribeInstanceNeedRebootResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstanceNeedRebootResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstanceNeedRebootResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceNeedRebootResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class InstanceInfo extends TeaModel {
        @NameInMap("InstanceInfo")
        public java.util.List<String> instanceInfo;

        public static InstanceInfo build(java.util.Map<String, ?> map) throws Exception {
            InstanceInfo self = new InstanceInfo();
            return TeaModel.build(map, self);
        }

        public InstanceInfo setInstanceInfo(java.util.List<String> instanceInfo) {
            this.instanceInfo = instanceInfo;
            return this;
        }
        public java.util.List<String> getInstanceInfo() {
            return this.instanceInfo;
        }

    }

}
