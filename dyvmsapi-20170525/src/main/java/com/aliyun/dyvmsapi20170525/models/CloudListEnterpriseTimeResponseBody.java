// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudListEnterpriseTimeResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudListEnterpriseTimeResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>F655A8D5-B967-440B-8683-DAD6FF8DE990</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudListEnterpriseTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudListEnterpriseTimeResponseBody self = new CloudListEnterpriseTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudListEnterpriseTimeResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudListEnterpriseTimeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudListEnterpriseTimeResponseBody setData(CloudListEnterpriseTimeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudListEnterpriseTimeResponseBodyData getData() {
        return this.data;
    }

    public CloudListEnterpriseTimeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudListEnterpriseTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudListEnterpriseTimeResponseBodyDataList extends TeaModel {
        /**
         * <p>创建时间，格式为： yyyy-MM-dd HH:mm:ss</p>
         * 
         * <strong>example:</strong>
         * <p>2026-02-20 10:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>星期 周一：2、周二：3、周三：4、周四：5、周五：6、周六：7、周日：1、使用&quot;,&quot;进行分割、type=2时为空串</p>
         * 
         * <strong>example:</strong>
         * <p>1,2,3</p>
         */
        @NameInMap("DayOfWeek")
        public String dayOfWeek;

        /**
         * <p>结束时间 格式为 HH:mm startTime不能大于endTime</p>
         * 
         * <strong>example:</strong>
         * <p>20:00</p>
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
         * <p>12314</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>时间条件名称 、同一呼叫中心下不能重复</p>
         * 
         * <strong>example:</strong>
         * <p>time-setting-name</p>
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
         * <p>10:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TimeType")
        public String timeType;

        /**
         * <p>终止日期 格式为：yyyy-MM-dd、type=1时为空串 fromDay不能大于toDay</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-22</p>
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

        public static CloudListEnterpriseTimeResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            CloudListEnterpriseTimeResponseBodyDataList self = new CloudListEnterpriseTimeResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public CloudListEnterpriseTimeResponseBodyDataList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CloudListEnterpriseTimeResponseBodyDataList setDayOfWeek(String dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            return this;
        }
        public String getDayOfWeek() {
            return this.dayOfWeek;
        }

        public CloudListEnterpriseTimeResponseBodyDataList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public CloudListEnterpriseTimeResponseBodyDataList setEnterpriseId(String enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public String getEnterpriseId() {
            return this.enterpriseId;
        }

        public CloudListEnterpriseTimeResponseBodyDataList setFromDay(String fromDay) {
            this.fromDay = fromDay;
            return this;
        }
        public String getFromDay() {
            return this.fromDay;
        }

        public CloudListEnterpriseTimeResponseBodyDataList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CloudListEnterpriseTimeResponseBodyDataList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CloudListEnterpriseTimeResponseBodyDataList setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public CloudListEnterpriseTimeResponseBodyDataList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public CloudListEnterpriseTimeResponseBodyDataList setTimeType(String timeType) {
            this.timeType = timeType;
            return this;
        }
        public String getTimeType() {
            return this.timeType;
        }

        public CloudListEnterpriseTimeResponseBodyDataList setToDay(String toDay) {
            this.toDay = toDay;
            return this;
        }
        public String getToDay() {
            return this.toDay;
        }

        public CloudListEnterpriseTimeResponseBodyDataList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CloudListEnterpriseTimeResponseBodyData extends TeaModel {
        /**
         * <p>时间条件设置列表</p>
         */
        @NameInMap("List")
        public java.util.List<CloudListEnterpriseTimeResponseBodyDataList> list;

        public static CloudListEnterpriseTimeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudListEnterpriseTimeResponseBodyData self = new CloudListEnterpriseTimeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudListEnterpriseTimeResponseBodyData setList(java.util.List<CloudListEnterpriseTimeResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<CloudListEnterpriseTimeResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
