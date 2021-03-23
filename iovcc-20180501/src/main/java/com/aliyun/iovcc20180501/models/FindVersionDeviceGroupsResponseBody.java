// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindVersionDeviceGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DeviceGroupList")
    public FindVersionDeviceGroupsResponseBodyDeviceGroupList deviceGroupList;

    public static FindVersionDeviceGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindVersionDeviceGroupsResponseBody self = new FindVersionDeviceGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public FindVersionDeviceGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FindVersionDeviceGroupsResponseBody setDeviceGroupList(FindVersionDeviceGroupsResponseBodyDeviceGroupList deviceGroupList) {
        this.deviceGroupList = deviceGroupList;
        return this;
    }
    public FindVersionDeviceGroupsResponseBodyDeviceGroupList getDeviceGroupList() {
        return this.deviceGroupList;
    }

    public static class FindVersionDeviceGroupsResponseBodyDeviceGroupListItems extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModify")
        public String gmtModify;

        @NameInMap("Description")
        public String description;

        @NameInMap("MaxCount")
        public String maxCount;

        @NameInMap("GmtCreateTimestamp")
        public Long gmtCreateTimestamp;

        @NameInMap("GmtModifyTimestamp")
        public Long gmtModifyTimestamp;

        public static FindVersionDeviceGroupsResponseBodyDeviceGroupListItems build(java.util.Map<String, ?> map) throws Exception {
            FindVersionDeviceGroupsResponseBodyDeviceGroupListItems self = new FindVersionDeviceGroupsResponseBodyDeviceGroupListItems();
            return TeaModel.build(map, self);
        }

        public FindVersionDeviceGroupsResponseBodyDeviceGroupListItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public FindVersionDeviceGroupsResponseBodyDeviceGroupListItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FindVersionDeviceGroupsResponseBodyDeviceGroupListItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public FindVersionDeviceGroupsResponseBodyDeviceGroupListItems setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public FindVersionDeviceGroupsResponseBodyDeviceGroupListItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public FindVersionDeviceGroupsResponseBodyDeviceGroupListItems setMaxCount(String maxCount) {
            this.maxCount = maxCount;
            return this;
        }
        public String getMaxCount() {
            return this.maxCount;
        }

        public FindVersionDeviceGroupsResponseBodyDeviceGroupListItems setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public FindVersionDeviceGroupsResponseBodyDeviceGroupListItems setGmtModifyTimestamp(Long gmtModifyTimestamp) {
            this.gmtModifyTimestamp = gmtModifyTimestamp;
            return this;
        }
        public Long getGmtModifyTimestamp() {
            return this.gmtModifyTimestamp;
        }

    }

    public static class FindVersionDeviceGroupsResponseBodyDeviceGroupList extends TeaModel {
        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Items")
        public java.util.List<FindVersionDeviceGroupsResponseBodyDeviceGroupListItems> items;

        public static FindVersionDeviceGroupsResponseBodyDeviceGroupList build(java.util.Map<String, ?> map) throws Exception {
            FindVersionDeviceGroupsResponseBodyDeviceGroupList self = new FindVersionDeviceGroupsResponseBodyDeviceGroupList();
            return TeaModel.build(map, self);
        }

        public FindVersionDeviceGroupsResponseBodyDeviceGroupList setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public FindVersionDeviceGroupsResponseBodyDeviceGroupList setItems(java.util.List<FindVersionDeviceGroupsResponseBodyDeviceGroupListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<FindVersionDeviceGroupsResponseBodyDeviceGroupListItems> getItems() {
            return this.items;
        }

    }

}
