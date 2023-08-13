// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetQueryOptimizeTagResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned SQL tag data.</p>
     */
    @NameInMap("Data")
    public GetQueryOptimizeTagResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>>  If the request was successful, **Successful** is returned. If the request failed, an error message such as an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public String success;

    public static GetQueryOptimizeTagResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQueryOptimizeTagResponseBody self = new GetQueryOptimizeTagResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQueryOptimizeTagResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetQueryOptimizeTagResponseBody setData(GetQueryOptimizeTagResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetQueryOptimizeTagResponseBodyData getData() {
        return this.data;
    }

    public GetQueryOptimizeTagResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQueryOptimizeTagResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQueryOptimizeTagResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetQueryOptimizeTagResponseBodyData extends TeaModel {
        /**
         * <p>The remarks.</p>
         */
        @NameInMap("Comments")
        public String comments;

        /**
         * <p>The SQL template ID.</p>
         */
        @NameInMap("SqlId")
        public String sqlId;

        /**
         * <p>The SQL tags. Multiple tags are separated by commas (,).</p>
         */
        @NameInMap("Tags")
        public String tags;

        public static GetQueryOptimizeTagResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQueryOptimizeTagResponseBodyData self = new GetQueryOptimizeTagResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQueryOptimizeTagResponseBodyData setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public GetQueryOptimizeTagResponseBodyData setSqlId(String sqlId) {
            this.sqlId = sqlId;
            return this;
        }
        public String getSqlId() {
            return this.sqlId;
        }

        public GetQueryOptimizeTagResponseBodyData setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

    }

}
