// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceGroupByTagsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Page")
    @Validation(required = true)
    public Integer page;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("PageCount")
    @Validation(required = true)
    public Integer pageCount;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryDeviceGroupByTagsResponseData data;

    public static QueryDeviceGroupByTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceGroupByTagsResponse self = new QueryDeviceGroupByTagsResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeviceGroupByTagsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceGroupByTagsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceGroupByTagsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceGroupByTagsResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceGroupByTagsResponse setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public QueryDeviceGroupByTagsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDeviceGroupByTagsResponse setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public QueryDeviceGroupByTagsResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public QueryDeviceGroupByTagsResponse setData(QueryDeviceGroupByTagsResponseData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceGroupByTagsResponseData getData() {
        return this.data;
    }

    public static class QueryDeviceGroupByTagsResponseDataDeviceGroup extends TeaModel {
        @NameInMap("GroupId")
        @Validation(required = true)
        public String groupId;

        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        public static QueryDeviceGroupByTagsResponseDataDeviceGroup build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceGroupByTagsResponseDataDeviceGroup self = new QueryDeviceGroupByTagsResponseDataDeviceGroup();
            return TeaModel.build(map, self);
        }

        public QueryDeviceGroupByTagsResponseDataDeviceGroup setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QueryDeviceGroupByTagsResponseDataDeviceGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

    public static class QueryDeviceGroupByTagsResponseData extends TeaModel {
        @NameInMap("DeviceGroup")
        @Validation(required = true)
        public java.util.List<QueryDeviceGroupByTagsResponseDataDeviceGroup> deviceGroup;

        public static QueryDeviceGroupByTagsResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceGroupByTagsResponseData self = new QueryDeviceGroupByTagsResponseData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceGroupByTagsResponseData setDeviceGroup(java.util.List<QueryDeviceGroupByTagsResponseDataDeviceGroup> deviceGroup) {
            this.deviceGroup = deviceGroup;
            return this;
        }
        public java.util.List<QueryDeviceGroupByTagsResponseDataDeviceGroup> getDeviceGroup() {
            return this.deviceGroup;
        }

    }

}
