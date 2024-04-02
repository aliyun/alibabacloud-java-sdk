// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class DescribeCostCheckAdvicesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeCostCheckAdvicesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static DescribeCostCheckAdvicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCostCheckAdvicesResponseBody self = new DescribeCostCheckAdvicesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCostCheckAdvicesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeCostCheckAdvicesResponseBody setData(DescribeCostCheckAdvicesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeCostCheckAdvicesResponseBodyData getData() {
        return this.data;
    }

    public DescribeCostCheckAdvicesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCostCheckAdvicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCostCheckAdvicesResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeCostCheckAdvicesResponseBodyDataAdviceListTags extends TeaModel {
        @NameInMap("TagKey")
        public String tagKey;

        @NameInMap("TagValue")
        public String tagValue;

        public static DescribeCostCheckAdvicesResponseBodyDataAdviceListTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeCostCheckAdvicesResponseBodyDataAdviceListTags self = new DescribeCostCheckAdvicesResponseBodyDataAdviceListTags();
            return TeaModel.build(map, self);
        }

        public DescribeCostCheckAdvicesResponseBodyDataAdviceListTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public DescribeCostCheckAdvicesResponseBodyDataAdviceListTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

    public static class DescribeCostCheckAdvicesResponseBodyDataAdviceList extends TeaModel {
        @NameInMap("AliyunId")
        public Long aliyunId;

        @NameInMap("Content")
        public String content;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("GmtDeleted")
        public Long gmtDeleted;

        @NameInMap("Product")
        public String product;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceId")
        public String resourceId;

        @NameInMap("ResourceName")
        public String resourceName;

        @NameInMap("Severity")
        public String severity;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Tags")
        public java.util.List<DescribeCostCheckAdvicesResponseBodyDataAdviceListTags> tags;

        @NameInMap("Url")
        public String url;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeCostCheckAdvicesResponseBodyDataAdviceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCostCheckAdvicesResponseBodyDataAdviceList self = new DescribeCostCheckAdvicesResponseBodyDataAdviceList();
            return TeaModel.build(map, self);
        }

        public DescribeCostCheckAdvicesResponseBodyDataAdviceList setAliyunId(Long aliyunId) {
            this.aliyunId = aliyunId;
            return this;
        }
        public Long getAliyunId() {
            return this.aliyunId;
        }

        public DescribeCostCheckAdvicesResponseBodyDataAdviceList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeCostCheckAdvicesResponseBodyDataAdviceList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeCostCheckAdvicesResponseBodyDataAdviceList setGmtDeleted(Long gmtDeleted) {
            this.gmtDeleted = gmtDeleted;
            return this;
        }
        public Long getGmtDeleted() {
            return this.gmtDeleted;
        }

        public DescribeCostCheckAdvicesResponseBodyDataAdviceList setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public DescribeCostCheckAdvicesResponseBodyDataAdviceList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeCostCheckAdvicesResponseBodyDataAdviceList setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeCostCheckAdvicesResponseBodyDataAdviceList setResourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }
        public String getResourceName() {
            return this.resourceName;
        }

        public DescribeCostCheckAdvicesResponseBodyDataAdviceList setSeverity(String severity) {
            this.severity = severity;
            return this;
        }
        public String getSeverity() {
            return this.severity;
        }

        public DescribeCostCheckAdvicesResponseBodyDataAdviceList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeCostCheckAdvicesResponseBodyDataAdviceList setTags(java.util.List<DescribeCostCheckAdvicesResponseBodyDataAdviceListTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeCostCheckAdvicesResponseBodyDataAdviceListTags> getTags() {
            return this.tags;
        }

        public DescribeCostCheckAdvicesResponseBodyDataAdviceList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public DescribeCostCheckAdvicesResponseBodyDataAdviceList setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeCostCheckAdvicesResponseBodyDataAdviceList setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeCostCheckAdvicesResponseBodyData extends TeaModel {
        @NameInMap("AdviceList")
        public java.util.List<DescribeCostCheckAdvicesResponseBodyDataAdviceList> adviceList;

        @NameInMap("CheckId")
        public String checkId;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeCostCheckAdvicesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCostCheckAdvicesResponseBodyData self = new DescribeCostCheckAdvicesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeCostCheckAdvicesResponseBodyData setAdviceList(java.util.List<DescribeCostCheckAdvicesResponseBodyDataAdviceList> adviceList) {
            this.adviceList = adviceList;
            return this;
        }
        public java.util.List<DescribeCostCheckAdvicesResponseBodyDataAdviceList> getAdviceList() {
            return this.adviceList;
        }

        public DescribeCostCheckAdvicesResponseBodyData setCheckId(String checkId) {
            this.checkId = checkId;
            return this;
        }
        public String getCheckId() {
            return this.checkId;
        }

        public DescribeCostCheckAdvicesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeCostCheckAdvicesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeCostCheckAdvicesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
