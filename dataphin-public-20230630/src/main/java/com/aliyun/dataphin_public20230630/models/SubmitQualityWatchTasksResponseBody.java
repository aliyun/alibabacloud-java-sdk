// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class SubmitQualityWatchTasksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubmitResult")
    public SubmitQualityWatchTasksResponseBodySubmitResult submitResult;

    @NameInMap("Success")
    public Boolean success;

    public static SubmitQualityWatchTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitQualityWatchTasksResponseBody self = new SubmitQualityWatchTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitQualityWatchTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitQualityWatchTasksResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SubmitQualityWatchTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitQualityWatchTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitQualityWatchTasksResponseBody setSubmitResult(SubmitQualityWatchTasksResponseBodySubmitResult submitResult) {
        this.submitResult = submitResult;
        return this;
    }
    public SubmitQualityWatchTasksResponseBodySubmitResult getSubmitResult() {
        return this.submitResult;
    }

    public SubmitQualityWatchTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SubmitQualityWatchTasksResponseBodySubmitResult extends TeaModel {
        @NameInMap("WatchTaskIdList")
        public java.util.List<Long> watchTaskIdList;

        public static SubmitQualityWatchTasksResponseBodySubmitResult build(java.util.Map<String, ?> map) throws Exception {
            SubmitQualityWatchTasksResponseBodySubmitResult self = new SubmitQualityWatchTasksResponseBodySubmitResult();
            return TeaModel.build(map, self);
        }

        public SubmitQualityWatchTasksResponseBodySubmitResult setWatchTaskIdList(java.util.List<Long> watchTaskIdList) {
            this.watchTaskIdList = watchTaskIdList;
            return this;
        }
        public java.util.List<Long> getWatchTaskIdList() {
            return this.watchTaskIdList;
        }

    }

}
