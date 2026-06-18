// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class InsertAiOutboundPhoneNumsRequest extends TeaModel {
    /**
     * <p>The batch version number of the job.  </p>
     * <blockquote>
     * <p>If this parameter is not specified, numbers are imported into the default batch.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("BatchVersion")
    public Integer batchVersion;

    /**
     * <p>Number details.  </p>
     * <blockquote>
     * <p>A maximum of 30 entries are allowed.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Details")
    public java.util.List<InsertAiOutboundPhoneNumsRequestDetails> details;

    /**
     * <p>The Artificial Intelligence Cloud Call Service (AICCS) instance ID.<br>You can obtain it from <strong>Instance Management</strong> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agent_***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The job ID.  </p>
     * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/312260.html">CreateAiOutboundTask</a> API and check the <strong>Data</strong> field in the response, or invoke the <a href="https://help.aliyun.com/document_detail/2718026.html">GetAiOutboundTaskList</a> API and check the <strong>TaskId</strong> field in the response.</p>
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
         * <p>Custom business information.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("BizData")
        public String bizData;

        /**
         * <p>The callee number for outbound calls.</p>
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
