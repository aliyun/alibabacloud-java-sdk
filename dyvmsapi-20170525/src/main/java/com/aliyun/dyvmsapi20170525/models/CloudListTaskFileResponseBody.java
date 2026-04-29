// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudListTaskFileResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudListTaskFileResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>6086693B-2250-17CE-A41F-06259AB6DB1B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudListTaskFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudListTaskFileResponseBody self = new CloudListTaskFileResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudListTaskFileResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudListTaskFileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudListTaskFileResponseBody setData(CloudListTaskFileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudListTaskFileResponseBodyData getData() {
        return this.data;
    }

    public CloudListTaskFileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudListTaskFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudListTaskFileResponseBodyDataTaskFileList extends TeaModel {
        /**
         * <p>创建批次时间，格式为： yyyy-MM-dd HH:mm:ss</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-20 10:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>企业编号</p>
         * 
         * <strong>example:</strong>
         * <p>7000002</p>
         */
        @NameInMap("EnterpriseId")
        public String enterpriseId;

        /**
         * <p>批次Id</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>导入条数</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ImportCount")
        public String importCount;

        /**
         * <p>批次名称</p>
         * 
         * <strong>example:</strong>
         * <p>name2</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>优先级，默认为0，值越大优先级越高</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>重复条数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RepeatCount")
        public String repeatCount;

        /**
         * <p>黑名单条数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RestrictCount")
        public String restrictCount;

        /**
         * <p>批次状态，0：未导入，1：导入完成 ，2：加载到缓存，3：呼叫完，4：已冻结</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>任务Id</p>
         * 
         * <strong>example:</strong>
         * <p>27</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static CloudListTaskFileResponseBodyDataTaskFileList build(java.util.Map<String, ?> map) throws Exception {
            CloudListTaskFileResponseBodyDataTaskFileList self = new CloudListTaskFileResponseBodyDataTaskFileList();
            return TeaModel.build(map, self);
        }

        public CloudListTaskFileResponseBodyDataTaskFileList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CloudListTaskFileResponseBodyDataTaskFileList setEnterpriseId(String enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public String getEnterpriseId() {
            return this.enterpriseId;
        }

        public CloudListTaskFileResponseBodyDataTaskFileList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CloudListTaskFileResponseBodyDataTaskFileList setImportCount(String importCount) {
            this.importCount = importCount;
            return this;
        }
        public String getImportCount() {
            return this.importCount;
        }

        public CloudListTaskFileResponseBodyDataTaskFileList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CloudListTaskFileResponseBodyDataTaskFileList setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public CloudListTaskFileResponseBodyDataTaskFileList setRepeatCount(String repeatCount) {
            this.repeatCount = repeatCount;
            return this;
        }
        public String getRepeatCount() {
            return this.repeatCount;
        }

        public CloudListTaskFileResponseBodyDataTaskFileList setRestrictCount(String restrictCount) {
            this.restrictCount = restrictCount;
            return this;
        }
        public String getRestrictCount() {
            return this.restrictCount;
        }

        public CloudListTaskFileResponseBodyDataTaskFileList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CloudListTaskFileResponseBodyDataTaskFileList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

    public static class CloudListTaskFileResponseBodyData extends TeaModel {
        /**
         * <p>任务批次信息</p>
         */
        @NameInMap("TaskFileList")
        public java.util.List<CloudListTaskFileResponseBodyDataTaskFileList> taskFileList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public String totalCount;

        public static CloudListTaskFileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudListTaskFileResponseBodyData self = new CloudListTaskFileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudListTaskFileResponseBodyData setTaskFileList(java.util.List<CloudListTaskFileResponseBodyDataTaskFileList> taskFileList) {
            this.taskFileList = taskFileList;
            return this;
        }
        public java.util.List<CloudListTaskFileResponseBodyDataTaskFileList> getTaskFileList() {
            return this.taskFileList;
        }

        public CloudListTaskFileResponseBodyData setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

    }

}
