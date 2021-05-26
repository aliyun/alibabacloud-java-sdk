// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class GetPageGroupsByChannelTypeResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public GetPageGroupsByChannelTypeResponseBodyData data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static GetPageGroupsByChannelTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPageGroupsByChannelTypeResponseBody self = new GetPageGroupsByChannelTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPageGroupsByChannelTypeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPageGroupsByChannelTypeResponseBody setData(GetPageGroupsByChannelTypeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPageGroupsByChannelTypeResponseBodyData getData() {
        return this.data;
    }

    public GetPageGroupsByChannelTypeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPageGroupsByChannelTypeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPageGroupsByChannelTypeResponseBodyDataList extends TeaModel {
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

        public static GetPageGroupsByChannelTypeResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetPageGroupsByChannelTypeResponseBodyDataList self = new GetPageGroupsByChannelTypeResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetPageGroupsByChannelTypeResponseBodyDataList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetPageGroupsByChannelTypeResponseBodyDataList setBuId(Long buId) {
            this.buId = buId;
            return this;
        }
        public Long getBuId() {
            return this.buId;
        }

        public GetPageGroupsByChannelTypeResponseBodyDataList setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public GetPageGroupsByChannelTypeResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetPageGroupsByChannelTypeResponseBodyDataList setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public GetPageGroupsByChannelTypeResponseBodyDataList setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public GetPageGroupsByChannelTypeResponseBodyDataList setChannelType(Integer channelType) {
            this.channelType = channelType;
            return this;
        }
        public Integer getChannelType() {
            return this.channelType;
        }

        public GetPageGroupsByChannelTypeResponseBodyDataList setDepartmentId(Long departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public Long getDepartmentId() {
            return this.departmentId;
        }

        public GetPageGroupsByChannelTypeResponseBodyDataList setIsPublic(Boolean isPublic) {
            this.isPublic = isPublic;
            return this;
        }
        public Boolean getIsPublic() {
            return this.isPublic;
        }

    }

    public static class GetPageGroupsByChannelTypeResponseBodyData extends TeaModel {
        @NameInMap("LastSortKey")
        public Long lastSortKey;

        @NameInMap("List")
        public java.util.List<GetPageGroupsByChannelTypeResponseBodyDataList> list;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("HasNextPage")
        public Boolean hasNextPage;

        public static GetPageGroupsByChannelTypeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPageGroupsByChannelTypeResponseBodyData self = new GetPageGroupsByChannelTypeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPageGroupsByChannelTypeResponseBodyData setLastSortKey(Long lastSortKey) {
            this.lastSortKey = lastSortKey;
            return this;
        }
        public Long getLastSortKey() {
            return this.lastSortKey;
        }

        public GetPageGroupsByChannelTypeResponseBodyData setList(java.util.List<GetPageGroupsByChannelTypeResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetPageGroupsByChannelTypeResponseBodyDataList> getList() {
            return this.list;
        }

        public GetPageGroupsByChannelTypeResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetPageGroupsByChannelTypeResponseBodyData setHasNextPage(Boolean hasNextPage) {
            this.hasNextPage = hasNextPage;
            return this;
        }
        public Boolean getHasNextPage() {
            return this.hasNextPage;
        }

    }

}
