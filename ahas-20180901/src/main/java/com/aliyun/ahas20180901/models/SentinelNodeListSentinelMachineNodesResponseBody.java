// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelNodeListSentinelMachineNodesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<SentinelNodeListSentinelMachineNodesResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelNodeListSentinelMachineNodesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelNodeListSentinelMachineNodesResponseBody self = new SentinelNodeListSentinelMachineNodesResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelNodeListSentinelMachineNodesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelNodeListSentinelMachineNodesResponseBody setData(java.util.List<SentinelNodeListSentinelMachineNodesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SentinelNodeListSentinelMachineNodesResponseBodyData> getData() {
        return this.data;
    }

    public SentinelNodeListSentinelMachineNodesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelNodeListSentinelMachineNodesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelNodeListSentinelMachineNodesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelNodeListSentinelMachineNodesResponseBodyData extends TeaModel {
        @NameInMap("averageRt")
        public Long averageRt;

        @NameInMap("blockQps")
        public Long blockQps;

        @NameInMap("exceptionQps")
        public Long exceptionQps;

        @NameInMap("id")
        public String id;

        @NameInMap("oneMinuteBlock")
        public Long oneMinuteBlock;

        @NameInMap("oneMinuteException")
        public Long oneMinuteException;

        @NameInMap("oneMinutePass")
        public Long oneMinutePass;

        @NameInMap("oneMinuteTotal")
        public Long oneMinuteTotal;

        @NameInMap("parentId")
        public String parentId;

        @NameInMap("passQps")
        public Long passQps;

        @NameInMap("resource")
        public String resource;

        @NameInMap("successQps")
        public Long successQps;

        @NameInMap("threadNum")
        public Integer threadNum;

        @NameInMap("timestamp")
        public Long timestamp;

        @NameInMap("totalQps")
        public Long totalQps;

        public static SentinelNodeListSentinelMachineNodesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelNodeListSentinelMachineNodesResponseBodyData self = new SentinelNodeListSentinelMachineNodesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelNodeListSentinelMachineNodesResponseBodyData setAverageRt(Long averageRt) {
            this.averageRt = averageRt;
            return this;
        }
        public Long getAverageRt() {
            return this.averageRt;
        }

        public SentinelNodeListSentinelMachineNodesResponseBodyData setBlockQps(Long blockQps) {
            this.blockQps = blockQps;
            return this;
        }
        public Long getBlockQps() {
            return this.blockQps;
        }

        public SentinelNodeListSentinelMachineNodesResponseBodyData setExceptionQps(Long exceptionQps) {
            this.exceptionQps = exceptionQps;
            return this;
        }
        public Long getExceptionQps() {
            return this.exceptionQps;
        }

        public SentinelNodeListSentinelMachineNodesResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SentinelNodeListSentinelMachineNodesResponseBodyData setOneMinuteBlock(Long oneMinuteBlock) {
            this.oneMinuteBlock = oneMinuteBlock;
            return this;
        }
        public Long getOneMinuteBlock() {
            return this.oneMinuteBlock;
        }

        public SentinelNodeListSentinelMachineNodesResponseBodyData setOneMinuteException(Long oneMinuteException) {
            this.oneMinuteException = oneMinuteException;
            return this;
        }
        public Long getOneMinuteException() {
            return this.oneMinuteException;
        }

        public SentinelNodeListSentinelMachineNodesResponseBodyData setOneMinutePass(Long oneMinutePass) {
            this.oneMinutePass = oneMinutePass;
            return this;
        }
        public Long getOneMinutePass() {
            return this.oneMinutePass;
        }

        public SentinelNodeListSentinelMachineNodesResponseBodyData setOneMinuteTotal(Long oneMinuteTotal) {
            this.oneMinuteTotal = oneMinuteTotal;
            return this;
        }
        public Long getOneMinuteTotal() {
            return this.oneMinuteTotal;
        }

        public SentinelNodeListSentinelMachineNodesResponseBodyData setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public SentinelNodeListSentinelMachineNodesResponseBodyData setPassQps(Long passQps) {
            this.passQps = passQps;
            return this;
        }
        public Long getPassQps() {
            return this.passQps;
        }

        public SentinelNodeListSentinelMachineNodesResponseBodyData setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public SentinelNodeListSentinelMachineNodesResponseBodyData setSuccessQps(Long successQps) {
            this.successQps = successQps;
            return this;
        }
        public Long getSuccessQps() {
            return this.successQps;
        }

        public SentinelNodeListSentinelMachineNodesResponseBodyData setThreadNum(Integer threadNum) {
            this.threadNum = threadNum;
            return this;
        }
        public Integer getThreadNum() {
            return this.threadNum;
        }

        public SentinelNodeListSentinelMachineNodesResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public SentinelNodeListSentinelMachineNodesResponseBodyData setTotalQps(Long totalQps) {
            this.totalQps = totalQps;
            return this;
        }
        public Long getTotalQps() {
            return this.totalQps;
        }

    }

}
