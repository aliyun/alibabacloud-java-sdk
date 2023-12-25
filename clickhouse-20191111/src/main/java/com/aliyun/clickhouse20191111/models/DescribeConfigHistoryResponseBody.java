// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeConfigHistoryResponseBody extends TeaModel {
    /**
     * <p>The change records of the configuration parameters.</p>
     */
    @NameInMap("ConfigHistoryItems")
    public java.util.List<DescribeConfigHistoryResponseBodyConfigHistoryItems> configHistoryItems;

    /**
     * <p>The request ID.</p>
     */
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
        /**
         * <p>The ID of the change record.</p>
         */
        @NameInMap("ChangeId")
        public String changeId;

        /**
         * <p>The user ID (UID) of the Alibaba Cloud account.</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The reason for the setting modification of the configuration parameters.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>Indicates whether the setting modification of the configuration parameters took effect. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Success")
        public Boolean success;

        /**
         * <p>The time when the values of the configuration parameters were changed. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
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
