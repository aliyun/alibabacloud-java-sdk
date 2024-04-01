// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListBlacklistCallTaggingsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListBlacklistCallTaggingsResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListBlacklistCallTaggingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBlacklistCallTaggingsResponseBody self = new ListBlacklistCallTaggingsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBlacklistCallTaggingsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListBlacklistCallTaggingsResponseBody setData(java.util.List<ListBlacklistCallTaggingsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListBlacklistCallTaggingsResponseBodyData> getData() {
        return this.data;
    }

    public ListBlacklistCallTaggingsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListBlacklistCallTaggingsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListBlacklistCallTaggingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListBlacklistCallTaggingsResponseBodyData extends TeaModel {
        @NameInMap("Blacklisted")
        public Boolean blacklisted;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Number")
        public String number;

        public static ListBlacklistCallTaggingsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListBlacklistCallTaggingsResponseBodyData self = new ListBlacklistCallTaggingsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListBlacklistCallTaggingsResponseBodyData setBlacklisted(Boolean blacklisted) {
            this.blacklisted = blacklisted;
            return this;
        }
        public Boolean getBlacklisted() {
            return this.blacklisted;
        }

        public ListBlacklistCallTaggingsResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListBlacklistCallTaggingsResponseBodyData setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

    }

}
