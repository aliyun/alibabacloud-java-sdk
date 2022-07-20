// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListPipelinesResponseBody extends TeaModel {
    @NameInMap("PipelineList")
    public java.util.List<ListPipelinesResponseBodyPipelineList> pipelineList;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static ListPipelinesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPipelinesResponseBody self = new ListPipelinesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPipelinesResponseBody setPipelineList(java.util.List<ListPipelinesResponseBodyPipelineList> pipelineList) {
        this.pipelineList = pipelineList;
        return this;
    }
    public java.util.List<ListPipelinesResponseBodyPipelineList> getPipelineList() {
        return this.pipelineList;
    }

    public ListPipelinesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPipelinesResponseBodyPipelineList extends TeaModel {
        // 模板创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 模板修改时间
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        // 管道名称
        @NameInMap("Name")
        public String name;

        // 管道Id
        @NameInMap("PipelineId")
        public String pipelineId;

        // 管道优先级
        @NameInMap("Priority")
        public Integer priority;

        // 管道类型
        @NameInMap("Speed")
        public String speed;

        // 管道状态
        @NameInMap("Status")
        public String status;

        public static ListPipelinesResponseBodyPipelineList build(java.util.Map<String, ?> map) throws Exception {
            ListPipelinesResponseBodyPipelineList self = new ListPipelinesResponseBodyPipelineList();
            return TeaModel.build(map, self);
        }

        public ListPipelinesResponseBodyPipelineList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPipelinesResponseBodyPipelineList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListPipelinesResponseBodyPipelineList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPipelinesResponseBodyPipelineList setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public ListPipelinesResponseBodyPipelineList setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public ListPipelinesResponseBodyPipelineList setSpeed(String speed) {
            this.speed = speed;
            return this;
        }
        public String getSpeed() {
            return this.speed;
        }

        public ListPipelinesResponseBodyPipelineList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
