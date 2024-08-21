// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs_workbench20220220.models;

import com.aliyun.tea.*;

public class ListInstanceRecordsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>InvalidParamter</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>Parameter is null or invalid.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Root")
    public ListInstanceRecordsResponseBodyRoot root;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListInstanceRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceRecordsResponseBody self = new ListInstanceRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceRecordsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInstanceRecordsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInstanceRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceRecordsResponseBody setRoot(ListInstanceRecordsResponseBodyRoot root) {
        this.root = root;
        return this;
    }
    public ListInstanceRecordsResponseBodyRoot getRoot() {
        return this.root;
    }

    public ListInstanceRecordsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListInstanceRecordsResponseBodyRootRecordList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("AccountId")
        public Long accountId;

        /**
         * <strong>example:</strong>
         * <p>2023-11-16T02:59:39Z</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <strong>example:</strong>
         * <p>2023-04-10T12:41:28Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>i-xxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p><a href="https://ecs-workbench.aliyun.com/view/instance/record/replay/abc">https://ecs-workbench.aliyun.com/view/instance/record/replay/abc</a></p>
         */
        @NameInMap("InstanceRecordUrl")
        public String instanceRecordUrl;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("RecordDurationMillis")
        public Long recordDurationMillis;

        /**
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("TerminalSessionToken")
        public String terminalSessionToken;

        public static ListInstanceRecordsResponseBodyRootRecordList build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceRecordsResponseBodyRootRecordList self = new ListInstanceRecordsResponseBodyRootRecordList();
            return TeaModel.build(map, self);
        }

        public ListInstanceRecordsResponseBodyRootRecordList setAccountId(Long accountId) {
            this.accountId = accountId;
            return this;
        }
        public Long getAccountId() {
            return this.accountId;
        }

        public ListInstanceRecordsResponseBodyRootRecordList setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public ListInstanceRecordsResponseBodyRootRecordList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListInstanceRecordsResponseBodyRootRecordList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstanceRecordsResponseBodyRootRecordList setInstanceRecordUrl(String instanceRecordUrl) {
            this.instanceRecordUrl = instanceRecordUrl;
            return this;
        }
        public String getInstanceRecordUrl() {
            return this.instanceRecordUrl;
        }

        public ListInstanceRecordsResponseBodyRootRecordList setRecordDurationMillis(Long recordDurationMillis) {
            this.recordDurationMillis = recordDurationMillis;
            return this;
        }
        public Long getRecordDurationMillis() {
            return this.recordDurationMillis;
        }

        public ListInstanceRecordsResponseBodyRootRecordList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListInstanceRecordsResponseBodyRootRecordList setTerminalSessionToken(String terminalSessionToken) {
            this.terminalSessionToken = terminalSessionToken;
            return this;
        }
        public String getTerminalSessionToken() {
            return this.terminalSessionToken;
        }

    }

    public static class ListInstanceRecordsResponseBodyRoot extends TeaModel {
        @NameInMap("RecordList")
        public java.util.List<ListInstanceRecordsResponseBodyRootRecordList> recordList;

        /**
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListInstanceRecordsResponseBodyRoot build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceRecordsResponseBodyRoot self = new ListInstanceRecordsResponseBodyRoot();
            return TeaModel.build(map, self);
        }

        public ListInstanceRecordsResponseBodyRoot setRecordList(java.util.List<ListInstanceRecordsResponseBodyRootRecordList> recordList) {
            this.recordList = recordList;
            return this;
        }
        public java.util.List<ListInstanceRecordsResponseBodyRootRecordList> getRecordList() {
            return this.recordList;
        }

        public ListInstanceRecordsResponseBodyRoot setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
