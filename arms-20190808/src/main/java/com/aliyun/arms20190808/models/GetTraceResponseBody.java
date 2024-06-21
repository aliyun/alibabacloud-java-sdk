// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetTraceResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6A9AEA84-7186-4D8D-B498-4585C6A2****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the trace.</p>
     */
    @NameInMap("Spans")
    public java.util.List<GetTraceResponseBodySpans> spans;

    public static GetTraceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTraceResponseBody self = new GetTraceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTraceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTraceResponseBody setSpans(java.util.List<GetTraceResponseBodySpans> spans) {
        this.spans = spans;
        return this;
    }
    public java.util.List<GetTraceResponseBodySpans> getSpans() {
        return this.spans;
    }

    public static class GetTraceResponseBodySpansLogEventListTagEntryList extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>http.status.code</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetTraceResponseBodySpansLogEventListTagEntryList build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseBodySpansLogEventListTagEntryList self = new GetTraceResponseBodySpansLogEventListTagEntryList();
            return TeaModel.build(map, self);
        }

        public GetTraceResponseBodySpansLogEventListTagEntryList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetTraceResponseBodySpansLogEventListTagEntryList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetTraceResponseBodySpansLogEventList extends TeaModel {
        /**
         * <p>The tags of the trace.</p>
         */
        @NameInMap("TagEntryList")
        public java.util.List<GetTraceResponseBodySpansLogEventListTagEntryList> tagEntryList;

        /**
         * <p>The timestamp when the log event was generated.</p>
         * 
         * <strong>example:</strong>
         * <p>1590388651</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        public static GetTraceResponseBodySpansLogEventList build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseBodySpansLogEventList self = new GetTraceResponseBodySpansLogEventList();
            return TeaModel.build(map, self);
        }

        public GetTraceResponseBodySpansLogEventList setTagEntryList(java.util.List<GetTraceResponseBodySpansLogEventListTagEntryList> tagEntryList) {
            this.tagEntryList = tagEntryList;
            return this;
        }
        public java.util.List<GetTraceResponseBodySpansLogEventListTagEntryList> getTagEntryList() {
            return this.tagEntryList;
        }

        public GetTraceResponseBodySpansLogEventList setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

    public static class GetTraceResponseBodySpansTagEntryList extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>http.status.code</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetTraceResponseBodySpansTagEntryList build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseBodySpansTagEntryList self = new GetTraceResponseBodySpansTagEntryList();
            return TeaModel.build(map, self);
        }

        public GetTraceResponseBodySpansTagEntryList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetTraceResponseBodySpansTagEntryList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetTraceResponseBodySpans extends TeaModel {
        /**
         * <p>The child spans of the current span.</p>
         */
        @NameInMap("Children")
        public java.util.List<java.util.Map<String, ?>> children;

        /**
         * <p>The amount of time consumed by the trace. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>Indicates whether a method stack was provided.</p>
         * <ul>
         * <li><code>true</code>: A method stack was provided.</li>
         * <li><code>false</code>: No method stack was provided.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HaveStack")
        public Boolean haveStack;

        /**
         * <p>The log events in the trace.</p>
         */
        @NameInMap("LogEventList")
        public java.util.List<GetTraceResponseBodySpansLogEventList> logEventList;

        /**
         * <p>The name of the traced span.</p>
         * 
         * <strong>example:</strong>
         * <p>/api/demo</p>
         */
        @NameInMap("OperationName")
        public String operationName;

        /**
         * <p>The ID of the parent span.</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("ParentSpanId")
        public String parentSpanId;

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>222</p>
         */
        @NameInMap("ResultCode")
        public String resultCode;

        /**
         * <p>The ID of the RPC mode.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RpcId")
        public String rpcId;

        /**
         * <p>The type of the remote procedure call (RPC) mode.</p>
         * <ul>
         * <li>0 http</li>
         * <li>25 http_client</li>
         * <li>1 hsf_client</li>
         * <li>2 hsf</li>
         * <li>40 local</li>
         * <li>41 async</li>
         * <li>52 DB2</li>
         * <li>53 Informix</li>
         * <li>54 SequoiaDB</li>
         * <li>55 Gbase</li>
         * <li>56 GaussDB</li>
         * <li>57 KingBase</li>
         * <li>58 infuxdb</li>
         * <li>59 clickhouse</li>
         * <li>60 mysql</li>
         * <li>61 mysql</li>
         * <li>62 oracle</li>
         * <li>63 postgresql</li>
         * <li>64 mongodb</li>
         * <li>65 ppas</li>
         * <li>66 sqlserver</li>
         * <li>67 mariadb</li>
         * <li>68 dmdb</li>
         * <li>69 oceanbase</li>
         * <li>70 redis</li>
         * <li>71 memcached</li>
         * <li>72 elasticsearch</li>
         * <li>73 kudu</li>
         * <li>4 tddl</li>
         * <li>5 tair</li>
         * <li>13 mq_client</li>
         * <li>252 mq</li>
         * <li>23 kafka_client</li>
         * <li>256 kafka</li>
         * <li>3 notify_client</li>
         * <li>254 notify</li>
         * <li>7 dubbo_client</li>
         * <li>8 dubbo</li>
         * <li>11 dsf_client</li>
         * <li>12 dsf</li>
         * <li>9 grpc</li>
         * <li>10 grpc_client</li>
         * <li>16 thrift</li>
         * <li>17 thrift_client</li>
         * <li>18 sofa</li>
         * <li>19 sofa_client</li>
         * <li>-1 unknown</li>
         * <li>98 user_method</li>
         * <li>100 root</li>
         * <li>101 client</li>
         * <li>102 server</li>
         * <li>103 producer</li>
         * <li>104 consumer</li>
         * <li>105 db</li>
         * <li>106 xtrace_other</li>
         * <li>1301 schedulerx</li>
         * <li>1302 XXL_Job</li>
         * <li>1303 Spring_Scheduled</li>
         * <li>1304 Quartz</li>
         * <li>1305 ElasticJob</li>
         * <li>1308 Jdk_Timer</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RpcType")
        public Integer rpcType;

        /**
         * <p>The IP address of the host where the application resides.</p>
         * 
         * <strong>example:</strong>
         * <p>172.20.XX.XX</p>
         */
        @NameInMap("ServiceIp")
        public String serviceIp;

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>arms-demo</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The span ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("SpanId")
        public String spanId;

        /**
         * <p>The tags of the trace.</p>
         */
        @NameInMap("TagEntryList")
        public java.util.List<GetTraceResponseBodySpansTagEntryList> tagEntryList;

        /**
         * <p>The timestamp generated when the span was generated.</p>
         * 
         * <strong>example:</strong>
         * <p>1590388651</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>The trace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ac14001a15954493811405707d****</p>
         */
        @NameInMap("TraceID")
        public String traceID;

        public static GetTraceResponseBodySpans build(java.util.Map<String, ?> map) throws Exception {
            GetTraceResponseBodySpans self = new GetTraceResponseBodySpans();
            return TeaModel.build(map, self);
        }

        public GetTraceResponseBodySpans setChildren(java.util.List<java.util.Map<String, ?>> children) {
            this.children = children;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getChildren() {
            return this.children;
        }

        public GetTraceResponseBodySpans setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetTraceResponseBodySpans setHaveStack(Boolean haveStack) {
            this.haveStack = haveStack;
            return this;
        }
        public Boolean getHaveStack() {
            return this.haveStack;
        }

        public GetTraceResponseBodySpans setLogEventList(java.util.List<GetTraceResponseBodySpansLogEventList> logEventList) {
            this.logEventList = logEventList;
            return this;
        }
        public java.util.List<GetTraceResponseBodySpansLogEventList> getLogEventList() {
            return this.logEventList;
        }

        public GetTraceResponseBodySpans setOperationName(String operationName) {
            this.operationName = operationName;
            return this;
        }
        public String getOperationName() {
            return this.operationName;
        }

        public GetTraceResponseBodySpans setParentSpanId(String parentSpanId) {
            this.parentSpanId = parentSpanId;
            return this;
        }
        public String getParentSpanId() {
            return this.parentSpanId;
        }

        public GetTraceResponseBodySpans setResultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public String getResultCode() {
            return this.resultCode;
        }

        public GetTraceResponseBodySpans setRpcId(String rpcId) {
            this.rpcId = rpcId;
            return this;
        }
        public String getRpcId() {
            return this.rpcId;
        }

        public GetTraceResponseBodySpans setRpcType(Integer rpcType) {
            this.rpcType = rpcType;
            return this;
        }
        public Integer getRpcType() {
            return this.rpcType;
        }

        public GetTraceResponseBodySpans setServiceIp(String serviceIp) {
            this.serviceIp = serviceIp;
            return this;
        }
        public String getServiceIp() {
            return this.serviceIp;
        }

        public GetTraceResponseBodySpans setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public GetTraceResponseBodySpans setSpanId(String spanId) {
            this.spanId = spanId;
            return this;
        }
        public String getSpanId() {
            return this.spanId;
        }

        public GetTraceResponseBodySpans setTagEntryList(java.util.List<GetTraceResponseBodySpansTagEntryList> tagEntryList) {
            this.tagEntryList = tagEntryList;
            return this;
        }
        public java.util.List<GetTraceResponseBodySpansTagEntryList> getTagEntryList() {
            return this.tagEntryList;
        }

        public GetTraceResponseBodySpans setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public GetTraceResponseBodySpans setTraceID(String traceID) {
            this.traceID = traceID;
            return this;
        }
        public String getTraceID() {
            return this.traceID;
        }

    }

}
