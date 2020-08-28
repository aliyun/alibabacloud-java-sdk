// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeTaskAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("TaskAction")
    @Validation(required = true)
    public String taskAction;

    @NameInMap("TaskStatus")
    @Validation(required = true)
    public String taskStatus;

    @NameInMap("TaskProcess")
    @Validation(required = true)
    public String taskProcess;

    @NameInMap("SupportCancel")
    @Validation(required = true)
    public String supportCancel;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("SuccessCount")
    @Validation(required = true)
    public Integer successCount;

    @NameInMap("FailedCount")
    @Validation(required = true)
    public Integer failedCount;

    @NameInMap("CreationTime")
    @Validation(required = true)
    public String creationTime;

    @NameInMap("FinishedTime")
    @Validation(required = true)
    public String finishedTime;

    @NameInMap("OperationProgressSet")
    @Validation(required = true)
    public DescribeTaskAttributeResponseOperationProgressSet operationProgressSet;

    public static DescribeTaskAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskAttributeResponse self = new DescribeTaskAttributeResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeTaskAttributeResponseOperationProgressSetOperationProgressRelatedItemSetRelatedItem extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeTaskAttributeResponseOperationProgressSetOperationProgressRelatedItemSetRelatedItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeTaskAttributeResponseOperationProgressSetOperationProgressRelatedItemSetRelatedItem self = new DescribeTaskAttributeResponseOperationProgressSetOperationProgressRelatedItemSetRelatedItem();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeTaskAttributeResponseOperationProgressSetOperationProgressRelatedItemSet extends TeaModel {
        @NameInMap("RelatedItem")
        @Validation(required = true)
        public java.util.List<DescribeTaskAttributeResponseOperationProgressSetOperationProgressRelatedItemSetRelatedItem> relatedItem;

        public static DescribeTaskAttributeResponseOperationProgressSetOperationProgressRelatedItemSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeTaskAttributeResponseOperationProgressSetOperationProgressRelatedItemSet self = new DescribeTaskAttributeResponseOperationProgressSetOperationProgressRelatedItemSet();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeTaskAttributeResponseOperationProgressSetOperationProgress extends TeaModel {
        @NameInMap("OperationStatus")
        @Validation(required = true)
        public String operationStatus;

        @NameInMap("ErrorCode")
        @Validation(required = true)
        public String errorCode;

        @NameInMap("ErrorMsg")
        @Validation(required = true)
        public String errorMsg;

        @NameInMap("RelatedItemSet")
        @Validation(required = true)
        public DescribeTaskAttributeResponseOperationProgressSetOperationProgressRelatedItemSet relatedItemSet;

        public static DescribeTaskAttributeResponseOperationProgressSetOperationProgress build(java.util.Map<String, ?> map) throws Exception {
            DescribeTaskAttributeResponseOperationProgressSetOperationProgress self = new DescribeTaskAttributeResponseOperationProgressSetOperationProgress();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeTaskAttributeResponseOperationProgressSet extends TeaModel {
        @NameInMap("OperationProgress")
        @Validation(required = true)
        public java.util.List<DescribeTaskAttributeResponseOperationProgressSetOperationProgress> operationProgress;

        public static DescribeTaskAttributeResponseOperationProgressSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeTaskAttributeResponseOperationProgressSet self = new DescribeTaskAttributeResponseOperationProgressSet();
            return TeaModel.build(map, self);
        }

    }

}
