// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SubmitQualityWatchTasksRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SubmitCommand")
    public SubmitQualityWatchTasksRequestSubmitCommand submitCommand;

    public static SubmitQualityWatchTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitQualityWatchTasksRequest self = new SubmitQualityWatchTasksRequest();
        return TeaModel.build(map, self);
    }

    public SubmitQualityWatchTasksRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public SubmitQualityWatchTasksRequest setSubmitCommand(SubmitQualityWatchTasksRequestSubmitCommand submitCommand) {
        this.submitCommand = submitCommand;
        return this;
    }
    public SubmitQualityWatchTasksRequestSubmitCommand getSubmitCommand() {
        return this.submitCommand;
    }

    public static class SubmitQualityWatchTasksRequestSubmitCommand extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-06-30</p>
         */
        @NameInMap("BizDate")
        public String bizDate;

        /**
         * <strong>example:</strong>
         * <p>ds=${yyyyMMdd}</p>
         */
        @NameInMap("PartitionExpression")
        public String partitionExpression;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("WatchIdList")
        public java.util.List<Long> watchIdList;

        public static SubmitQualityWatchTasksRequestSubmitCommand build(java.util.Map<String, ?> map) throws Exception {
            SubmitQualityWatchTasksRequestSubmitCommand self = new SubmitQualityWatchTasksRequestSubmitCommand();
            return TeaModel.build(map, self);
        }

        public SubmitQualityWatchTasksRequestSubmitCommand setBizDate(String bizDate) {
            this.bizDate = bizDate;
            return this;
        }
        public String getBizDate() {
            return this.bizDate;
        }

        public SubmitQualityWatchTasksRequestSubmitCommand setPartitionExpression(String partitionExpression) {
            this.partitionExpression = partitionExpression;
            return this;
        }
        public String getPartitionExpression() {
            return this.partitionExpression;
        }

        public SubmitQualityWatchTasksRequestSubmitCommand setWatchIdList(java.util.List<Long> watchIdList) {
            this.watchIdList = watchIdList;
            return this;
        }
        public java.util.List<Long> getWatchIdList() {
            return this.watchIdList;
        }

    }

}
