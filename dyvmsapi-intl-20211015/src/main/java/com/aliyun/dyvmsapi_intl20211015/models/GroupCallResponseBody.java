// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi_intl20211015.models;

import com.aliyun.tea.*;

public class GroupCallResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>请求状态码。  返回OK代表请求成功。 其他错误码，请参见API错误码。</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>返回信息描述</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public GroupCallResponseBodyModel model;

    /**
     * <p>请求ID</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GroupCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GroupCallResponseBody self = new GroupCallResponseBody();
        return TeaModel.build(map, self);
    }

    public GroupCallResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GroupCallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GroupCallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GroupCallResponseBody setModel(GroupCallResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public GroupCallResponseBodyModel getModel() {
        return this.model;
    }

    public GroupCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GroupCallResponseBodyModel extends TeaModel {
        /**
         * <p>任务ID，可以通过此ID查询任务的详情。</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static GroupCallResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            GroupCallResponseBodyModel self = new GroupCallResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public GroupCallResponseBodyModel setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
