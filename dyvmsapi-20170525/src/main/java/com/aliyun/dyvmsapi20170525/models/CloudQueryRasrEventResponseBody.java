// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudQueryRasrEventResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudQueryRasrEventResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>D9CB3933-9FE3-4870-BA8E-2BEE91B69D23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudQueryRasrEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudQueryRasrEventResponseBody self = new CloudQueryRasrEventResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudQueryRasrEventResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudQueryRasrEventResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudQueryRasrEventResponseBody setData(CloudQueryRasrEventResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudQueryRasrEventResponseBodyData getData() {
        return this.data;
    }

    public CloudQueryRasrEventResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudQueryRasrEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudQueryRasrEventResponseBodyDataList extends TeaModel {
        /**
         * <p>机器人对话文本信息</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("BotText")
        public String botText;

        /**
         * <p>坐席工号</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("Cno")
        public String cno;

        /**
         * <p>客户号码</p>
         * 
         * <strong>example:</strong>
         * <p>177xxxx1313</p>
         */
        @NameInMap("CustomerNumber")
        public String customerNumber;

        /**
         * <p>结束时间</p>
         * 
         * <strong>example:</strong>
         * <p>1768615738</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>引擎</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>呼叫中心 id</p>
         * 
         * <strong>example:</strong>
         * <p>7000002</p>
         */
        @NameInMap("EnterpriseId")
        public String enterpriseId;

        /**
         * <p>通话唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>sip-2-1558615724.87</p>
         */
        @NameInMap("MainUniqueId")
        public String mainUniqueId;

        /**
         * <p>混音录音文件名</p>
         * 
         * <strong>example:</strong>
         * <p>sip-2-1558615724.87-54529-mix</p>
         */
        @NameInMap("MixRecordFile")
        public String mixRecordFile;

        /**
         * <p>1:座席侧（webcall是第二侧），2:客户侧（webcall是第一侧）</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MonitorSide")
        public String monitorSide;

        /**
         * <p>机器人侧录音文件名</p>
         * 
         * <strong>example:</strong>
         * <p>sip-2-1558615724.87-54529-out</p>
         */
        @NameInMap("OutRecordFile")
        public String outRecordFile;

        /**
         * <p>持续时间</p>
         * 
         * <strong>example:</strong>
         * <p>333</p>
         */
        @NameInMap("RasrDuration")
        public String rasrDuration;

        /**
         * <p>客户侧录音文件名</p>
         * 
         * <strong>example:</strong>
         * <p>sip-2-1558615724.87-54529-in</p>
         */
        @NameInMap("RecordFile")
        public String recordFile;

        /**
         * <p>开始时间</p>
         * 
         * <strong>example:</strong>
         * <p>96</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>客户对话文本信息</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>通话唯一标识</p>
         * 
         * <strong>example:</strong>
         * <p>sip-2-1480660149.0</p>
         */
        @NameInMap("UniqueId")
        public String uniqueId;

        public static CloudQueryRasrEventResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            CloudQueryRasrEventResponseBodyDataList self = new CloudQueryRasrEventResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public CloudQueryRasrEventResponseBodyDataList setBotText(String botText) {
            this.botText = botText;
            return this;
        }
        public String getBotText() {
            return this.botText;
        }

        public CloudQueryRasrEventResponseBodyDataList setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public CloudQueryRasrEventResponseBodyDataList setCustomerNumber(String customerNumber) {
            this.customerNumber = customerNumber;
            return this;
        }
        public String getCustomerNumber() {
            return this.customerNumber;
        }

        public CloudQueryRasrEventResponseBodyDataList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public CloudQueryRasrEventResponseBodyDataList setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public CloudQueryRasrEventResponseBodyDataList setEnterpriseId(String enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public String getEnterpriseId() {
            return this.enterpriseId;
        }

        public CloudQueryRasrEventResponseBodyDataList setMainUniqueId(String mainUniqueId) {
            this.mainUniqueId = mainUniqueId;
            return this;
        }
        public String getMainUniqueId() {
            return this.mainUniqueId;
        }

        public CloudQueryRasrEventResponseBodyDataList setMixRecordFile(String mixRecordFile) {
            this.mixRecordFile = mixRecordFile;
            return this;
        }
        public String getMixRecordFile() {
            return this.mixRecordFile;
        }

        public CloudQueryRasrEventResponseBodyDataList setMonitorSide(String monitorSide) {
            this.monitorSide = monitorSide;
            return this;
        }
        public String getMonitorSide() {
            return this.monitorSide;
        }

        public CloudQueryRasrEventResponseBodyDataList setOutRecordFile(String outRecordFile) {
            this.outRecordFile = outRecordFile;
            return this;
        }
        public String getOutRecordFile() {
            return this.outRecordFile;
        }

        public CloudQueryRasrEventResponseBodyDataList setRasrDuration(String rasrDuration) {
            this.rasrDuration = rasrDuration;
            return this;
        }
        public String getRasrDuration() {
            return this.rasrDuration;
        }

        public CloudQueryRasrEventResponseBodyDataList setRecordFile(String recordFile) {
            this.recordFile = recordFile;
            return this;
        }
        public String getRecordFile() {
            return this.recordFile;
        }

        public CloudQueryRasrEventResponseBodyDataList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public CloudQueryRasrEventResponseBodyDataList setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public CloudQueryRasrEventResponseBodyDataList setUniqueId(String uniqueId) {
            this.uniqueId = uniqueId;
            return this;
        }
        public String getUniqueId() {
            return this.uniqueId;
        }

    }

    public static class CloudQueryRasrEventResponseBodyData extends TeaModel {
        /**
         * <p>返回数据</p>
         */
        @NameInMap("List")
        public java.util.List<CloudQueryRasrEventResponseBodyDataList> list;

        public static CloudQueryRasrEventResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudQueryRasrEventResponseBodyData self = new CloudQueryRasrEventResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudQueryRasrEventResponseBodyData setList(java.util.List<CloudQueryRasrEventResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<CloudQueryRasrEventResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
