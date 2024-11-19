// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceGroupByTagsResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>iot.system.SystemException</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The group information returned if the call succeeds.</p>
     */
    @NameInMap("Data")
    public QueryDeviceGroupByTagsResponseBodyData data;

    /**
     * <p>The error message returned if the call fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageCount")
    public Integer pageCount;

    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9599EE98-1642-4FCD-BFC4-039E458A4693</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static QueryDeviceGroupByTagsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceGroupByTagsResponseBody self = new QueryDeviceGroupByTagsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDeviceGroupByTagsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeviceGroupByTagsResponseBody setData(QueryDeviceGroupByTagsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryDeviceGroupByTagsResponseBodyData getData() {
        return this.data;
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

    public QueryDeviceGroupByTagsResponseBody setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public Integer getPageCount() {
        return this.pageCount;
    }

    public QueryDeviceGroupByTagsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
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

    public QueryDeviceGroupByTagsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class QueryDeviceGroupByTagsResponseBodyDataDeviceGroup extends TeaModel {
        /**
         * <p>The ID of the group.</p>
         * 
         * <strong>example:</strong>
         * <p>Z0ElGF5aqc0t****</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The name of the group.</p>
         * 
         * <strong>example:</strong>
         * <p>test11</p>
         */
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
