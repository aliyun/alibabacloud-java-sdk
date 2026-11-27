// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class InsertAiOutboundPhoneNumsRequest extends TeaModel {
    /**
     * <p>The task batch number.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the numbers are imported to the default batch.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("BatchVersion")
    public Integer batchVersion;

    /**
     * <p>The number details.</p>
     * <blockquote>
     * <p>A maximum of 30 entries are supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Details")
    public java.util.List<InsertAiOutboundPhoneNumsRequestDetails> details;

    /**
     * <p>The AICCS instance ID.
     * You can obtain the instance ID in the <b>Instances</b> section of the left-side navigation pane in the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agent_***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The task ID.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/312260.html">CreateAiOutboundTask</a> operation and view the <strong>Data</strong> response parameter, or call the <a href="https://help.aliyun.com/document_detail/2718026.html">GetAiOutboundTaskList</a> operation and view the <strong>TaskId</strong> response parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static InsertAiOutboundPhoneNumsRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertAiOutboundPhoneNumsRequest self = new InsertAiOutboundPhoneNumsRequest();
        return TeaModel.build(map, self);
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

    public static class InsertAiOutboundPhoneNumsRequestDetails extends TeaModel {
        /**
         * <p>The custom business information.</p>
         * 
         * <strong>example:</strong>
         * <p>ioi-qerhne-hoz-114c</p>
         */
        @NameInMap("BizData")
        public String bizData;

        /**
         * <p>The outbound called number.</p>
         * 
         * <strong>example:</strong>
         * <p>150****0000</p>
         */
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
