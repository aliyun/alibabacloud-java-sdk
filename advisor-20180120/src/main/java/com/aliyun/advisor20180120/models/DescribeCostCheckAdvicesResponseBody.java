// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.advisor20180120.models;

import com.aliyun.tea.*;

public class DescribeCostCheckAdvicesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeCostCheckAdvicesResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>566331F9-****-550F-B745-A730331F97A9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>autoTest-7</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <strong>example:</strong>
         * <p>basic</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AccountFolderId")
        public String accountFolderId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AccountFolderName")
        public String accountFolderName;

        /**
         * <strong>example:</strong>
         * <p>111******767</p>
         */
        @NameInMap("AliyunId")
        public Long aliyunId;

        /**
         * <strong>example:</strong>
         * <p>{\&quot;Domains\&quot;: [{\&quot;Status\&quot;: \&quot;success\&quot;, \&quot;\&quot;: \&quot;cn\&quot;, \&quot;DomainName\&quot;: \&quot;www.****.com\&quot;, Region\&quot;Desc\&quot;: \&quot;ok\&quot;}]}</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>Email</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <strong>example:</strong>
         * <p>2025-03-05T02:02:00Z</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>2025-03-05T02:02:00Z</p>
         */
        @NameInMap("GmtDeleted")
        public Long gmtDeleted;

        /**
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("Product")
        public String product;

        /**
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>i-2ze5*****ef7d2lk63in</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <strong>example:</strong>
         * <p>1200***bles_df</p>
         */
        @NameInMap("ResourceName")
        public String resourceName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Severity")
        public String severity;

        /**
         * <strong>example:</strong>
         * <p>2025-02-04T16:00:00Z</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Tags")
        public java.util.List<DescribeCostCheckAdvicesResponseBodyDataAdviceListTags> tags;

        @NameInMap("Url")
        public String url;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing-h</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeCostCheckAdvicesResponseBodyDataAdviceList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCostCheckAdvicesResponseBodyDataAdviceList self = new DescribeCostCheckAdvicesResponseBodyDataAdviceList();
            return TeaModel.build(map, self);
        }

        public DescribeCostCheckAdvicesResponseBodyDataAdviceList setAccountFolderId(String accountFolderId) {
            this.accountFolderId = accountFolderId;
            return this;
        }
        public String getAccountFolderId() {
            return this.accountFolderId;
        }

        public DescribeCostCheckAdvicesResponseBodyDataAdviceList setAccountFolderName(String accountFolderName) {
            this.accountFolderName = accountFolderName;
            return this;
        }
        public String getAccountFolderName() {
            return this.accountFolderName;
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

        public DescribeCostCheckAdvicesResponseBodyDataAdviceList setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
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

        /**
         * <strong>example:</strong>
         * <p>EcsHighCpuUtilization</p>
         */
        @NameInMap("CheckId")
        public String checkId;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
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
