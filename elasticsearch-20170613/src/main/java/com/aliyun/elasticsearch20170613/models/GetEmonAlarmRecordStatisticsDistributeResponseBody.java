// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class GetEmonAlarmRecordStatisticsDistributeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetEmonAlarmRecordStatisticsDistributeResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static GetEmonAlarmRecordStatisticsDistributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEmonAlarmRecordStatisticsDistributeResponseBody self = new GetEmonAlarmRecordStatisticsDistributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEmonAlarmRecordStatisticsDistributeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEmonAlarmRecordStatisticsDistributeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetEmonAlarmRecordStatisticsDistributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEmonAlarmRecordStatisticsDistributeResponseBody setResult(GetEmonAlarmRecordStatisticsDistributeResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetEmonAlarmRecordStatisticsDistributeResponseBodyResult getResult() {
        return this.result;
    }

    public GetEmonAlarmRecordStatisticsDistributeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetEmonAlarmRecordStatisticsDistributeResponseBodyResultAlarmGroupTotal extends TeaModel {
        @NameInMap("alarmGroup")
        public String alarmGroup;

        @NameInMap("compare")
        public String compare;

        @NameInMap("count")
        public Integer count;

        @NameInMap("level")
        public String level;

        @NameInMap("receiver")
        public String receiver;

        @NameInMap("time")
        public Integer time;

        @NameInMap("today")
        public Integer today;

        @NameInMap("type")
        public String type;

        @NameInMap("yesterday")
        public Integer yesterday;

        public static GetEmonAlarmRecordStatisticsDistributeResponseBodyResultAlarmGroupTotal build(java.util.Map<String, ?> map) throws Exception {
            GetEmonAlarmRecordStatisticsDistributeResponseBodyResultAlarmGroupTotal self = new GetEmonAlarmRecordStatisticsDistributeResponseBodyResultAlarmGroupTotal();
            return TeaModel.build(map, self);
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultAlarmGroupTotal setAlarmGroup(String alarmGroup) {
            this.alarmGroup = alarmGroup;
            return this;
        }
        public String getAlarmGroup() {
            return this.alarmGroup;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultAlarmGroupTotal setCompare(String compare) {
            this.compare = compare;
            return this;
        }
        public String getCompare() {
            return this.compare;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultAlarmGroupTotal setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultAlarmGroupTotal setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultAlarmGroupTotal setReceiver(String receiver) {
            this.receiver = receiver;
            return this;
        }
        public String getReceiver() {
            return this.receiver;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultAlarmGroupTotal setTime(Integer time) {
            this.time = time;
            return this;
        }
        public Integer getTime() {
            return this.time;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultAlarmGroupTotal setToday(Integer today) {
            this.today = today;
            return this;
        }
        public Integer getToday() {
            return this.today;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultAlarmGroupTotal setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultAlarmGroupTotal setYesterday(Integer yesterday) {
            this.yesterday = yesterday;
            return this;
        }
        public Integer getYesterday() {
            return this.yesterday;
        }

    }

    public static class GetEmonAlarmRecordStatisticsDistributeResponseBodyResultChannelTotal extends TeaModel {
        @NameInMap("alarmGroup")
        public String alarmGroup;

        @NameInMap("compare")
        public String compare;

        @NameInMap("count")
        public Integer count;

        @NameInMap("level")
        public String level;

        @NameInMap("receiver")
        public String receiver;

        @NameInMap("time")
        public Integer time;

        @NameInMap("today")
        public Integer today;

        @NameInMap("type")
        public String type;

        @NameInMap("yesterday")
        public Integer yesterday;

        public static GetEmonAlarmRecordStatisticsDistributeResponseBodyResultChannelTotal build(java.util.Map<String, ?> map) throws Exception {
            GetEmonAlarmRecordStatisticsDistributeResponseBodyResultChannelTotal self = new GetEmonAlarmRecordStatisticsDistributeResponseBodyResultChannelTotal();
            return TeaModel.build(map, self);
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultChannelTotal setAlarmGroup(String alarmGroup) {
            this.alarmGroup = alarmGroup;
            return this;
        }
        public String getAlarmGroup() {
            return this.alarmGroup;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultChannelTotal setCompare(String compare) {
            this.compare = compare;
            return this;
        }
        public String getCompare() {
            return this.compare;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultChannelTotal setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultChannelTotal setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultChannelTotal setReceiver(String receiver) {
            this.receiver = receiver;
            return this;
        }
        public String getReceiver() {
            return this.receiver;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultChannelTotal setTime(Integer time) {
            this.time = time;
            return this;
        }
        public Integer getTime() {
            return this.time;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultChannelTotal setToday(Integer today) {
            this.today = today;
            return this;
        }
        public Integer getToday() {
            return this.today;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultChannelTotal setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultChannelTotal setYesterday(Integer yesterday) {
            this.yesterday = yesterday;
            return this;
        }
        public Integer getYesterday() {
            return this.yesterday;
        }

    }

    public static class GetEmonAlarmRecordStatisticsDistributeResponseBodyResultLevelTotal extends TeaModel {
        @NameInMap("alarmGroup")
        public String alarmGroup;

        @NameInMap("compare")
        public String compare;

        @NameInMap("count")
        public Integer count;

        @NameInMap("level")
        public String level;

        @NameInMap("receiver")
        public String receiver;

        @NameInMap("time")
        public Integer time;

        @NameInMap("today")
        public Integer today;

        @NameInMap("type")
        public String type;

        @NameInMap("yesterday")
        public Integer yesterday;

        public static GetEmonAlarmRecordStatisticsDistributeResponseBodyResultLevelTotal build(java.util.Map<String, ?> map) throws Exception {
            GetEmonAlarmRecordStatisticsDistributeResponseBodyResultLevelTotal self = new GetEmonAlarmRecordStatisticsDistributeResponseBodyResultLevelTotal();
            return TeaModel.build(map, self);
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultLevelTotal setAlarmGroup(String alarmGroup) {
            this.alarmGroup = alarmGroup;
            return this;
        }
        public String getAlarmGroup() {
            return this.alarmGroup;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultLevelTotal setCompare(String compare) {
            this.compare = compare;
            return this;
        }
        public String getCompare() {
            return this.compare;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultLevelTotal setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultLevelTotal setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultLevelTotal setReceiver(String receiver) {
            this.receiver = receiver;
            return this;
        }
        public String getReceiver() {
            return this.receiver;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultLevelTotal setTime(Integer time) {
            this.time = time;
            return this;
        }
        public Integer getTime() {
            return this.time;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultLevelTotal setToday(Integer today) {
            this.today = today;
            return this;
        }
        public Integer getToday() {
            return this.today;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultLevelTotal setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultLevelTotal setYesterday(Integer yesterday) {
            this.yesterday = yesterday;
            return this;
        }
        public Integer getYesterday() {
            return this.yesterday;
        }

    }

    public static class GetEmonAlarmRecordStatisticsDistributeResponseBodyResultReceiverTotal extends TeaModel {
        @NameInMap("alarmGroup")
        public String alarmGroup;

        @NameInMap("compare")
        public String compare;

        @NameInMap("count")
        public Integer count;

        @NameInMap("level")
        public String level;

        @NameInMap("receiver")
        public String receiver;

        @NameInMap("time")
        public Integer time;

        @NameInMap("today")
        public Integer today;

        @NameInMap("type")
        public String type;

        @NameInMap("yesterday")
        public Integer yesterday;

        public static GetEmonAlarmRecordStatisticsDistributeResponseBodyResultReceiverTotal build(java.util.Map<String, ?> map) throws Exception {
            GetEmonAlarmRecordStatisticsDistributeResponseBodyResultReceiverTotal self = new GetEmonAlarmRecordStatisticsDistributeResponseBodyResultReceiverTotal();
            return TeaModel.build(map, self);
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultReceiverTotal setAlarmGroup(String alarmGroup) {
            this.alarmGroup = alarmGroup;
            return this;
        }
        public String getAlarmGroup() {
            return this.alarmGroup;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultReceiverTotal setCompare(String compare) {
            this.compare = compare;
            return this;
        }
        public String getCompare() {
            return this.compare;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultReceiverTotal setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultReceiverTotal setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultReceiverTotal setReceiver(String receiver) {
            this.receiver = receiver;
            return this;
        }
        public String getReceiver() {
            return this.receiver;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultReceiverTotal setTime(Integer time) {
            this.time = time;
            return this;
        }
        public Integer getTime() {
            return this.time;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultReceiverTotal setToday(Integer today) {
            this.today = today;
            return this;
        }
        public Integer getToday() {
            return this.today;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultReceiverTotal setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultReceiverTotal setYesterday(Integer yesterday) {
            this.yesterday = yesterday;
            return this;
        }
        public Integer getYesterday() {
            return this.yesterday;
        }

    }

    public static class GetEmonAlarmRecordStatisticsDistributeResponseBodyResultStatistics extends TeaModel {
        @NameInMap("alarmGroup")
        public String alarmGroup;

        @NameInMap("compare")
        public String compare;

        @NameInMap("count")
        public Integer count;

        @NameInMap("level")
        public String level;

        @NameInMap("receiver")
        public String receiver;

        @NameInMap("time")
        public Integer time;

        @NameInMap("today")
        public Integer today;

        @NameInMap("type")
        public String type;

        @NameInMap("yesterday")
        public Integer yesterday;

        public static GetEmonAlarmRecordStatisticsDistributeResponseBodyResultStatistics build(java.util.Map<String, ?> map) throws Exception {
            GetEmonAlarmRecordStatisticsDistributeResponseBodyResultStatistics self = new GetEmonAlarmRecordStatisticsDistributeResponseBodyResultStatistics();
            return TeaModel.build(map, self);
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultStatistics setAlarmGroup(String alarmGroup) {
            this.alarmGroup = alarmGroup;
            return this;
        }
        public String getAlarmGroup() {
            return this.alarmGroup;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultStatistics setCompare(String compare) {
            this.compare = compare;
            return this;
        }
        public String getCompare() {
            return this.compare;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultStatistics setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultStatistics setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultStatistics setReceiver(String receiver) {
            this.receiver = receiver;
            return this;
        }
        public String getReceiver() {
            return this.receiver;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultStatistics setTime(Integer time) {
            this.time = time;
            return this;
        }
        public Integer getTime() {
            return this.time;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultStatistics setToday(Integer today) {
            this.today = today;
            return this;
        }
        public Integer getToday() {
            return this.today;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultStatistics setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResultStatistics setYesterday(Integer yesterday) {
            this.yesterday = yesterday;
            return this;
        }
        public Integer getYesterday() {
            return this.yesterday;
        }

    }

    public static class GetEmonAlarmRecordStatisticsDistributeResponseBodyResult extends TeaModel {
        @NameInMap("alarmGroup")
        public String alarmGroup;

        @NameInMap("alarmGroupTotal")
        public java.util.List<GetEmonAlarmRecordStatisticsDistributeResponseBodyResultAlarmGroupTotal> alarmGroupTotal;

        @NameInMap("channelTotal")
        public java.util.List<GetEmonAlarmRecordStatisticsDistributeResponseBodyResultChannelTotal> channelTotal;

        @NameInMap("count")
        public Integer count;

        @NameInMap("levelTotal")
        public java.util.List<GetEmonAlarmRecordStatisticsDistributeResponseBodyResultLevelTotal> levelTotal;

        @NameInMap("receiverTotal")
        public java.util.List<GetEmonAlarmRecordStatisticsDistributeResponseBodyResultReceiverTotal> receiverTotal;

        @NameInMap("statistics")
        public java.util.List<GetEmonAlarmRecordStatisticsDistributeResponseBodyResultStatistics> statistics;

        public static GetEmonAlarmRecordStatisticsDistributeResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetEmonAlarmRecordStatisticsDistributeResponseBodyResult self = new GetEmonAlarmRecordStatisticsDistributeResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResult setAlarmGroup(String alarmGroup) {
            this.alarmGroup = alarmGroup;
            return this;
        }
        public String getAlarmGroup() {
            return this.alarmGroup;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResult setAlarmGroupTotal(java.util.List<GetEmonAlarmRecordStatisticsDistributeResponseBodyResultAlarmGroupTotal> alarmGroupTotal) {
            this.alarmGroupTotal = alarmGroupTotal;
            return this;
        }
        public java.util.List<GetEmonAlarmRecordStatisticsDistributeResponseBodyResultAlarmGroupTotal> getAlarmGroupTotal() {
            return this.alarmGroupTotal;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResult setChannelTotal(java.util.List<GetEmonAlarmRecordStatisticsDistributeResponseBodyResultChannelTotal> channelTotal) {
            this.channelTotal = channelTotal;
            return this;
        }
        public java.util.List<GetEmonAlarmRecordStatisticsDistributeResponseBodyResultChannelTotal> getChannelTotal() {
            return this.channelTotal;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResult setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResult setLevelTotal(java.util.List<GetEmonAlarmRecordStatisticsDistributeResponseBodyResultLevelTotal> levelTotal) {
            this.levelTotal = levelTotal;
            return this;
        }
        public java.util.List<GetEmonAlarmRecordStatisticsDistributeResponseBodyResultLevelTotal> getLevelTotal() {
            return this.levelTotal;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResult setReceiverTotal(java.util.List<GetEmonAlarmRecordStatisticsDistributeResponseBodyResultReceiverTotal> receiverTotal) {
            this.receiverTotal = receiverTotal;
            return this;
        }
        public java.util.List<GetEmonAlarmRecordStatisticsDistributeResponseBodyResultReceiverTotal> getReceiverTotal() {
            return this.receiverTotal;
        }

        public GetEmonAlarmRecordStatisticsDistributeResponseBodyResult setStatistics(java.util.List<GetEmonAlarmRecordStatisticsDistributeResponseBodyResultStatistics> statistics) {
            this.statistics = statistics;
            return this;
        }
        public java.util.List<GetEmonAlarmRecordStatisticsDistributeResponseBodyResultStatistics> getStatistics() {
            return this.statistics;
        }

    }

}
