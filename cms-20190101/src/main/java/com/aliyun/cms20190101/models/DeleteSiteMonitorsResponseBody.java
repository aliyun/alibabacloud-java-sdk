// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteSiteMonitorsResponseBody extends TeaModel {
    /**
     * <p>The information about the site monitoring tasks that were deleted.</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DeleteSiteMonitorsResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Deletes one or more site monitoring tasks.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static DeleteSiteMonitorsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSiteMonitorsResponseBody self = new DeleteSiteMonitorsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSiteMonitorsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteSiteMonitorsResponseBody setData(DeleteSiteMonitorsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteSiteMonitorsResponseBodyData getData() {
        return this.data;
    }

    public DeleteSiteMonitorsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteSiteMonitorsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteSiteMonitorsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DeleteSiteMonitorsResponseBodyData extends TeaModel {
        @NameInMap("count")
        public Integer count;

        public static DeleteSiteMonitorsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteSiteMonitorsResponseBodyData self = new DeleteSiteMonitorsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteSiteMonitorsResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
