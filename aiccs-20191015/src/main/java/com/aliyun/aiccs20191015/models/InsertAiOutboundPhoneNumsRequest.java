// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class InsertAiOutboundPhoneNumsRequest extends TeaModel {
    // 实例ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 任务id
    @NameInMap("TaskId")
    public Long taskId;

    // 任务批次号（不填则导入到默认批次）
    @NameInMap("BatchVersion")
    public Integer batchVersion;

    // 号码详情(至多30条)
    @NameInMap("Details")
    public java.util.List<InsertAiOutboundPhoneNumsRequestDetails> details;

    public static InsertAiOutboundPhoneNumsRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertAiOutboundPhoneNumsRequest self = new InsertAiOutboundPhoneNumsRequest();
        return TeaModel.build(map, self);
    }

    public InsertAiOutboundPhoneNumsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public InsertAiOutboundPhoneNumsRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public InsertAiOutboundPhoneNumsRequest setBatchVersion(Integer batchVersion) {
        this.batchVersion = batchVersion;
        return this;
    }
    public Integer getBatchVersion() {
        return this.batchVersion;
    }

    public InsertAiOutboundPhoneNumsRequest setDetails(java.util.List<InsertAiOutboundPhoneNumsRequestDetails> details) {
        this.details = details;
        return this;
    }
    public java.util.List<InsertAiOutboundPhoneNumsRequestDetails> getDetails() {
        return this.details;
    }

    public static class InsertAiOutboundPhoneNumsRequestDetails extends TeaModel {
        // 自定义信息
        @NameInMap("BizData")
        public String bizData;

        // 手机号
        @NameInMap("PhoneNum")
        public String phoneNum;

        public static InsertAiOutboundPhoneNumsRequestDetails build(java.util.Map<String, ?> map) throws Exception {
            InsertAiOutboundPhoneNumsRequestDetails self = new InsertAiOutboundPhoneNumsRequestDetails();
            return TeaModel.build(map, self);
        }

        public InsertAiOutboundPhoneNumsRequestDetails setBizData(String bizData) {
            this.bizData = bizData;
            return this;
        }
        public String getBizData() {
            return this.bizData;
        }

        public InsertAiOutboundPhoneNumsRequestDetails setPhoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
            return this;
        }
        public String getPhoneNum() {
            return this.phoneNum;
        }

    }

}
