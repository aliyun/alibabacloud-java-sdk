// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindCustomizedPropertiesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CustomizedPropertyList")
    public FindCustomizedPropertiesResponseBodyCustomizedPropertyList customizedPropertyList;

    public static FindCustomizedPropertiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindCustomizedPropertiesResponseBody self = new FindCustomizedPropertiesResponseBody();
        return TeaModel.build(map, self);
    }

    public FindCustomizedPropertiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FindCustomizedPropertiesResponseBody setCustomizedPropertyList(FindCustomizedPropertiesResponseBodyCustomizedPropertyList customizedPropertyList) {
        this.customizedPropertyList = customizedPropertyList;
        return this;
    }
    public FindCustomizedPropertiesResponseBodyCustomizedPropertyList getCustomizedPropertyList() {
        return this.customizedPropertyList;
    }

    public static class FindCustomizedPropertiesResponseBodyCustomizedPropertyListItems extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtCreateTimestamp")
        public Long gmtCreateTimestamp;

        public static FindCustomizedPropertiesResponseBodyCustomizedPropertyListItems build(java.util.Map<String, ?> map) throws Exception {
            FindCustomizedPropertiesResponseBodyCustomizedPropertyListItems self = new FindCustomizedPropertiesResponseBodyCustomizedPropertyListItems();
            return TeaModel.build(map, self);
        }

        public FindCustomizedPropertiesResponseBodyCustomizedPropertyListItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public FindCustomizedPropertiesResponseBodyCustomizedPropertyListItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FindCustomizedPropertiesResponseBodyCustomizedPropertyListItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public FindCustomizedPropertiesResponseBodyCustomizedPropertyListItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public FindCustomizedPropertiesResponseBodyCustomizedPropertyListItems setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

    }

    public static class FindCustomizedPropertiesResponseBodyCustomizedPropertyList extends TeaModel {
        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Items")
        public java.util.List<FindCustomizedPropertiesResponseBodyCustomizedPropertyListItems> items;

        public static FindCustomizedPropertiesResponseBodyCustomizedPropertyList build(java.util.Map<String, ?> map) throws Exception {
            FindCustomizedPropertiesResponseBodyCustomizedPropertyList self = new FindCustomizedPropertiesResponseBodyCustomizedPropertyList();
            return TeaModel.build(map, self);
        }

        public FindCustomizedPropertiesResponseBodyCustomizedPropertyList setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public FindCustomizedPropertiesResponseBodyCustomizedPropertyList setItems(java.util.List<FindCustomizedPropertiesResponseBodyCustomizedPropertyListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<FindCustomizedPropertiesResponseBodyCustomizedPropertyListItems> getItems() {
            return this.items;
        }

    }

}
