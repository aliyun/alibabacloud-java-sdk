// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListVersionDeviceGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DeviceGroupList")
    public java.util.List<ListVersionDeviceGroupsResponseBodyDeviceGroupList> deviceGroupList;

    public static ListVersionDeviceGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVersionDeviceGroupsResponseBody self = new ListVersionDeviceGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVersionDeviceGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVersionDeviceGroupsResponseBody setDeviceGroupList(java.util.List<ListVersionDeviceGroupsResponseBodyDeviceGroupList> deviceGroupList) {
        this.deviceGroupList = deviceGroupList;
        return this;
    }
    public java.util.List<ListVersionDeviceGroupsResponseBodyDeviceGroupList> getDeviceGroupList() {
        return this.deviceGroupList;
    }

    public static class ListVersionDeviceGroupsResponseBodyDeviceGroupList extends TeaModel {
        @NameInMap("GmtModify")
        public String gmtModify;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static ListVersionDeviceGroupsResponseBodyDeviceGroupList build(java.util.Map<String, ?> map) throws Exception {
            ListVersionDeviceGroupsResponseBodyDeviceGroupList self = new ListVersionDeviceGroupsResponseBodyDeviceGroupList();
            return TeaModel.build(map, self);
        }

        public ListVersionDeviceGroupsResponseBodyDeviceGroupList setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public ListVersionDeviceGroupsResponseBodyDeviceGroupList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListVersionDeviceGroupsResponseBodyDeviceGroupList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListVersionDeviceGroupsResponseBodyDeviceGroupList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListVersionDeviceGroupsResponseBodyDeviceGroupList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
