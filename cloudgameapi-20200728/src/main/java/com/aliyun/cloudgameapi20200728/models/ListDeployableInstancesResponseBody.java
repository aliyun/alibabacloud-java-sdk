// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class ListDeployableInstancesResponseBody extends TeaModel {
    // TotalCount本次请求条件下的数据总量，此参数为可选参数，默认可不返回
    @NameInMap("TotalCount")
    public Long totalCount;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 表示当前调用返回读取到的位置，空代表数据已经读取完毕
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // MaxResults本次请求所返回的最大记录条数
    @NameInMap("PageSize")
    public Integer pageSize;

    // 数据列表
    @NameInMap("DataList")
    public java.util.List<ListDeployableInstancesResponseBodyDataList> dataList;

    public static ListDeployableInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeployableInstancesResponseBody self = new ListDeployableInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeployableInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListDeployableInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public ListDeployableInstancesResponseBody setDataList(java.util.List<ListDeployableInstancesResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<ListDeployableInstancesResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public static class ListDeployableInstancesResponseBodyDataList extends TeaModel {
        // 实例ID
        @NameInMap("CloudGameInstanceId")
        public String cloudGameInstanceId;

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

    }

}
