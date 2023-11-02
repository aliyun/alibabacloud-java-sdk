// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeLogStoreResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public DescribeLogStoreResponseBodyData data;

    @NameInMap("DyCode")
    public String dyCode;

    @NameInMap("DyMessage")
    public String dyMessage;

    @NameInMap("ErrCode")
    public String errCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeLogStoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogStoreResponseBody self = new DescribeLogStoreResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLogStoreResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeLogStoreResponseBody setData(DescribeLogStoreResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeLogStoreResponseBodyData getData() {
        return this.data;
    }

    public DescribeLogStoreResponseBody setDyCode(String dyCode) {
        this.dyCode = dyCode;
        return this;
    }
    public String getDyCode() {
        return this.dyCode;
    }

    public DescribeLogStoreResponseBody setDyMessage(String dyMessage) {
        this.dyMessage = dyMessage;
        return this;
    }
    public String getDyMessage() {
        return this.dyMessage;
    }

    public DescribeLogStoreResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeLogStoreResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeLogStoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLogStoreResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeLogStoreResponseBodyData extends TeaModel {
        @NameInMap("AppendMeta")
        public Boolean appendMeta;

        @NameInMap("AutoSplit")
        public Boolean autoSplit;

        @NameInMap("EnableTracking")
        public Boolean enableTracking;

        @NameInMap("LogStoreName")
        public String logStoreName;

        @NameInMap("MaxSplitShard")
        public Integer maxSplitShard;

        @NameInMap("ShardCount")
        public Integer shardCount;

        @NameInMap("Ttl")
        public Integer ttl;

        public static DescribeLogStoreResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogStoreResponseBodyData self = new DescribeLogStoreResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeLogStoreResponseBodyData setAppendMeta(Boolean appendMeta) {
            this.appendMeta = appendMeta;
            return this;
        }
        public Boolean getAppendMeta() {
            return this.appendMeta;
        }

        public DescribeLogStoreResponseBodyData setAutoSplit(Boolean autoSplit) {
            this.autoSplit = autoSplit;
            return this;
        }
        public Boolean getAutoSplit() {
            return this.autoSplit;
        }

        public DescribeLogStoreResponseBodyData setEnableTracking(Boolean enableTracking) {
            this.enableTracking = enableTracking;
            return this;
        }
        public Boolean getEnableTracking() {
            return this.enableTracking;
        }

        public DescribeLogStoreResponseBodyData setLogStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }
        public String getLogStoreName() {
            return this.logStoreName;
        }

        public DescribeLogStoreResponseBodyData setMaxSplitShard(Integer maxSplitShard) {
            this.maxSplitShard = maxSplitShard;
            return this;
        }
        public Integer getMaxSplitShard() {
            return this.maxSplitShard;
        }

        public DescribeLogStoreResponseBodyData setShardCount(Integer shardCount) {
            this.shardCount = shardCount;
            return this;
        }
        public Integer getShardCount() {
            return this.shardCount;
        }

        public DescribeLogStoreResponseBodyData setTtl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }
        public Integer getTtl() {
            return this.ttl;
        }

    }

}
