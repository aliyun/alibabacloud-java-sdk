// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetStreamTagListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>73f33c91-d59383e8280b</strong></strong></p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StreamTagList")
    public java.util.List<GetStreamTagListResponseBodyStreamTagList> streamTagList;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <strong>example:</strong>
     * <p>163</p>
     */
    @NameInMap("Total")
    public Long total;

    public static GetStreamTagListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStreamTagListResponseBody self = new GetStreamTagListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStreamTagListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetStreamTagListResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public GetStreamTagListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStreamTagListResponseBody setStreamTagList(java.util.List<GetStreamTagListResponseBodyStreamTagList> streamTagList) {
        this.streamTagList = streamTagList;
        return this;
    }
    public java.util.List<GetStreamTagListResponseBodyStreamTagList> getStreamTagList() {
        return this.streamTagList;
    }

    public GetStreamTagListResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public GetStreamTagListResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class GetStreamTagListResponseBodyStreamTagList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-02-25T02:24:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>2025-04-26T16:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>{&quot;result&quot;:&quot;xxx&quot;}</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static GetStreamTagListResponseBodyStreamTagList build(java.util.Map<String, ?> map) throws Exception {
            GetStreamTagListResponseBodyStreamTagList self = new GetStreamTagListResponseBodyStreamTagList();
            return TeaModel.build(map, self);
        }

        public GetStreamTagListResponseBodyStreamTagList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetStreamTagListResponseBodyStreamTagList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetStreamTagListResponseBodyStreamTagList setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
