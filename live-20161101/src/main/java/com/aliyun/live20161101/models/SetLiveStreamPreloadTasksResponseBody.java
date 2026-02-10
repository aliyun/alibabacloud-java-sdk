// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveStreamPreloadTasksResponseBody extends TeaModel {
    /**
     * <p>The number of URLs for which the prefetch task configuration failed.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("FailedURL")
    public Integer failedURL;

    @NameInMap("PreloadTasksMessages")
    public SetLiveStreamPreloadTasksResponseBodyPreloadTasksMessages preloadTasksMessages;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>36E0E523-E0C6-5D95-A465-A8EA2DCBA2A5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the prefetch task. Valid values:</p>
     * <ul>
     * <li>Success</li>
     * <li>Failed</li>
     * </ul>
     * <blockquote>
     * <p> Success is returned only if the prefetch task is configured for all specified streaming URLs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The number of URLs for which the prefetch task is successfully configured.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SuccessURL")
    public Integer successURL;

    /**
     * <p>The total number of URLs.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalURL")
    public Integer totalURL;

    public static SetLiveStreamPreloadTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetLiveStreamPreloadTasksResponseBody self = new SetLiveStreamPreloadTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public SetLiveStreamPreloadTasksResponseBody setFailedURL(Integer failedURL) {
        this.failedURL = failedURL;
        return this;
    }
    public Integer getFailedURL() {
        return this.failedURL;
    }

    public SetLiveStreamPreloadTasksResponseBody setPreloadTasksMessages(SetLiveStreamPreloadTasksResponseBodyPreloadTasksMessages preloadTasksMessages) {
        this.preloadTasksMessages = preloadTasksMessages;
        return this;
    }
    public SetLiveStreamPreloadTasksResponseBodyPreloadTasksMessages getPreloadTasksMessages() {
        return this.preloadTasksMessages;
    }

    public SetLiveStreamPreloadTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetLiveStreamPreloadTasksResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public SetLiveStreamPreloadTasksResponseBody setSuccessURL(Integer successURL) {
        this.successURL = successURL;
        return this;
    }
    public Integer getSuccessURL() {
        return this.successURL;
    }

    public SetLiveStreamPreloadTasksResponseBody setTotalURL(Integer totalURL) {
        this.totalURL = totalURL;
        return this;
    }
    public Integer getTotalURL() {
        return this.totalURL;
    }

    public static class SetLiveStreamPreloadTasksResponseBodyPreloadTasksMessagesPreloadTasksMessage extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("PlayUrl")
        public String playUrl;

        @NameInMap("TaskId")
        public String taskId;

        public static SetLiveStreamPreloadTasksResponseBodyPreloadTasksMessagesPreloadTasksMessage build(java.util.Map<String, ?> map) throws Exception {
            SetLiveStreamPreloadTasksResponseBodyPreloadTasksMessagesPreloadTasksMessage self = new SetLiveStreamPreloadTasksResponseBodyPreloadTasksMessagesPreloadTasksMessage();
            return TeaModel.build(map, self);
        }

        public SetLiveStreamPreloadTasksResponseBodyPreloadTasksMessagesPreloadTasksMessage setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SetLiveStreamPreloadTasksResponseBodyPreloadTasksMessagesPreloadTasksMessage setPlayUrl(String playUrl) {
            this.playUrl = playUrl;
            return this;
        }
        public String getPlayUrl() {
            return this.playUrl;
        }

        public SetLiveStreamPreloadTasksResponseBodyPreloadTasksMessagesPreloadTasksMessage setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class SetLiveStreamPreloadTasksResponseBodyPreloadTasksMessages extends TeaModel {
        @NameInMap("PreloadTasksMessage")
        public java.util.List<SetLiveStreamPreloadTasksResponseBodyPreloadTasksMessagesPreloadTasksMessage> preloadTasksMessage;

        public static SetLiveStreamPreloadTasksResponseBodyPreloadTasksMessages build(java.util.Map<String, ?> map) throws Exception {
            SetLiveStreamPreloadTasksResponseBodyPreloadTasksMessages self = new SetLiveStreamPreloadTasksResponseBodyPreloadTasksMessages();
            return TeaModel.build(map, self);
        }

        public SetLiveStreamPreloadTasksResponseBodyPreloadTasksMessages setPreloadTasksMessage(java.util.List<SetLiveStreamPreloadTasksResponseBodyPreloadTasksMessagesPreloadTasksMessage> preloadTasksMessage) {
            this.preloadTasksMessage = preloadTasksMessage;
            return this;
        }
        public java.util.List<SetLiveStreamPreloadTasksResponseBodyPreloadTasksMessagesPreloadTasksMessage> getPreloadTasksMessage() {
            return this.preloadTasksMessage;
        }

    }

}
