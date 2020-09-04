// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class DescribePublishPlanDataResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("UpdateData")
    @Validation(required = true)
    public DescribePublishPlanDataResponseUpdateData updateData;

    public static DescribePublishPlanDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePublishPlanDataResponse self = new DescribePublishPlanDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribePublishPlanDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePublishPlanDataResponse setUpdateData(DescribePublishPlanDataResponseUpdateData updateData) {
        this.updateData = updateData;
        return this;
    }
    public DescribePublishPlanDataResponseUpdateData getUpdateData() {
        return this.updateData;
    }

    public static class DescribePublishPlanDataResponseUpdateData extends TeaModel {
        @NameInMap("NotifiedCount")
        @Validation(required = true)
        public Long notifiedCount;

        @NameInMap("UpdatedCount")
        @Validation(required = true)
        public Long updatedCount;

        public static DescribePublishPlanDataResponseUpdateData build(java.util.Map<String, ?> map) throws Exception {
            DescribePublishPlanDataResponseUpdateData self = new DescribePublishPlanDataResponseUpdateData();
            return TeaModel.build(map, self);
        }

        public DescribePublishPlanDataResponseUpdateData setNotifiedCount(Long notifiedCount) {
            this.notifiedCount = notifiedCount;
            return this;
        }
        public Long getNotifiedCount() {
            return this.notifiedCount;
        }

        public DescribePublishPlanDataResponseUpdateData setUpdatedCount(Long updatedCount) {
            this.updatedCount = updatedCount;
            return this;
        }
        public Long getUpdatedCount() {
            return this.updatedCount;
        }

    }

}
