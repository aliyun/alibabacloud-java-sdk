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
     * 
     * <strong>example:</strong>
     * <p>D0CEC6AC-7760-409A-A0D5-E6CD8660E9CC</p>
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
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ChangeId")
        public String changeId;

        /**
         * <p>The user ID (UID) of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>253460731706911258</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The reason for the setting modification of the configuration parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>Indicates whether the setting modification of the configuration parameters took effect. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        /**
         * <p>The time when the values of the configuration parameters were changed. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-22T10:00:00Z</p>
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
