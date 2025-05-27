// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class ListRebalanceInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public ListRebalanceInfoResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>operation success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>06084011-E093-46F3-A51F-4B19A8AD****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListRebalanceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRebalanceInfoResponseBody self = new ListRebalanceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRebalanceInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListRebalanceInfoResponseBody setData(ListRebalanceInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListRebalanceInfoResponseBodyData getData() {
        return this.data;
    }

    public ListRebalanceInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRebalanceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRebalanceInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListRebalanceInfoResponseBodyDataRebalanceInfoList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Generation")
        public Long generation;

        /**
         * <strong>example:</strong>
         * <p>kafka-test</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <strong>example:</strong>
         * <p>1709199270</p>
         */
        @NameInMap("LastRebalanceTimestamp")
        public Long lastRebalanceTimestamp;

        /**
         * <strong>example:</strong>
         * <p>removing member consumer-1-cd14eb9c-379b-4b8e-9bbd-76f147f8536f on LeaveGroup</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RebalanceSuccess")
        public Boolean rebalanceSuccess;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("RebalanceTimeConsuming")
        public Long rebalanceTimeConsuming;

        public static ListRebalanceInfoResponseBodyDataRebalanceInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListRebalanceInfoResponseBodyDataRebalanceInfoList self = new ListRebalanceInfoResponseBodyDataRebalanceInfoList();
            return TeaModel.build(map, self);
        }

        public ListRebalanceInfoResponseBodyDataRebalanceInfoList setGeneration(Long generation) {
            this.generation = generation;
            return this;
        }
        public Long getGeneration() {
            return this.generation;
        }

        public ListRebalanceInfoResponseBodyDataRebalanceInfoList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListRebalanceInfoResponseBodyDataRebalanceInfoList setLastRebalanceTimestamp(Long lastRebalanceTimestamp) {
            this.lastRebalanceTimestamp = lastRebalanceTimestamp;
            return this;
        }
        public Long getLastRebalanceTimestamp() {
            return this.lastRebalanceTimestamp;
        }

        public ListRebalanceInfoResponseBodyDataRebalanceInfoList setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListRebalanceInfoResponseBodyDataRebalanceInfoList setRebalanceSuccess(Boolean rebalanceSuccess) {
            this.rebalanceSuccess = rebalanceSuccess;
            return this;
        }
        public Boolean getRebalanceSuccess() {
            return this.rebalanceSuccess;
        }

        public ListRebalanceInfoResponseBodyDataRebalanceInfoList setRebalanceTimeConsuming(Long rebalanceTimeConsuming) {
            this.rebalanceTimeConsuming = rebalanceTimeConsuming;
            return this;
        }
        public Long getRebalanceTimeConsuming() {
            return this.rebalanceTimeConsuming;
        }

    }

    public static class ListRebalanceInfoResponseBodyData extends TeaModel {
        @NameInMap("RebalanceInfoList")
        public java.util.List<ListRebalanceInfoResponseBodyDataRebalanceInfoList> rebalanceInfoList;

        public static ListRebalanceInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRebalanceInfoResponseBodyData self = new ListRebalanceInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRebalanceInfoResponseBodyData setRebalanceInfoList(java.util.List<ListRebalanceInfoResponseBodyDataRebalanceInfoList> rebalanceInfoList) {
            this.rebalanceInfoList = rebalanceInfoList;
            return this;
        }
        public java.util.List<ListRebalanceInfoResponseBodyDataRebalanceInfoList> getRebalanceInfoList() {
            return this.rebalanceInfoList;
        }

    }

}
