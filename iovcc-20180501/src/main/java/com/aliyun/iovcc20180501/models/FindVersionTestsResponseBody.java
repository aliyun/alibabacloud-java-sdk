// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class FindVersionTestsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VersionTestList")
    public FindVersionTestsResponseBodyVersionTestList versionTestList;

    public static FindVersionTestsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FindVersionTestsResponseBody self = new FindVersionTestsResponseBody();
        return TeaModel.build(map, self);
    }

    public FindVersionTestsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FindVersionTestsResponseBody setVersionTestList(FindVersionTestsResponseBodyVersionTestList versionTestList) {
        this.versionTestList = versionTestList;
        return this;
    }
    public FindVersionTestsResponseBodyVersionTestList getVersionTestList() {
        return this.versionTestList;
    }

    public static class FindVersionTestsResponseBodyVersionTestListItems extends TeaModel {
        @NameInMap("GmtCreateTimestamp")
        public Long gmtCreateTimestamp;

        @NameInMap("GmtModify")
        public String gmtModify;

        @NameInMap("VersionId")
        public String versionId;

        @NameInMap("GmtModifyTimestamp")
        public Long gmtModifyTimestamp;

        @NameInMap("FailedCount")
        public String failedCount;

        @NameInMap("DeviceGroupId")
        public String deviceGroupId;

        @NameInMap("SkippedCount")
        public String skippedCount;

        @NameInMap("Description")
        public String description;

        @NameInMap("SucceededCount")
        public String succeededCount;

        @NameInMap("DeviceGroupName")
        public String deviceGroupName;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public Long id;

        @NameInMap("VersionType")
        public String versionType;

        public static FindVersionTestsResponseBodyVersionTestListItems build(java.util.Map<String, ?> map) throws Exception {
            FindVersionTestsResponseBodyVersionTestListItems self = new FindVersionTestsResponseBodyVersionTestListItems();
            return TeaModel.build(map, self);
        }

        public FindVersionTestsResponseBodyVersionTestListItems setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public FindVersionTestsResponseBodyVersionTestListItems setGmtModify(String gmtModify) {
            this.gmtModify = gmtModify;
            return this;
        }
        public String getGmtModify() {
            return this.gmtModify;
        }

        public FindVersionTestsResponseBodyVersionTestListItems setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

        public FindVersionTestsResponseBodyVersionTestListItems setGmtModifyTimestamp(Long gmtModifyTimestamp) {
            this.gmtModifyTimestamp = gmtModifyTimestamp;
            return this;
        }
        public Long getGmtModifyTimestamp() {
            return this.gmtModifyTimestamp;
        }

        public FindVersionTestsResponseBodyVersionTestListItems setFailedCount(String failedCount) {
            this.failedCount = failedCount;
            return this;
        }
        public String getFailedCount() {
            return this.failedCount;
        }

        public FindVersionTestsResponseBodyVersionTestListItems setDeviceGroupId(String deviceGroupId) {
            this.deviceGroupId = deviceGroupId;
            return this;
        }
        public String getDeviceGroupId() {
            return this.deviceGroupId;
        }

        public FindVersionTestsResponseBodyVersionTestListItems setSkippedCount(String skippedCount) {
            this.skippedCount = skippedCount;
            return this;
        }
        public String getSkippedCount() {
            return this.skippedCount;
        }

        public FindVersionTestsResponseBodyVersionTestListItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public FindVersionTestsResponseBodyVersionTestListItems setSucceededCount(String succeededCount) {
            this.succeededCount = succeededCount;
            return this;
        }
        public String getSucceededCount() {
            return this.succeededCount;
        }

        public FindVersionTestsResponseBodyVersionTestListItems setDeviceGroupName(String deviceGroupName) {
            this.deviceGroupName = deviceGroupName;
            return this;
        }
        public String getDeviceGroupName() {
            return this.deviceGroupName;
        }

        public FindVersionTestsResponseBodyVersionTestListItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public FindVersionTestsResponseBodyVersionTestListItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public FindVersionTestsResponseBodyVersionTestListItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public FindVersionTestsResponseBodyVersionTestListItems setVersionType(String versionType) {
            this.versionType = versionType;
            return this;
        }
        public String getVersionType() {
            return this.versionType;
        }

    }

    public static class FindVersionTestsResponseBodyVersionTestList extends TeaModel {
        @NameInMap("Items")
        public java.util.List<FindVersionTestsResponseBodyVersionTestListItems> items;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static FindVersionTestsResponseBodyVersionTestList build(java.util.Map<String, ?> map) throws Exception {
            FindVersionTestsResponseBodyVersionTestList self = new FindVersionTestsResponseBodyVersionTestList();
            return TeaModel.build(map, self);
        }

        public FindVersionTestsResponseBodyVersionTestList setItems(java.util.List<FindVersionTestsResponseBodyVersionTestListItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<FindVersionTestsResponseBodyVersionTestListItems> getItems() {
            return this.items;
        }

        public FindVersionTestsResponseBodyVersionTestList setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
