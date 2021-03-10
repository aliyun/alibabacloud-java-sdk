// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceGroupByTagsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Page")
    public Integer page;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageCount")
    public Integer pageCount;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("Data")
    public QueryDeviceGroupByTagsResponseBodyData data;

    public static QueryDeviceGroupByTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceGroupByTagsResponseBody self = new QueryDeviceGroupByTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceGroupByTagsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDeviceGroupByTagsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeviceGroupByTagsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceGroupByTagsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryDeviceGroupByTagsResponseBody setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public QueryDeviceGroupByTagsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDeviceGroupByTagsResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public QueryDeviceGroupByTagsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public QueryDeviceGroupByTagsResponseBody setData(QueryDeviceGroupByTagsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceGroupByTagsResponseBodyData getData() {
        return this.data;
    }

    public static class QueryDeviceGroupByTagsResponseBodyDataDeviceGroup extends TeaModel {
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        public static QueryDeviceGroupByTagsResponseBodyDataDeviceGroup build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceGroupByTagsResponseBodyDataDeviceGroup self = new QueryDeviceGroupByTagsResponseBodyDataDeviceGroup();
            return TeaModel.build(map, self);
        }

        public QueryDeviceGroupByTagsResponseBodyDataDeviceGroup setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public QueryDeviceGroupByTagsResponseBodyDataDeviceGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

    public static class QueryDeviceGroupByTagsResponseBodyData extends TeaModel {
        @NameInMap("DeviceGroup")
        public java.util.List<QueryDeviceGroupByTagsResponseBodyDataDeviceGroup> deviceGroup;

        public static QueryDeviceGroupByTagsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDeviceGroupByTagsResponseBodyData self = new QueryDeviceGroupByTagsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDeviceGroupByTagsResponseBodyData setDeviceGroup(java.util.List<QueryDeviceGroupByTagsResponseBodyDataDeviceGroup> deviceGroup) {
            this.deviceGroup = deviceGroup;
            return this;
        }
        public java.util.List<QueryDeviceGroupByTagsResponseBodyDataDeviceGroup> getDeviceGroup() {
            return this.deviceGroup;
        }

    }

}
