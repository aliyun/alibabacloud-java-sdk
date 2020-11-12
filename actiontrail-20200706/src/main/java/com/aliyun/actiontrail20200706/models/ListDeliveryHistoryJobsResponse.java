// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class ListDeliveryHistoryJobsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("DeliveryHistoryJobs")
    @Validation(required = true)
    public java.util.List<ListDeliveryHistoryJobsResponseDeliveryHistoryJobs> deliveryHistoryJobs;

    public static ListDeliveryHistoryJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeliveryHistoryJobsResponse self = new ListDeliveryHistoryJobsResponse();
        return TeaModel.build(map, self);
    }

    public ListDeliveryHistoryJobsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeliveryHistoryJobsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListDeliveryHistoryJobsResponse setDeliveryHistoryJobs(java.util.List<ListDeliveryHistoryJobsResponseDeliveryHistoryJobs> deliveryHistoryJobs) {
        this.deliveryHistoryJobs = deliveryHistoryJobs;
        return this;
    }
    public java.util.List<ListDeliveryHistoryJobsResponseDeliveryHistoryJobs> getDeliveryHistoryJobs() {
        return this.deliveryHistoryJobs;
    }

    public static class ListDeliveryHistoryJobsResponseDeliveryHistoryJobs extends TeaModel {
        @NameInMap("TrailName")
        @Validation(required = true)
        public String trailName;

        @NameInMap("CreatedTime")
        @Validation(required = true)
        public String createdTime;

        @NameInMap("UpdatedTime")
        @Validation(required = true)
        public String updatedTime;

        @NameInMap("HomeRegion")
        @Validation(required = true)
        public String homeRegion;

        public static ListDeliveryHistoryJobsResponseDeliveryHistoryJobs build(java.util.Map<String, ?> map) throws Exception {
            ListDeliveryHistoryJobsResponseDeliveryHistoryJobs self = new ListDeliveryHistoryJobsResponseDeliveryHistoryJobs();
            return TeaModel.build(map, self);
        }

        public ListDeliveryHistoryJobsResponseDeliveryHistoryJobs setTrailName(String trailName) {
            this.trailName = trailName;
            return this;
        }
        public String getTrailName() {
            return this.trailName;
        }

        public ListDeliveryHistoryJobsResponseDeliveryHistoryJobs setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListDeliveryHistoryJobsResponseDeliveryHistoryJobs setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

        public ListDeliveryHistoryJobsResponseDeliveryHistoryJobs setHomeRegion(String homeRegion) {
            this.homeRegion = homeRegion;
            return this;
        }
        public String getHomeRegion() {
            return this.homeRegion;
        }

    }

}
