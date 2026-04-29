// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudCreateEnterpriseTimeResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudCreateEnterpriseTimeResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>ED18A5AE-9BBC-5851-1111-8E5B8C23CEDE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudCreateEnterpriseTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudCreateEnterpriseTimeResponseBody self = new CloudCreateEnterpriseTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudCreateEnterpriseTimeResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudCreateEnterpriseTimeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudCreateEnterpriseTimeResponseBody setData(CloudCreateEnterpriseTimeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudCreateEnterpriseTimeResponseBodyData getData() {
        return this.data;
    }

    public CloudCreateEnterpriseTimeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudCreateEnterpriseTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudCreateEnterpriseTimeResponseBodyData extends TeaModel {
        /**
         * <p>创建时间，格式为： yyyy-MM-dd HH:mm:ss</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-20 10:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>星期 周一：2、周二：3、周三：4、周四：5、周五：6、周六：7、周日：1、使用&quot;,&quot;进行分割、type=2时为空串</p>
         * 
         * <strong>example:</strong>
         * <p>2,3,4</p>
         */
        @NameInMap("DayOfWeek")
        public String dayOfWeek;

        /**
         * <p>结束时间 格式为 HH:mm startTime不能大于endTime</p>
         * 
         * <strong>example:</strong>
         * <p>19:00</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>呼叫中心编号</p>
         * 
         * <strong>example:</strong>
         * <p>7000002</p>
         */
        @NameInMap("EnterpriseId")
        public String enterpriseId;

        /**
         * <p>起始日期 格式为：yyyy-MM-dd、type=1时为空串 fromDay不能大于toDay</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-20</p>
         */
        @NameInMap("FromDay")
        public String fromDay;

        /**
         * <p>时间条件id</p>
         * 
         * <strong>example:</strong>
         * <p>236</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>时间条件名称 、同一呼叫中心下不能重复</p>
         * 
         * <strong>example:</strong>
         * <p>demo01</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>优先级、同一呼叫中心下不能重复，值从1开始，值越小优先级越高</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>开始时间 格式为 HH:mm startTime不能大于endTime</p>
         * 
         * <strong>example:</strong>
         * <p>06:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>时间类型 1.连续 2.间隔</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TimeType")
        public String timeType;

        /**
         * <p>终止日期 格式为：yyyy-MM-dd、type=1时为空串 fromDay不能大于toDay</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-25</p>
         */
        @NameInMap("ToDay")
        public String toDay;

        /**
         * <p>时间条件类型 1:按照星期配置 2:按照固定时间配置</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public String type;

        public static CloudCreateEnterpriseTimeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudCreateEnterpriseTimeResponseBodyData self = new CloudCreateEnterpriseTimeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudCreateEnterpriseTimeResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CloudCreateEnterpriseTimeResponseBodyData setDayOfWeek(String dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            return this;
        }
        public String getDayOfWeek() {
            return this.dayOfWeek;
        }

        public CloudCreateEnterpriseTimeResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CloudCreateEnterpriseTimeResponseBodyData setEnterpriseId(String enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public String getEnterpriseId() {
            return this.enterpriseId;
        }

        public CloudCreateEnterpriseTimeResponseBodyData setFromDay(String fromDay) {
            this.fromDay = fromDay;
            return this;
        }
        public String getFromDay() {
            return this.fromDay;
        }

        public CloudCreateEnterpriseTimeResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CloudCreateEnterpriseTimeResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CloudCreateEnterpriseTimeResponseBodyData setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public CloudCreateEnterpriseTimeResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public CloudCreateEnterpriseTimeResponseBodyData setTimeType(String timeType) {
            this.timeType = timeType;
            return this;
        }
        public String getTimeType() {
            return this.timeType;
        }

        public CloudCreateEnterpriseTimeResponseBodyData setToDay(String toDay) {
            this.toDay = toDay;
            return this;
        }
        public String getToDay() {
            return this.toDay;
        }

        public CloudCreateEnterpriseTimeResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
