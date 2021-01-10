// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindCustomizedFiltersResponseBody extends TeaModel {
    @NameInMap("CustomizedFilterList")
    public FindCustomizedFiltersResponseBodyCustomizedFilterList customizedFilterList;

    @NameInMap("RequestId")
    public String requestId;

    public static FindCustomizedFiltersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindCustomizedFiltersResponseBody self = new FindCustomizedFiltersResponseBody();
        return TeaModel.build(map, self);
    }

    public FindCustomizedFiltersResponseBody setCustomizedFilterList(FindCustomizedFiltersResponseBodyCustomizedFilterList customizedFilterList) {
        this.customizedFilterList = customizedFilterList;
        return this;
    }
    public FindCustomizedFiltersResponseBodyCustomizedFilterList getCustomizedFilterList() {
        return this.customizedFilterList;
    }

    public FindCustomizedFiltersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class FindCustomizedFiltersResponseBodyCustomizedFilterListItems extends TeaModel {
        @NameInMap("GmtModifyTimestamp")
        public Long gmtModifyTimestamp;

        @NameInMap("GmtCreateTimestamp")
        public Long gmtCreateTimestamp;

        @NameInMap("Value")
        public String value;

        @NameInMap("GmtModify")
        public String gmtModify;

        @NameInMap("ValueCompareType")
        public String valueCompareType;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("BlackWhiteType")
        public String blackWhiteType;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        public static FindCustomizedFiltersResponseBodyCustomizedFilterListItems build(java.util.Map<String, ?> map) throws Exception {
            FindCustomizedFiltersResponseBodyCustomizedFilterListItems self = new FindCustomizedFiltersResponseBodyCustomizedFilterListItems();
            return TeaModel.build(map, self);
        }

        public FindCustomizedFiltersResponseBodyCustomizedFilterListItems setGmtModifyTimestamp(Long gmtModifyTimestamp) {
            this.gmtModifyTimestamp = gmtModifyTimestamp;
            return this;
        }
        public Long getGmtModifyTimestamp() {
            return this.gmtModifyTimestamp;
        }

        public FindCustomizedFiltersResponseBodyCustomizedFilterListItems setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public FindCustomizedFiltersResponseBodyCustomizedFilterListItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public FindCustomizedFiltersResponseBodyCustomizedFilterListItems setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public FindCustomizedFiltersResponseBodyCustomizedFilterListItems setValueCompareType(String valueCompareType) {
            this.valueCompareType = valueCompareType;
            return this;
        }
        public String getValueCompareType() {
            return this.valueCompareType;
        }

        public FindCustomizedFiltersResponseBodyCustomizedFilterListItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public FindCustomizedFiltersResponseBodyCustomizedFilterListItems setBlackWhiteType(String blackWhiteType) {
            this.blackWhiteType = blackWhiteType;
            return this;
        }
        public String getBlackWhiteType() {
            return this.blackWhiteType;
        }

        public FindCustomizedFiltersResponseBodyCustomizedFilterListItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FindCustomizedFiltersResponseBodyCustomizedFilterListItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class FindCustomizedFiltersResponseBodyCustomizedFilterList extends TeaModel {
        @NameInMap("Items")
        public java.util.List<FindCustomizedFiltersResponseBodyCustomizedFilterListItems> items;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static FindCustomizedFiltersResponseBodyCustomizedFilterList build(java.util.Map<String, ?> map) throws Exception {
            FindCustomizedFiltersResponseBodyCustomizedFilterList self = new FindCustomizedFiltersResponseBodyCustomizedFilterList();
            return TeaModel.build(map, self);
        }

        public FindCustomizedFiltersResponseBodyCustomizedFilterList setItems(java.util.List<FindCustomizedFiltersResponseBodyCustomizedFilterListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<FindCustomizedFiltersResponseBodyCustomizedFilterListItems> getItems() {
            return this.items;
        }

        public FindCustomizedFiltersResponseBodyCustomizedFilterList setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
