// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class ListDeployableInstancesResponseBody extends TeaModel {
    @NameInMap("DataList")
    public java.util.List<ListDeployableInstancesResponseBodyDataList> dataList;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListDeployableInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeployableInstancesResponseBody self = new ListDeployableInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeployableInstancesResponseBody setDataList(java.util.List<ListDeployableInstancesResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<ListDeployableInstancesResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public ListDeployableInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDeployableInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDeployableInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeployableInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListDeployableInstancesResponseBodyDataList extends TeaModel {
        @NameInMap("CloudGameInstanceId")
        public String cloudGameInstanceId;

        @NameInMap("CloudGameInstanceName")
        public String cloudGameInstanceName;

        public static ListDeployableInstancesResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListDeployableInstancesResponseBodyDataList self = new ListDeployableInstancesResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListDeployableInstancesResponseBodyDataList setCloudGameInstanceId(String cloudGameInstanceId) {
            this.cloudGameInstanceId = cloudGameInstanceId;
            return this;
        }
        public String getCloudGameInstanceId() {
            return this.cloudGameInstanceId;
        }

        public ListDeployableInstancesResponseBodyDataList setCloudGameInstanceName(String cloudGameInstanceName) {
            this.cloudGameInstanceName = cloudGameInstanceName;
            return this;
        }
        public String getCloudGameInstanceName() {
            return this.cloudGameInstanceName;
        }

    }

}
