// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkDescribeRecordFileUrlResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ClinkDescribeRecordFileUrlResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>6086693B-2250-17CE-A41F-06259AB6DB1B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ClinkDescribeRecordFileUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClinkDescribeRecordFileUrlResponseBody self = new ClinkDescribeRecordFileUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public ClinkDescribeRecordFileUrlResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ClinkDescribeRecordFileUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClinkDescribeRecordFileUrlResponseBody setData(ClinkDescribeRecordFileUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClinkDescribeRecordFileUrlResponseBodyData getData() {
        return this.data;
    }

    public ClinkDescribeRecordFileUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClinkDescribeRecordFileUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ClinkDescribeRecordFileUrlResponseBodyDataAudioFlows extends TeaModel {
        /**
         * <p>节点，1：录音，2：保持，3：静音，4：咨询</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Node")
        public Long node;

        /**
         * <p>时间戳，单位：秒</p>
         * 
         * <strong>example:</strong>
         * <p>19</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        /**
         * <p>类型，0：开始，1：结束</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Type")
        public Long type;

        public static ClinkDescribeRecordFileUrlResponseBodyDataAudioFlows build(java.util.Map<String, ?> map) throws Exception {
            ClinkDescribeRecordFileUrlResponseBodyDataAudioFlows self = new ClinkDescribeRecordFileUrlResponseBodyDataAudioFlows();
            return TeaModel.build(map, self);
        }

        public ClinkDescribeRecordFileUrlResponseBodyDataAudioFlows setNode(Long node) {
            this.node = node;
            return this;
        }
        public Long getNode() {
            return this.node;
        }

        public ClinkDescribeRecordFileUrlResponseBodyDataAudioFlows setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public ClinkDescribeRecordFileUrlResponseBodyDataAudioFlows setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

    }

    public static class ClinkDescribeRecordFileUrlResponseBodyData extends TeaModel {
        /**
         * <p>录音流程列表。仅当获取 mp3 格式通话录音时返回（不传 recordSide 且 recordType 为 &quot;record&quot; 或未传）。</p>
         */
        @NameInMap("AudioFlows")
        public java.util.List<ClinkDescribeRecordFileUrlResponseBodyDataAudioFlows> audioFlows;

        /**
         * <p>请求 id</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("ClinkRequestId")
        public String clinkRequestId;

        /**
         * <p>通话录音地址</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("RecordFileUrl")
        public String recordFileUrl;

        public static ClinkDescribeRecordFileUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClinkDescribeRecordFileUrlResponseBodyData self = new ClinkDescribeRecordFileUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClinkDescribeRecordFileUrlResponseBodyData setAudioFlows(java.util.List<ClinkDescribeRecordFileUrlResponseBodyDataAudioFlows> audioFlows) {
            this.audioFlows = audioFlows;
            return this;
        }
        public java.util.List<ClinkDescribeRecordFileUrlResponseBodyDataAudioFlows> getAudioFlows() {
            return this.audioFlows;
        }

        public ClinkDescribeRecordFileUrlResponseBodyData setClinkRequestId(String clinkRequestId) {
            this.clinkRequestId = clinkRequestId;
            return this;
        }
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

        public ClinkDescribeRecordFileUrlResponseBodyData setRecordFileUrl(String recordFileUrl) {
            this.recordFileUrl = recordFileUrl;
            return this;
        }
        public String getRecordFileUrl() {
            return this.recordFileUrl;
        }

    }

}
