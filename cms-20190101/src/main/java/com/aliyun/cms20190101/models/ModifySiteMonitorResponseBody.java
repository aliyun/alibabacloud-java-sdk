// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class ModifySiteMonitorResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * <br>
     * <p>> The status code 200 indicates that the request was successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The result of modifying the task.</p>
     */
    @NameInMap("Data")
    public ModifySiteMonitorResponseBodyData data;

    /**
     * <p>The returned message.</p>
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
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("Success")
    public String success;

    public static ModifySiteMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySiteMonitorResponseBody self = new ModifySiteMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySiteMonitorResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifySiteMonitorResponseBody setData(ModifySiteMonitorResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ModifySiteMonitorResponseBodyData getData() {
        return this.data;
    }

    public ModifySiteMonitorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifySiteMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifySiteMonitorResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class ModifySiteMonitorResponseBodyData extends TeaModel {
        /**
         * <p>The number of site monitoring tasks.</p>
         */
        @NameInMap("count")
        public Integer count;

        public static ModifySiteMonitorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ModifySiteMonitorResponseBodyData self = new ModifySiteMonitorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ModifySiteMonitorResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
