// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class ListDeployableInstancesResponse extends TeaModel {
    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("DataList")
    @Validation(required = true)
    public java.util.List<ListDeployableInstancesResponseDataList> dataList;

    public static ListDeployableInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeployableInstancesResponse self = new ListDeployableInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ListDeployableInstancesResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListDeployableInstancesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeployableInstancesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDeployableInstancesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDeployableInstancesResponse setDataList(java.util.List<ListDeployableInstancesResponseDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<ListDeployableInstancesResponseDataList> getDataList() {
        return this.dataList;
    }

    public static class ListDeployableInstancesResponseDataList extends TeaModel {
        @NameInMap("CloudGameInstanceId")
        @Validation(required = true)
        public String cloudGameInstanceId;

        public static ListDeployableInstancesResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            ListDeployableInstancesResponseDataList self = new ListDeployableInstancesResponseDataList();
            return TeaModel.build(map, self);
        }

        public ListDeployableInstancesResponseDataList setCloudGameInstanceId(String cloudGameInstanceId) {
            this.cloudGameInstanceId = cloudGameInstanceId;
            return this;
        }
        public String getCloudGameInstanceId() {
            return this.cloudGameInstanceId;
        }

    }

}
