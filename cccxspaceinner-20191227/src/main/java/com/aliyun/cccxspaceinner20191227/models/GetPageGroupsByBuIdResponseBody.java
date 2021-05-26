// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class GetPageGroupsByBuIdResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public GetPageGroupsByBuIdResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetPageGroupsByBuIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPageGroupsByBuIdResponseBody self = new GetPageGroupsByBuIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPageGroupsByBuIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPageGroupsByBuIdResponseBody setData(GetPageGroupsByBuIdResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPageGroupsByBuIdResponseBodyData getData() {
        return this.data;
    }

    public GetPageGroupsByBuIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPageGroupsByBuIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPageGroupsByBuIdResponseBodyDataList extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("BuId")
        public Long buId;

        @NameInMap("ShowName")
        public String showName;

        @NameInMap("Description")
        public String description;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("ChannelType")
        public Integer channelType;

        @NameInMap("DepartmentId")
        public Long departmentId;

        @NameInMap("IsPublic")
        public Boolean isPublic;

        public static GetPageGroupsByBuIdResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetPageGroupsByBuIdResponseBodyDataList self = new GetPageGroupsByBuIdResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetPageGroupsByBuIdResponseBodyDataList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetPageGroupsByBuIdResponseBodyDataList setBuId(Long buId) {
            this.buId = buId;
            return this;
        }
        public Long getBuId() {
            return this.buId;
        }

        public GetPageGroupsByBuIdResponseBodyDataList setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public GetPageGroupsByBuIdResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetPageGroupsByBuIdResponseBodyDataList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetPageGroupsByBuIdResponseBodyDataList setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public GetPageGroupsByBuIdResponseBodyDataList setChannelType(Integer channelType) {
            this.channelType = channelType;
            return this;
        }
        public Integer getChannelType() {
            return this.channelType;
        }

        public GetPageGroupsByBuIdResponseBodyDataList setDepartmentId(Long departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public Long getDepartmentId() {
            return this.departmentId;
        }

        public GetPageGroupsByBuIdResponseBodyDataList setIsPublic(Boolean isPublic) {
            this.isPublic = isPublic;
            return this;
        }
        public Boolean getIsPublic() {
            return this.isPublic;
        }

    }

    public static class GetPageGroupsByBuIdResponseBodyData extends TeaModel {
        @NameInMap("LastSortKey")
        public Long lastSortKey;

        @NameInMap("List")
        public java.util.List<GetPageGroupsByBuIdResponseBodyDataList> list;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("HasNextPage")
        public Boolean hasNextPage;

        public static GetPageGroupsByBuIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPageGroupsByBuIdResponseBodyData self = new GetPageGroupsByBuIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPageGroupsByBuIdResponseBodyData setLastSortKey(Long lastSortKey) {
            this.lastSortKey = lastSortKey;
            return this;
        }
        public Long getLastSortKey() {
            return this.lastSortKey;
        }

        public GetPageGroupsByBuIdResponseBodyData setList(java.util.List<GetPageGroupsByBuIdResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetPageGroupsByBuIdResponseBodyDataList> getList() {
            return this.list;
        }

        public GetPageGroupsByBuIdResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetPageGroupsByBuIdResponseBodyData setHasNextPage(Boolean hasNextPage) {
            this.hasNextPage = hasNextPage;
            return this;
        }
        public Boolean getHasNextPage() {
            return this.hasNextPage;
        }

    }

}
