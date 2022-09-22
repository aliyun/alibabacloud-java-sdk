// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeConfigHistoryResponseBody extends TeaModel {
    @NameInMap("ConfigHistoryItems")
    public java.util.List<DescribeConfigHistoryResponseBodyConfigHistoryItems> configHistoryItems;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeConfigHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigHistoryResponseBody self = new DescribeConfigHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConfigHistoryResponseBody setConfigHistoryItems(java.util.List<DescribeConfigHistoryResponseBodyConfigHistoryItems> configHistoryItems) {
        this.configHistoryItems = configHistoryItems;
        return this;
    }
    public java.util.List<DescribeConfigHistoryResponseBodyConfigHistoryItems> getConfigHistoryItems() {
        return this.configHistoryItems;
    }

    public DescribeConfigHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeConfigHistoryResponseBodyConfigHistoryItems extends TeaModel {
        @NameInMap("ChangeId")
        public String changeId;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Time")
        public String time;

        public static DescribeConfigHistoryResponseBodyConfigHistoryItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigHistoryResponseBodyConfigHistoryItems self = new DescribeConfigHistoryResponseBodyConfigHistoryItems();
            return TeaModel.build(map, self);
        }

        public DescribeConfigHistoryResponseBodyConfigHistoryItems setChangeId(String changeId) {
            this.changeId = changeId;
            return this;
        }
        public String getChangeId() {
            return this.changeId;
        }

        public DescribeConfigHistoryResponseBodyConfigHistoryItems setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public DescribeConfigHistoryResponseBodyConfigHistoryItems setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeConfigHistoryResponseBodyConfigHistoryItems setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public DescribeConfigHistoryResponseBodyConfigHistoryItems setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

}
