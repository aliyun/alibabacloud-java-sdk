// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamPreloadTasksResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The details of the prefetch task.</p>
     */
    @NameInMap("PreloadTasks")
    public DescribeLiveStreamPreloadTasksResponseBodyPreloadTasks preloadTasks;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E1564CBC-DCFE-5E1B-8B78-8DED9A39F334</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalNum")
    public Integer totalNum;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static DescribeLiveStreamPreloadTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamPreloadTasksResponseBody self = new DescribeLiveStreamPreloadTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamPreloadTasksResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeLiveStreamPreloadTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLiveStreamPreloadTasksResponseBody setPreloadTasks(DescribeLiveStreamPreloadTasksResponseBodyPreloadTasks preloadTasks) {
        this.preloadTasks = preloadTasks;
        return this;
    }
    public DescribeLiveStreamPreloadTasksResponseBodyPreloadTasks getPreloadTasks() {
        return this.preloadTasks;
    }

    public DescribeLiveStreamPreloadTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamPreloadTasksResponseBody setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public DescribeLiveStreamPreloadTasksResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeLiveStreamPreloadTasksResponseBodyPreloadTasksPreloadTask extends TeaModel {
        /**
         * <p>The acceleration region where the live content is prefetched. Valid values:</p>
         * <ul>
         * <li>domestic: regions in the Chinese mainland.</li>
         * <li>overseas: regions outside the Chinese mainland.</li>
         * <li>global: regions in and outside the Chinese mainland.</li>
         * </ul>
         * <blockquote>
         * <p> If this parameter is left empty, the acceleration region configured for the domain name is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>domestic</p>
         */
        @NameInMap("Area")
        public String area;

        /**
         * <p>The time when the prefetch task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-06-29T19:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Indicates whether the prefetch task is successful. Valid values:</p>
         * <ul>
         * <li>Successfully</li>
         * <li>InternalError</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Successfully</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The streaming domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The streaming URL.</p>
         */
        @NameInMap("PlayUrl")
        public String playUrl;

        /**
         * <p>The time when the prefetch task ended.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-06-30T19:00:00Z</p>
         */
        @NameInMap("PreloadedEndTime")
        public String preloadedEndTime;

        /**
         * <p>The time when the prefetch task started.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-06-29T19:00:00Z</p>
         */
        @NameInMap("PreloadedStartTime")
        public String preloadedStartTime;

        /**
         * <p>The progress of the prefetch task.</p>
         * 
         * <strong>example:</strong>
         * <p>100%</p>
         */
        @NameInMap("Process")
        public String process;

        /**
         * <p>The status of the prefetch task. Valid values:</p>
         * <ul>
         * <li>Success</li>
         * <li>Failed</li>
         * </ul>
         * <blockquote>
         * <p> Success is returned only if the prefetch task is configured for all streaming URLs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the prefetch task.</p>
         * 
         * <strong>example:</strong>
         * <p>yourTaskId</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static DescribeLiveStreamPreloadTasksResponseBodyPreloadTasksPreloadTask build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamPreloadTasksResponseBodyPreloadTasksPreloadTask self = new DescribeLiveStreamPreloadTasksResponseBodyPreloadTasksPreloadTask();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamPreloadTasksResponseBodyPreloadTasksPreloadTask setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public DescribeLiveStreamPreloadTasksResponseBodyPreloadTasksPreloadTask setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeLiveStreamPreloadTasksResponseBodyPreloadTasksPreloadTask setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeLiveStreamPreloadTasksResponseBodyPreloadTasksPreloadTask setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveStreamPreloadTasksResponseBodyPreloadTasksPreloadTask setPlayUrl(String playUrl) {
            this.playUrl = playUrl;
            return this;
        }
        public String getPlayUrl() {
            return this.playUrl;
        }

        public DescribeLiveStreamPreloadTasksResponseBodyPreloadTasksPreloadTask setPreloadedEndTime(String preloadedEndTime) {
            this.preloadedEndTime = preloadedEndTime;
            return this;
        }
        public String getPreloadedEndTime() {
            return this.preloadedEndTime;
        }

        public DescribeLiveStreamPreloadTasksResponseBodyPreloadTasksPreloadTask setPreloadedStartTime(String preloadedStartTime) {
            this.preloadedStartTime = preloadedStartTime;
            return this;
        }
        public String getPreloadedStartTime() {
            return this.preloadedStartTime;
        }

        public DescribeLiveStreamPreloadTasksResponseBodyPreloadTasksPreloadTask setProcess(String process) {
            this.process = process;
            return this;
        }
        public String getProcess() {
            return this.process;
        }

        public DescribeLiveStreamPreloadTasksResponseBodyPreloadTasksPreloadTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeLiveStreamPreloadTasksResponseBodyPreloadTasksPreloadTask setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class DescribeLiveStreamPreloadTasksResponseBodyPreloadTasks extends TeaModel {
        @NameInMap("PreloadTask")
        public java.util.List<DescribeLiveStreamPreloadTasksResponseBodyPreloadTasksPreloadTask> preloadTask;

        public static DescribeLiveStreamPreloadTasksResponseBodyPreloadTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamPreloadTasksResponseBodyPreloadTasks self = new DescribeLiveStreamPreloadTasksResponseBodyPreloadTasks();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamPreloadTasksResponseBodyPreloadTasks setPreloadTask(java.util.List<DescribeLiveStreamPreloadTasksResponseBodyPreloadTasksPreloadTask> preloadTask) {
            this.preloadTask = preloadTask;
            return this;
        }
        public java.util.List<DescribeLiveStreamPreloadTasksResponseBodyPreloadTasksPreloadTask> getPreloadTask() {
            return this.preloadTask;
        }

    }

}
