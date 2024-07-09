// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribePreloadDetailByIdResponseBody extends TeaModel {
    /**
     * <p>The ID of the request. You can use the ID to query logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>E9D3257A-1B7C-414C-90C1-8D07AC47BCAC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of queried tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The details of the task, including the task ID, start time, end time, domain name, success rate, status, returned error code, and completion details of all URL resources.</p>
     */
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
        /**
         * <p>The details of resource prefetch.</p>
         * <ul>
         * <li>If the resource is prefetched on all POPs, &quot;Successfully preloaded&quot; is returned.</li>
         * <li>If the resource fails to be prefetched on some POPs, the failure details separated by vertical bars (|) are returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Successfully preloaded</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The success percentage, which indicates the number of POPs on which the resource is prefetched.</p>
         * 
         * <strong>example:</strong>
         * <p>47%</p>
         */
        @NameInMap("Success")
        public String success;

        /**
         * <p>The URL of the prefetched resource.</p>
         * 
         * <strong>example:</strong>
         * <p>/abc.jpg</p>
         */
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
        /**
         * <p>The time when the task was created. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-23T02:26:56Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The domain name for prefetching resources.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The time when the task ended. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-23T02:27:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The progress of the prefetch task, which indicates the number of points of presence (POPs) on which the prefetch task is completed.</p>
         * 
         * <strong>example:</strong>
         * <p>100%</p>
         */
        @NameInMap("Process")
        public String process;

        /**
         * <p>The turned error code. A value of <code>0</code> indicates that the task succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RetCode")
        public String retCode;

        /**
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li><strong>Complete</strong></li>
         * <li><strong>Refreshing</strong></li>
         * <li><strong>Failed</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Complete</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the task that you want to query.</p>
         * <p>You can call the PushObjectCache operation to query task IDs. Then, you can use the task IDs to query task status.</p>
         * <p>You can query one task ID at a time.</p>
         * 
         * <strong>example:</strong>
         * <p>14286878547</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The completion details of all URL resources in the task.</p>
         */
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
