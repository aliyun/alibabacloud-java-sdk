// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListAlarmStatusHistoriesResponseBody extends TeaModel {
    // 数据列表
    @NameInMap("AlarmStatusHistories")
    public java.util.List<ListAlarmStatusHistoriesResponseBodyAlarmStatusHistories> alarmStatusHistories;

    // request id
    @NameInMap("RequestId")
    public String requestId;

    public static ListAlarmStatusHistoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmStatusHistoriesResponseBody self = new ListAlarmStatusHistoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlarmStatusHistoriesResponseBody setAlarmStatusHistories(java.util.List<ListAlarmStatusHistoriesResponseBodyAlarmStatusHistories> alarmStatusHistories) {
        this.alarmStatusHistories = alarmStatusHistories;
        return this;
    }
    public java.util.List<ListAlarmStatusHistoriesResponseBodyAlarmStatusHistories> getAlarmStatusHistories() {
        return this.alarmStatusHistories;
    }

    public ListAlarmStatusHistoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAlarmStatusHistoriesResponseBodyAlarmStatusHistories extends TeaModel {
        // 时间戳
        @NameInMap("Timestamp")
        public Long timestamp;

        // 数值
        @NameInMap("Value")
        public String value;

        public static ListAlarmStatusHistoriesResponseBodyAlarmStatusHistories build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmStatusHistoriesResponseBodyAlarmStatusHistories self = new ListAlarmStatusHistoriesResponseBodyAlarmStatusHistories();
            return TeaModel.build(map, self);
        }

        public ListAlarmStatusHistoriesResponseBodyAlarmStatusHistories setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public ListAlarmStatusHistoriesResponseBodyAlarmStatusHistories setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
