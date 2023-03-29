// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribePreloadDetailByIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("UrlDetails")
    public java.util.List<DescribePreloadDetailByIdResponseBodyUrlDetails> urlDetails;

    public static DescribePreloadDetailByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePreloadDetailByIdResponseBody self = new DescribePreloadDetailByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePreloadDetailByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePreloadDetailByIdResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribePreloadDetailByIdResponseBody setUrlDetails(java.util.List<DescribePreloadDetailByIdResponseBodyUrlDetails> urlDetails) {
        this.urlDetails = urlDetails;
        return this;
    }
    public java.util.List<DescribePreloadDetailByIdResponseBodyUrlDetails> getUrlDetails() {
        return this.urlDetails;
    }

    public static class DescribePreloadDetailByIdResponseBodyUrlDetailsUrls extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Success")
        public String success;

        @NameInMap("Url")
        public String url;

        public static DescribePreloadDetailByIdResponseBodyUrlDetailsUrls build(java.util.Map<String, ?> map) throws Exception {
            DescribePreloadDetailByIdResponseBodyUrlDetailsUrls self = new DescribePreloadDetailByIdResponseBodyUrlDetailsUrls();
            return TeaModel.build(map, self);
        }

        public DescribePreloadDetailByIdResponseBodyUrlDetailsUrls setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePreloadDetailByIdResponseBodyUrlDetailsUrls setSuccess(String success) {
            this.success = success;
            return this;
        }
        public String getSuccess() {
            return this.success;
        }

        public DescribePreloadDetailByIdResponseBodyUrlDetailsUrls setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class DescribePreloadDetailByIdResponseBodyUrlDetails extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Process")
        public String process;

        @NameInMap("RetCode")
        public String retCode;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Urls")
        public java.util.List<DescribePreloadDetailByIdResponseBodyUrlDetailsUrls> urls;

        public static DescribePreloadDetailByIdResponseBodyUrlDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribePreloadDetailByIdResponseBodyUrlDetails self = new DescribePreloadDetailByIdResponseBodyUrlDetails();
            return TeaModel.build(map, self);
        }

        public DescribePreloadDetailByIdResponseBodyUrlDetails setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribePreloadDetailByIdResponseBodyUrlDetails setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribePreloadDetailByIdResponseBodyUrlDetails setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribePreloadDetailByIdResponseBodyUrlDetails setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

        public DescribePreloadDetailByIdResponseBodyUrlDetails setRetCode(String retCode) {
            this.retCode = retCode;
            return this;
        }
        public String getRetCode() {
            return this.retCode;
        }

        public DescribePreloadDetailByIdResponseBodyUrlDetails setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribePreloadDetailByIdResponseBodyUrlDetails setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribePreloadDetailByIdResponseBodyUrlDetails setUrls(java.util.List<DescribePreloadDetailByIdResponseBodyUrlDetailsUrls> urls) {
            this.urls = urls;
            return this;
        }
        public java.util.List<DescribePreloadDetailByIdResponseBodyUrlDetailsUrls> getUrls() {
            return this.urls;
        }

    }

}
