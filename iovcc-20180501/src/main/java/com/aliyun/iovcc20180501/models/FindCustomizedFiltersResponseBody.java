// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindCustomizedFiltersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CustomizedFilterList")
    public FindCustomizedFiltersResponseBodyCustomizedFilterList customizedFilterList;

    public static FindCustomizedFiltersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindCustomizedFiltersResponseBody self = new FindCustomizedFiltersResponseBody();
        return TeaModel.build(map, self);
    }

    public FindCustomizedFiltersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FindCustomizedFiltersResponseBody setCustomizedFilterList(FindCustomizedFiltersResponseBodyCustomizedFilterList customizedFilterList) {
        this.customizedFilterList = customizedFilterList;
        return this;
    }
    public FindCustomizedFiltersResponseBodyCustomizedFilterList getCustomizedFilterList() {
        return this.customizedFilterList;
    }

    public static class FindCustomizedFiltersResponseBodyCustomizedFilterListItems extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Value")
        public String value;

        @NameInMap("ValueCompareType")
        public String valueCompareType;

        @NameInMap("BlackWhiteType")
        public String blackWhiteType;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModify")
        public String gmtModify;

        @NameInMap("GmtCreateTimestamp")
        public Long gmtCreateTimestamp;

        @NameInMap("GmtModifyTimestamp")
        public Long gmtModifyTimestamp;

        public static FindCustomizedFiltersResponseBodyCustomizedFilterListItems build(java.util.Map<String, ?> map) throws Exception {
            FindCustomizedFiltersResponseBodyCustomizedFilterListItems self = new FindCustomizedFiltersResponseBodyCustomizedFilterListItems();
            return TeaModel.build(map, self);
        }

        public FindCustomizedFiltersResponseBodyCustomizedFilterListItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public FindCustomizedFiltersResponseBodyCustomizedFilterListItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FindCustomizedFiltersResponseBodyCustomizedFilterListItems setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public FindCustomizedFiltersResponseBodyCustomizedFilterListItems setValueCompareType(String valueCompareType) {
            this.valueCompareType = valueCompareType;
            return this;
        }
        public String getValueCompareType() {
            return this.valueCompareType;
        }

        public FindCustomizedFiltersResponseBodyCustomizedFilterListItems setBlackWhiteType(String blackWhiteType) {
            this.blackWhiteType = blackWhiteType;
            return this;
        }
        public String getBlackWhiteType() {
            return this.blackWhiteType;
        }

        public FindCustomizedFiltersResponseBodyCustomizedFilterListItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public FindCustomizedFiltersResponseBodyCustomizedFilterListItems setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public FindCustomizedFiltersResponseBodyCustomizedFilterListItems setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public FindCustomizedFiltersResponseBodyCustomizedFilterListItems setGmtModifyTimestamp(Long gmtModifyTimestamp) {
            this.gmtModifyTimestamp = gmtModifyTimestamp;
            return this;
        }
        public Long getGmtModifyTimestamp() {
            return this.gmtModifyTimestamp;
        }

    }

    public static class FindCustomizedFiltersResponseBodyCustomizedFilterList extends TeaModel {
        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("Items")
        public java.util.List<FindCustomizedFiltersResponseBodyCustomizedFilterListItems> items;

        public static FindCustomizedFiltersResponseBodyCustomizedFilterList build(java.util.Map<String, ?> map) throws Exception {
            FindCustomizedFiltersResponseBodyCustomizedFilterList self = new FindCustomizedFiltersResponseBodyCustomizedFilterList();
            return TeaModel.build(map, self);
        }

        public FindCustomizedFiltersResponseBodyCustomizedFilterList setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public FindCustomizedFiltersResponseBodyCustomizedFilterList setItems(java.util.List<FindCustomizedFiltersResponseBodyCustomizedFilterListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<FindCustomizedFiltersResponseBodyCustomizedFilterListItems> getItems() {
            return this.items;
        }

    }

}
